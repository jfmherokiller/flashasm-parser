// Generated from C:/Users/peter/Downloads/flashasm parser\flashasm.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class flashasmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, BODY=2, CODE=3, TRY=4, SCRIPT=5, MAXSTACK=6, REFID=7, RETURNVIOD=8, 
		LOCALCOUNT=9, INITSCOPEDEPTH=10, MAXSCOPEDEPTH=11, GETLOCAL0=12, PUSHSCOPE=13, 
		POPSCOPE=14, END=15, MINORVERSION=16, MAJORVERSION=17, SINIT=18, GETSCOPEOBJECT=19, 
		GETLEX=20, NEWCLASS=21, INITPROPERTY=22, TRAIT=23, INCLUDE=24, WS=25, 
		LINE_COMMENT=26;
	public static final int
		RULE_flashasm = 0, RULE_program = 1, RULE_script = 2, RULE_body = 3, RULE_code = 4, 
		RULE_internalcode = 5, RULE_trait = 6;
	public static final String[] ruleNames = {
		"flashasm", "program", "script", "body", "code", "internalcode", "trait"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'body'", "'code'", "'try'", "'script'", null, null, 
		"'returnvoid'", null, null, null, "'getlocal0'", "'pushscope'", "'popscope'", 
		"'end'", null, null, "'sinit'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "BODY", "CODE", "TRY", "SCRIPT", "MAXSTACK", "REFID", 
		"RETURNVIOD", "LOCALCOUNT", "INITSCOPEDEPTH", "MAXSCOPEDEPTH", "GETLOCAL0", 
		"PUSHSCOPE", "POPSCOPE", "END", "MINORVERSION", "MAJORVERSION", "SINIT", 
		"GETSCOPEOBJECT", "GETLEX", "NEWCLASS", "INITPROPERTY", "TRAIT", "INCLUDE", 
		"WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "flashasm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public flashasmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FlashasmContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(flashasmParser.EOF, 0); }
		public FlashasmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flashasm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).enterFlashasm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).exitFlashasm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flashasmVisitor ) return ((flashasmVisitor<? extends T>)visitor).visitFlashasm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlashasmContext flashasm() throws RecognitionException {
		FlashasmContext _localctx = new FlashasmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_flashasm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			program();
			setState(15);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(flashasmParser.PROGRAM, 0); }
		public TerminalNode MINORVERSION() { return getToken(flashasmParser.MINORVERSION, 0); }
		public TerminalNode MAJORVERSION() { return getToken(flashasmParser.MAJORVERSION, 0); }
		public TerminalNode END() { return getToken(flashasmParser.END, 0); }
		public List<ScriptContext> script() {
			return getRuleContexts(ScriptContext.class);
		}
		public ScriptContext script(int i) {
			return getRuleContext(ScriptContext.class,i);
		}
		public List<TraitContext> trait() {
			return getRuleContexts(TraitContext.class);
		}
		public TraitContext trait(int i) {
			return getRuleContext(TraitContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flashasmVisitor ) return ((flashasmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(PROGRAM);
			setState(18);
			match(MINORVERSION);
			setState(19);
			match(MAJORVERSION);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCRIPT) {
				{
				{
				setState(20);
				script();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TRAIT) {
				{
				{
				setState(26);
				trait();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(END);
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

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SCRIPT() { return getToken(flashasmParser.SCRIPT, 0); }
		public TerminalNode SINIT() { return getToken(flashasmParser.SINIT, 0); }
		public TerminalNode REFID() { return getToken(flashasmParser.REFID, 0); }
		public TerminalNode END() { return getToken(flashasmParser.END, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flashasmVisitor ) return ((flashasmVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(SCRIPT);
			setState(35);
			match(SINIT);
			setState(36);
			match(REFID);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BODY) {
				{
				{
				setState(37);
				body();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(END);
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
		public TerminalNode BODY() { return getToken(flashasmParser.BODY, 0); }
		public TerminalNode MAXSTACK() { return getToken(flashasmParser.MAXSTACK, 0); }
		public TerminalNode LOCALCOUNT() { return getToken(flashasmParser.LOCALCOUNT, 0); }
		public TerminalNode INITSCOPEDEPTH() { return getToken(flashasmParser.INITSCOPEDEPTH, 0); }
		public TerminalNode MAXSCOPEDEPTH() { return getToken(flashasmParser.MAXSCOPEDEPTH, 0); }
		public TerminalNode END() { return getToken(flashasmParser.END, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flashasmVisitor ) return ((flashasmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(BODY);
			setState(46);
			match(MAXSTACK);
			setState(47);
			match(LOCALCOUNT);
			setState(48);
			match(INITSCOPEDEPTH);
			setState(49);
			match(MAXSCOPEDEPTH);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CODE) {
				{
				{
				setState(50);
				code();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(END);
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

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(flashasmParser.CODE, 0); }
		public InternalcodeContext internalcode() {
			return getRuleContext(InternalcodeContext.class,0);
		}
		public TerminalNode END() { return getToken(flashasmParser.END, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flashasmVisitor ) return ((flashasmVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(CODE);
			setState(59);
			internalcode();
			setState(60);
			match(END);
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

	public static class InternalcodeContext extends ParserRuleContext {
		public List<TerminalNode> GETLOCAL0() { return getTokens(flashasmParser.GETLOCAL0); }
		public TerminalNode GETLOCAL0(int i) {
			return getToken(flashasmParser.GETLOCAL0, i);
		}
		public List<TerminalNode> POPSCOPE() { return getTokens(flashasmParser.POPSCOPE); }
		public TerminalNode POPSCOPE(int i) {
			return getToken(flashasmParser.POPSCOPE, i);
		}
		public List<TerminalNode> PUSHSCOPE() { return getTokens(flashasmParser.PUSHSCOPE); }
		public TerminalNode PUSHSCOPE(int i) {
			return getToken(flashasmParser.PUSHSCOPE, i);
		}
		public List<TerminalNode> GETSCOPEOBJECT() { return getTokens(flashasmParser.GETSCOPEOBJECT); }
		public TerminalNode GETSCOPEOBJECT(int i) {
			return getToken(flashasmParser.GETSCOPEOBJECT, i);
		}
		public List<TerminalNode> GETLEX() { return getTokens(flashasmParser.GETLEX); }
		public TerminalNode GETLEX(int i) {
			return getToken(flashasmParser.GETLEX, i);
		}
		public List<TerminalNode> NEWCLASS() { return getTokens(flashasmParser.NEWCLASS); }
		public TerminalNode NEWCLASS(int i) {
			return getToken(flashasmParser.NEWCLASS, i);
		}
		public List<TerminalNode> INITPROPERTY() { return getTokens(flashasmParser.INITPROPERTY); }
		public TerminalNode INITPROPERTY(int i) {
			return getToken(flashasmParser.INITPROPERTY, i);
		}
		public List<TerminalNode> RETURNVIOD() { return getTokens(flashasmParser.RETURNVIOD); }
		public TerminalNode RETURNVIOD(int i) {
			return getToken(flashasmParser.RETURNVIOD, i);
		}
		public List<TerminalNode> TRAIT() { return getTokens(flashasmParser.TRAIT); }
		public TerminalNode TRAIT(int i) {
			return getToken(flashasmParser.TRAIT, i);
		}
		public InternalcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internalcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).enterInternalcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).exitInternalcode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flashasmVisitor ) return ((flashasmVisitor<? extends T>)visitor).visitInternalcode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InternalcodeContext internalcode() throws RecognitionException {
		InternalcodeContext _localctx = new InternalcodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_internalcode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURNVIOD) | (1L << GETLOCAL0) | (1L << PUSHSCOPE) | (1L << POPSCOPE) | (1L << GETSCOPEOBJECT) | (1L << GETLEX) | (1L << NEWCLASS) | (1L << INITPROPERTY) | (1L << TRAIT))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURNVIOD) | (1L << GETLOCAL0) | (1L << PUSHSCOPE) | (1L << POPSCOPE) | (1L << GETSCOPEOBJECT) | (1L << GETLEX) | (1L << NEWCLASS) | (1L << INITPROPERTY) | (1L << TRAIT))) != 0) );
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

	public static class TraitContext extends ParserRuleContext {
		public TerminalNode TRAIT() { return getToken(flashasmParser.TRAIT, 0); }
		public TerminalNode INCLUDE() { return getToken(flashasmParser.INCLUDE, 0); }
		public TerminalNode END() { return getToken(flashasmParser.END, 0); }
		public TraitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).enterTrait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flashasmListener ) ((flashasmListener)listener).exitTrait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof flashasmVisitor ) return ((flashasmVisitor<? extends T>)visitor).visitTrait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitContext trait() throws RecognitionException {
		TraitContext _localctx = new TraitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_trait);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(TRAIT);
			setState(68);
			match(INCLUDE);
			setState(69);
			match(END);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\7\3\30\n\3\f\3\16\3\33\13\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5\66\n\5\f\5\16\59\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7B\n\7\r\7\16\7"+
		"C\3\b\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\5\2\n\n\16\20\25\31G\2"+
		"\20\3\2\2\2\4\23\3\2\2\2\6$\3\2\2\2\b/\3\2\2\2\n<\3\2\2\2\fA\3\2\2\2\16"+
		"E\3\2\2\2\20\21\5\4\3\2\21\22\7\2\2\3\22\3\3\2\2\2\23\24\7\3\2\2\24\25"+
		"\7\22\2\2\25\31\7\23\2\2\26\30\5\6\4\2\27\26\3\2\2\2\30\33\3\2\2\2\31"+
		"\27\3\2\2\2\31\32\3\2\2\2\32\37\3\2\2\2\33\31\3\2\2\2\34\36\5\16\b\2\35"+
		"\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2"+
		"\2\"#\7\21\2\2#\5\3\2\2\2$%\7\7\2\2%&\7\24\2\2&*\7\t\2\2\')\5\b\5\2(\'"+
		"\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7\21\2\2"+
		".\7\3\2\2\2/\60\7\4\2\2\60\61\7\b\2\2\61\62\7\13\2\2\62\63\7\f\2\2\63"+
		"\67\7\r\2\2\64\66\5\n\6\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678"+
		"\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\21\2\2;\t\3\2\2\2<=\7\5\2\2=>\5\f\7"+
		"\2>?\7\21\2\2?\13\3\2\2\2@B\t\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3"+
		"\2\2\2D\r\3\2\2\2EF\7\31\2\2FG\7\32\2\2GH\7\21\2\2H\17\3\2\2\2\7\31\37"+
		"*\67C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}