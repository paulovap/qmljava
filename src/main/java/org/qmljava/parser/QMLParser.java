// Generated from QML.g4 by ANTLR 4.7.1

    package org.qmljava.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDTOKEN=1, COLON=2, LBRACE=3, RBRACE=4, PROPERTY_TOKEN=5, BOOL=6, INT=7, 
		DOUBLE=8, REAL=9, LIST=10, STRING=11, URL=12, VAR=13, Identifier=14, ObjectType=15, 
		WS=16;
	public static final int
		RULE_program = 0, RULE_objectDeclaration = 1, RULE_objectMember = 2, RULE_idDeclaration = 3, 
		RULE_propertyDeclaration = 4, RULE_propertyType = 5, RULE_basicType = 6;
	public static final String[] ruleNames = {
		"program", "objectDeclaration", "objectMember", "idDeclaration", "propertyDeclaration", 
		"propertyType", "basicType"
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

	@Override
	public String getGrammarFileName() { return "QML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			objectDeclaration();
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

	public static class ObjectDeclarationContext extends ParserRuleContext {
		public TerminalNode ObjectType() { return getToken(QMLParser.ObjectType, 0); }
		public TerminalNode LBRACE() { return getToken(QMLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QMLParser.RBRACE, 0); }
		public IdDeclarationContext idDeclaration() {
			return getRuleContext(IdDeclarationContext.class,0);
		}
		public List<ObjectMemberContext> objectMember() {
			return getRuleContexts(ObjectMemberContext.class);
		}
		public ObjectMemberContext objectMember(int i) {
			return getRuleContext(ObjectMemberContext.class,i);
		}
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).enterObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).exitObjectDeclaration(this);
		}
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_objectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(ObjectType);
			setState(17);
			match(LBRACE);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDTOKEN) {
				{
				setState(18);
				idDeclaration();
				}
			}

			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROPERTY_TOKEN) {
				{
				{
				setState(21);
				objectMember();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			match(RBRACE);
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

	public static class ObjectMemberContext extends ParserRuleContext {
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public ObjectMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).enterObjectMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).exitObjectMember(this);
		}
	}

	public final ObjectMemberContext objectMember() throws RecognitionException {
		ObjectMemberContext _localctx = new ObjectMemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_objectMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			propertyDeclaration();
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

	public static class IdDeclarationContext extends ParserRuleContext {
		public TerminalNode IDTOKEN() { return getToken(QMLParser.IDTOKEN, 0); }
		public TerminalNode COLON() { return getToken(QMLParser.COLON, 0); }
		public TerminalNode Identifier() { return getToken(QMLParser.Identifier, 0); }
		public IdDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).enterIdDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).exitIdDeclaration(this);
		}
	}

	public final IdDeclarationContext idDeclaration() throws RecognitionException {
		IdDeclarationContext _localctx = new IdDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_idDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(IDTOKEN);
			setState(32);
			match(COLON);
			setState(33);
			match(Identifier);
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

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode PROPERTY_TOKEN() { return getToken(QMLParser.PROPERTY_TOKEN, 0); }
		public PropertyTypeContext propertyType() {
			return getRuleContext(PropertyTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(QMLParser.Identifier, 0); }
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).exitPropertyDeclaration(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_propertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(PROPERTY_TOKEN);
			setState(36);
			propertyType();
			setState(37);
			match(Identifier);
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

	public static class PropertyTypeContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode ObjectType() { return getToken(QMLParser.ObjectType, 0); }
		public PropertyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).enterPropertyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).exitPropertyType(this);
		}
	}

	public final PropertyTypeContext propertyType() throws RecognitionException {
		PropertyTypeContext _localctx = new PropertyTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_propertyType);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case DOUBLE:
			case REAL:
			case LIST:
			case STRING:
			case URL:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				basicType();
				}
				break;
			case ObjectType:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(ObjectType);
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

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(QMLParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(QMLParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(QMLParser.DOUBLE, 0); }
		public TerminalNode REAL() { return getToken(QMLParser.REAL, 0); }
		public TerminalNode LIST() { return getToken(QMLParser.LIST, 0); }
		public TerminalNode STRING() { return getToken(QMLParser.STRING, 0); }
		public TerminalNode URL() { return getToken(QMLParser.URL, 0); }
		public TerminalNode VAR() { return getToken(QMLParser.VAR, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMLListener ) ((QMLListener)listener).exitBasicType(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << DOUBLE) | (1L << REAL) | (1L << LIST) | (1L << STRING) | (1L << URL) | (1L << VAR))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\5\3\26"+
		"\n\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\5\7,\n\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\3"+
		"\2\b\17\2+\2\20\3\2\2\2\4\22\3\2\2\2\6\37\3\2\2\2\b!\3\2\2\2\n%\3\2\2"+
		"\2\f+\3\2\2\2\16-\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\23\7\21\2\2\23"+
		"\25\7\5\2\2\24\26\5\b\5\2\25\24\3\2\2\2\25\26\3\2\2\2\26\32\3\2\2\2\27"+
		"\31\5\6\4\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33"+
		"\35\3\2\2\2\34\32\3\2\2\2\35\36\7\6\2\2\36\5\3\2\2\2\37 \5\n\6\2 \7\3"+
		"\2\2\2!\"\7\3\2\2\"#\7\4\2\2#$\7\20\2\2$\t\3\2\2\2%&\7\7\2\2&\'\5\f\7"+
		"\2\'(\7\20\2\2(\13\3\2\2\2),\5\16\b\2*,\7\21\2\2+)\3\2\2\2+*\3\2\2\2,"+
		"\r\3\2\2\2-.\t\2\2\2.\17\3\2\2\2\5\25\32+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}