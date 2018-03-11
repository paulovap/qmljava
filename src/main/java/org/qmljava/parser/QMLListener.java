// Generated from QML.g4 by ANTLR 4.7.1

    package org.qmljava.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QMLParser}.
 */
public interface QMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QMLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QMLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QMLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMLParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(QMLParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMLParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(QMLParser.ObjectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMLParser#objectMember}.
	 * @param ctx the parse tree
	 */
	void enterObjectMember(QMLParser.ObjectMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMLParser#objectMember}.
	 * @param ctx the parse tree
	 */
	void exitObjectMember(QMLParser.ObjectMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMLParser#idDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIdDeclaration(QMLParser.IdDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMLParser#idDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIdDeclaration(QMLParser.IdDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMLParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(QMLParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMLParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(QMLParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMLParser#propertyType}.
	 * @param ctx the parse tree
	 */
	void enterPropertyType(QMLParser.PropertyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMLParser#propertyType}.
	 * @param ctx the parse tree
	 */
	void exitPropertyType(QMLParser.PropertyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMLParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(QMLParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMLParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(QMLParser.BasicTypeContext ctx);
}