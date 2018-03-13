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

package org.qmljava;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.qmljava.parser.QMLListener;
import org.qmljava.parser.QMLParser;

public class QMLWalker implements QMLListener {

    @Override
    public void enterProgram(QMLParser.ProgramContext ctx) {
    }

    @Override
    public void exitProgram(QMLParser.ProgramContext ctx) {
    }

    @Override
    public void enterHeaderList(QMLParser.HeaderListContext ctx) {

    }

    @Override
    public void exitHeaderList(QMLParser.HeaderListContext ctx) {

    }

    @Override
    public void enterImport_(QMLParser.Import_Context ctx) {

    }

    @Override
    public void exitImport_(QMLParser.Import_Context ctx) {

    }

    @Override
    public void enterRootMember(QMLParser.RootMemberContext ctx) {

    }

    @Override
    public void exitRootMember(QMLParser.RootMemberContext ctx) {

    }

    @Override
    public void enterObjectDefinition(QMLParser.ObjectDefinitionContext ctx) {

    }

    @Override
    public void exitObjectDefinition(QMLParser.ObjectDefinitionContext ctx) {

    }

    @Override
    public void enterQualifiedId(QMLParser.QualifiedIdContext ctx) {

    }

    @Override
    public void exitQualifiedId(QMLParser.QualifiedIdContext ctx) {

    }

    @Override
    public void enterObjectInitializer(QMLParser.ObjectInitializerContext ctx) {

    }

    @Override
    public void exitObjectInitializer(QMLParser.ObjectInitializerContext ctx) {

    }

    @Override
    public void enterObjectMember(QMLParser.ObjectMemberContext ctx) {

    }

    @Override
    public void exitObjectMember(QMLParser.ObjectMemberContext ctx) {

    }

    @Override
    public void enterParameterList(QMLParser.ParameterListContext ctx) {

    }

    @Override
    public void exitParameterList(QMLParser.ParameterListContext ctx) {

    }

    @Override
    public void enterPropertyType(QMLParser.PropertyTypeContext ctx) {

    }

    @Override
    public void exitPropertyType(QMLParser.PropertyTypeContext ctx) {

    }

    @Override
    public void enterArrayMemberList(QMLParser.ArrayMemberListContext ctx) {

    }

    @Override
    public void exitArrayMemberList(QMLParser.ArrayMemberListContext ctx) {

    }

    @Override
    public void enterScriptStatement(QMLParser.ScriptStatementContext ctx) {

    }

    @Override
    public void exitScriptStatement(QMLParser.ScriptStatementContext ctx) {

    }

