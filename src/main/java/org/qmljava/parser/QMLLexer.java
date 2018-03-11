// Generated from QML.g4 by ANTLR 4.7.1

    package org.qmljava.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDTOKEN=1, COLON=2, LBRACE=3, RBRACE=4, PROPERTY_TOKEN=5, BOOL=6, INT=7, 
		DOUBLE=8, REAL=9, LIST=10, STRING=11, URL=12, VAR=13, Identifier=14, ObjectType=15, 
		WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IDTOKEN", "COLON", "LBRACE", "RBRACE", "PROPERTY_TOKEN", "BOOL", "INT", 
		"DOUBLE", "REAL", "LIST", "STRING", "URL", "VAR", "Identifier", "ObjectType", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'id'", "':'", "'{'", "'}'", "'property'", "'bool'", "'int'", "'double'", 
		"'real'", "'list'", "'string'", "'url'", "'var'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IDTOKEN", "COLON", "LBRACE", "RBRACE", "PROPERTY_TOKEN", "BOOL", 
		"INT", "DOUBLE", "REAL", "LIST", "STRING", "URL", "VAR", "Identifier", 
		"ObjectType", "WS"
	};
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


	public QMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QML.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\6\17a\n\17\r\17\16\17b\3\20\3\20"+
		"\6\20g\n\20\r\20\16\20h\3\21\3\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\6\3\2"+
		"c|\6\2\62;C\\aac|\3\2C\\\6\2\13\f\17\17\"\"==\2o\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5&\3\2\2\2\7(\3\2"+
		"\2\2\t*\3\2\2\2\13,\3\2\2\2\r\65\3\2\2\2\17:\3\2\2\2\21>\3\2\2\2\23E\3"+
		"\2\2\2\25J\3\2\2\2\27O\3\2\2\2\31V\3\2\2\2\33Z\3\2\2\2\35^\3\2\2\2\37"+
		"d\3\2\2\2!j\3\2\2\2#$\7k\2\2$%\7f\2\2%\4\3\2\2\2&\'\7<\2\2\'\6\3\2\2\2"+
		"()\7}\2\2)\b\3\2\2\2*+\7\177\2\2+\n\3\2\2\2,-\7r\2\2-.\7t\2\2./\7q\2\2"+
		"/\60\7r\2\2\60\61\7g\2\2\61\62\7t\2\2\62\63\7v\2\2\63\64\7{\2\2\64\f\3"+
		"\2\2\2\65\66\7d\2\2\66\67\7q\2\2\678\7q\2\289\7n\2\29\16\3\2\2\2:;\7k"+
		"\2\2;<\7p\2\2<=\7v\2\2=\20\3\2\2\2>?\7f\2\2?@\7q\2\2@A\7w\2\2AB\7d\2\2"+
		"BC\7n\2\2CD\7g\2\2D\22\3\2\2\2EF\7t\2\2FG\7g\2\2GH\7c\2\2HI\7n\2\2I\24"+
		"\3\2\2\2JK\7n\2\2KL\7k\2\2LM\7u\2\2MN\7v\2\2N\26\3\2\2\2OP\7u\2\2PQ\7"+
		"v\2\2QR\7t\2\2RS\7k\2\2ST\7p\2\2TU\7i\2\2U\30\3\2\2\2VW\7w\2\2WX\7t\2"+
		"\2XY\7n\2\2Y\32\3\2\2\2Z[\7x\2\2[\\\7c\2\2\\]\7t\2\2]\34\3\2\2\2^`\t\2"+
		"\2\2_a\t\3\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\36\3\2\2\2df\t"+
		"\4\2\2eg\t\3\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i \3\2\2\2jk\t"+
		"\5\2\2kl\3\2\2\2lm\b\21\2\2m\"\3\2\2\2\5\2bh\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}