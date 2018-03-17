package org.qmljava.ast;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.qmljava.parser.QMLLexer;
import org.qmljava.parser.QMLParser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

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
public class ImportNodeVisitorTest {


    final String[] acceptableImports =  new String[] {
            "import QtQuick 1.0",
            "import 'http://www.google.com' 0.2",
            "import QtQuick.Controls 2.3 as Controls",
    };

    final String[] errorImport = new String[] {
            "import 3 1.0",
            "import QtQuick;",
            "import QtQuick T.T as Good",
            "import QtQuick 1.1 as 10"
    };

    final ImportNode[] acceptableResults = new ImportNode[] {
            new ImportNode("QtQuick", 1.0, null),
            new ImportNode("'http://www.google.com'", 0.2, null),
            new ImportNode("QtQuick.Controls", 2.3, "Controls")
    };

    @Test
    public void testValidImportVisitor() throws IOException {
        for (int i=0; i < acceptableImports.length; i++) {
            ParseTree tree = loadTree(acceptableImports[i]);
            ImportNodeVisitor importVisitor = new ImportNodeVisitor();
            ImportNode import_ = importVisitor.visit(tree);
            assertEquals(acceptableResults[i], import_);
        }
    }

    @Test
    public void testInValidImportVisitor() throws IOException {
        for (String code : errorImport) {
            ParseTree tree = loadTree(code);
            ImportNodeVisitor importVisitor = new ImportNodeVisitor();
            try {
                ImportNode import_ = importVisitor.visit(tree);
                assertNull("This assert should never been reached because visitor should throw exception" , import_);
            } catch (NoViableAltException ignored) {
            }
        }
    }



    private ParseTree loadTree(String code) throws IOException {
        InputStream stream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
        QMLLexer lexer = new QMLLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        QMLParser parser = new QMLParser( tokens );
         return parser.import_();
    }
}