    @Override
    public void enterStatement(QMLParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(QMLParser.StatementContext ctx) {

    }

    @Override
    public void enterVariableStatement(QMLParser.VariableStatementContext ctx) {

    }

    @Override
    public void exitVariableStatement(QMLParser.VariableStatementContext ctx) {

    }

    @Override
    public void enterVariableDeclarationKind(QMLParser.VariableDeclarationKindContext ctx) {

    }

    @Override
    public void exitVariableDeclarationKind(QMLParser.VariableDeclarationKindContext ctx) {

    }

    @Override
    public void enterVariableDeclarationList(QMLParser.VariableDeclarationListContext ctx) {

    }

    @Override
    public void exitVariableDeclarationList(QMLParser.VariableDeclarationListContext ctx) {

    }

    @Override
    public void enterVariableDeclaration(QMLParser.VariableDeclarationContext ctx) {

    }

    @Override
    public void exitVariableDeclaration(QMLParser.VariableDeclarationContext ctx) {

    }

    @Override
    public void enterInitialiser(QMLParser.InitialiserContext ctx) {

    }

    @Override
    public void exitInitialiser(QMLParser.InitialiserContext ctx) {

    }

    @Override
    public void enterDebuggerStatement(QMLParser.DebuggerStatementContext ctx) {

    }

    @Override
    public void exitDebuggerStatement(QMLParser.DebuggerStatementContext ctx) {

    }

    @Override
    public void enterThrowStatement(QMLParser.ThrowStatementContext ctx) {

    }

    @Override
    public void exitThrowStatement(QMLParser.ThrowStatementContext ctx) {

    }

    @Override
    public void enterContinueStatement(QMLParser.ContinueStatementContext ctx) {

    }

    @Override
    public void exitContinueStatement(QMLParser.ContinueStatementContext ctx) {

    }

    @Override
    public void enterIterationStatement(QMLParser.IterationStatementContext ctx) {

    }

    @Override
    public void exitIterationStatement(QMLParser.IterationStatementContext ctx) {

    }

    @Override
    public void enterVariableDeclarationListNotIn(QMLParser.VariableDeclarationListNotInContext ctx) {

    }

    @Override
    public void exitVariableDeclarationListNotIn(QMLParser.VariableDeclarationListNotInContext ctx) {

    }

    @Override
    public void enterVariableDeclarationNotIn(QMLParser.VariableDeclarationNotInContext ctx) {

    }

    @Override
    public void exitVariableDeclarationNotIn(QMLParser.VariableDeclarationNotInContext ctx) {

    }

    @Override
    public void enterInitialiserNotIn(QMLParser.InitialiserNotInContext ctx) {

    }

    @Override
    public void exitInitialiserNotIn(QMLParser.InitialiserNotInContext ctx) {

    }

    @Override
    public void enterExpressionNotIn(QMLParser.ExpressionNotInContext ctx) {

    }

    @Override
    public void exitExpressionNotIn(QMLParser.ExpressionNotInContext ctx) {

    }

    @Override
    public void enterAssignmentExpressionNotIn(QMLParser.AssignmentExpressionNotInContext ctx) {

    }

    @Override
    public void exitAssignmentExpressionNotIn(QMLParser.AssignmentExpressionNotInContext ctx) {

    }

    @Override
    public void enterAssignmentOperator(QMLParser.AssignmentOperatorContext ctx) {

    }

    @Override
    public void exitAssignmentOperator(QMLParser.AssignmentOperatorContext ctx) {

    }

    @Override
    public void enterConditionalExpressionNotIn(QMLParser.ConditionalExpressionNotInContext ctx) {

    }

    @Override
    public void exitConditionalExpressionNotIn(QMLParser.ConditionalExpressionNotInContext ctx) {

    }

    @Override
    public void enterLogicalORExpressionNotIn(QMLParser.LogicalORExpressionNotInContext ctx) {

    }

    @Override
    public void exitLogicalORExpressionNotIn(QMLParser.LogicalORExpressionNotInContext ctx) {

    }

    @Override
    public void enterLogicalANDExpressionNotIn(QMLParser.LogicalANDExpressionNotInContext ctx) {

    }

    @Override
    public void exitLogicalANDExpressionNotIn(QMLParser.LogicalANDExpressionNotInContext ctx) {

    }

    @Override
    public void enterBitwiseORExpressionNotIn(QMLParser.BitwiseORExpressionNotInContext ctx) {

    }

    @Override
    public void exitBitwiseORExpressionNotIn(QMLParser.BitwiseORExpressionNotInContext ctx) {

    }

    @Override
    public void enterBitwiseXORExpressionNotIn(QMLParser.BitwiseXORExpressionNotInContext ctx) {

    }

    @Override
    public void exitBitwiseXORExpressionNotIn(QMLParser.BitwiseXORExpressionNotInContext ctx) {

    }

    @Override
    public void enterBitwiseANDExpressionNotIn(QMLParser.BitwiseANDExpressionNotInContext ctx) {

    }

    @Override
    public void exitBitwiseANDExpressionNotIn(QMLParser.BitwiseANDExpressionNotInContext ctx) {

    }

    @Override
    public void enterEqualityExpressionNotIn(QMLParser.EqualityExpressionNotInContext ctx) {

    }

    @Override
    public void exitEqualityExpressionNotIn(QMLParser.EqualityExpressionNotInContext ctx) {

    }

    @Override
    public void enterRelationalExpressionNotIn(QMLParser.RelationalExpressionNotInContext ctx) {

    }

    @Override
    public void exitRelationalExpressionNotIn(QMLParser.RelationalExpressionNotInContext ctx) {

    }

    @Override
    public void enterLabelledStatement(QMLParser.LabelledStatementContext ctx) {

    }

    @Override
    public void exitLabelledStatement(QMLParser.LabelledStatementContext ctx) {

    }

    @Override
    public void enterBreakStatement(QMLParser.BreakStatementContext ctx) {

    }

    @Override
    public void exitBreakStatement(QMLParser.BreakStatementContext ctx) {

    }

    @Override
    public void enterReturnStatement(QMLParser.ReturnStatementContext ctx) {

    }

    @Override
    public void exitReturnStatement(QMLParser.ReturnStatementContext ctx) {

    }

    @Override
    public void enterTryStatement(QMLParser.TryStatementContext ctx) {

    }

    @Override
    public void exitTryStatement(QMLParser.TryStatementContext ctx) {

    }

    @Override
    public void enterCatch_(QMLParser.Catch_Context ctx) {

    }

    @Override
    public void exitCatch_(QMLParser.Catch_Context ctx) {

    }

    @Override
    public void enterFinally_(QMLParser.Finally_Context ctx) {

    }

    @Override
    public void exitFinally_(QMLParser.Finally_Context ctx) {

    }

    @Override
    public void enterBlock(QMLParser.BlockContext ctx) {

    }

    @Override
    public void exitBlock(QMLParser.BlockContext ctx) {

    }

    @Override
    public void enterCaseBlock(QMLParser.CaseBlockContext ctx) {

    }

    @Override
    public void exitCaseBlock(QMLParser.CaseBlockContext ctx) {

    }

    @Override
    public void enterCaseClause(QMLParser.CaseClauseContext ctx) {

    }

    @Override
    public void exitCaseClause(QMLParser.CaseClauseContext ctx) {

    }

    @Override
    public void enterDefaultClause(QMLParser.DefaultClauseContext ctx) {

    }

    @Override
    public void exitDefaultClause(QMLParser.DefaultClauseContext ctx) {

    }

    @Override
    public void enterSwitchStatement(QMLParser.SwitchStatementContext ctx) {

    }

    @Override
    public void exitSwitchStatement(QMLParser.SwitchStatementContext ctx) {

    }

    @Override
    public void enterWithStatement(QMLParser.WithStatementContext ctx) {

    }

    @Override
    public void exitWithStatement(QMLParser.WithStatementContext ctx) {

    }

    @Override
    public void enterIfStatement(QMLParser.IfStatementContext ctx) {

    }

    @Override
    public void exitIfStatement(QMLParser.IfStatementContext ctx) {

    }

    @Override
    public void enterStatementListOpt(QMLParser.StatementListOptContext ctx) {

    }

    @Override
    public void exitStatementListOpt(QMLParser.StatementListOptContext ctx) {

    }

    @Override
    public void enterStatementList(QMLParser.StatementListContext ctx) {

    }

    @Override
    public void exitStatementList(QMLParser.StatementListContext ctx) {

    }

    @Override
    public void enterEmptyStatement(QMLParser.EmptyStatementContext ctx) {

    }

    @Override
    public void exitEmptyStatement(QMLParser.EmptyStatementContext ctx) {

    }

    @Override
    public void enterExpressionStatement(QMLParser.ExpressionStatementContext ctx) {

    }

    @Override
    public void exitExpressionStatement(QMLParser.ExpressionStatementContext ctx) {

    }

    @Override
    public void enterExpression(QMLParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(QMLParser.ExpressionContext ctx) {

    }

    @Override
    public void enterAssignmentExpression(QMLParser.AssignmentExpressionContext ctx) {

    }

    @Override
    public void exitAssignmentExpression(QMLParser.AssignmentExpressionContext ctx) {

    }

    @Override
    public void enterLeftHandSideExpression(QMLParser.LeftHandSideExpressionContext ctx) {

    }

    @Override
    public void exitLeftHandSideExpression(QMLParser.LeftHandSideExpressionContext ctx) {

    }

    @Override
    public void enterCallExpression(QMLParser.CallExpressionContext ctx) {

    }

    @Override
    public void exitCallExpression(QMLParser.CallExpressionContext ctx) {

    }

    @Override
    public void enterNewExpression(QMLParser.NewExpressionContext ctx) {

    }

    @Override
    public void exitNewExpression(QMLParser.NewExpressionContext ctx) {

    }

    @Override
    public void enterMemberExpression(QMLParser.MemberExpressionContext ctx) {

    }

    @Override
    public void exitMemberExpression(QMLParser.MemberExpressionContext ctx) {

    }

    @Override
    public void enterArgumentList(QMLParser.ArgumentListContext ctx) {

    }

    @Override
    public void exitArgumentList(QMLParser.ArgumentListContext ctx) {

    }

    @Override
    public void enterPropertyIdentifier(QMLParser.PropertyIdentifierContext ctx) {

    }

    @Override
    public void exitPropertyIdentifier(QMLParser.PropertyIdentifierContext ctx) {

    }

    @Override
    public void enterFunctionExpression(QMLParser.FunctionExpressionContext ctx) {

    }

    @Override
    public void exitFunctionExpression(QMLParser.FunctionExpressionContext ctx) {

    }

    @Override
    public void enterFormalParameterList(QMLParser.FormalParameterListContext ctx) {

    }

    @Override
    public void exitFormalParameterList(QMLParser.FormalParameterListContext ctx) {

    }

    @Override
    public void enterFunctionBody(QMLParser.FunctionBodyContext ctx) {

    }

    @Override
    public void exitFunctionBody(QMLParser.FunctionBodyContext ctx) {

    }

    @Override
    public void enterSourceElement(QMLParser.SourceElementContext ctx) {

    }

    @Override
    public void exitSourceElement(QMLParser.SourceElementContext ctx) {

    }

    @Override
    public void enterFunctionDeclaration(QMLParser.FunctionDeclarationContext ctx) {

    }

    @Override
    public void exitFunctionDeclaration(QMLParser.FunctionDeclarationContext ctx) {

    }

    @Override
    public void enterPrimaryExpression(QMLParser.PrimaryExpressionContext ctx) {

    }

    @Override
    public void exitPrimaryExpression(QMLParser.PrimaryExpressionContext ctx) {

    }

    @Override
    public void enterPropertyAssignmentListOpt(QMLParser.PropertyAssignmentListOptContext ctx) {

    }

    @Override
    public void exitPropertyAssignmentListOpt(QMLParser.PropertyAssignmentListOptContext ctx) {

    }

    @Override
    public void enterPopertyAssignmentList(QMLParser.PopertyAssignmentListContext ctx) {

    }

    @Override
    public void exitPopertyAssignmentList(QMLParser.PopertyAssignmentListContext ctx) {

    }

    @Override
    public void enterPropertyAssignmentList(QMLParser.PropertyAssignmentListContext ctx) {

    }

    @Override
    public void exitPropertyAssignmentList(QMLParser.PropertyAssignmentListContext ctx) {

    }

    @Override
    public void enterPropertyAssignment(QMLParser.PropertyAssignmentContext ctx) {

    }

    @Override
    public void exitPropertyAssignment(QMLParser.PropertyAssignmentContext ctx) {

    }

    @Override
    public void enterPropertyName(QMLParser.PropertyNameContext ctx) {

    }

    @Override
    public void exitPropertyName(QMLParser.PropertyNameContext ctx) {

    }

    @Override
    public void enterElementList(QMLParser.ElementListContext ctx) {

    }

    @Override
    public void exitElementList(QMLParser.ElementListContext ctx) {

    }

    @Override
    public void enterElision(QMLParser.ElisionContext ctx) {

    }

    @Override
    public void exitElision(QMLParser.ElisionContext ctx) {

    }

    @Override
    public void enterConditionalExpression(QMLParser.ConditionalExpressionContext ctx) {

    }

    @Override
    public void exitConditionalExpression(QMLParser.ConditionalExpressionContext ctx) {

    }

    @Override
    public void enterLogicalORExpression(QMLParser.LogicalORExpressionContext ctx) {

    }

    @Override
    public void exitLogicalORExpression(QMLParser.LogicalORExpressionContext ctx) {

    }

    @Override
    public void enterLogicalANDExpression(QMLParser.LogicalANDExpressionContext ctx) {

    }

    @Override
    public void exitLogicalANDExpression(QMLParser.LogicalANDExpressionContext ctx) {

    }

    @Override
    public void enterBitwiseORExpression(QMLParser.BitwiseORExpressionContext ctx) {

    }

    @Override
    public void exitBitwiseORExpression(QMLParser.BitwiseORExpressionContext ctx) {

    }

    @Override
    public void enterBitwiseXORExpression(QMLParser.BitwiseXORExpressionContext ctx) {

    }

    @Override
    public void exitBitwiseXORExpression(QMLParser.BitwiseXORExpressionContext ctx) {

    }

    @Override
    public void enterBitwiseANDExpression(QMLParser.BitwiseANDExpressionContext ctx) {

    }

    @Override
    public void exitBitwiseANDExpression(QMLParser.BitwiseANDExpressionContext ctx) {

    }

    @Override
    public void enterEqualityExpression(QMLParser.EqualityExpressionContext ctx) {

    }

    @Override
    public void exitEqualityExpression(QMLParser.EqualityExpressionContext ctx) {

    }

    @Override
    public void enterRelationalExpression(QMLParser.RelationalExpressionContext ctx) {

    }

    @Override
    public void exitRelationalExpression(QMLParser.RelationalExpressionContext ctx) {

    }

    @Override
    public void enterShiftExpression(QMLParser.ShiftExpressionContext ctx) {

    }

    @Override
    public void exitShiftExpression(QMLParser.ShiftExpressionContext ctx) {

    }

    @Override
    public void enterAdditiveExpression(QMLParser.AdditiveExpressionContext ctx) {

    }

    @Override
    public void exitAdditiveExpression(QMLParser.AdditiveExpressionContext ctx) {

    }

    @Override
    public void enterMultiplicativeExpression(QMLParser.MultiplicativeExpressionContext ctx) {

    }

    @Override
    public void exitMultiplicativeExpression(QMLParser.MultiplicativeExpressionContext ctx) {

    }

    @Override
    public void enterUnaryExpression(QMLParser.UnaryExpressionContext ctx) {

    }

    @Override
    public void exitUnaryExpression(QMLParser.UnaryExpressionContext ctx) {

    }

    @Override
    public void enterPostfixExpression(QMLParser.PostfixExpressionContext ctx) {

    }

    @Override
    public void exitPostfixExpression(QMLParser.PostfixExpressionContext ctx) {

    }

    @Override
    public void enterReservedIdentifier(QMLParser.ReservedIdentifierContext ctx) {

    }

    @Override
    public void exitReservedIdentifier(QMLParser.ReservedIdentifierContext ctx) {

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
