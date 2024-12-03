// Generated from DSL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, NAME=2, ACTION=3, SHAPE=4, WS=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COLON", "NAME", "ACTION", "SHAPE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "NAME", "ACTION", "SHAPE", "WS"
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


	public DSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DSL.g4"; }

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
		"\u0004\u0000\u0005X\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u0010\b\u0001\n\u0001\f\u0001\u0013\t\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0017\b\u0001\n\u0001\f\u0001\u001a\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002,\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003P\b\u0003\u0001\u0004\u0004\u0004"+
		"S\b\u0004\u000b\u0004\f\u0004T\u0001\u0004\u0001\u0004\u0000\u0000\u0005"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u0001\u0000\u0003"+
		"\u0001\u0000AZ\u0001\u0000az\u0003\u0000\t\n\r\r  `\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0001\u000b\u0001\u0000\u0000\u0000\u0003\r\u0001\u0000\u0000"+
		"\u0000\u0005+\u0001\u0000\u0000\u0000\u0007O\u0001\u0000\u0000\u0000\t"+
		"R\u0001\u0000\u0000\u0000\u000b\f\u0005:\u0000\u0000\f\u0002\u0001\u0000"+
		"\u0000\u0000\r\u0011\u0007\u0000\u0000\u0000\u000e\u0010\u0007\u0001\u0000"+
		"\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000\u0000"+
		"\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000"+
		"\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000"+
		"\u0000\u0014\u0018\u0007\u0000\u0000\u0000\u0015\u0017\u0007\u0001\u0000"+
		"\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000"+
		"\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000"+
		"\u0000\u0019\u0004\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0005c\u0000\u0000\u001c\u001d\u0005r\u0000\u0000\u001d"+
		"\u001e\u0005e\u0000\u0000\u001e\u001f\u0005a\u0000\u0000\u001f \u0005"+
		"t\u0000\u0000 ,\u0005e\u0000\u0000!\"\u0005d\u0000\u0000\"#\u0005e\u0000"+
		"\u0000#$\u0005l\u0000\u0000$%\u0005e\u0000\u0000%&\u0005t\u0000\u0000"+
		"&,\u0005e\u0000\u0000\'(\u0005m\u0000\u0000()\u0005o\u0000\u0000)*\u0005"+
		"v\u0000\u0000*,\u0005e\u0000\u0000+\u001b\u0001\u0000\u0000\u0000+!\u0001"+
		"\u0000\u0000\u0000+\'\u0001\u0000\u0000\u0000,\u0006\u0001\u0000\u0000"+
		"\u0000-.\u0005R\u0000\u0000./\u0005e\u0000\u0000/0\u0005c\u0000\u0000"+
		"01\u0005t\u0000\u000012\u0005a\u0000\u000023\u0005n\u0000\u000034\u0005"+
		"g\u0000\u000045\u0005l\u0000\u00005P\u0005e\u0000\u000067\u0005C\u0000"+
		"\u000078\u0005i\u0000\u000089\u0005r\u0000\u00009:\u0005c\u0000\u0000"+
		":;\u0005l\u0000\u0000;P\u0005e\u0000\u0000<=\u0005S\u0000\u0000=>\u0005"+
		"q\u0000\u0000>?\u0005u\u0000\u0000?@\u0005a\u0000\u0000@A\u0005r\u0000"+
		"\u0000AP\u0005e\u0000\u0000BC\u0005E\u0000\u0000CD\u0005l\u0000\u0000"+
		"DE\u0005i\u0000\u0000EF\u0005p\u0000\u0000FG\u0005s\u0000\u0000GP\u0005"+
		"e\u0000\u0000HI\u0005D\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005a\u0000"+
		"\u0000KL\u0005m\u0000\u0000LM\u0005o\u0000\u0000MN\u0005n\u0000\u0000"+
		"NP\u0005d\u0000\u0000O-\u0001\u0000\u0000\u0000O6\u0001\u0000\u0000\u0000"+
		"O<\u0001\u0000\u0000\u0000OB\u0001\u0000\u0000\u0000OH\u0001\u0000\u0000"+
		"\u0000P\b\u0001\u0000\u0000\u0000QS\u0007\u0002\u0000\u0000RQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0006\u0004\u0000\u0000"+
		"W\n\u0001\u0000\u0000\u0000\u0006\u0000\u0011\u0018+OT\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}