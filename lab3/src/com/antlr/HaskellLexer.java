// Generated from /home/phoenix/CLionProjects/MT/lab3/src/Haskell.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NO_ARGS=4, LOGIC_OP=5, COMPARE_OP=6, OP=7, OB=8, 
		CB=9, NUMBER=10, NAME=11, TYPE=12, DOUBLE_COLON=13, ARROW=14, EQ=15, STICK=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "NO_ARGS", "LOGIC_OP", "COMPARE_OP", "OP", "OB", 
			"CB", "NUMBER", "NAME", "TYPE", "DOUBLE_COLON", "ARROW", "EQ", "STICK", 
			"WS"
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


	public HaskellLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Haskell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\69\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7E\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bN\n\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13V"+
		"\n\13\f\13\16\13Y\13\13\3\13\3\13\3\13\7\13^\n\13\f\13\16\13a\13\13\3"+
		"\13\3\13\6\13e\n\13\r\13\16\13f\3\13\3\13\3\13\3\13\6\13m\n\13\r\13\16"+
		"\13n\5\13q\n\13\3\f\3\f\7\fu\n\f\f\f\16\fx\13\f\3\r\3\r\7\r|\n\r\f\r\16"+
		"\r\177\13\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\6\22"+
		"\u008c\n\22\r\22\16\22\u008d\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\t\5\2-"+
		"-//\61\61\3\2\63;\3\2\62;\3\2c|\5\2\62;C\\c|\3\2C\\\5\2\13\f\17\17\"\""+
		"\2\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\3%\3\2\2\2\5(\3\2\2\2\7-\3\2\2\2\t\62\3\2\2\2\138\3\2\2"+
		"\2\rD\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25p\3\2\2\2\27r\3\2"+
		"\2\2\31y\3\2\2\2\33\u0080\3\2\2\2\35\u0083\3\2\2\2\37\u0086\3\2\2\2!\u0088"+
		"\3\2\2\2#\u008b\3\2\2\2%&\7k\2\2&\'\7h\2\2\'\4\3\2\2\2()\7v\2\2)*\7j\2"+
		"\2*+\7g\2\2+,\7p\2\2,\6\3\2\2\2-.\7g\2\2./\7n\2\2/\60\7u\2\2\60\61\7g"+
		"\2\2\61\b\3\2\2\2\62\63\7a\2\2\63\n\3\2\2\2\64\65\7~\2\2\659\7~\2\2\66"+
		"\67\7(\2\2\679\7(\2\28\64\3\2\2\28\66\3\2\2\29\f\3\2\2\2:E\7>\2\2;<\7"+
		">\2\2<E\7?\2\2=E\7@\2\2>?\7@\2\2?E\7?\2\2@A\7?\2\2AE\7?\2\2BC\7\61\2\2"+
		"CE\7?\2\2D:\3\2\2\2D;\3\2\2\2D=\3\2\2\2D>\3\2\2\2D@\3\2\2\2DB\3\2\2\2"+
		"E\16\3\2\2\2FN\t\2\2\2GH\7b\2\2HI\7o\2\2IJ\7q\2\2JK\7f\2\2KN\7b\2\2LN"+
		"\7,\2\2MF\3\2\2\2MG\3\2\2\2ML\3\2\2\2N\20\3\2\2\2OP\7*\2\2P\22\3\2\2\2"+
		"QR\7+\2\2R\24\3\2\2\2SW\t\3\2\2TV\t\4\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2"+
		"\2WX\3\2\2\2Xq\3\2\2\2YW\3\2\2\2Zq\7\62\2\2[_\t\3\2\2\\^\t\4\2\2]\\\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bd\7\60\2\2ce"+
		"\t\4\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gq\3\2\2\2hi\7\62\2\2"+
		"ij\7\60\2\2jl\3\2\2\2km\t\4\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2"+
		"\2oq\3\2\2\2pS\3\2\2\2pZ\3\2\2\2p[\3\2\2\2ph\3\2\2\2q\26\3\2\2\2rv\t\5"+
		"\2\2su\t\6\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\30\3\2\2\2xv\3"+
		"\2\2\2y}\t\7\2\2z|\t\6\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2"+
		"~\32\3\2\2\2\177}\3\2\2\2\u0080\u0081\7<\2\2\u0081\u0082\7<\2\2\u0082"+
		"\34\3\2\2\2\u0083\u0084\7/\2\2\u0084\u0085\7@\2\2\u0085\36\3\2\2\2\u0086"+
		"\u0087\7?\2\2\u0087 \3\2\2\2\u0088\u0089\7~\2\2\u0089\"\3\2\2\2\u008a"+
		"\u008c\t\b\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\22\2\2\u0090"+
		"$\3\2\2\2\16\28DMW_fnpv}\u008d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}