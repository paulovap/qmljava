package org.qmljava;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.qmljava.parser.QMLListener;
import org.qmljava.parser.QMLParser;

/**
 * Created by ppinheiro on 3/11/18.
 */
public class QMLWalker implements QMLListener {

    @Override
    public void enterProgram(QMLParser.ProgramContext ctx) {
    }

    @Override
    public void exitProgram(QMLParser.ProgramContext ctx) {
    }

    @Override
    public void enterObjectDeclaration(QMLParser.ObjectDeclarationContext ctx) {
        System.out.println( "Entering Object : " + ctx.ObjectType().toString());
    }

    @Override
    public void exitObjectDeclaration(QMLParser.ObjectDeclarationContext ctx) {
        System.out.println( "Exiting Object : " + ctx.ObjectType().toString());
    }

    @Override
    public void enterObjectMember(QMLParser.ObjectMemberContext ctx) {
    }

    @Override
    public void exitObjectMember(QMLParser.ObjectMemberContext ctx) {

    }

    @Override
    public void enterIdDeclaration(QMLParser.IdDeclarationContext ctx) {
        System.out.println( "id : " + ctx.Identifier().toString());
    }

    @Override
    public void exitIdDeclaration(QMLParser.IdDeclarationContext ctx) {

    }

    @Override
    public void enterPropertyDeclaration(QMLParser.PropertyDeclarationContext ctx) {

    }

    @Override
    public void exitPropertyDeclaration(QMLParser.PropertyDeclarationContext ctx) {

    }

    @Override
    public void enterPropertyType(QMLParser.PropertyTypeContext ctx) {

    }

    @Override
    public void exitPropertyType(QMLParser.PropertyTypeContext ctx) {

    }

    @Override
    public void enterBasicType(QMLParser.BasicTypeContext ctx) {

    }

    @Override
    public void exitBasicType(QMLParser.BasicTypeContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode node) {

    }

    @Override
    public void visitErrorNode(ErrorNode node) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }
}
