package org.qmljava;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.qmljava.parser.QMLLexer;
import org.qmljava.parser.QMLParser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;

/**
 * Created by ppinheiro on 3/11/18.
 */

public class Main {
    public static void main( String[] args ){
        try {
            InputStream stream = new ByteArrayInputStream("import QtQuick 0.0 as Cool; Test { id: 20; d:++a Awesome {} } ".getBytes(StandardCharsets.UTF_8));
            QMLLexer lexer = new QMLLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
            CommonTokenStream tokens = new CommonTokenStream( lexer );
            QMLParser parser = new QMLParser( tokens );
            ParseTree tree = parser.program();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk( new QMLWalker(), tree );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
