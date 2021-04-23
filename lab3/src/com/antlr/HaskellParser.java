// Generated from /home/phoenix/CLionProjects/MT/lab3/src/Haskell.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NO_ARGS=4, LOGIC_OP=5, COMPARE_OP=6, OP=7, OB=8, 
		CB=9, NUMBER=10, NAME=11, TYPE=12, DOUBLE_COLON=13, ARROW=14, EQ=15, STICK=16, 
		WS=17;
	public static final int
		RULE_start = 0, RULE_function = 1, RULE_declaration = 2, RULE_types = 3, 
		RULE_body = 4, RULE_myCase = 5, RULE_caseStructure = 6, RULE_result = 7, 
		RULE_args = 8, RULE_condition = 9, RULE_restCondition = 10, RULE_logicExpression = 11, 
		RULE_expression = 12, RULE_restExpression = 13, RULE_callFunction = 14, 
		RULE_argsExpression = 15, RULE_data = 16, RULE_myIf = 17, RULE_myThen = 18, 
		RULE_myElse = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "function", "declaration", "types", "body", "myCase", "caseStructure", 
			"result", "args", "condition", "restCondition", "logicExpression", "expression", 
			"restExpression", "callFunction", "argsExpression", "data", "myIf", "myThen", 
			"myElse"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'_'", null, null, null, "'('", "')'", 
			null, null, null, "'::'", "'->'", "'='", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NO_ARGS", "LOGIC_OP", "COMPARE_OP", "OP", "OB", 
			"CB", "NUMBER", "NAME", "TYPE", "DOUBLE_COLON", "ARROW", "EQ", "STICK", 
			"WS"
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
	public String getGrammarFileName() { return "Haskell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HaskellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitStart(this);
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME || _la==TYPE) {
				{
				{
				setState(40);
				function();
				}
				}
				setState(45);
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

	public static class FunctionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			declaration();
			setState(47);
			body();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DOUBLE_COLON() { return getToken(HaskellParser.DOUBLE_COLON, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public List<TerminalNode> TYPE() { return getTokens(HaskellParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(HaskellParser.TYPE, i);
		}
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(50);
			match(DOUBLE_COLON);
			setState(51);
			types();
			setState(52);
			match(TYPE);
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

	public static class TypesContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(HaskellParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(HaskellParser.TYPE, i);
		}
		public List<TerminalNode> ARROW() { return getTokens(HaskellParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(HaskellParser.ARROW, i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_types);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					match(TYPE);
					setState(55);
					match(ARROW);
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class BodyContext extends ParserRuleContext {
		public List<MyCaseContext> myCase() {
			return getRuleContexts(MyCaseContext.class);
		}
		public MyCaseContext myCase(int i) {
			return getRuleContext(MyCaseContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(61);
					myCase();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(64); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class MyCaseContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CaseStructureContext caseStructure() {
			return getRuleContext(CaseStructureContext.class,0);
		}
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public TerminalNode TYPE() { return getToken(HaskellParser.TYPE, 0); }
		public MyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMyCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMyCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitMyCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyCaseContext myCase() throws RecognitionException {
		MyCaseContext _localctx = new MyCaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_myCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(67);
			args();
			setState(68);
			caseStructure();
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

	public static class CaseStructureContext extends ParserRuleContext {
		public TerminalNode STICK() { return getToken(HaskellParser.STICK, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TerminalNode EQ() { return getToken(HaskellParser.EQ, 0); }
		public MyIfContext myIf() {
			return getRuleContext(MyIfContext.class,0);
		}
		public MyThenContext myThen() {
			return getRuleContext(MyThenContext.class,0);
		}
		public MyElseContext myElse() {
			return getRuleContext(MyElseContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CaseStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCaseStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCaseStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitCaseStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStructureContext caseStructure() throws RecognitionException {
		CaseStructureContext _localctx = new CaseStructureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_caseStructure);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(STICK);
				setState(71);
				condition(0);
				setState(72);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(EQ);
				setState(75);
				myIf();
				setState(76);
				myThen();
				setState(77);
				myElse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(EQ);
				setState(80);
				expression(0);
				}
				break;
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

	public static class ResultContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(HaskellParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(EQ);
			setState(84);
			expression(0);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(HaskellParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HaskellParser.NAME, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(86);
				match(NAME);
				}
				}
				setState(91);
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

	public static class ConditionContext extends ParserRuleContext {
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public TerminalNode LOGIC_OP() { return getToken(HaskellParser.LOGIC_OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RestConditionContext restCondition() {
			return getRuleContext(RestConditionContext.class,0);
		}
		public TerminalNode OB() { return getToken(HaskellParser.OB, 0); }
		public TerminalNode CB() { return getToken(HaskellParser.CB, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(93);
				logicExpression();
				}
				break;
			case 2:
				{
				setState(94);
				match(LOGIC_OP);
				setState(95);
				condition(0);
				setState(96);
				restCondition();
				}
				break;
			case 3:
				{
				setState(98);
				match(OB);
				setState(99);
				condition(0);
				setState(100);
				match(CB);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(104);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(105);
					match(LOGIC_OP);
					setState(106);
					restCondition();
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RestConditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RestConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterRestCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitRestCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitRestCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestConditionContext restCondition() throws RecognitionException {
		RestConditionContext _localctx = new RestConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_restCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			condition(0);
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

	public static class LogicExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMPARE_OP() { return getToken(HaskellParser.COMPARE_OP, 0); }
		public RestExpressionContext restExpression() {
			return getRuleContext(RestExpressionContext.class,0);
		}
		public TerminalNode OB() { return getToken(HaskellParser.OB, 0); }
		public TerminalNode CB() { return getToken(HaskellParser.CB, 0); }
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterLogicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitLogicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicExpression);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(COMPARE_OP);
				setState(116);
				expression(0);
				setState(117);
				restExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				expression(0);
				setState(120);
				match(COMPARE_OP);
				setState(121);
				restExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(OB);
				setState(124);
				expression(0);
				setState(125);
				match(CB);
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode OP() { return getToken(HaskellParser.OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RestExpressionContext restExpression() {
			return getRuleContext(RestExpressionContext.class,0);
		}
		public TerminalNode OB() { return getToken(HaskellParser.OB, 0); }
		public TerminalNode CB() { return getToken(HaskellParser.CB, 0); }
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(130);
				data();
				}
				break;
			case 2:
				{
				setState(131);
				match(OP);
				setState(132);
				expression(0);
				setState(133);
				restExpression();
				}
				break;
			case 3:
				{
				setState(135);
				match(OB);
				setState(136);
				expression(0);
				setState(137);
				match(CB);
				}
				break;
			case 4:
				{
				setState(139);
				callFunction();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(142);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(143);
					match(OP);
					setState(144);
					restExpression();
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RestExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RestExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterRestExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitRestExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitRestExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestExpressionContext restExpression() throws RecognitionException {
		RestExpressionContext _localctx = new RestExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_restExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			expression(0);
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

	public static class CallFunctionContext extends ParserRuleContext {
		public TerminalNode OB() { return getToken(HaskellParser.OB, 0); }
		public TerminalNode CB() { return getToken(HaskellParser.CB, 0); }
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public TerminalNode TYPE() { return getToken(HaskellParser.TYPE, 0); }
		public ArgsExpressionContext argsExpression() {
			return getRuleContext(ArgsExpressionContext.class,0);
		}
		public TerminalNode NO_ARGS() { return getToken(HaskellParser.NO_ARGS, 0); }
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(OB);
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
			case OB:
			case NUMBER:
			case NAME:
				{
				setState(154);
				argsExpression();
				}
				break;
			case NO_ARGS:
				{
				setState(155);
				match(NO_ARGS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(158);
			match(CB);
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

	public static class ArgsExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgsExpressionContext argsExpression() {
			return getRuleContext(ArgsExpressionContext.class,0);
		}
		public ArgsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterArgsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitArgsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitArgsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsExpressionContext argsExpression() throws RecognitionException {
		ArgsExpressionContext _localctx = new ArgsExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argsExpression);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				expression(0);
				setState(162);
				argsExpression();
				}
				break;
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

	public static class DataContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(HaskellParser.NUMBER, 0); }
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MyIfContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public MyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMyIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitMyIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyIfContext myIf() throws RecognitionException {
		MyIfContext _localctx = new MyIfContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_myIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__0);
			setState(169);
			condition(0);
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

	public static class MyThenContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MyThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myThen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMyThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMyThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitMyThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyThenContext myThen() throws RecognitionException {
		MyThenContext _localctx = new MyThenContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_myThen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__1);
			setState(172);
			expression(0);
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

	public static class MyElseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MyElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMyElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMyElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitMyElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyElseContext myElse() throws RecognitionException {
		MyElseContext _localctx = new MyElseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_myElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__2);
			setState(175);
			expression(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u00b4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\6\6A\n\6\r\6"+
		"\16\6B\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"T\n\b\3\t\3\t\3\t\3\n\7\nZ\n\n\f\n\16\n]\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13i\n\13\3\13\3\13\3\13\7\13n\n\13\f\13\16"+
		"\13q\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0082\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u008f\n\16\3\16\3\16\3\16\7\16\u0094\n\16\f\16\16\16\u0097\13\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u009f\n\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\5\21\u00a7\n\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\2\4\24\32\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2"+
		"\4\3\2\r\16\3\2\f\r\2\u00b1\2-\3\2\2\2\4\60\3\2\2\2\6\63\3\2\2\2\b<\3"+
		"\2\2\2\n@\3\2\2\2\fD\3\2\2\2\16S\3\2\2\2\20U\3\2\2\2\22[\3\2\2\2\24h\3"+
		"\2\2\2\26r\3\2\2\2\30\u0081\3\2\2\2\32\u008e\3\2\2\2\34\u0098\3\2\2\2"+
		"\36\u009a\3\2\2\2 \u00a6\3\2\2\2\"\u00a8\3\2\2\2$\u00aa\3\2\2\2&\u00ad"+
		"\3\2\2\2(\u00b0\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2"+
		"\2\2.\3\3\2\2\2/-\3\2\2\2\60\61\5\6\4\2\61\62\5\n\6\2\62\5\3\2\2\2\63"+
		"\64\t\2\2\2\64\65\7\17\2\2\65\66\5\b\5\2\66\67\7\16\2\2\67\7\3\2\2\28"+
		"9\7\16\2\29;\7\20\2\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\t\3\2\2"+
		"\2><\3\2\2\2?A\5\f\7\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\13\3\2"+
		"\2\2DE\t\2\2\2EF\5\22\n\2FG\5\16\b\2G\r\3\2\2\2HI\7\22\2\2IJ\5\24\13\2"+
		"JK\5\20\t\2KT\3\2\2\2LM\7\21\2\2MN\5$\23\2NO\5&\24\2OP\5(\25\2PT\3\2\2"+
		"\2QR\7\21\2\2RT\5\32\16\2SH\3\2\2\2SL\3\2\2\2SQ\3\2\2\2T\17\3\2\2\2UV"+
		"\7\21\2\2VW\5\32\16\2W\21\3\2\2\2XZ\7\r\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2"+
		"\2\2[\\\3\2\2\2\\\23\3\2\2\2][\3\2\2\2^_\b\13\1\2_i\5\30\r\2`a\7\7\2\2"+
		"ab\5\24\13\2bc\5\26\f\2ci\3\2\2\2de\7\n\2\2ef\5\24\13\2fg\7\13\2\2gi\3"+
		"\2\2\2h^\3\2\2\2h`\3\2\2\2hd\3\2\2\2io\3\2\2\2jk\f\4\2\2kl\7\7\2\2ln\5"+
		"\26\f\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\25\3\2\2\2qo\3\2\2\2"+
		"rs\5\24\13\2s\27\3\2\2\2t\u0082\5\32\16\2uv\7\b\2\2vw\5\32\16\2wx\5\34"+
		"\17\2x\u0082\3\2\2\2yz\5\32\16\2z{\7\b\2\2{|\5\34\17\2|\u0082\3\2\2\2"+
		"}~\7\n\2\2~\177\5\32\16\2\177\u0080\7\13\2\2\u0080\u0082\3\2\2\2\u0081"+
		"t\3\2\2\2\u0081u\3\2\2\2\u0081y\3\2\2\2\u0081}\3\2\2\2\u0082\31\3\2\2"+
		"\2\u0083\u0084\b\16\1\2\u0084\u008f\5\"\22\2\u0085\u0086\7\t\2\2\u0086"+
		"\u0087\5\32\16\2\u0087\u0088\5\34\17\2\u0088\u008f\3\2\2\2\u0089\u008a"+
		"\7\n\2\2\u008a\u008b\5\32\16\2\u008b\u008c\7\13\2\2\u008c\u008f\3\2\2"+
		"\2\u008d\u008f\5\36\20\2\u008e\u0083\3\2\2\2\u008e\u0085\3\2\2\2\u008e"+
		"\u0089\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0095\3\2\2\2\u0090\u0091\f\5"+
		"\2\2\u0091\u0092\7\t\2\2\u0092\u0094\5\34\17\2\u0093\u0090\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\33\3\2\2"+
		"\2\u0097\u0095\3\2\2\2\u0098\u0099\5\32\16\2\u0099\35\3\2\2\2\u009a\u009b"+
		"\7\n\2\2\u009b\u009e\t\2\2\2\u009c\u009f\5 \21\2\u009d\u009f\7\6\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\13"+
		"\2\2\u00a1\37\3\2\2\2\u00a2\u00a7\5\32\16\2\u00a3\u00a4\5\32\16\2\u00a4"+
		"\u00a5\5 \21\2\u00a5\u00a7\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2"+
		"\2\2\u00a7!\3\2\2\2\u00a8\u00a9\t\3\2\2\u00a9#\3\2\2\2\u00aa\u00ab\7\3"+
		"\2\2\u00ab\u00ac\5\24\13\2\u00ac%\3\2\2\2\u00ad\u00ae\7\4\2\2\u00ae\u00af"+
		"\5\32\16\2\u00af\'\3\2\2\2\u00b0\u00b1\7\5\2\2\u00b1\u00b2\5\32\16\2\u00b2"+
		")\3\2\2\2\16-<BS[ho\u0081\u008e\u0095\u009e\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}