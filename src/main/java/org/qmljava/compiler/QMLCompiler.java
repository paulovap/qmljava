package org.qmljava.compiler;
/*
BSD License

Copyright (c) 2018, Paulo Pinheiro
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

1. Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
3. Neither the name of Tom Everett nor the names of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;
import org.qmljava.ast.ObjectDefinitionNode;
import org.qmljava.ast.ProgramNode;
import org.qmljava.ast.ProgramNodeVisitor;
import org.qmljava.ast.PropertyNode;
import org.qmljava.core.MetaClass;
import org.qmljava.core.QMLObject;
import org.qmljava.core.QMLProperty;
import org.qmljava.parser.QMLLexer;
import org.qmljava.parser.QMLParser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.function.Function;

public class QMLCompiler {

    /* list of available qml types that can be used */
    private Map<String, MetaClass> availableTypes;

    public QMLCompiler(@NotNull Map<String, MetaClass> availableTypes) {
        this.availableTypes = availableTypes;
    }

    public QMLObject compile(String unit) {

        return createQMLObject(loadAst(unit).rootObject);
    }

    private QMLObject createQMLObject(@NotNull ObjectDefinitionNode objectNode) {
        MetaClass meta = availableTypes.get(objectNode.type);

        if (meta == null) {
            //@TODO: throw line number
            throw new QMLRuntimeException("%s is not a type", objectNode.type);
        }

        try {
            QMLObject object = (QMLObject) meta.getJavaClass().newInstance();

            // add children
            for (ObjectDefinitionNode childNode : objectNode.children) {
                QMLObject child = createQMLObject(childNode);
                object.addChildren(child.getId(), child);
            }

            // add new properties
            for (PropertyNode propNode : objectNode.declaredProperties) {
                object.addDynamicProperty(createProperty(propNode));
            }

            return object;
        } catch (InstantiationException e) {
            throw new QMLRuntimeException(e, "%s unable to be instantiated",
                    meta.getJavaClass().getCanonicalName());
        } catch (IllegalAccessException e) {
            throw new QMLRuntimeException(e, "%s constructor not implemented",
                    meta.getJavaClass().getCanonicalName());
        } catch (ClassCastException e) {
           throw new QMLRuntimeException(e, "%s does not implement %s",
                   meta.getJavaClass().getCanonicalName(),
                   QMLObject.class.getSimpleName());
        }
    }

    private QMLProperty createProperty(@NotNull PropertyNode propertyNode) {
        Class clazz = castQMLType(propertyNode.getType());
        ObjectDefinitionNode objDefinition = propertyNode.getObjectDefinition();
        QMLObject obj = objDefinition != null ? createQMLObject(objDefinition): null;
        return new QMLProperty(propertyNode.getName(), clazz, obj);
    }

    private ProgramNode loadAst(String unit) {
        try {
            InputStream stream = new ByteArrayInputStream(unit.getBytes(StandardCharsets.UTF_8));
            QMLLexer lexer = new QMLLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
            CommonTokenStream tokens = new CommonTokenStream( lexer );
            QMLParser parser = new QMLParser( tokens );
            ParseTree tree = parser.program();

            ProgramNodeVisitor programVisitor = new ProgramNodeVisitor();
            return programVisitor.visit(tree);
        } catch (IOException e) {
            e.printStackTrace();
            throw new QMLRuntimeException(e, "unable to load unit");
        }
    }

    private Class castQMLType(@NotNull String type) {
        switch (type) {
            case "int": return Integer.class;
            case "double":
            case "real": return Double.class;
            case "string": return String.class;
            case "var" : return Object.class;
            case "bool": return Boolean.class;
        }

        MetaClass meta = availableTypes.get(type);
        if (meta == null) {
            throw new QMLRuntimeException("type %s is not defined", type);
        }
        return meta.getJavaClass();
    }
}
