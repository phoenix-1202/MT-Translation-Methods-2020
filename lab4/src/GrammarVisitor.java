// Generated from /home/phoenix/CLionProjects/MT/lab4/src/Grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(GrammarParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembers(GrammarParser.MembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(GrammarParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rulex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulex(GrammarParser.RulexContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminalRule(GrammarParser.NonTerminalRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalRule(GrammarParser.TerminalRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpts(GrammarParser.OptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt(GrammarParser.OptContext ctx);
}