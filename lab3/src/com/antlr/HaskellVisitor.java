// Generated from /home/phoenix/CLionProjects/MT/lab3/src/Haskell.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HaskellParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HaskellVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HaskellParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(HaskellParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(HaskellParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(HaskellParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(HaskellParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(HaskellParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#myCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyCase(HaskellParser.MyCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#caseStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStructure(HaskellParser.CaseStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(HaskellParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(HaskellParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(HaskellParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#restCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestCondition(HaskellParser.RestConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#logicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpression(HaskellParser.LogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HaskellParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#restExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestExpression(HaskellParser.RestExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(HaskellParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#argsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsExpression(HaskellParser.ArgsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(HaskellParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#myIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyIf(HaskellParser.MyIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#myThen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyThen(HaskellParser.MyThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#myElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyElse(HaskellParser.MyElseContext ctx);
}