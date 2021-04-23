// Generated from /home/phoenix/CLionProjects/MT/lab3/src/Haskell.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HaskellParser}.
 */
public interface HaskellListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HaskellParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(HaskellParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(HaskellParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(HaskellParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(HaskellParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(HaskellParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(HaskellParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(HaskellParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(HaskellParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(HaskellParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(HaskellParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#myCase}.
	 * @param ctx the parse tree
	 */
	void enterMyCase(HaskellParser.MyCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#myCase}.
	 * @param ctx the parse tree
	 */
	void exitMyCase(HaskellParser.MyCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#caseStructure}.
	 * @param ctx the parse tree
	 */
	void enterCaseStructure(HaskellParser.CaseStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#caseStructure}.
	 * @param ctx the parse tree
	 */
	void exitCaseStructure(HaskellParser.CaseStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(HaskellParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(HaskellParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(HaskellParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(HaskellParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(HaskellParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(HaskellParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#restCondition}.
	 * @param ctx the parse tree
	 */
	void enterRestCondition(HaskellParser.RestConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#restCondition}.
	 * @param ctx the parse tree
	 */
	void exitRestCondition(HaskellParser.RestConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(HaskellParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(HaskellParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HaskellParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HaskellParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#restExpression}.
	 * @param ctx the parse tree
	 */
	void enterRestExpression(HaskellParser.RestExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#restExpression}.
	 * @param ctx the parse tree
	 */
	void exitRestExpression(HaskellParser.RestExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(HaskellParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(HaskellParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#argsExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgsExpression(HaskellParser.ArgsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#argsExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgsExpression(HaskellParser.ArgsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(HaskellParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(HaskellParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#myIf}.
	 * @param ctx the parse tree
	 */
	void enterMyIf(HaskellParser.MyIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#myIf}.
	 * @param ctx the parse tree
	 */
	void exitMyIf(HaskellParser.MyIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#myThen}.
	 * @param ctx the parse tree
	 */
	void enterMyThen(HaskellParser.MyThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#myThen}.
	 * @param ctx the parse tree
	 */
	void exitMyThen(HaskellParser.MyThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#myElse}.
	 * @param ctx the parse tree
	 */
	void enterMyElse(HaskellParser.MyElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#myElse}.
	 * @param ctx the parse tree
	 */
	void exitMyElse(HaskellParser.MyElseContext ctx);
}