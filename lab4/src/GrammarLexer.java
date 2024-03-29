// Generated from /home/phoenix/CLionProjects/MT/lab4/src/Grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ARG=7, JAVA_CODE=8, NON_TERMINAL_NAME=9, 
		TERMINAL_NAME=10, REGEX=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "ARG", "JAVA_CODE", "NON_TERMINAL_NAME", 
			"TERMINAL_NAME", "REGEX", "WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\6\b=\n\b\r\b\16\b>\3\b\3\b\3\t\3\t\3\t\3\t\6\tG\n\t\r\t\16"+
		"\tH\3\t\3\t\3\t\3\n\3\n\7\nP\n\n\f\n\16\nS\13\n\3\13\3\13\7\13W\n\13\f"+
		"\13\16\13Z\13\13\3\f\3\f\3\f\3\f\6\f`\n\f\r\f\16\fa\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\5>Ha\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\3\2\6\3\2c|\6\2\62;C\\aac|\3\2C\\\5\2\13\f\17\17\"\"\2n\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\3\33\3\2\2\2\5#\3\2\2\2\7,\3\2\2\2\t\64\3\2\2\2\13\66\3\2\2\2\r"+
		"8\3\2\2\2\17:\3\2\2\2\21B\3\2\2\2\23M\3\2\2\2\25T\3\2\2\2\27[\3\2\2\2"+
		"\31f\3\2\2\2\33\34\7B\2\2\34\35\7j\2\2\35\36\7g\2\2\36\37\7c\2\2\37 \7"+
		"f\2\2 !\7g\2\2!\"\7t\2\2\"\4\3\2\2\2#$\7B\2\2$%\7o\2\2%&\7g\2\2&\'\7o"+
		"\2\2\'(\7d\2\2()\7g\2\2)*\7t\2\2*+\7u\2\2+\6\3\2\2\2,-\7t\2\2-.\7g\2\2"+
		"./\7v\2\2/\60\7w\2\2\60\61\7t\2\2\61\62\7p\2\2\62\63\7u\2\2\63\b\3\2\2"+
		"\2\64\65\7<\2\2\65\n\3\2\2\2\66\67\7=\2\2\67\f\3\2\2\289\7~\2\29\16\3"+
		"\2\2\2:<\7]\2\2;=\13\2\2\2<;\3\2\2\2=>\3\2\2\2>?\3\2\2\2><\3\2\2\2?@\3"+
		"\2\2\2@A\7_\2\2A\20\3\2\2\2BC\7}\2\2CD\7<\2\2DF\3\2\2\2EG\13\2\2\2FE\3"+
		"\2\2\2GH\3\2\2\2HI\3\2\2\2HF\3\2\2\2IJ\3\2\2\2JK\7<\2\2KL\7\177\2\2L\22"+
		"\3\2\2\2MQ\t\2\2\2NP\t\3\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R"+
		"\24\3\2\2\2SQ\3\2\2\2TX\t\4\2\2UW\t\3\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2"+
		"\2XY\3\2\2\2Y\26\3\2\2\2ZX\3\2\2\2[\\\7]\2\2\\]\7]\2\2]_\3\2\2\2^`\13"+
		"\2\2\2_^\3\2\2\2`a\3\2\2\2ab\3\2\2\2a_\3\2\2\2bc\3\2\2\2cd\7_\2\2de\7"+
		"_\2\2e\30\3\2\2\2fg\t\5\2\2gh\3\2\2\2hi\b\r\2\2i\32\3\2\2\2\b\2>HQXa\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}