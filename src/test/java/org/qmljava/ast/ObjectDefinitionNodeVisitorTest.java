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

package org.qmljava.ast;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;


public class ObjectDefinitionNodeVisitorTest {

    final String[] acceptables =  new String[] {
            "T {}",
            "MyItem { Rectangle{}; Cube{} }",
    };

    final String[] errors = new String[] {
            "10 { }",
            "MyItem {",
            "Re{}c",
    };

    final ObjectDefinitionNode[] acceptableResults = new ObjectDefinitionNode[] {
            new ObjectDefinitionNode("T", Collections.emptyList()),
            new ObjectDefinitionNode("MyItem", Arrays.asList(
                   new ObjectDefinitionNode("Rectangle", Collections.emptyList()),
                  new ObjectDefinitionNode("Cube", Collections.emptyList()))
            )
    };

    @Test
    public void validObjects() throws IOException {
        for (int i=0; i < acceptables.length; i++) {
            ParseTree tree = LoadTree.loadTree(acceptables[i]).objectDefinition();
            ObjectDefinitionNodeVisitor objectVisitor = new ObjectDefinitionNodeVisitor();
            ObjectDefinitionNode obj = objectVisitor.visit(tree);
            assertEquals(acceptableResults[i], obj);
        }
    }

    @Test
    public void inValidObjects() throws IOException {
        for (String code : errors) {
            ParseTree tree = LoadTree.loadTree(code).import_();
            ObjectDefinitionNodeVisitor visitor = new ObjectDefinitionNodeVisitor();
            try {
                ObjectDefinitionNode object = visitor.visit(tree);
                assertNull("This assert should never been reached because visitor should throw exception" , object);
            } catch (NoViableAltException ignored) {
            }
        }
    }
}