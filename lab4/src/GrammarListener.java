// Generated from /home/phoenix/CLionProjects/MT/lab4/src/Grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(GrammarParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(GrammarParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(GrammarParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(GrammarParser.MembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(GrammarParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(GrammarParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rulex}.
	 * @param ctx the parse tree
	 */
	void enterRulex(GrammarParser.RulexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rulex}.
	 * @param ctx the parse tree
	 */
	void exitRulex(GrammarParser.RulexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminalRule(GrammarParser.NonTerminalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminalRule(GrammarParser.NonTerminalRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void enterTerminalRule(GrammarParser.TerminalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void exitTerminalRule(GrammarParser.TerminalRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#opts}.
	 * @param ctx the parse tree
	 */
	void enterOpts(GrammarParser.OptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#opts}.
	 * @param ctx the parse tree
	 */
	void exitOpts(GrammarParser.OptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#opt}.
	 * @param ctx the parse tree
	 */
	void enterOpt(GrammarParser.OptContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#opt}.
	 * @param ctx the parse tree
	 */
	void exitOpt(GrammarParser.OptContext ctx);
}