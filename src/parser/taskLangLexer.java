// Generated from taskLang.g4 by ANTLR 4.7.1
package parser;

	import estruturas.taskSimbolo;
	import estruturas.taskTabelaSimbolo;
	import estruturas.taskVariavel;
	import excecoes.ExcecaoSemantica;
	import java.util.ArrayList;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class taskLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, AP=7, FP=8, PV=9, OP=10, 
		ATTR=11, VIR=12, ID=13, NUMBER=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "AP", "FP", "PV", "OP", 
			"ATTR", "VIR", "ID", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'STARTPROG'", "'ENDPROG'", "'Number'", "'Text'", "'Read'", "'Write'", 
			"'('", "')'", "';'", null, "'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "AP", "FP", "PV", "OP", "ATTR", 
			"VIR", "ID", "NUMBER", "WS"
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


	public taskLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "taskLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\7\16"+
		"Y\n\16\f\16\16\16\\\13\16\3\17\6\17_\n\17\r\17\16\17`\3\17\3\17\6\17e"+
		"\n\17\r\17\16\17f\5\17i\n\17\3\20\3\20\3\20\3\20\2\2\21\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\7\5"+
		"\2,-//\61\61\3\2c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2q\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5+\3\2\2\2\7\63"+
		"\3\2\2\2\t:\3\2\2\2\13?\3\2\2\2\rD\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23"+
		"N\3\2\2\2\25P\3\2\2\2\27R\3\2\2\2\31T\3\2\2\2\33V\3\2\2\2\35^\3\2\2\2"+
		"\37j\3\2\2\2!\"\7U\2\2\"#\7V\2\2#$\7C\2\2$%\7T\2\2%&\7V\2\2&\'\7R\2\2"+
		"\'(\7T\2\2()\7Q\2\2)*\7I\2\2*\4\3\2\2\2+,\7G\2\2,-\7P\2\2-.\7F\2\2./\7"+
		"R\2\2/\60\7T\2\2\60\61\7Q\2\2\61\62\7I\2\2\62\6\3\2\2\2\63\64\7P\2\2\64"+
		"\65\7w\2\2\65\66\7o\2\2\66\67\7d\2\2\678\7g\2\289\7t\2\29\b\3\2\2\2:;"+
		"\7V\2\2;<\7g\2\2<=\7z\2\2=>\7v\2\2>\n\3\2\2\2?@\7T\2\2@A\7g\2\2AB\7c\2"+
		"\2BC\7f\2\2C\f\3\2\2\2DE\7Y\2\2EF\7t\2\2FG\7k\2\2GH\7v\2\2HI\7g\2\2I\16"+
		"\3\2\2\2JK\7*\2\2K\20\3\2\2\2LM\7+\2\2M\22\3\2\2\2NO\7=\2\2O\24\3\2\2"+
		"\2PQ\t\2\2\2Q\26\3\2\2\2RS\7?\2\2S\30\3\2\2\2TU\7.\2\2U\32\3\2\2\2VZ\t"+
		"\3\2\2WY\t\4\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\34\3\2\2\2"+
		"\\Z\3\2\2\2]_\t\5\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ah\3\2\2"+
		"\2bd\7\60\2\2ce\t\5\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2"+
		"\2\2hb\3\2\2\2hi\3\2\2\2i\36\3\2\2\2jk\t\6\2\2kl\3\2\2\2lm\b\20\2\2m "+
		"\3\2\2\2\b\2XZ`fh\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}