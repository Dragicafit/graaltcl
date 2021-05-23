// Generated from language/src/main/java/com/oracle/truffle/tcl/parser/Tcl.g4 by ANTLR 4.7.1
package com.oracle.truffle.tcl.parser;

// DO NOT MODIFY - generated from SimpleLanguage.g4 using "mx create-tcl-parser"

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TclLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, COMMENT=36, WS=37, NL=38, IDENTIFIER=39, 
		STRING_LITERAL=40, ANY_STRING=41, INTEGER_LITERAL=42, DOUBLE_LITERAL=43, 
		BOOLEAN_LITERAL=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "COMMENT", "WS", "NL", "LETTER", "NON_ZERO_DIGIT", "DIGIT", 
		"HEX_DIGIT", "OCT_DIGIT", "BINARY_DIGIT", "TAB", "STRING_CHAR", "IDENTIFIER", 
		"STRING_LITERAL", "ANY_STRING", "INTEGER_LITERAL", "DOUBLE_LITERAL", "BOOLEAN_LITERAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'proc'", "'{'", "','", "'}'", "'break'", "'continue'", "';'", "'while'", 
		"'if'", "'then'", "'elseif'", "'else'", "'return'", "'('", "')'", "'||'", 
		"'&&'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'eq'", "'ne'", 
		"'*'", "'/'", "'%'", "'+'", "'-'", "'**'", "'$'", "'['", "']'", "'::'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"COMMENT", "WS", "NL", "IDENTIFIER", "STRING_LITERAL", "ANY_STRING", "INTEGER_LITERAL", 
		"DOUBLE_LITERAL", "BOOLEAN_LITERAL"
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


	public TclLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tcl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u015b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\7%\u00e1\n%\f%\16%\u00e4\13%\3%\3"+
		"%\3&\6&\u00e9\n&\r&\16&\u00ea\3&\3&\3\'\6\'\u00f0\n\'\r\'\16\'\u00f1\3"+
		"(\5(\u00f5\n(\3)\3)\3*\3*\3+\5+\u00fc\n+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\60\7\60\u0109\n\60\f\60\16\60\u010c\13\60\3\61\3\61\7\61\u0110"+
		"\n\61\f\61\16\61\u0113\13\61\3\61\3\61\3\62\6\62\u0118\n\62\r\62\16\62"+
		"\u0119\3\62\6\62\u011d\n\62\r\62\16\62\u011e\3\62\6\62\u0122\n\62\r\62"+
		"\16\62\u0123\3\62\6\62\u0127\n\62\r\62\16\62\u0128\3\62\6\62\u012c\n\62"+
		"\r\62\16\62\u012d\7\62\u0130\n\62\f\62\16\62\u0133\13\62\3\63\6\63\u0136"+
		"\n\63\r\63\16\63\u0137\3\64\6\64\u013b\n\64\r\64\16\64\u013c\3\64\3\64"+
		"\6\64\u0141\n\64\r\64\16\64\u0142\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5"+
		"\65\u015a\n\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S\2U\2W\2Y\2[\2]\2_)a*c"+
		"+e,g-i.\3\2\n\4\2\f\f\17\17\5\2\13\13\16\16\"\"\5\2C\\aac|\3\2\63;\3\2"+
		"\62;\5\2\62;CHch\3\2\629\6\2\f\f\17\17$$^^\2\u016a\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\3k\3\2\2\2\5p\3\2\2\2\7r\3\2\2\2\tt\3\2\2\2\13v\3\2\2\2\r|\3"+
		"\2\2\2\17\u0085\3\2\2\2\21\u0087\3\2\2\2\23\u008d\3\2\2\2\25\u0090\3\2"+
		"\2\2\27\u0095\3\2\2\2\31\u009c\3\2\2\2\33\u00a1\3\2\2\2\35\u00a8\3\2\2"+
		"\2\37\u00aa\3\2\2\2!\u00ac\3\2\2\2#\u00af\3\2\2\2%\u00b2\3\2\2\2\'\u00b4"+
		"\3\2\2\2)\u00b7\3\2\2\2+\u00b9\3\2\2\2-\u00bc\3\2\2\2/\u00bf\3\2\2\2\61"+
		"\u00c2\3\2\2\2\63\u00c5\3\2\2\2\65\u00c8\3\2\2\2\67\u00ca\3\2\2\29\u00cc"+
		"\3\2\2\2;\u00ce\3\2\2\2=\u00d0\3\2\2\2?\u00d2\3\2\2\2A\u00d5\3\2\2\2C"+
		"\u00d7\3\2\2\2E\u00d9\3\2\2\2G\u00db\3\2\2\2I\u00de\3\2\2\2K\u00e8\3\2"+
		"\2\2M\u00ef\3\2\2\2O\u00f4\3\2\2\2Q\u00f6\3\2\2\2S\u00f8\3\2\2\2U\u00fb"+
		"\3\2\2\2W\u00fd\3\2\2\2Y\u00ff\3\2\2\2[\u0101\3\2\2\2]\u0103\3\2\2\2_"+
		"\u0105\3\2\2\2a\u010d\3\2\2\2c\u0131\3\2\2\2e\u0135\3\2\2\2g\u013a\3\2"+
		"\2\2i\u0159\3\2\2\2kl\7r\2\2lm\7t\2\2mn\7q\2\2no\7e\2\2o\4\3\2\2\2pq\7"+
		"}\2\2q\6\3\2\2\2rs\7.\2\2s\b\3\2\2\2tu\7\177\2\2u\n\3\2\2\2vw\7d\2\2w"+
		"x\7t\2\2xy\7g\2\2yz\7c\2\2z{\7m\2\2{\f\3\2\2\2|}\7e\2\2}~\7q\2\2~\177"+
		"\7p\2\2\177\u0080\7v\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7w\2\2\u0083\u0084\7g\2\2\u0084\16\3\2\2\2\u0085\u0086\7=\2\2\u0086\20"+
		"\3\2\2\2\u0087\u0088\7y\2\2\u0088\u0089\7j\2\2\u0089\u008a\7k\2\2\u008a"+
		"\u008b\7n\2\2\u008b\u008c\7g\2\2\u008c\22\3\2\2\2\u008d\u008e\7k\2\2\u008e"+
		"\u008f\7h\2\2\u008f\24\3\2\2\2\u0090\u0091\7v\2\2\u0091\u0092\7j\2\2\u0092"+
		"\u0093\7g\2\2\u0093\u0094\7p\2\2\u0094\26\3\2\2\2\u0095\u0096\7g\2\2\u0096"+
		"\u0097\7n\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\u009a\7k\2\2"+
		"\u009a\u009b\7h\2\2\u009b\30\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7"+
		"n\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7g\2\2\u00a0\32\3\2\2\2\u00a1\u00a2"+
		"\7t\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7w\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7p\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7*\2\2\u00a9"+
		"\36\3\2\2\2\u00aa\u00ab\7+\2\2\u00ab \3\2\2\2\u00ac\u00ad\7~\2\2\u00ad"+
		"\u00ae\7~\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7(\2\2\u00b0\u00b1\7(\2\2\u00b1"+
		"$\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3&\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5\u00b6"+
		"\7?\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7@\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7"+
		"@\2\2\u00ba\u00bb\7?\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd\u00be"+
		"\7?\2\2\u00be.\3\2\2\2\u00bf\u00c0\7#\2\2\u00c0\u00c1\7?\2\2\u00c1\60"+
		"\3\2\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7s\2\2\u00c4\62\3\2\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7g\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9"+
		"\66\3\2\2\2\u00ca\u00cb\7\61\2\2\u00cb8\3\2\2\2\u00cc\u00cd\7\'\2\2\u00cd"+
		":\3\2\2\2\u00ce\u00cf\7-\2\2\u00cf<\3\2\2\2\u00d0\u00d1\7/\2\2\u00d1>"+
		"\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3\u00d4\7,\2\2\u00d4@\3\2\2\2\u00d5\u00d6"+
		"\7&\2\2\u00d6B\3\2\2\2\u00d7\u00d8\7]\2\2\u00d8D\3\2\2\2\u00d9\u00da\7"+
		"_\2\2\u00daF\3\2\2\2\u00db\u00dc\7<\2\2\u00dc\u00dd\7<\2\2\u00ddH\3\2"+
		"\2\2\u00de\u00e2\7%\2\2\u00df\u00e1\n\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\b%\2\2\u00e6J\3\2\2\2\u00e7\u00e9"+
		"\t\3\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b&\2\2\u00edL\3\2\2\2\u00ee"+
		"\u00f0\t\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2N\3\2\2\2\u00f3\u00f5\t\4\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5P\3\2\2\2\u00f6\u00f7\t\5\2\2\u00f7R\3\2\2\2\u00f8\u00f9"+
		"\t\6\2\2\u00f9T\3\2\2\2\u00fa\u00fc\t\7\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"V\3\2\2\2\u00fd\u00fe\t\b\2\2\u00feX\3\2\2\2\u00ff\u0100\4\62\63\2\u0100"+
		"Z\3\2\2\2\u0101\u0102\7\13\2\2\u0102\\\3\2\2\2\u0103\u0104\n\t\2\2\u0104"+
		"^\3\2\2\2\u0105\u010a\5O(\2\u0106\u0109\5O(\2\u0107\u0109\5S*\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b`\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0111"+
		"\7$\2\2\u010e\u0110\5]/\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0115\7$\2\2\u0115b\3\2\2\2\u0116\u0118\5O(\2\u0117\u0116\3"+
		"\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011c\3\2\2\2\u011b\u011d\5S*\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2"+
		"\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0130\3\2\2\2\u0120\u0122"+
		"\5S*\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0127\5O(\2\u0126\u0125\3\2\2"+
		"\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0130"+
		"\3\2\2\2\u012a\u012c\5O(\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u0117\3\2"+
		"\2\2\u012f\u0121\3\2\2\2\u012f\u012b\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132d\3\2\2\2\u0133\u0131\3\2\2\2"+
		"\u0134\u0136\5S*\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138f\3\2\2\2\u0139\u013b\5S*\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0140\7\60\2\2\u013f\u0141\5S*\2\u0140\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"h\3\2\2\2\u0144\u0145\7h\2\2\u0145\u0146\7c\2\2\u0146\u0147\7n\2\2\u0147"+
		"\u0148\7u\2\2\u0148\u015a\7g\2\2\u0149\u014a\7p\2\2\u014a\u015a\7q\2\2"+
		"\u014b\u015a\7p\2\2\u014c\u014d\7q\2\2\u014d\u014e\7h\2\2\u014e\u015a"+
		"\7h\2\2\u014f\u0150\7v\2\2\u0150\u0151\7t\2\2\u0151\u0152\7w\2\2\u0152"+
		"\u015a\7g\2\2\u0153\u0154\7{\2\2\u0154\u0155\7g\2\2\u0155\u015a\7u\2\2"+
		"\u0156\u015a\7{\2\2\u0157\u0158\7q\2\2\u0158\u015a\7p\2\2\u0159\u0144"+
		"\3\2\2\2\u0159\u0149\3\2\2\2\u0159\u014b\3\2\2\2\u0159\u014c\3\2\2\2\u0159"+
		"\u014f\3\2\2\2\u0159\u0153\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015aj\3\2\2\2\26\2\u00e2\u00ea\u00f1\u00f4\u00fb\u0108\u010a\u0111"+
		"\u0119\u011e\u0123\u0128\u012d\u012f\u0131\u0137\u013c\u0142\u0159\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}