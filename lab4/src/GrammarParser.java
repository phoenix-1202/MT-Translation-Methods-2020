// Generated from /home/phoenix/CLionProjects/MT/lab4/src/Grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ARG=7, JAVA_CODE=8, NON_TERMINAL_NAME=9, 
		TERMINAL_NAME=10, REGEX=11, WS=12;
	public static final int
		RULE_start = 0, RULE_header = 1, RULE_members = 2, RULE_rules = 3, RULE_rulex = 4, 
		RULE_nonTerminalRule = 5, RULE_terminalRule = 6, RULE_opts = 7, RULE_opt = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "header", "members", "rules", "rulex", "nonTerminalRule", "terminalRule", 
			"opts", "opt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@header'", "'@members'", "'returns'", "':'", "';'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ARG", "JAVA_CODE", "NON_TERMINAL_NAME", 
			"TERMINAL_NAME", "REGEX", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(18);
				header();
				}
			}

			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(21);
				members();
				}
			}

			setState(24);
			rules();
			setState(25);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public String txt;
		public Token JAVA_CODE;
		public TerminalNode JAVA_CODE() { return getToken(GrammarParser.JAVA_CODE, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__0);
			setState(28);
			((HeaderContext)_localctx).JAVA_CODE = match(JAVA_CODE);
			((HeaderContext)_localctx).txt =  (((HeaderContext)_localctx).JAVA_CODE!=null?((HeaderContext)_localctx).JAVA_CODE.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MembersContext extends ParserRuleContext {
		public String txt;
		public Token JAVA_CODE;
		public TerminalNode JAVA_CODE() { return getToken(GrammarParser.JAVA_CODE, 0); }
		public MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_members);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__1);
			setState(32);
			((MembersContext)_localctx).JAVA_CODE = match(JAVA_CODE);
			((MembersContext)_localctx).txt =  (((MembersContext)_localctx).JAVA_CODE!=null?((MembersContext)_localctx).JAVA_CODE.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext {
		public List<RulexContext> rulex() {
			return getRuleContexts(RulexContext.class);
		}
		public RulexContext rulex(int i) {
			return getRuleContext(RulexContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				rulex();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NON_TERMINAL_NAME || _la==TERMINAL_NAME );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulexContext extends ParserRuleContext {
		public NonTerminalRuleContext nonTerminalRule() {
			return getRuleContext(NonTerminalRuleContext.class,0);
		}
		public TerminalRuleContext terminalRule() {
			return getRuleContext(TerminalRuleContext.class,0);
		}
		public RulexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRulex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRulex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRulex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulexContext rulex() throws RecognitionException {
		RulexContext _localctx = new RulexContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rulex);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON_TERMINAL_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				nonTerminalRule();
				}
				break;
			case TERMINAL_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				terminalRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonTerminalRuleContext extends ParserRuleContext {
		public NonTerminalRule ntr;
		public Token NON_TERMINAL_NAME;
		public Token ARG;
		public OptsContext opts;
		public TerminalNode NON_TERMINAL_NAME() { return getToken(GrammarParser.NON_TERMINAL_NAME, 0); }
		public OptsContext opts() {
			return getRuleContext(OptsContext.class,0);
		}
		public List<TerminalNode> ARG() { return getTokens(GrammarParser.ARG); }
		public TerminalNode ARG(int i) {
			return getToken(GrammarParser.ARG, i);
		}
		public NonTerminalRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNonTerminalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNonTerminalRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNonTerminalRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalRuleContext nonTerminalRule() throws RecognitionException {
		NonTerminalRuleContext _localctx = new NonTerminalRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nonTerminalRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((NonTerminalRuleContext)_localctx).NON_TERMINAL_NAME = match(NON_TERMINAL_NAME);
			((NonTerminalRuleContext)_localctx).ntr =  new NonTerminalRule((((NonTerminalRuleContext)_localctx).NON_TERMINAL_NAME!=null?((NonTerminalRuleContext)_localctx).NON_TERMINAL_NAME.getText():null));
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARG) {
				{
				setState(46);
				((NonTerminalRuleContext)_localctx).ARG = match(ARG);
				_localctx.ntr.inhArg = (((NonTerminalRuleContext)_localctx).ARG!=null?((NonTerminalRuleContext)_localctx).ARG.getText():null);
				}
			}

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(50);
				match(T__2);
				setState(51);
				((NonTerminalRuleContext)_localctx).ARG = match(ARG);
				_localctx.ntr.synthArg = (((NonTerminalRuleContext)_localctx).ARG!=null?((NonTerminalRuleContext)_localctx).ARG.getText():null);
				}
			}

			setState(55);
			match(T__3);
			setState(56);
			((NonTerminalRuleContext)_localctx).opts = opts();
			_localctx.ntr.opts = ((NonTerminalRuleContext)_localctx).opts.optionals;
			setState(58);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalRuleContext extends ParserRuleContext {
		public TerminalRule tr;
		public Token TERMINAL_NAME;
		public Token REGEX;
		public TerminalNode TERMINAL_NAME() { return getToken(GrammarParser.TERMINAL_NAME, 0); }
		public TerminalNode REGEX() { return getToken(GrammarParser.REGEX, 0); }
		public TerminalRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerminalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerminalRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTerminalRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalRuleContext terminalRule() throws RecognitionException {
		TerminalRuleContext _localctx = new TerminalRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_terminalRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((TerminalRuleContext)_localctx).TERMINAL_NAME = match(TERMINAL_NAME);
			setState(61);
			match(T__3);
			setState(62);
			((TerminalRuleContext)_localctx).REGEX = match(REGEX);
			setState(63);
			match(T__4);
			((TerminalRuleContext)_localctx).tr =  new TerminalRule((((TerminalRuleContext)_localctx).TERMINAL_NAME!=null?((TerminalRuleContext)_localctx).TERMINAL_NAME.getText():null), (((TerminalRuleContext)_localctx).REGEX!=null?((TerminalRuleContext)_localctx).REGEX.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptsContext extends ParserRuleContext {
		public ArrayList<ArrayList<Opt>> optionals;
		public OptContext opt;
		public List<OptContext> opt() {
			return getRuleContexts(OptContext.class);
		}
		public OptContext opt(int i) {
			return getRuleContext(OptContext.class,i);
		}
		public OptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOpts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOpts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOpts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptsContext opts() throws RecognitionException {
		OptsContext _localctx = new OptsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((OptsContext)_localctx).optionals =  new ArrayList<>();
			setState(67);
			((OptsContext)_localctx).opt = opt();
			_localctx.optionals.add(((OptsContext)_localctx).opt.lst);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(69);
				match(T__5);
				setState(70);
				((OptsContext)_localctx).opt = opt();
				_localctx.optionals.add(((OptsContext)_localctx).opt.lst);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptContext extends ParserRuleContext {
		public ArrayList<Opt> lst;
		public Token JAVA_CODE;
		public Token NON_TERMINAL_NAME;
		public Token ARG;
		public Token TERMINAL_NAME;
		public List<TerminalNode> JAVA_CODE() { return getTokens(GrammarParser.JAVA_CODE); }
		public TerminalNode JAVA_CODE(int i) {
			return getToken(GrammarParser.JAVA_CODE, i);
		}
		public List<TerminalNode> NON_TERMINAL_NAME() { return getTokens(GrammarParser.NON_TERMINAL_NAME); }
		public TerminalNode NON_TERMINAL_NAME(int i) {
			return getToken(GrammarParser.NON_TERMINAL_NAME, i);
		}
		public List<TerminalNode> TERMINAL_NAME() { return getTokens(GrammarParser.TERMINAL_NAME); }
		public TerminalNode TERMINAL_NAME(int i) {
			return getToken(GrammarParser.TERMINAL_NAME, i);
		}
		public List<TerminalNode> ARG() { return getTokens(GrammarParser.ARG); }
		public TerminalNode ARG(int i) {
			return getToken(GrammarParser.ARG, i);
		}
		public OptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptContext opt() throws RecognitionException {
		OptContext _localctx = new OptContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((OptContext)_localctx).lst =  new ArrayList<>();
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				Opt o;
				setState(90);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JAVA_CODE:
					{
					setState(80);
					((OptContext)_localctx).JAVA_CODE = match(JAVA_CODE);
					o = new Opt((((OptContext)_localctx).JAVA_CODE!=null?((OptContext)_localctx).JAVA_CODE.getText():null), 0);
					}
					break;
				case NON_TERMINAL_NAME:
					{
					setState(82);
					((OptContext)_localctx).NON_TERMINAL_NAME = match(NON_TERMINAL_NAME);
					o = new Opt((((OptContext)_localctx).NON_TERMINAL_NAME!=null?((OptContext)_localctx).NON_TERMINAL_NAME.getText():null), 1);
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ARG) {
						{
						setState(84);
						((OptContext)_localctx).ARG = match(ARG);
						o.arg = (((OptContext)_localctx).ARG!=null?((OptContext)_localctx).ARG.getText():null);
						}
					}

					}
					break;
				case TERMINAL_NAME:
					{
					setState(88);
					((OptContext)_localctx).TERMINAL_NAME = match(TERMINAL_NAME);
					o = new Opt((((OptContext)_localctx).TERMINAL_NAME!=null?((OptContext)_localctx).TERMINAL_NAME.getText():null), 2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				_localctx.lst.add(o);
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA_CODE) | (1L << NON_TERMINAL_NAME) | (1L << TERMINAL_NAME))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\5\2\26"+
		"\n\2\3\2\5\2\31\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\6"+
		"\5\'\n\5\r\5\16\5(\3\6\3\6\5\6-\n\6\3\7\3\7\3\7\3\7\5\7\63\n\7\3\7\3\7"+
		"\3\7\5\78\n\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\tL\n\t\f\t\16\tO\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\nY\n\n\3\n\3\n\5\n]\n\n\3\n\6\n`\n\n\r\n\16\na\3\n\2\2\13\2\4\6\b"+
		"\n\f\16\20\22\2\2\2e\2\25\3\2\2\2\4\35\3\2\2\2\6!\3\2\2\2\b&\3\2\2\2\n"+
		",\3\2\2\2\f.\3\2\2\2\16>\3\2\2\2\20D\3\2\2\2\22P\3\2\2\2\24\26\5\4\3\2"+
		"\25\24\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\31\5\6\4\2\30\27\3\2\2\2"+
		"\30\31\3\2\2\2\31\32\3\2\2\2\32\33\5\b\5\2\33\34\7\2\2\3\34\3\3\2\2\2"+
		"\35\36\7\3\2\2\36\37\7\n\2\2\37 \b\3\1\2 \5\3\2\2\2!\"\7\4\2\2\"#\7\n"+
		"\2\2#$\b\4\1\2$\7\3\2\2\2%\'\5\n\6\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()"+
		"\3\2\2\2)\t\3\2\2\2*-\5\f\7\2+-\5\16\b\2,*\3\2\2\2,+\3\2\2\2-\13\3\2\2"+
		"\2./\7\13\2\2/\62\b\7\1\2\60\61\7\t\2\2\61\63\b\7\1\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\67\3\2\2\2\64\65\7\5\2\2\65\66\7\t\2\2\668\b\7\1\2\67\64"+
		"\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\6\2\2:;\5\20\t\2;<\b\7\1\2<=\7\7\2"+
		"\2=\r\3\2\2\2>?\7\f\2\2?@\7\6\2\2@A\7\r\2\2AB\7\7\2\2BC\b\b\1\2C\17\3"+
		"\2\2\2DE\b\t\1\2EF\5\22\n\2FM\b\t\1\2GH\7\b\2\2HI\5\22\n\2IJ\b\t\1\2J"+
		"L\3\2\2\2KG\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\21\3\2\2\2OM\3\2\2"+
		"\2P_\b\n\1\2Q\\\b\n\1\2RS\7\n\2\2S]\b\n\1\2TU\7\13\2\2UX\b\n\1\2VW\7\t"+
		"\2\2WY\b\n\1\2XV\3\2\2\2XY\3\2\2\2Y]\3\2\2\2Z[\7\f\2\2[]\b\n\1\2\\R\3"+
		"\2\2\2\\T\3\2\2\2\\Z\3\2\2\2]^\3\2\2\2^`\b\n\1\2_Q\3\2\2\2`a\3\2\2\2a"+
		"_\3\2\2\2ab\3\2\2\2b\23\3\2\2\2\f\25\30(,\62\67MX\\a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}