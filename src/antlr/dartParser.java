// Generated from F:/Projects/java/MinaCom/src/antlr\dartParser.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class dartParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, IMPORT_=2, STRING=3, INT=4, LIST=5, LISTVIEW=6, ScrollDirectionKeyWord=7, 
		Axis=8, FLOATINGACTIONBUTTON=9, APPBARScaff=10, APPBARInScaffold=11, TitleKeyWord=12, 
		LISTTILE=13, LeadingKeyWord=14, TrailingKeyWord=15, SubtitleKeyWord=16, 
		ReverseKeyWord=17, BOOLEAN=18, TRY=19, CATCH=20, MainKeyWord=21, RunAppKeyWord=22, 
		MaterialAppKeyWord=23, Home=24, ColorKey=25, AXISATTR=26, INTEGER=27, 
		DOUBLE=28, FromRGBO=29, Color=30, Get=31, GetView=32, Obx=33, GetxController=34, 
		Bindings=35, Implements_keyWord=36, LazyPut=37, MethodCallBack=38, Put=39, 
		Find=40, To=41, VoidDataType=42, Dependencies=43, Dispose=44, Delete=45, 
		RxGetter=46, OnInit=47, OnClose=48, GetMaterialApp=49, EQUALS=50, PLUS_EQUALS=51, 
		MINUS_EQUALS=52, TIMES_EQUALS=53, DIVIDE_EQUALS=54, MODULO_EQUALS=55, 
		PLUS=56, CHILDREN=57, SingleQ=58, DoubleQ=59, MINUS=60, TIMES=61, DIVIDE=62, 
		MODULO=63, AND=64, OR=65, NOT=66, EQUAL_TO=67, NOT_EQUAL_TO=68, GREATER_THAN=69, 
		GREATER_THAN_OR_EQUAL_TO=70, LESS_THAN=71, LESS_THAN_OR_EQUAL_TO=72, Arrow=73, 
		Super=74, Key=75, True=76, False=77, WIDGET=78, CONTAINAR=79, Row=80, 
		COLUMN=81, GESTUREDETECTOR=82, CARD=83, Text=84, MainAxisAligmentKeyWord=85, 
		MainAxisProperties=86, CrossAxisAligmentKeyWord=87, CrossProperties=88, 
		WidthKeyWord=89, HeightKeyWord=90, ONTAP=91, NavigatorKeyWord=92, PushMethods=93, 
		PushNamed=94, FINAL=95, PopMethods=96, MaterialPageRoute=97, Builder=98, 
		START=99, END=100, CENTER=101, STRETCH=102, BUILDM=103, BUILDContext=104, 
		Context=105, CBracketC=106, Dot=107, Return=108, Scaffold=109, BodyScaffold=110, 
		TWODOT=111, INHERITS_KEYWORD=112, TypeWidget=113, CHILD=114, OSP=115, 
		CSP=116, OP=117, CP=118, SemiC=119, THIS=120, Required=121, Name=122, 
		OBracketC=123, InputIntoText=124, Newline=125, Whitespace=126, IDENTIFIER=127, 
		COMMAWidget=128, DecorationContainer=129, OVERRIDE_=130, CLASS_NAME=131, 
		CONST=132, OnPressedKeyWord=133;
	public static final int
		RULE_plur = 0, RULE_classInjection = 1, RULE_class = 2, RULE_classController = 3, 
		RULE_controllerBody = 4, RULE_declareRxList = 5, RULE_declareRxBool = 6, 
		RULE_declareRxInt = 7, RULE_onInitFunction = 8, RULE_oninitBody = 9, RULE_onCloseFunction = 10, 
		RULE_oncloseBody = 11, RULE_classBody = 12, RULE_declareController = 13, 
		RULE_dependenciesInje = 14, RULE_disposeFunction = 15, RULE_disposeBody = 16, 
		RULE_typeInjection = 17, RULE_injectionLazyPut = 18, RULE_injectionPut = 19, 
		RULE_constructor = 20, RULE_constructorBody = 21, RULE_constracterInit = 22, 
		RULE_build = 23, RULE_widget = 24, RULE_scaffold = 25, RULE_bodyScaffold = 26, 
		RULE_return = 27, RULE_returnMaterialApp = 28, RULE_row = 29, RULE_column = 30, 
		RULE_columnProps = 31, RULE_mainAxisAligment = 32, RULE_crossAxisAligment = 33, 
		RULE_mainPropertiesAttr = 34, RULE_crossPropertiesAttr = 35, RULE_width = 36, 
		RULE_height = 37, RULE_text = 38, RULE_container = 39, RULE_color = 40, 
		RULE_colorValue = 41, RULE_gestureDetector = 42, RULE_card = 43, RULE_onTap = 44, 
		RULE_child = 45, RULE_widgets = 46, RULE_children = 47, RULE_navigator = 48, 
		RULE_push = 49, RULE_materialPageRoute = 50, RULE_newScreen = 51, RULE_pop = 52, 
		RULE_pushNamed = 53, RULE_listView = 54, RULE_listViewProps = 55, RULE_scrollDirection = 56, 
		RULE_reverse = 57, RULE_axisAttr = 58, RULE_declareString = 59, RULE_declareInt = 60, 
		RULE_declareBool = 61, RULE_main = 62, RULE_classMaterial = 63, RULE_floatingActionButton = 64, 
		RULE_floatingActionButtonProps = 65, RULE_onPressed = 66, RULE_appBar = 67, 
		RULE_appBarProps = 68, RULE_title = 69, RULE_listTile = 70, RULE_listTileProps = 71, 
		RULE_leading = 72, RULE_subtitle = 73, RULE_trailing = 74;
	private static String[] makeRuleNames() {
		return new String[] {
			"plur", "classInjection", "class", "classController", "controllerBody", 
			"declareRxList", "declareRxBool", "declareRxInt", "onInitFunction", "oninitBody", 
			"onCloseFunction", "oncloseBody", "classBody", "declareController", "dependenciesInje", 
			"disposeFunction", "disposeBody", "typeInjection", "injectionLazyPut", 
			"injectionPut", "constructor", "constructorBody", "constracterInit", 
			"build", "widget", "scaffold", "bodyScaffold", "return", "returnMaterialApp", 
			"row", "column", "columnProps", "mainAxisAligment", "crossAxisAligment", 
			"mainPropertiesAttr", "crossPropertiesAttr", "width", "height", "text", 
			"container", "color", "colorValue", "gestureDetector", "card", "onTap", 
			"child", "widgets", "children", "navigator", "push", "materialPageRoute", 
			"newScreen", "pop", "pushNamed", "listView", "listViewProps", "scrollDirection", 
			"reverse", "axisAttr", "declareString", "declareInt", "declareBool", 
			"main", "classMaterial", "floatingActionButton", "floatingActionButtonProps", 
			"onPressed", "appBar", "appBarProps", "title", "listTile", "listTileProps", 
			"leading", "subtitle", "trailing"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'import'", "'String'", "'int'", "'List'", "'ListView'", 
			"'scrollDirection'", "'Axis'", "'FloatingActionButton'", "'appBar'", 
			"'AppBar'", "'title'", "'ListTile'", "'leading'", "'trailing'", "'subtitle'", 
			"'reverse'", "'bool'", "'try'", "'catch'", "'main'", "'runApp'", "'MaterialApp'", 
			"'home'", "'color'", null, null, null, "'fromRGBO'", "'Color'", "'Get'", 
			"'GetView'", "'Obx'", "'GetxController'", "'Bindings'", "'implements'", 
			"'lazyPut'", "'() =>'", "'put'", "'find'", "'to'", "'void'", "'dependencies'", 
			"'dispose'", "'delete'", "'obs'", "'onInit'", "'onClose'", "'GetMaterialApp'", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'+'", "'children'", "'''", 
			"'\"'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'=='", "'!='", 
			"'>'", "'>='", "'<'", "'<='", "'=>'", "'super'", "'key'", "'true'", "'false'", 
			"'Widget'", "'Container'", "'Row'", "'Column'", "'GestureDetector'", 
			"'Card'", "'Text'", "'mainAxisAlignment'", "'MainAxisAlignment'", "'crossAxisAlignment'", 
			"'CrossAxisAlignment'", "'width'", "'height'", "'onTap'", "'Navigator'", 
			"'push'", "'pushNamed'", "'final'", null, "'MaterialPageRoute'", "'builder'", 
			"'start'", "'end'", "'center'", "'stretch'", "'build'", "'BuildContext'", 
			"'context'", "'}'", "'.'", "'return'", "'Scaffold'", "'body'", "':'", 
			"'extends'", null, "'child'", "'['", "']'", "'('", "')'", "';'", "'this'", 
			"'required'", null, "'{'", null, null, null, null, "','", "'decoration'", 
			"'@override'", null, "'const'", "'onPressed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "IMPORT_", "STRING", "INT", "LIST", "LISTVIEW", "ScrollDirectionKeyWord", 
			"Axis", "FLOATINGACTIONBUTTON", "APPBARScaff", "APPBARInScaffold", "TitleKeyWord", 
			"LISTTILE", "LeadingKeyWord", "TrailingKeyWord", "SubtitleKeyWord", "ReverseKeyWord", 
			"BOOLEAN", "TRY", "CATCH", "MainKeyWord", "RunAppKeyWord", "MaterialAppKeyWord", 
			"Home", "ColorKey", "AXISATTR", "INTEGER", "DOUBLE", "FromRGBO", "Color", 
			"Get", "GetView", "Obx", "GetxController", "Bindings", "Implements_keyWord", 
			"LazyPut", "MethodCallBack", "Put", "Find", "To", "VoidDataType", "Dependencies", 
			"Dispose", "Delete", "RxGetter", "OnInit", "OnClose", "GetMaterialApp", 
			"EQUALS", "PLUS_EQUALS", "MINUS_EQUALS", "TIMES_EQUALS", "DIVIDE_EQUALS", 
			"MODULO_EQUALS", "PLUS", "CHILDREN", "SingleQ", "DoubleQ", "MINUS", "TIMES", 
			"DIVIDE", "MODULO", "AND", "OR", "NOT", "EQUAL_TO", "NOT_EQUAL_TO", "GREATER_THAN", 
			"GREATER_THAN_OR_EQUAL_TO", "LESS_THAN", "LESS_THAN_OR_EQUAL_TO", "Arrow", 
			"Super", "Key", "True", "False", "WIDGET", "CONTAINAR", "Row", "COLUMN", 
			"GESTUREDETECTOR", "CARD", "Text", "MainAxisAligmentKeyWord", "MainAxisProperties", 
			"CrossAxisAligmentKeyWord", "CrossProperties", "WidthKeyWord", "HeightKeyWord", 
			"ONTAP", "NavigatorKeyWord", "PushMethods", "PushNamed", "FINAL", "PopMethods", 
			"MaterialPageRoute", "Builder", "START", "END", "CENTER", "STRETCH", 
			"BUILDM", "BUILDContext", "Context", "CBracketC", "Dot", "Return", "Scaffold", 
			"BodyScaffold", "TWODOT", "INHERITS_KEYWORD", "TypeWidget", "CHILD", 
			"OSP", "CSP", "OP", "CP", "SemiC", "THIS", "Required", "Name", "OBracketC", 
			"InputIntoText", "Newline", "Whitespace", "IDENTIFIER", "COMMAWidget", 
			"DecorationContainer", "OVERRIDE_", "CLASS_NAME", "CONST", "OnPressedKeyWord"
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
	public String getGrammarFileName() { return "dartParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dartParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlurContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ClassMaterialContext classMaterial() {
			return getRuleContext(ClassMaterialContext.class,0);
		}
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public List<ClassInjectionContext> classInjection() {
			return getRuleContexts(ClassInjectionContext.class);
		}
		public ClassInjectionContext classInjection(int i) {
			return getRuleContext(ClassInjectionContext.class,i);
		}
		public List<ClassControllerContext> classController() {
			return getRuleContexts(ClassControllerContext.class);
		}
		public ClassControllerContext classController(int i) {
			return getRuleContext(ClassControllerContext.class,i);
		}
		public PlurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterPlur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitPlur(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitPlur(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlurContext plur() throws RecognitionException {
		PlurContext _localctx = new PlurContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_plur);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			main();
			setState(151);
			classMaterial();
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					class_();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					classInjection();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(164);
				classController();
				}
				}
				setState(169);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassInjectionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(dartParser.CLASS, 0); }
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public TerminalNode Bindings() { return getToken(dartParser.Bindings, 0); }
		public TerminalNode OBracketC() { return getToken(dartParser.OBracketC, 0); }
		public DependenciesInjeContext dependenciesInje() {
			return getRuleContext(DependenciesInjeContext.class,0);
		}
		public TerminalNode CBracketC() { return getToken(dartParser.CBracketC, 0); }
		public TerminalNode Implements_keyWord() { return getToken(dartParser.Implements_keyWord, 0); }
		public ClassInjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClassInjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClassInjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClassInjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInjectionContext classInjection() throws RecognitionException {
		ClassInjectionContext _localctx = new ClassInjectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classInjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(CLASS);
			setState(171);
			match(Name);
			{
			setState(172);
			match(Implements_keyWord);
			}
			setState(173);
			match(Bindings);
			setState(174);
			match(OBracketC);
			setState(175);
			dependenciesInje();
			setState(176);
			match(CBracketC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(dartParser.CLASS, 0); }
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public TerminalNode INHERITS_KEYWORD() { return getToken(dartParser.INHERITS_KEYWORD, 0); }
		public TerminalNode TypeWidget() { return getToken(dartParser.TypeWidget, 0); }
		public TerminalNode OBracketC() { return getToken(dartParser.OBracketC, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CBracketC() { return getToken(dartParser.CBracketC, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(CLASS);
			setState(179);
			match(Name);
			setState(180);
			match(INHERITS_KEYWORD);
			setState(181);
			match(TypeWidget);
			setState(182);
			match(OBracketC);
			setState(183);
			classBody();
			setState(184);
			match(CBracketC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassControllerContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(dartParser.CLASS, 0); }
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public TerminalNode INHERITS_KEYWORD() { return getToken(dartParser.INHERITS_KEYWORD, 0); }
		public TerminalNode GetxController() { return getToken(dartParser.GetxController, 0); }
		public TerminalNode OBracketC() { return getToken(dartParser.OBracketC, 0); }
		public ControllerBodyContext controllerBody() {
			return getRuleContext(ControllerBodyContext.class,0);
		}
		public TerminalNode CBracketC() { return getToken(dartParser.CBracketC, 0); }
		public ClassControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classController; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClassController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClassController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClassController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassControllerContext classController() throws RecognitionException {
		ClassControllerContext _localctx = new ClassControllerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classController);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(CLASS);
			setState(187);
			match(Name);
			setState(188);
			match(INHERITS_KEYWORD);
			setState(189);
			match(GetxController);
			setState(190);
			match(OBracketC);
			setState(191);
			controllerBody();
			setState(192);
			match(CBracketC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ControllerBodyContext extends ParserRuleContext {
		public List<DeclareRxIntContext> declareRxInt() {
			return getRuleContexts(DeclareRxIntContext.class);
		}
		public DeclareRxIntContext declareRxInt(int i) {
			return getRuleContext(DeclareRxIntContext.class,i);
		}
		public List<DeclareRxBoolContext> declareRxBool() {
			return getRuleContexts(DeclareRxBoolContext.class);
		}
		public DeclareRxBoolContext declareRxBool(int i) {
			return getRuleContext(DeclareRxBoolContext.class,i);
		}
		public List<DeclareRxListContext> declareRxList() {
			return getRuleContexts(DeclareRxListContext.class);
		}
		public DeclareRxListContext declareRxList(int i) {
			return getRuleContext(DeclareRxListContext.class,i);
		}
		public OnInitFunctionContext onInitFunction() {
			return getRuleContext(OnInitFunctionContext.class,0);
		}
		public OnCloseFunctionContext onCloseFunction() {
			return getRuleContext(OnCloseFunctionContext.class,0);
		}
		public DisposeFunctionContext disposeFunction() {
			return getRuleContext(DisposeFunctionContext.class,0);
		}
		public ControllerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controllerBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterControllerBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitControllerBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitControllerBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControllerBodyContext controllerBody() throws RecognitionException {
		ControllerBodyContext _localctx = new ControllerBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_controllerBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					declareRxInt();
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200);
					declareRxBool();
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==Name) {
				{
				{
				setState(206);
				declareRxList();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(212);
				onInitFunction();
				}
				break;
			}
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(215);
				onCloseFunction();
				}
				break;
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE_) {
				{
				setState(218);
				disposeFunction();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareRxListContext extends ParserRuleContext {
		public List<TerminalNode> Name() { return getTokens(dartParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(dartParser.Name, i);
		}
		public TerminalNode EQUALS() { return getToken(dartParser.EQUALS, 0); }
		public TerminalNode OSP() { return getToken(dartParser.OSP, 0); }
		public TerminalNode CSP() { return getToken(dartParser.CSP, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public TerminalNode RxGetter() { return getToken(dartParser.RxGetter, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public TerminalNode FINAL() { return getToken(dartParser.FINAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(dartParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(dartParser.GREATER_THAN, 0); }
		public DeclareRxListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareRxList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclareRxList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclareRxList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclareRxList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareRxListContext declareRxList() throws RecognitionException {
		DeclareRxListContext _localctx = new DeclareRxListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declareRxList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(221);
				match(FINAL);
				}
			}

			setState(224);
			match(Name);
			setState(225);
			match(EQUALS);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(226);
				match(LESS_THAN);
				setState(227);
				match(Name);
				setState(228);
				match(GREATER_THAN);
				}
			}

			setState(231);
			match(OSP);
			setState(232);
			match(CSP);
			setState(233);
			match(Dot);
			setState(234);
			match(RxGetter);
			setState(235);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareRxBoolContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public TerminalNode EQUALS() { return getToken(dartParser.EQUALS, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public TerminalNode RxGetter() { return getToken(dartParser.RxGetter, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public TerminalNode True() { return getToken(dartParser.True, 0); }
		public TerminalNode False() { return getToken(dartParser.False, 0); }
		public TerminalNode FINAL() { return getToken(dartParser.FINAL, 0); }
		public DeclareRxBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareRxBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclareRxBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclareRxBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclareRxBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareRxBoolContext declareRxBool() throws RecognitionException {
		DeclareRxBoolContext _localctx = new DeclareRxBoolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declareRxBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(237);
				match(FINAL);
				}
			}

			setState(240);
			match(Name);
			setState(241);
			match(EQUALS);
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==True || _la==False) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(243);
			match(Dot);
			setState(244);
			match(RxGetter);
			setState(245);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareRxIntContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public TerminalNode EQUALS() { return getToken(dartParser.EQUALS, 0); }
		public TerminalNode INTEGER() { return getToken(dartParser.INTEGER, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public TerminalNode RxGetter() { return getToken(dartParser.RxGetter, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public TerminalNode FINAL() { return getToken(dartParser.FINAL, 0); }
		public DeclareRxIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareRxInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclareRxInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclareRxInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclareRxInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareRxIntContext declareRxInt() throws RecognitionException {
		DeclareRxIntContext _localctx = new DeclareRxIntContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declareRxInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(247);
				match(FINAL);
				}
			}

			setState(250);
			match(Name);
			setState(251);
			match(EQUALS);
			setState(252);
			match(INTEGER);
			setState(253);
			match(Dot);
			setState(254);
			match(RxGetter);
			setState(255);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OnInitFunctionContext extends ParserRuleContext {
		public TerminalNode OVERRIDE_() { return getToken(dartParser.OVERRIDE_, 0); }
		public TerminalNode VoidDataType() { return getToken(dartParser.VoidDataType, 0); }
		public List<TerminalNode> OnInit() { return getTokens(dartParser.OnInit); }
		public TerminalNode OnInit(int i) {
			return getToken(dartParser.OnInit, i);
		}
		public List<TerminalNode> OP() { return getTokens(dartParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(dartParser.OP, i);
		}
		public List<TerminalNode> CP() { return getTokens(dartParser.CP); }
		public TerminalNode CP(int i) {
			return getToken(dartParser.CP, i);
		}
		public TerminalNode OBracketC() { return getToken(dartParser.OBracketC, 0); }
		public OninitBodyContext oninitBody() {
			return getRuleContext(OninitBodyContext.class,0);
		}
		public TerminalNode Super() { return getToken(dartParser.Super, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public TerminalNode CBracketC() { return getToken(dartParser.CBracketC, 0); }
		public OnInitFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onInitFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterOnInitFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitOnInitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitOnInitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnInitFunctionContext onInitFunction() throws RecognitionException {
		OnInitFunctionContext _localctx = new OnInitFunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_onInitFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(OVERRIDE_);
			setState(258);
			match(VoidDataType);
			setState(259);
			match(OnInit);
			setState(260);
			match(OP);
			setState(261);
			match(CP);
			setState(262);
			match(OBracketC);
			setState(263);
			oninitBody();
			setState(264);
			match(Super);
			setState(265);
			match(Dot);
			setState(266);
			match(OnInit);
			setState(267);
			match(OP);
			setState(268);
			match(CP);
			setState(269);
			match(SemiC);
			setState(270);
			match(CBracketC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OninitBodyContext extends ParserRuleContext {
		public TerminalNode Newline() { return getToken(dartParser.Newline, 0); }
		public OninitBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oninitBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterOninitBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitOninitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitOninitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OninitBodyContext oninitBody() throws RecognitionException {
		OninitBodyContext _localctx = new OninitBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_oninitBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(Newline);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OnCloseFunctionContext extends ParserRuleContext {
		public TerminalNode OVERRIDE_() { return getToken(dartParser.OVERRIDE_, 0); }
		public TerminalNode VoidDataType() { return getToken(dartParser.VoidDataType, 0); }
		public List<TerminalNode> OnClose() { return getTokens(dartParser.OnClose); }
		public TerminalNode OnClose(int i) {
			return getToken(dartParser.OnClose, i);
		}
		public List<TerminalNode> OP() { return getTokens(dartParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(dartParser.OP, i);
		}
		public List<TerminalNode> CP() { return getTokens(dartParser.CP); }
		public TerminalNode CP(int i) {
			return getToken(dartParser.CP, i);
		}
		public TerminalNode OBracketC() { return getToken(dartParser.OBracketC, 0); }
		public OncloseBodyContext oncloseBody() {
			return getRuleContext(OncloseBodyContext.class,0);
		}
		public TerminalNode Super() { return getToken(dartParser.Super, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public TerminalNode CBracketC() { return getToken(dartParser.CBracketC, 0); }
		public OnCloseFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onCloseFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterOnCloseFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitOnCloseFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitOnCloseFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnCloseFunctionContext onCloseFunction() throws RecognitionException {
		OnCloseFunctionContext _localctx = new OnCloseFunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_onCloseFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(OVERRIDE_);
			setState(275);
			match(VoidDataType);
			setState(276);
			match(OnClose);
			setState(277);
			match(OP);
			setState(278);
			match(CP);
			setState(279);
			match(OBracketC);
			setState(280);
			oncloseBody();
			setState(281);
			match(Super);
			setState(282);
			match(Dot);
			setState(283);
			match(OnClose);
			setState(284);
			match(OP);
			setState(285);
			match(CP);
			setState(286);
			match(SemiC);
			setState(287);
			match(CBracketC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OncloseBodyContext extends ParserRuleContext {
		public TerminalNode Newline() { return getToken(dartParser.Newline, 0); }
		public OncloseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oncloseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterOncloseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitOncloseBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitOncloseBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OncloseBodyContext oncloseBody() throws RecognitionException {
		OncloseBodyContext _localctx = new OncloseBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_oncloseBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(Newline);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public BuildContext build() {
			return getRuleContext(BuildContext.class,0);
		}
		public List<DeclareStringContext> declareString() {
			return getRuleContexts(DeclareStringContext.class);
		}
		public DeclareStringContext declareString(int i) {
			return getRuleContext(DeclareStringContext.class,i);
		}
		public List<DeclareIntContext> declareInt() {
			return getRuleContexts(DeclareIntContext.class);
		}
		public DeclareIntContext declareInt(int i) {
			return getRuleContext(DeclareIntContext.class,i);
		}
		public List<DeclareBoolContext> declareBool() {
			return getRuleContexts(DeclareBoolContext.class);
		}
		public DeclareBoolContext declareBool(int i) {
			return getRuleContext(DeclareBoolContext.class,i);
		}
		public DeclareControllerContext declareController() {
			return getRuleContext(DeclareControllerContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(291);
					declareString();
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					declareInt();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					declareBool();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(309);
				declareController();
				}
				break;
			}
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(312);
				constructor();
				}
			}

			setState(315);
			build();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareControllerContext extends ParserRuleContext {
		public List<TerminalNode> Name() { return getTokens(dartParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(dartParser.Name, i);
		}
		public TerminalNode EQUALS() { return getToken(dartParser.EQUALS, 0); }
		public TerminalNode Get() { return getToken(dartParser.Get, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public TerminalNode Find() { return getToken(dartParser.Find, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public TerminalNode FINAL() { return getToken(dartParser.FINAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(dartParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(dartParser.GREATER_THAN, 0); }
		public DeclareControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareController; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclareController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclareController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclareController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareControllerContext declareController() throws RecognitionException {
		DeclareControllerContext _localctx = new DeclareControllerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declareController);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(317);
				match(FINAL);
				}
			}

			setState(320);
			match(Name);
			setState(321);
			match(EQUALS);
			setState(322);
			match(Get);
			setState(323);
			match(Dot);
			setState(324);
			match(Find);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(325);
				match(LESS_THAN);
				setState(326);
				match(Name);
				setState(327);
				match(GREATER_THAN);
				}
			}

			setState(330);
			match(OP);
			setState(331);
			match(CP);
			setState(332);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DependenciesInjeContext extends ParserRuleContext {
		public TerminalNode OVERRIDE_() { return getToken(dartParser.OVERRIDE_, 0); }
		public TerminalNode VoidDataType() { return getToken(dartParser.VoidDataType, 0); }
		public TerminalNode Dependencies() { return getToken(dartParser.Dependencies, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode OBracketC() { return getToken(dartParser.OBracketC, 0); }
		public TypeInjectionContext typeInjection() {
			return getRuleContext(TypeInjectionContext.class,0);
		}
		public TerminalNode CBracketC() { return getToken(dartParser.CBracketC, 0); }
		public DependenciesInjeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependenciesInje; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDependenciesInje(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDependenciesInje(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDependenciesInje(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependenciesInjeContext dependenciesInje() throws RecognitionException {
		DependenciesInjeContext _localctx = new DependenciesInjeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dependenciesInje);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(OVERRIDE_);
			setState(335);
			match(VoidDataType);
			setState(336);
			match(Dependencies);
			setState(337);
			match(OP);
			setState(338);
			match(CP);
			setState(339);
			match(OBracketC);
			setState(340);
			typeInjection();
			setState(341);
			match(CBracketC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DisposeFunctionContext extends ParserRuleContext {
		public TerminalNode OVERRIDE_() { return getToken(dartParser.OVERRIDE_, 0); }
		public TerminalNode Dispose() { return getToken(dartParser.Dispose, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode OBracketC() { return getToken(dartParser.OBracketC, 0); }
		public TerminalNode CBracketC() { return getToken(dartParser.CBracketC, 0); }
		public List<TerminalNode> VoidDataType() { return getTokens(dartParser.VoidDataType); }
		public TerminalNode VoidDataType(int i) {
			return getToken(dartParser.VoidDataType, i);
		}
		public List<DisposeBodyContext> disposeBody() {
			return getRuleContexts(DisposeBodyContext.class);
		}
		public DisposeBodyContext disposeBody(int i) {
			return getRuleContext(DisposeBodyContext.class,i);
		}
		public DisposeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disposeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDisposeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDisposeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDisposeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisposeFunctionContext disposeFunction() throws RecognitionException {
		DisposeFunctionContext _localctx = new DisposeFunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_disposeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(OVERRIDE_);
			setState(345); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(344);
				match(VoidDataType);
				}
				}
				setState(347); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VoidDataType );
			setState(349);
			match(Dispose);
			setState(350);
			match(OP);
			setState(351);
			match(CP);
			setState(352);
			match(OBracketC);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Get) {
				{
				{
				setState(353);
				disposeBody();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(CBracketC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DisposeBodyContext extends ParserRuleContext {
		public TerminalNode Get() { return getToken(dartParser.Get, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public TerminalNode Delete() { return getToken(dartParser.Delete, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public TerminalNode LESS_THAN() { return getToken(dartParser.LESS_THAN, 0); }
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public TerminalNode GREATER_THAN() { return getToken(dartParser.GREATER_THAN, 0); }
		public DisposeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disposeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDisposeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDisposeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDisposeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisposeBodyContext disposeBody() throws RecognitionException {
		DisposeBodyContext _localctx = new DisposeBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_disposeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(Get);
			setState(362);
			match(Dot);
			setState(363);
			match(Delete);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(364);
				match(LESS_THAN);
				setState(365);
				match(Name);
				setState(366);
				match(GREATER_THAN);
				}
			}

			setState(369);
			match(OP);
			setState(370);
			match(CP);
			setState(371);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeInjectionContext extends ParserRuleContext {
		public List<InjectionLazyPutContext> injectionLazyPut() {
			return getRuleContexts(InjectionLazyPutContext.class);
		}
		public InjectionLazyPutContext injectionLazyPut(int i) {
			return getRuleContext(InjectionLazyPutContext.class,i);
		}
		public List<InjectionPutContext> injectionPut() {
			return getRuleContexts(InjectionPutContext.class);
		}
		public InjectionPutContext injectionPut(int i) {
			return getRuleContext(InjectionPutContext.class,i);
		}
		public TypeInjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterTypeInjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitTypeInjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitTypeInjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeInjectionContext typeInjection() throws RecognitionException {
		TypeInjectionContext _localctx = new TypeInjectionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeInjection);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					injectionLazyPut();
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Get) {
				{
				{
				setState(379);
				injectionPut();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class InjectionLazyPutContext extends ParserRuleContext {
		public TerminalNode Get() { return getToken(dartParser.Get, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public TerminalNode LazyPut() { return getToken(dartParser.LazyPut, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode MethodCallBack() { return getToken(dartParser.MethodCallBack, 0); }
		public NewScreenContext newScreen() {
			return getRuleContext(NewScreenContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public InjectionLazyPutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectionLazyPut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterInjectionLazyPut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitInjectionLazyPut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitInjectionLazyPut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectionLazyPutContext injectionLazyPut() throws RecognitionException {
		InjectionLazyPutContext _localctx = new InjectionLazyPutContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_injectionLazyPut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(Get);
			setState(386);
			match(Dot);
			setState(387);
			match(LazyPut);
			setState(388);
			match(OP);
			setState(389);
			match(MethodCallBack);
			setState(390);
			newScreen();
			setState(391);
			match(CP);
			setState(392);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InjectionPutContext extends ParserRuleContext {
		public TerminalNode Get() { return getToken(dartParser.Get, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public TerminalNode Put() { return getToken(dartParser.Put, 0); }
		public List<TerminalNode> OP() { return getTokens(dartParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(dartParser.OP, i);
		}
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public List<TerminalNode> CP() { return getTokens(dartParser.CP); }
		public TerminalNode CP(int i) {
			return getToken(dartParser.CP, i);
		}
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public InjectionPutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectionPut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterInjectionPut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitInjectionPut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitInjectionPut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectionPutContext injectionPut() throws RecognitionException {
		InjectionPutContext _localctx = new InjectionPutContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_injectionPut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(Get);
			setState(395);
			match(Dot);
			setState(396);
			match(Put);
			setState(397);
			match(OP);
			setState(398);
			match(Name);
			setState(399);
			match(OP);
			setState(400);
			match(CP);
			setState(401);
			match(CP);
			setState(402);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(Name);
			setState(405);
			match(OP);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Super || _la==OBracketC) {
				{
				setState(406);
				constructorBody();
				}
			}

			setState(409);
			match(CP);
			setState(410);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode Super() { return getToken(dartParser.Super, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public TerminalNode Key() { return getToken(dartParser.Key, 0); }
		public TerminalNode OBracketC() { return getToken(dartParser.OBracketC, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public TerminalNode CBracketC() { return getToken(dartParser.CBracketC, 0); }
		public List<ConstracterInitContext> constracterInit() {
			return getRuleContexts(ConstracterInitContext.class);
		}
		public ConstracterInitContext constracterInit(int i) {
			return getRuleContext(ConstracterInitContext.class,i);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBracketC) {
				{
				setState(412);
				match(OBracketC);
				}
			}

			setState(415);
			match(Super);
			setState(416);
			match(Dot);
			setState(417);
			match(Key);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAWidget) {
				{
				setState(418);
				match(COMMAWidget);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==THIS || _la==Required) {
					{
					{
					setState(419);
					constracterInit();
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CBracketC) {
				{
				setState(427);
				match(CBracketC);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstracterInitContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(dartParser.THIS, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public TerminalNode Required() { return getToken(dartParser.Required, 0); }
		public ConstracterInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constracterInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterConstracterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitConstracterInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitConstracterInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstracterInitContext constracterInit() throws RecognitionException {
		ConstracterInitContext _localctx = new ConstracterInitContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constracterInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Required) {
				{
				setState(430);
				match(Required);
				}
			}

			setState(433);
			match(THIS);
			setState(434);
			match(Dot);
			setState(435);
			match(Name);
			setState(436);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BuildContext extends ParserRuleContext {
		public TerminalNode OVERRIDE_() { return getToken(dartParser.OVERRIDE_, 0); }
		public TerminalNode WIDGET() { return getToken(dartParser.WIDGET, 0); }
		public TerminalNode BUILDM() { return getToken(dartParser.BUILDM, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode BUILDContext() { return getToken(dartParser.BUILDContext, 0); }
		public TerminalNode Context() { return getToken(dartParser.Context, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode OBracketC() { return getToken(dartParser.OBracketC, 0); }
		public TerminalNode CBracketC() { return getToken(dartParser.CBracketC, 0); }
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public ReturnMaterialAppContext returnMaterialApp() {
			return getRuleContext(ReturnMaterialAppContext.class,0);
		}
		public BuildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBuild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBuild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBuild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildContext build() throws RecognitionException {
		BuildContext _localctx = new BuildContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_build);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(OVERRIDE_);
			setState(439);
			match(WIDGET);
			setState(440);
			match(BUILDM);
			setState(441);
			match(OP);
			setState(442);
			match(BUILDContext);
			setState(443);
			match(Context);
			setState(444);
			match(CP);
			setState(445);
			match(OBracketC);
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(446);
				return_();
				}
				break;
			case 2:
				{
				setState(447);
				returnMaterialApp();
				}
				break;
			}
			setState(450);
			match(CBracketC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WidgetContext extends ParserRuleContext {
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ScaffoldContext scaffold() {
			return getRuleContext(ScaffoldContext.class,0);
		}
		public GestureDetectorContext gestureDetector() {
			return getRuleContext(GestureDetectorContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
		public ListViewContext listView() {
			return getRuleContext(ListViewContext.class,0);
		}
		public FloatingActionButtonContext floatingActionButton() {
			return getRuleContext(FloatingActionButtonContext.class,0);
		}
		public AppBarContext appBar() {
			return getRuleContext(AppBarContext.class,0);
		}
		public ListTileContext listTile() {
			return getRuleContext(ListTileContext.class,0);
		}
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_widget);
		try {
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				container();
				}
				break;
			case Row:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				row();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				column();
				}
				break;
			case Scaffold:
				enterOuterAlt(_localctx, 4);
				{
				setState(455);
				scaffold();
				}
				break;
			case GESTUREDETECTOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(456);
				gestureDetector();
				}
				break;
			case Text:
				enterOuterAlt(_localctx, 6);
				{
				setState(457);
				text();
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 7);
				{
				setState(458);
				card();
				}
				break;
			case LISTVIEW:
				enterOuterAlt(_localctx, 8);
				{
				setState(459);
				listView();
				}
				break;
			case FLOATINGACTIONBUTTON:
				enterOuterAlt(_localctx, 9);
				{
				setState(460);
				floatingActionButton();
				}
				break;
			case APPBARScaff:
				enterOuterAlt(_localctx, 10);
				{
				setState(461);
				appBar();
				}
				break;
			case LISTTILE:
				enterOuterAlt(_localctx, 11);
				{
				setState(462);
				listTile();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldContext extends ParserRuleContext {
		public TerminalNode Scaffold() { return getToken(dartParser.Scaffold, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public AppBarContext appBar() {
			return getRuleContext(AppBarContext.class,0);
		}
		public BodyScaffoldContext bodyScaffold() {
			return getRuleContext(BodyScaffoldContext.class,0);
		}
		public ScaffoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterScaffold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitScaffold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitScaffold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldContext scaffold() throws RecognitionException {
		ScaffoldContext _localctx = new ScaffoldContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_scaffold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(Scaffold);
			setState(466);
			match(OP);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==APPBARScaff) {
				{
				setState(467);
				appBar();
				}
			}

			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BodyScaffold) {
				{
				setState(470);
				bodyScaffold();
				}
			}

			setState(473);
			match(CP);
			setState(474);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyScaffoldContext extends ParserRuleContext {
		public TerminalNode BodyScaffold() { return getToken(dartParser.BodyScaffold, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public BodyScaffoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyScaffold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBodyScaffold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBodyScaffold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBodyScaffold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyScaffoldContext bodyScaffold() throws RecognitionException {
		BodyScaffoldContext _localctx = new BodyScaffoldContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bodyScaffold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(BodyScaffold);
			setState(477);
			match(TWODOT);
			setState(478);
			widget();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(dartParser.Return, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(Return);
			setState(481);
			widget();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnMaterialAppContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(dartParser.Return, 0); }
		public List<TerminalNode> OP() { return getTokens(dartParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(dartParser.OP, i);
		}
		public List<TerminalNode> CP() { return getTokens(dartParser.CP); }
		public TerminalNode CP(int i) {
			return getToken(dartParser.CP, i);
		}
		public List<TerminalNode> SemiC() { return getTokens(dartParser.SemiC); }
		public TerminalNode SemiC(int i) {
			return getToken(dartParser.SemiC, i);
		}
		public TerminalNode MaterialAppKeyWord() { return getToken(dartParser.MaterialAppKeyWord, 0); }
		public TerminalNode GetMaterialApp() { return getToken(dartParser.GetMaterialApp, 0); }
		public TerminalNode Home() { return getToken(dartParser.Home, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public ReturnMaterialAppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnMaterialApp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterReturnMaterialApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitReturnMaterialApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitReturnMaterialApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnMaterialAppContext returnMaterialApp() throws RecognitionException {
		ReturnMaterialAppContext _localctx = new ReturnMaterialAppContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnMaterialApp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(Return);
			setState(484);
			_la = _input.LA(1);
			if ( !(_la==MaterialAppKeyWord || _la==GetMaterialApp) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(485);
			match(OP);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Home) {
				{
				setState(486);
				match(Home);
				setState(487);
				match(TWODOT);
				setState(488);
				match(Name);
				setState(489);
				match(OP);
				setState(490);
				match(CP);
				setState(491);
				match(SemiC);
				}
			}

			setState(494);
			match(CP);
			setState(495);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RowContext extends ParserRuleContext {
		public TerminalNode Row() { return getToken(dartParser.Row, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(Row);
			setState(498);
			match(OP);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILDREN) {
				{
				setState(499);
				children();
				}
			}

			setState(502);
			match(CP);
			setState(503);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(dartParser.COLUMN, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public ColumnPropsContext columnProps() {
			return getRuleContext(ColumnPropsContext.class,0);
		}
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(COLUMN);
			setState(506);
			match(OP);
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(507);
				columnProps();
				}
				break;
			}
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILDREN) {
				{
				setState(510);
				children();
				}
			}

			setState(513);
			match(CP);
			setState(514);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnPropsContext extends ParserRuleContext {
		public MainAxisAligmentContext mainAxisAligment() {
			return getRuleContext(MainAxisAligmentContext.class,0);
		}
		public CrossAxisAligmentContext crossAxisAligment() {
			return getRuleContext(CrossAxisAligmentContext.class,0);
		}
		public ColumnPropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterColumnProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitColumnProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitColumnProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnPropsContext columnProps() throws RecognitionException {
		ColumnPropsContext _localctx = new ColumnPropsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_columnProps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MainAxisAligmentKeyWord) {
				{
				setState(516);
				mainAxisAligment();
				}
			}

			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CrossAxisAligmentKeyWord) {
				{
				setState(519);
				crossAxisAligment();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainAxisAligmentContext extends ParserRuleContext {
		public TerminalNode MainAxisAligmentKeyWord() { return getToken(dartParser.MainAxisAligmentKeyWord, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public TerminalNode MainAxisProperties() { return getToken(dartParser.MainAxisProperties, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public MainPropertiesAttrContext mainPropertiesAttr() {
			return getRuleContext(MainPropertiesAttrContext.class,0);
		}
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public MainAxisAligmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainAxisAligment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterMainAxisAligment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitMainAxisAligment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitMainAxisAligment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainAxisAligmentContext mainAxisAligment() throws RecognitionException {
		MainAxisAligmentContext _localctx = new MainAxisAligmentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mainAxisAligment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(MainAxisAligmentKeyWord);
			setState(523);
			match(TWODOT);
			setState(524);
			match(MainAxisProperties);
			setState(525);
			match(Dot);
			setState(526);
			mainPropertiesAttr();
			setState(527);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CrossAxisAligmentContext extends ParserRuleContext {
		public TerminalNode CrossAxisAligmentKeyWord() { return getToken(dartParser.CrossAxisAligmentKeyWord, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public TerminalNode CrossProperties() { return getToken(dartParser.CrossProperties, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public CrossPropertiesAttrContext crossPropertiesAttr() {
			return getRuleContext(CrossPropertiesAttrContext.class,0);
		}
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public CrossAxisAligmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossAxisAligment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterCrossAxisAligment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitCrossAxisAligment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitCrossAxisAligment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossAxisAligmentContext crossAxisAligment() throws RecognitionException {
		CrossAxisAligmentContext _localctx = new CrossAxisAligmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_crossAxisAligment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(CrossAxisAligmentKeyWord);
			setState(530);
			match(TWODOT);
			setState(531);
			match(CrossProperties);
			setState(532);
			match(Dot);
			setState(533);
			crossPropertiesAttr();
			setState(534);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainPropertiesAttrContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(dartParser.START, 0); }
		public TerminalNode END() { return getToken(dartParser.END, 0); }
		public TerminalNode CENTER() { return getToken(dartParser.CENTER, 0); }
		public TerminalNode STRETCH() { return getToken(dartParser.STRETCH, 0); }
		public MainPropertiesAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainPropertiesAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterMainPropertiesAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitMainPropertiesAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitMainPropertiesAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainPropertiesAttrContext mainPropertiesAttr() throws RecognitionException {
		MainPropertiesAttrContext _localctx = new MainPropertiesAttrContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mainPropertiesAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 15L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CrossPropertiesAttrContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(dartParser.START, 0); }
		public TerminalNode END() { return getToken(dartParser.END, 0); }
		public TerminalNode CENTER() { return getToken(dartParser.CENTER, 0); }
		public TerminalNode STRETCH() { return getToken(dartParser.STRETCH, 0); }
		public CrossPropertiesAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossPropertiesAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterCrossPropertiesAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitCrossPropertiesAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitCrossPropertiesAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossPropertiesAttrContext crossPropertiesAttr() throws RecognitionException {
		CrossPropertiesAttrContext _localctx = new CrossPropertiesAttrContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_crossPropertiesAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 15L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class WidthContext extends ParserRuleContext {
		public TerminalNode WidthKeyWord() { return getToken(dartParser.WidthKeyWord, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public TerminalNode INTEGER() { return getToken(dartParser.INTEGER, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(WidthKeyWord);
			setState(541);
			match(TWODOT);
			setState(542);
			match(INTEGER);
			setState(543);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HeightContext extends ParserRuleContext {
		public TerminalNode HeightKeyWord() { return getToken(dartParser.HeightKeyWord, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public TerminalNode INTEGER() { return getToken(dartParser.INTEGER, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(HeightKeyWord);
			setState(546);
			match(TWODOT);
			setState(547);
			match(INTEGER);
			setState(548);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(dartParser.Text, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public List<TerminalNode> COMMAWidget() { return getTokens(dartParser.COMMAWidget); }
		public TerminalNode COMMAWidget(int i) {
			return getToken(dartParser.COMMAWidget, i);
		}
		public List<TerminalNode> SingleQ() { return getTokens(dartParser.SingleQ); }
		public TerminalNode SingleQ(int i) {
			return getToken(dartParser.SingleQ, i);
		}
		public List<TerminalNode> DoubleQ() { return getTokens(dartParser.DoubleQ); }
		public TerminalNode DoubleQ(int i) {
			return getToken(dartParser.DoubleQ, i);
		}
		public List<TerminalNode> Name() { return getTokens(dartParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(dartParser.Name, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(Text);
			setState(551);
			match(OP);
			setState(552);
			_la = _input.LA(1);
			if ( !(_la==SingleQ || _la==DoubleQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(553);
				match(Name);
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
			_la = _input.LA(1);
			if ( !(_la==SingleQ || _la==DoubleQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAWidget) {
				{
				setState(560);
				match(COMMAWidget);
				}
			}

			setState(563);
			match(CP);
			setState(564);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINAR() { return getToken(dartParser.CONTAINAR, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(CONTAINAR);
			setState(567);
			match(OP);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WidthKeyWord) {
				{
				setState(568);
				width();
				}
			}

			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HeightKeyWord) {
				{
				setState(571);
				height();
				}
			}

			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ColorKey) {
				{
				setState(574);
				color();
				}
			}

			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
				setState(577);
				child();
				}
			}

			setState(580);
			match(CP);
			setState(581);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColorContext extends ParserRuleContext {
		public TerminalNode ColorKey() { return getToken(dartParser.ColorKey, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public ColorValueContext colorValue() {
			return getRuleContext(ColorValueContext.class,0);
		}
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(ColorKey);
			setState(584);
			match(TWODOT);
			setState(585);
			colorValue();
			setState(586);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColorValueContext extends ParserRuleContext {
		public TerminalNode Color() { return getToken(dartParser.Color, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public TerminalNode FromRGBO() { return getToken(dartParser.FromRGBO, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(dartParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(dartParser.INTEGER, i);
		}
		public List<TerminalNode> COMMAWidget() { return getTokens(dartParser.COMMAWidget); }
		public TerminalNode COMMAWidget(int i) {
			return getToken(dartParser.COMMAWidget, i);
		}
		public TerminalNode DOUBLE() { return getToken(dartParser.DOUBLE, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public ColorValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterColorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitColorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitColorValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorValueContext colorValue() throws RecognitionException {
		ColorValueContext _localctx = new ColorValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_colorValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(Color);
			setState(589);
			match(Dot);
			setState(590);
			match(FromRGBO);
			setState(591);
			match(OP);
			setState(592);
			match(INTEGER);
			setState(593);
			match(COMMAWidget);
			setState(594);
			match(INTEGER);
			setState(595);
			match(COMMAWidget);
			setState(596);
			match(INTEGER);
			setState(597);
			match(COMMAWidget);
			setState(598);
			match(DOUBLE);
			setState(599);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GestureDetectorContext extends ParserRuleContext {
		public TerminalNode GESTUREDETECTOR() { return getToken(dartParser.GESTUREDETECTOR, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public OnTapContext onTap() {
			return getRuleContext(OnTapContext.class,0);
		}
		public GestureDetectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gestureDetector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterGestureDetector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitGestureDetector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitGestureDetector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GestureDetectorContext gestureDetector() throws RecognitionException {
		GestureDetectorContext _localctx = new GestureDetectorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_gestureDetector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(GESTUREDETECTOR);
			setState(602);
			match(OP);
			setState(603);
			child();
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONTAP) {
				{
				setState(604);
				onTap();
				}
			}

			setState(607);
			match(CP);
			setState(608);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CardContext extends ParserRuleContext {
		public TerminalNode CARD() { return getToken(dartParser.CARD, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public CardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitCard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitCard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardContext card() throws RecognitionException {
		CardContext _localctx = new CardContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(CARD);
			setState(611);
			match(OP);
			setState(612);
			child();
			setState(613);
			match(CP);
			setState(614);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OnTapContext extends ParserRuleContext {
		public TerminalNode ONTAP() { return getToken(dartParser.ONTAP, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode OBracketC() { return getToken(dartParser.OBracketC, 0); }
		public TerminalNode CBracketC() { return getToken(dartParser.CBracketC, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public NavigatorContext navigator() {
			return getRuleContext(NavigatorContext.class,0);
		}
		public OnTapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onTap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterOnTap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitOnTap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitOnTap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnTapContext onTap() throws RecognitionException {
		OnTapContext _localctx = new OnTapContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_onTap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(ONTAP);
			setState(617);
			match(TWODOT);
			setState(618);
			match(OP);
			setState(619);
			match(CP);
			setState(620);
			match(OBracketC);
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NavigatorKeyWord) {
				{
				setState(621);
				navigator();
				}
			}

			setState(624);
			match(CBracketC);
			setState(625);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChildContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(dartParser.CHILD, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildContext child() throws RecognitionException {
		ChildContext _localctx = new ChildContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_child);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(CHILD);
			setState(628);
			match(TWODOT);
			setState(629);
			widget();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WidgetsContext extends ParserRuleContext {
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public WidgetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterWidgets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitWidgets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitWidgets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetsContext widgets() throws RecognitionException {
		WidgetsContext _localctx = new WidgetsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_widgets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9792L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 1073741887L) != 0)) {
				{
				{
				setState(631);
				widget();
				}
				}
				setState(636);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChildrenContext extends ParserRuleContext {
		public TerminalNode CHILDREN() { return getToken(dartParser.CHILDREN, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public TerminalNode OSP() { return getToken(dartParser.OSP, 0); }
		public WidgetsContext widgets() {
			return getRuleContext(WidgetsContext.class,0);
		}
		public TerminalNode CSP() { return getToken(dartParser.CSP, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public ChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_children; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitChildren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenContext children() throws RecognitionException {
		ChildrenContext _localctx = new ChildrenContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_children);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(CHILDREN);
			setState(638);
			match(TWODOT);
			setState(639);
			match(OSP);
			setState(640);
			widgets();
			setState(641);
			match(CSP);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAWidget) {
				{
				setState(642);
				match(COMMAWidget);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class NavigatorContext extends ParserRuleContext {
		public TerminalNode NavigatorKeyWord() { return getToken(dartParser.NavigatorKeyWord, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public PopContext pop() {
			return getRuleContext(PopContext.class,0);
		}
		public PushNamedContext pushNamed() {
			return getRuleContext(PushNamedContext.class,0);
		}
		public NavigatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterNavigator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitNavigator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitNavigator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigatorContext navigator() throws RecognitionException {
		NavigatorContext _localctx = new NavigatorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_navigator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(NavigatorKeyWord);
			setState(646);
			match(Dot);
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PushMethods:
				{
				setState(647);
				push();
				}
				break;
			case PopMethods:
				{
				setState(648);
				pop();
				}
				break;
			case PushNamed:
				{
				setState(649);
				pushNamed();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PushContext extends ParserRuleContext {
		public TerminalNode PushMethods() { return getToken(dartParser.PushMethods, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode Context() { return getToken(dartParser.Context, 0); }
		public List<TerminalNode> COMMAWidget() { return getTokens(dartParser.COMMAWidget); }
		public TerminalNode COMMAWidget(int i) {
			return getToken(dartParser.COMMAWidget, i);
		}
		public MaterialPageRouteContext materialPageRoute() {
			return getRuleContext(MaterialPageRouteContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(PushMethods);
			setState(653);
			match(OP);
			setState(654);
			match(Context);
			setState(655);
			match(COMMAWidget);
			setState(656);
			materialPageRoute();
			setState(657);
			match(CP);
			setState(658);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaterialPageRouteContext extends ParserRuleContext {
		public TerminalNode MaterialPageRoute() { return getToken(dartParser.MaterialPageRoute, 0); }
		public List<TerminalNode> OP() { return getTokens(dartParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(dartParser.OP, i);
		}
		public TerminalNode Builder() { return getToken(dartParser.Builder, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public TerminalNode Context() { return getToken(dartParser.Context, 0); }
		public List<TerminalNode> CP() { return getTokens(dartParser.CP); }
		public TerminalNode CP(int i) {
			return getToken(dartParser.CP, i);
		}
		public TerminalNode Arrow() { return getToken(dartParser.Arrow, 0); }
		public NewScreenContext newScreen() {
			return getRuleContext(NewScreenContext.class,0);
		}
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public MaterialPageRouteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialPageRoute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterMaterialPageRoute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitMaterialPageRoute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitMaterialPageRoute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialPageRouteContext materialPageRoute() throws RecognitionException {
		MaterialPageRouteContext _localctx = new MaterialPageRouteContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_materialPageRoute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(MaterialPageRoute);
			setState(661);
			match(OP);
			setState(662);
			match(Builder);
			setState(663);
			match(TWODOT);
			setState(664);
			match(OP);
			setState(665);
			match(Context);
			setState(666);
			match(CP);
			setState(667);
			match(Arrow);
			setState(668);
			newScreen();
			setState(669);
			match(CP);
			setState(670);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NewScreenContext extends ParserRuleContext {
		public List<TerminalNode> Name() { return getTokens(dartParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(dartParser.Name, i);
		}
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public List<TerminalNode> DoubleQ() { return getTokens(dartParser.DoubleQ); }
		public TerminalNode DoubleQ(int i) {
			return getToken(dartParser.DoubleQ, i);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public NewScreenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newScreen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterNewScreen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitNewScreen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitNewScreen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewScreenContext newScreen() throws RecognitionException {
		NewScreenContext _localctx = new NewScreenContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_newScreen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(Name);
			setState(673);
			match(OP);
			setState(674);
			match(DoubleQ);
			setState(675);
			match(Name);
			setState(676);
			match(DoubleQ);
			setState(677);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PopContext extends ParserRuleContext {
		public TerminalNode PopMethods() { return getToken(dartParser.PopMethods, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode Context() { return getToken(dartParser.Context, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public PopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitPop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitPop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopContext pop() throws RecognitionException {
		PopContext _localctx = new PopContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(PopMethods);
			setState(680);
			match(OP);
			setState(681);
			match(Context);
			setState(682);
			match(CP);
			setState(683);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PushNamedContext extends ParserRuleContext {
		public TerminalNode PushNamed() { return getToken(dartParser.PushNamed, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode Context() { return getToken(dartParser.Context, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public List<TerminalNode> SingleQ() { return getTokens(dartParser.SingleQ); }
		public TerminalNode SingleQ(int i) {
			return getToken(dartParser.SingleQ, i);
		}
		public List<TerminalNode> DoubleQ() { return getTokens(dartParser.DoubleQ); }
		public TerminalNode DoubleQ(int i) {
			return getToken(dartParser.DoubleQ, i);
		}
		public PushNamedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pushNamed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterPushNamed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitPushNamed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitPushNamed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushNamedContext pushNamed() throws RecognitionException {
		PushNamedContext _localctx = new PushNamedContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_pushNamed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(PushNamed);
			setState(686);
			match(OP);
			setState(687);
			match(Context);
			setState(688);
			match(COMMAWidget);
			setState(689);
			_la = _input.LA(1);
			if ( !(_la==SingleQ || _la==DoubleQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(690);
			match(Name);
			setState(691);
			_la = _input.LA(1);
			if ( !(_la==SingleQ || _la==DoubleQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(692);
			match(CP);
			setState(693);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListViewContext extends ParserRuleContext {
		public TerminalNode LISTVIEW() { return getToken(dartParser.LISTVIEW, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public ListViewPropsContext listViewProps() {
			return getRuleContext(ListViewPropsContext.class,0);
		}
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public ListViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterListView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitListView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitListView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListViewContext listView() throws RecognitionException {
		ListViewContext _localctx = new ListViewContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_listView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(LISTVIEW);
			setState(696);
			match(OP);
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(697);
				listViewProps();
				}
				break;
			}
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILDREN) {
				{
				setState(700);
				children();
				}
			}

			setState(703);
			match(CP);
			setState(704);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListViewPropsContext extends ParserRuleContext {
		public ScrollDirectionContext scrollDirection() {
			return getRuleContext(ScrollDirectionContext.class,0);
		}
		public ReverseContext reverse() {
			return getRuleContext(ReverseContext.class,0);
		}
		public ListViewPropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listViewProps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterListViewProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitListViewProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitListViewProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListViewPropsContext listViewProps() throws RecognitionException {
		ListViewPropsContext _localctx = new ListViewPropsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_listViewProps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ScrollDirectionKeyWord) {
				{
				setState(706);
				scrollDirection();
				}
			}

			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ReverseKeyWord) {
				{
				setState(709);
				reverse();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScrollDirectionContext extends ParserRuleContext {
		public TerminalNode ScrollDirectionKeyWord() { return getToken(dartParser.ScrollDirectionKeyWord, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public TerminalNode Axis() { return getToken(dartParser.Axis, 0); }
		public TerminalNode Dot() { return getToken(dartParser.Dot, 0); }
		public AxisAttrContext axisAttr() {
			return getRuleContext(AxisAttrContext.class,0);
		}
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public ScrollDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scrollDirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterScrollDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitScrollDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitScrollDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScrollDirectionContext scrollDirection() throws RecognitionException {
		ScrollDirectionContext _localctx = new ScrollDirectionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_scrollDirection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(ScrollDirectionKeyWord);
			setState(713);
			match(TWODOT);
			setState(714);
			match(Axis);
			setState(715);
			match(Dot);
			setState(716);
			axisAttr();
			setState(717);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReverseContext extends ParserRuleContext {
		public TerminalNode ReverseKeyWord() { return getToken(dartParser.ReverseKeyWord, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public TerminalNode False() { return getToken(dartParser.False, 0); }
		public TerminalNode True() { return getToken(dartParser.True, 0); }
		public ReverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterReverse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitReverse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitReverse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReverseContext reverse() throws RecognitionException {
		ReverseContext _localctx = new ReverseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_reverse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(ReverseKeyWord);
			setState(720);
			match(TWODOT);
			setState(721);
			_la = _input.LA(1);
			if ( !(_la==True || _la==False) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(722);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AxisAttrContext extends ParserRuleContext {
		public TerminalNode AXISATTR() { return getToken(dartParser.AXISATTR, 0); }
		public AxisAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axisAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterAxisAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitAxisAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitAxisAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxisAttrContext axisAttr() throws RecognitionException {
		AxisAttrContext _localctx = new AxisAttrContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_axisAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(AXISATTR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareStringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(dartParser.STRING, 0); }
		public List<TerminalNode> Name() { return getTokens(dartParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(dartParser.Name, i);
		}
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public TerminalNode FINAL() { return getToken(dartParser.FINAL, 0); }
		public TerminalNode EQUALS() { return getToken(dartParser.EQUALS, 0); }
		public List<TerminalNode> SingleQ() { return getTokens(dartParser.SingleQ); }
		public TerminalNode SingleQ(int i) {
			return getToken(dartParser.SingleQ, i);
		}
		public List<TerminalNode> DoubleQ() { return getTokens(dartParser.DoubleQ); }
		public TerminalNode DoubleQ(int i) {
			return getToken(dartParser.DoubleQ, i);
		}
		public DeclareStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclareString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclareString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclareString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareStringContext declareString() throws RecognitionException {
		DeclareStringContext _localctx = new DeclareStringContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_declareString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(726);
				match(FINAL);
				}
			}

			setState(729);
			match(STRING);
			setState(730);
			match(Name);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(731);
				match(EQUALS);
				}
			}

			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(734);
				_la = _input.LA(1);
				if ( !(_la==SingleQ || _la==DoubleQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(737);
				match(Name);
				}
			}

			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SingleQ || _la==DoubleQ) {
				{
				setState(740);
				_la = _input.LA(1);
				if ( !(_la==SingleQ || _la==DoubleQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(743);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareIntContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(dartParser.INT, 0); }
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public TerminalNode FINAL() { return getToken(dartParser.FINAL, 0); }
		public TerminalNode EQUALS() { return getToken(dartParser.EQUALS, 0); }
		public TerminalNode INTEGER() { return getToken(dartParser.INTEGER, 0); }
		public DeclareIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclareInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclareInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclareInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareIntContext declareInt() throws RecognitionException {
		DeclareIntContext _localctx = new DeclareIntContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declareInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(745);
				match(FINAL);
				}
			}

			setState(748);
			match(INT);
			setState(749);
			match(Name);
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(750);
				match(EQUALS);
				setState(751);
				match(INTEGER);
				}
			}

			setState(754);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareBoolContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(dartParser.BOOLEAN, 0); }
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public TerminalNode FINAL() { return getToken(dartParser.FINAL, 0); }
		public TerminalNode EQUALS() { return getToken(dartParser.EQUALS, 0); }
		public TerminalNode True() { return getToken(dartParser.True, 0); }
		public TerminalNode False() { return getToken(dartParser.False, 0); }
		public DeclareBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclareBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclareBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclareBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareBoolContext declareBool() throws RecognitionException {
		DeclareBoolContext _localctx = new DeclareBoolContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declareBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(756);
				match(FINAL);
				}
			}

			setState(759);
			match(BOOLEAN);
			setState(760);
			match(Name);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(761);
				match(EQUALS);
				setState(762);
				_la = _input.LA(1);
				if ( !(_la==True || _la==False) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(765);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode VoidDataType() { return getToken(dartParser.VoidDataType, 0); }
		public TerminalNode MainKeyWord() { return getToken(dartParser.MainKeyWord, 0); }
		public List<TerminalNode> OP() { return getTokens(dartParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(dartParser.OP, i);
		}
		public List<TerminalNode> CP() { return getTokens(dartParser.CP); }
		public TerminalNode CP(int i) {
			return getToken(dartParser.CP, i);
		}
		public TerminalNode OBracketC() { return getToken(dartParser.OBracketC, 0); }
		public TerminalNode RunAppKeyWord() { return getToken(dartParser.RunAppKeyWord, 0); }
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public TerminalNode CBracketC() { return getToken(dartParser.CBracketC, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(VoidDataType);
			setState(768);
			match(MainKeyWord);
			setState(769);
			match(OP);
			setState(770);
			match(CP);
			setState(771);
			match(OBracketC);
			setState(772);
			match(RunAppKeyWord);
			setState(773);
			match(OP);
			setState(774);
			match(Name);
			setState(775);
			match(OP);
			setState(776);
			match(CP);
			setState(777);
			match(CP);
			setState(778);
			match(SemiC);
			setState(779);
			match(CBracketC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMaterialContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(dartParser.CLASS, 0); }
		public TerminalNode Name() { return getToken(dartParser.Name, 0); }
		public TerminalNode INHERITS_KEYWORD() { return getToken(dartParser.INHERITS_KEYWORD, 0); }
		public TerminalNode TypeWidget() { return getToken(dartParser.TypeWidget, 0); }
		public TerminalNode OBracketC() { return getToken(dartParser.OBracketC, 0); }
		public BuildContext build() {
			return getRuleContext(BuildContext.class,0);
		}
		public TerminalNode CBracketC() { return getToken(dartParser.CBracketC, 0); }
		public ClassMaterialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMaterial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClassMaterial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClassMaterial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClassMaterial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMaterialContext classMaterial() throws RecognitionException {
		ClassMaterialContext _localctx = new ClassMaterialContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_classMaterial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(CLASS);
			setState(782);
			match(Name);
			setState(783);
			match(INHERITS_KEYWORD);
			setState(784);
			match(TypeWidget);
			setState(785);
			match(OBracketC);
			setState(786);
			build();
			setState(787);
			match(CBracketC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatingActionButtonContext extends ParserRuleContext {
		public TerminalNode FLOATINGACTIONBUTTON() { return getToken(dartParser.FLOATINGACTIONBUTTON, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public FloatingActionButtonPropsContext floatingActionButtonProps() {
			return getRuleContext(FloatingActionButtonPropsContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode SemiC() { return getToken(dartParser.SemiC, 0); }
		public FloatingActionButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingActionButton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFloatingActionButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFloatingActionButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFloatingActionButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingActionButtonContext floatingActionButton() throws RecognitionException {
		FloatingActionButtonContext _localctx = new FloatingActionButtonContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_floatingActionButton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(FLOATINGACTIONBUTTON);
			setState(790);
			match(OP);
			setState(791);
			floatingActionButtonProps();
			setState(792);
			match(CP);
			setState(793);
			match(SemiC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatingActionButtonPropsContext extends ParserRuleContext {
		public OnPressedContext onPressed() {
			return getRuleContext(OnPressedContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public FloatingActionButtonPropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingActionButtonProps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFloatingActionButtonProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFloatingActionButtonProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFloatingActionButtonProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingActionButtonPropsContext floatingActionButtonProps() throws RecognitionException {
		FloatingActionButtonPropsContext _localctx = new FloatingActionButtonPropsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_floatingActionButtonProps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			onPressed();
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
				setState(796);
				child();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class OnPressedContext extends ParserRuleContext {
		public TerminalNode OnPressedKeyWord() { return getToken(dartParser.OnPressedKeyWord, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public TerminalNode MethodCallBack() { return getToken(dartParser.MethodCallBack, 0); }
		public OnPressedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onPressed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterOnPressed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitOnPressed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitOnPressed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnPressedContext onPressed() throws RecognitionException {
		OnPressedContext _localctx = new OnPressedContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_onPressed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(OnPressedKeyWord);
			setState(800);
			match(TWODOT);
			setState(801);
			match(MethodCallBack);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AppBarContext extends ParserRuleContext {
		public TerminalNode APPBARScaff() { return getToken(dartParser.APPBARScaff, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public TerminalNode APPBARInScaffold() { return getToken(dartParser.APPBARInScaffold, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public AppBarPropsContext appBarProps() {
			return getRuleContext(AppBarPropsContext.class,0);
		}
		public AppBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterAppBar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitAppBar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitAppBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarContext appBar() throws RecognitionException {
		AppBarContext _localctx = new AppBarContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_appBar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(APPBARScaff);
			setState(804);
			match(TWODOT);
			setState(805);
			match(APPBARInScaffold);
			setState(806);
			match(OP);
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(807);
				appBarProps();
				}
				break;
			}
			setState(810);
			match(CP);
			setState(811);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AppBarPropsContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public AppBarPropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBarProps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterAppBarProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitAppBarProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitAppBarProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarPropsContext appBarProps() throws RecognitionException {
		AppBarPropsContext _localctx = new AppBarPropsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_appBarProps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TitleKeyWord) {
				{
				setState(813);
				title();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TitleKeyWord() { return getToken(dartParser.TitleKeyWord, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(TitleKeyWord);
			setState(817);
			match(TWODOT);
			setState(818);
			widget();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListTileContext extends ParserRuleContext {
		public TerminalNode LISTTILE() { return getToken(dartParser.LISTTILE, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public ListTilePropsContext listTileProps() {
			return getRuleContext(ListTilePropsContext.class,0);
		}
		public ListTileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listTile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterListTile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitListTile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitListTile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTileContext listTile() throws RecognitionException {
		ListTileContext _localctx = new ListTileContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_listTile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(LISTTILE);
			setState(821);
			match(OP);
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(822);
				listTileProps();
				}
				break;
			}
			setState(825);
			match(CP);
			setState(826);
			match(COMMAWidget);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListTilePropsContext extends ParserRuleContext {
		public LeadingContext leading() {
			return getRuleContext(LeadingContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public SubtitleContext subtitle() {
			return getRuleContext(SubtitleContext.class,0);
		}
		public TrailingContext trailing() {
			return getRuleContext(TrailingContext.class,0);
		}
		public ListTilePropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listTileProps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterListTileProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitListTileProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitListTileProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTilePropsContext listTileProps() throws RecognitionException {
		ListTilePropsContext _localctx = new ListTilePropsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_listTileProps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeadingKeyWord) {
				{
				setState(828);
				leading();
				}
			}

			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TitleKeyWord) {
				{
				setState(831);
				title();
				}
			}

			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SubtitleKeyWord) {
				{
				setState(834);
				subtitle();
				}
			}

			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TrailingKeyWord) {
				{
				setState(837);
				trailing();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LeadingContext extends ParserRuleContext {
		public TerminalNode LeadingKeyWord() { return getToken(dartParser.LeadingKeyWord, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public LeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterLeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitLeading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitLeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeadingContext leading() throws RecognitionException {
		LeadingContext _localctx = new LeadingContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_leading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(LeadingKeyWord);
			setState(841);
			match(TWODOT);
			setState(842);
			widget();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubtitleContext extends ParserRuleContext {
		public TerminalNode SubtitleKeyWord() { return getToken(dartParser.SubtitleKeyWord, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public SubtitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterSubtitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitSubtitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitSubtitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubtitleContext subtitle() throws RecognitionException {
		SubtitleContext _localctx = new SubtitleContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_subtitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(SubtitleKeyWord);
			setState(845);
			match(TWODOT);
			setState(846);
			widget();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TrailingContext extends ParserRuleContext {
		public TerminalNode TrailingKeyWord() { return getToken(dartParser.TrailingKeyWord, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TrailingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterTrailing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitTrailing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitTrailing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingContext trailing() throws RecognitionException {
		TrailingContext _localctx = new TrailingContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_trailing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(TrailingKeyWord);
			setState(849);
			match(TWODOT);
			setState(850);
			widget();
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
		"\u0004\u0001\u0085\u0355\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u009a\b\u0000\n\u0000"+
		"\f\u0000\u009d\t\u0000\u0001\u0000\u0005\u0000\u00a0\b\u0000\n\u0000\f"+
		"\u0000\u00a3\t\u0000\u0001\u0000\u0005\u0000\u00a6\b\u0000\n\u0000\f\u0000"+
		"\u00a9\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0005\u0004\u00c4\b\u0004\n\u0004\f\u0004\u00c7"+
		"\t\u0004\u0001\u0004\u0005\u0004\u00ca\b\u0004\n\u0004\f\u0004\u00cd\t"+
		"\u0004\u0001\u0004\u0005\u0004\u00d0\b\u0004\n\u0004\f\u0004\u00d3\t\u0004"+
		"\u0001\u0004\u0003\u0004\u00d6\b\u0004\u0001\u0004\u0003\u0004\u00d9\b"+
		"\u0004\u0001\u0004\u0003\u0004\u00dc\b\u0004\u0001\u0005\u0003\u0005\u00df"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00e6\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0003\u0006\u00ef\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0003\u0007\u00f9\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u0125\b\f\n\f\f\f\u0128"+
		"\t\f\u0001\f\u0005\f\u012b\b\f\n\f\f\f\u012e\t\f\u0001\f\u0005\f\u0131"+
		"\b\f\n\f\f\f\u0134\t\f\u0001\f\u0003\f\u0137\b\f\u0001\f\u0003\f\u013a"+
		"\b\f\u0001\f\u0001\f\u0001\r\u0003\r\u013f\b\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0149\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u015a\b\u000f\u000b\u000f\f\u000f\u015b\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0163\b\u000f"+
		"\n\u000f\f\u000f\u0166\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0170"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0005"+
		"\u0011\u0177\b\u0011\n\u0011\f\u0011\u017a\t\u0011\u0001\u0011\u0005\u0011"+
		"\u017d\b\u0011\n\u0011\f\u0011\u0180\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0198\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0003\u0015\u019e\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01a5\b\u0015\n\u0015\f\u0015"+
		"\u01a8\t\u0015\u0003\u0015\u01aa\b\u0015\u0001\u0015\u0003\u0015\u01ad"+
		"\b\u0015\u0001\u0016\u0003\u0016\u01b0\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01c1\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01d0\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01d5\b\u0019\u0001\u0019"+
		"\u0003\u0019\u01d8\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01ed\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u01f5\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u01fd\b\u001e\u0001\u001e\u0003\u001e\u0200\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0003\u001f\u0206"+
		"\b\u001f\u0001\u001f\u0003\u001f\u0209\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005&\u022b"+
		"\b&\n&\f&\u022e\t&\u0001&\u0001&\u0003&\u0232\b&\u0001&\u0001&\u0001&"+
		"\u0001\'\u0001\'\u0001\'\u0003\'\u023a\b\'\u0001\'\u0003\'\u023d\b\'\u0001"+
		"\'\u0003\'\u0240\b\'\u0001\'\u0003\'\u0243\b\'\u0001\'\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0003*\u025e\b*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u026f\b,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001.\u0005"+
		".\u0279\b.\n.\f.\u027c\t.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u0284\b/\u00010\u00010\u00010\u00010\u00010\u00030\u028b\b0\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00016\u00016\u00016\u00036\u02bb\b6\u00016\u00036\u02be\b6\u0001"+
		"6\u00016\u00016\u00017\u00037\u02c4\b7\u00017\u00037\u02c7\b7\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u0001"+
		"9\u0001:\u0001:\u0001;\u0003;\u02d8\b;\u0001;\u0001;\u0001;\u0003;\u02dd"+
		"\b;\u0001;\u0003;\u02e0\b;\u0001;\u0003;\u02e3\b;\u0001;\u0003;\u02e6"+
		"\b;\u0001;\u0001;\u0001<\u0003<\u02eb\b<\u0001<\u0001<\u0001<\u0001<\u0003"+
		"<\u02f1\b<\u0001<\u0001<\u0001=\u0003=\u02f6\b=\u0001=\u0001=\u0001=\u0001"+
		"=\u0003=\u02fc\b=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001A\u0001A\u0003A\u031e\bA\u0001B\u0001B\u0001B\u0001"+
		"B\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u0329\bC\u0001C\u0001C\u0001"+
		"C\u0001D\u0003D\u032f\bD\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001"+
		"F\u0003F\u0338\bF\u0001F\u0001F\u0001F\u0001G\u0003G\u033e\bG\u0001G\u0003"+
		"G\u0341\bG\u0001G\u0003G\u0344\bG\u0001G\u0003G\u0347\bG\u0001H\u0001"+
		"H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0000\u0000K\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0000\u0004\u0001\u0000LM\u0002\u0000\u0017\u001711\u0001"+
		"\u0000cf\u0001\u0000:;\u035c\u0000\u0096\u0001\u0000\u0000\u0000\u0002"+
		"\u00aa\u0001\u0000\u0000\u0000\u0004\u00b2\u0001\u0000\u0000\u0000\u0006"+
		"\u00ba\u0001\u0000\u0000\u0000\b\u00c5\u0001\u0000\u0000\u0000\n\u00de"+
		"\u0001\u0000\u0000\u0000\f\u00ee\u0001\u0000\u0000\u0000\u000e\u00f8\u0001"+
		"\u0000\u0000\u0000\u0010\u0101\u0001\u0000\u0000\u0000\u0012\u0110\u0001"+
		"\u0000\u0000\u0000\u0014\u0112\u0001\u0000\u0000\u0000\u0016\u0121\u0001"+
		"\u0000\u0000\u0000\u0018\u0126\u0001\u0000\u0000\u0000\u001a\u013e\u0001"+
		"\u0000\u0000\u0000\u001c\u014e\u0001\u0000\u0000\u0000\u001e\u0157\u0001"+
		"\u0000\u0000\u0000 \u0169\u0001\u0000\u0000\u0000\"\u0178\u0001\u0000"+
		"\u0000\u0000$\u0181\u0001\u0000\u0000\u0000&\u018a\u0001\u0000\u0000\u0000"+
		"(\u0194\u0001\u0000\u0000\u0000*\u019d\u0001\u0000\u0000\u0000,\u01af"+
		"\u0001\u0000\u0000\u0000.\u01b6\u0001\u0000\u0000\u00000\u01cf\u0001\u0000"+
		"\u0000\u00002\u01d1\u0001\u0000\u0000\u00004\u01dc\u0001\u0000\u0000\u0000"+
		"6\u01e0\u0001\u0000\u0000\u00008\u01e3\u0001\u0000\u0000\u0000:\u01f1"+
		"\u0001\u0000\u0000\u0000<\u01f9\u0001\u0000\u0000\u0000>\u0205\u0001\u0000"+
		"\u0000\u0000@\u020a\u0001\u0000\u0000\u0000B\u0211\u0001\u0000\u0000\u0000"+
		"D\u0218\u0001\u0000\u0000\u0000F\u021a\u0001\u0000\u0000\u0000H\u021c"+
		"\u0001\u0000\u0000\u0000J\u0221\u0001\u0000\u0000\u0000L\u0226\u0001\u0000"+
		"\u0000\u0000N\u0236\u0001\u0000\u0000\u0000P\u0247\u0001\u0000\u0000\u0000"+
		"R\u024c\u0001\u0000\u0000\u0000T\u0259\u0001\u0000\u0000\u0000V\u0262"+
		"\u0001\u0000\u0000\u0000X\u0268\u0001\u0000\u0000\u0000Z\u0273\u0001\u0000"+
		"\u0000\u0000\\\u027a\u0001\u0000\u0000\u0000^\u027d\u0001\u0000\u0000"+
		"\u0000`\u0285\u0001\u0000\u0000\u0000b\u028c\u0001\u0000\u0000\u0000d"+
		"\u0294\u0001\u0000\u0000\u0000f\u02a0\u0001\u0000\u0000\u0000h\u02a7\u0001"+
		"\u0000\u0000\u0000j\u02ad\u0001\u0000\u0000\u0000l\u02b7\u0001\u0000\u0000"+
		"\u0000n\u02c3\u0001\u0000\u0000\u0000p\u02c8\u0001\u0000\u0000\u0000r"+
		"\u02cf\u0001\u0000\u0000\u0000t\u02d4\u0001\u0000\u0000\u0000v\u02d7\u0001"+
		"\u0000\u0000\u0000x\u02ea\u0001\u0000\u0000\u0000z\u02f5\u0001\u0000\u0000"+
		"\u0000|\u02ff\u0001\u0000\u0000\u0000~\u030d\u0001\u0000\u0000\u0000\u0080"+
		"\u0315\u0001\u0000\u0000\u0000\u0082\u031b\u0001\u0000\u0000\u0000\u0084"+
		"\u031f\u0001\u0000\u0000\u0000\u0086\u0323\u0001\u0000\u0000\u0000\u0088"+
		"\u032e\u0001\u0000\u0000\u0000\u008a\u0330\u0001\u0000\u0000\u0000\u008c"+
		"\u0334\u0001\u0000\u0000\u0000\u008e\u033d\u0001\u0000\u0000\u0000\u0090"+
		"\u0348\u0001\u0000\u0000\u0000\u0092\u034c\u0001\u0000\u0000\u0000\u0094"+
		"\u0350\u0001\u0000\u0000\u0000\u0096\u0097\u0003|>\u0000\u0097\u009b\u0003"+
		"~?\u0000\u0098\u009a\u0003\u0004\u0002\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u00a1\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a0\u0003\u0002\u0001"+
		"\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a7\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0003\u0006\u0003\u0000\u00a5\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u0001\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0001\u0000"+
		"\u0000\u00ab\u00ac\u0005z\u0000\u0000\u00ac\u00ad\u0005$\u0000\u0000\u00ad"+
		"\u00ae\u0005#\u0000\u0000\u00ae\u00af\u0005{\u0000\u0000\u00af\u00b0\u0003"+
		"\u001c\u000e\u0000\u00b0\u00b1\u0005j\u0000\u0000\u00b1\u0003\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005\u0001\u0000\u0000\u00b3\u00b4\u0005z\u0000"+
		"\u0000\u00b4\u00b5\u0005p\u0000\u0000\u00b5\u00b6\u0005q\u0000\u0000\u00b6"+
		"\u00b7\u0005{\u0000\u0000\u00b7\u00b8\u0003\u0018\f\u0000\u00b8\u00b9"+
		"\u0005j\u0000\u0000\u00b9\u0005\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		"\u0001\u0000\u0000\u00bb\u00bc\u0005z\u0000\u0000\u00bc\u00bd\u0005p\u0000"+
		"\u0000\u00bd\u00be\u0005\"\u0000\u0000\u00be\u00bf\u0005{\u0000\u0000"+
		"\u00bf\u00c0\u0003\b\u0004\u0000\u00c0\u00c1\u0005j\u0000\u0000\u00c1"+
		"\u0007\u0001\u0000\u0000\u0000\u00c2\u00c4\u0003\u000e\u0007\u0000\u00c3"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00cb\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8"+
		"\u00ca\u0003\f\u0006\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\u00d1\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ce\u00d0\u0003\n\u0005\u0000\u00cf\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d6\u0003"+
		"\u0010\b\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d9\u0003\u0014"+
		"\n\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00dc\u0003\u001e\u000f"+
		"\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\t\u0001\u0000\u0000\u0000\u00dd\u00df\u0005_\u0000\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005z\u0000\u0000\u00e1"+
		"\u00e5\u00052\u0000\u0000\u00e2\u00e3\u0005G\u0000\u0000\u00e3\u00e4\u0005"+
		"z\u0000\u0000\u00e4\u00e6\u0005E\u0000\u0000\u00e5\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0005s\u0000\u0000\u00e8\u00e9\u0005t\u0000\u0000\u00e9"+
		"\u00ea\u0005k\u0000\u0000\u00ea\u00eb\u0005.\u0000\u0000\u00eb\u00ec\u0005"+
		"w\u0000\u0000\u00ec\u000b\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005_\u0000"+
		"\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005z\u0000\u0000"+
		"\u00f1\u00f2\u00052\u0000\u0000\u00f2\u00f3\u0007\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005k\u0000\u0000\u00f4\u00f5\u0005.\u0000\u0000\u00f5\u00f6\u0005"+
		"w\u0000\u0000\u00f6\r\u0001\u0000\u0000\u0000\u00f7\u00f9\u0005_\u0000"+
		"\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005z\u0000\u0000"+
		"\u00fb\u00fc\u00052\u0000\u0000\u00fc\u00fd\u0005\u001b\u0000\u0000\u00fd"+
		"\u00fe\u0005k\u0000\u0000\u00fe\u00ff\u0005.\u0000\u0000\u00ff\u0100\u0005"+
		"w\u0000\u0000\u0100\u000f\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u0082"+
		"\u0000\u0000\u0102\u0103\u0005*\u0000\u0000\u0103\u0104\u0005/\u0000\u0000"+
		"\u0104\u0105\u0005u\u0000\u0000\u0105\u0106\u0005v\u0000\u0000\u0106\u0107"+
		"\u0005{\u0000\u0000\u0107\u0108\u0003\u0012\t\u0000\u0108\u0109\u0005"+
		"J\u0000\u0000\u0109\u010a\u0005k\u0000\u0000\u010a\u010b\u0005/\u0000"+
		"\u0000\u010b\u010c\u0005u\u0000\u0000\u010c\u010d\u0005v\u0000\u0000\u010d"+
		"\u010e\u0005w\u0000\u0000\u010e\u010f\u0005j\u0000\u0000\u010f\u0011\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0005}\u0000\u0000\u0111\u0013\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0005\u0082\u0000\u0000\u0113\u0114\u0005*\u0000"+
		"\u0000\u0114\u0115\u00050\u0000\u0000\u0115\u0116\u0005u\u0000\u0000\u0116"+
		"\u0117\u0005v\u0000\u0000\u0117\u0118\u0005{\u0000\u0000\u0118\u0119\u0003"+
		"\u0016\u000b\u0000\u0119\u011a\u0005J\u0000\u0000\u011a\u011b\u0005k\u0000"+
		"\u0000\u011b\u011c\u00050\u0000\u0000\u011c\u011d\u0005u\u0000\u0000\u011d"+
		"\u011e\u0005v\u0000\u0000\u011e\u011f\u0005w\u0000\u0000\u011f\u0120\u0005"+
		"j\u0000\u0000\u0120\u0015\u0001\u0000\u0000\u0000\u0121\u0122\u0005}\u0000"+
		"\u0000\u0122\u0017\u0001\u0000\u0000\u0000\u0123\u0125\u0003v;\u0000\u0124"+
		"\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u012c\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129"+
		"\u012b\u0003x<\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u012e\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u0132\u0001\u0000\u0000\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012f\u0131\u0003z=\u0000\u0130\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0137\u0003\u001a\r\u0000"+
		"\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u013a\u0003(\u0014\u0000\u0139"+
		"\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0003.\u0017\u0000\u013c\u0019"+
		"\u0001\u0000\u0000\u0000\u013d\u013f\u0005_\u0000\u0000\u013e\u013d\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0005z\u0000\u0000\u0141\u0142\u00052\u0000"+
		"\u0000\u0142\u0143\u0005\u001f\u0000\u0000\u0143\u0144\u0005k\u0000\u0000"+
		"\u0144\u0148\u0005(\u0000\u0000\u0145\u0146\u0005G\u0000\u0000\u0146\u0147"+
		"\u0005z\u0000\u0000\u0147\u0149\u0005E\u0000\u0000\u0148\u0145\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0005u\u0000\u0000\u014b\u014c\u0005v\u0000\u0000"+
		"\u014c\u014d\u0005w\u0000\u0000\u014d\u001b\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0005\u0082\u0000\u0000\u014f\u0150\u0005*\u0000\u0000\u0150\u0151"+
		"\u0005+\u0000\u0000\u0151\u0152\u0005u\u0000\u0000\u0152\u0153\u0005v"+
		"\u0000\u0000\u0153\u0154\u0005{\u0000\u0000\u0154\u0155\u0003\"\u0011"+
		"\u0000\u0155\u0156\u0005j\u0000\u0000\u0156\u001d\u0001\u0000\u0000\u0000"+
		"\u0157\u0159\u0005\u0082\u0000\u0000\u0158\u015a\u0005*\u0000\u0000\u0159"+
		"\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0005,\u0000\u0000\u015e\u015f"+
		"\u0005u\u0000\u0000\u015f\u0160\u0005v\u0000\u0000\u0160\u0164\u0005{"+
		"\u0000\u0000\u0161\u0163\u0003 \u0010\u0000\u0162\u0161\u0001\u0000\u0000"+
		"\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000"+
		"\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u0168\u0005j\u0000\u0000"+
		"\u0168\u001f\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u001f\u0000\u0000"+
		"\u016a\u016b\u0005k\u0000\u0000\u016b\u016f\u0005-\u0000\u0000\u016c\u016d"+
		"\u0005G\u0000\u0000\u016d\u016e\u0005z\u0000\u0000\u016e\u0170\u0005E"+
		"\u0000\u0000\u016f\u016c\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0005u\u0000"+
		"\u0000\u0172\u0173\u0005v\u0000\u0000\u0173\u0174\u0005w\u0000\u0000\u0174"+
		"!\u0001\u0000\u0000\u0000\u0175\u0177\u0003$\u0012\u0000\u0176\u0175\u0001"+
		"\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017e\u0001"+
		"\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017d\u0003"+
		"&\u0013\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000"+
		"\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f#\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000"+
		"\u0000\u0181\u0182\u0005\u001f\u0000\u0000\u0182\u0183\u0005k\u0000\u0000"+
		"\u0183\u0184\u0005%\u0000\u0000\u0184\u0185\u0005u\u0000\u0000\u0185\u0186"+
		"\u0005&\u0000\u0000\u0186\u0187\u0003f3\u0000\u0187\u0188\u0005v\u0000"+
		"\u0000\u0188\u0189\u0005w\u0000\u0000\u0189%\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0005\u001f\u0000\u0000\u018b\u018c\u0005k\u0000\u0000\u018c\u018d"+
		"\u0005\'\u0000\u0000\u018d\u018e\u0005u\u0000\u0000\u018e\u018f\u0005"+
		"z\u0000\u0000\u018f\u0190\u0005u\u0000\u0000\u0190\u0191\u0005v\u0000"+
		"\u0000\u0191\u0192\u0005v\u0000\u0000\u0192\u0193\u0005w\u0000\u0000\u0193"+
		"\'\u0001\u0000\u0000\u0000\u0194\u0195\u0005z\u0000\u0000\u0195\u0197"+
		"\u0005u\u0000\u0000\u0196\u0198\u0003*\u0015\u0000\u0197\u0196\u0001\u0000"+
		"\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0005v\u0000\u0000\u019a\u019b\u0005w\u0000\u0000"+
		"\u019b)\u0001\u0000\u0000\u0000\u019c\u019e\u0005{\u0000\u0000\u019d\u019c"+
		"\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0001\u0000\u0000\u0000\u019f\u01a0\u0005J\u0000\u0000\u01a0\u01a1\u0005"+
		"k\u0000\u0000\u01a1\u01a9\u0005K\u0000\u0000\u01a2\u01a6\u0005\u0080\u0000"+
		"\u0000\u01a3\u01a5\u0003,\u0016\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ad\u0005j\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ad+\u0001\u0000\u0000\u0000\u01ae\u01b0"+
		"\u0005y\u0000\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005"+
		"x\u0000\u0000\u01b2\u01b3\u0005k\u0000\u0000\u01b3\u01b4\u0005z\u0000"+
		"\u0000\u01b4\u01b5\u0005\u0080\u0000\u0000\u01b5-\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\u0005\u0082\u0000\u0000\u01b7\u01b8\u0005N\u0000\u0000\u01b8"+
		"\u01b9\u0005g\u0000\u0000\u01b9\u01ba\u0005u\u0000\u0000\u01ba\u01bb\u0005"+
		"h\u0000\u0000\u01bb\u01bc\u0005i\u0000\u0000\u01bc\u01bd\u0005v\u0000"+
		"\u0000\u01bd\u01c0\u0005{\u0000\u0000\u01be\u01c1\u00036\u001b\u0000\u01bf"+
		"\u01c1\u00038\u001c\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0005j\u0000\u0000\u01c3/\u0001\u0000\u0000\u0000\u01c4\u01d0\u0003N"+
		"\'\u0000\u01c5\u01d0\u0003:\u001d\u0000\u01c6\u01d0\u0003<\u001e\u0000"+
		"\u01c7\u01d0\u00032\u0019\u0000\u01c8\u01d0\u0003T*\u0000\u01c9\u01d0"+
		"\u0003L&\u0000\u01ca\u01d0\u0003V+\u0000\u01cb\u01d0\u0003l6\u0000\u01cc"+
		"\u01d0\u0003\u0080@\u0000\u01cd\u01d0\u0003\u0086C\u0000\u01ce\u01d0\u0003"+
		"\u008cF\u0000\u01cf\u01c4\u0001\u0000\u0000\u0000\u01cf\u01c5\u0001\u0000"+
		"\u0000\u0000\u01cf\u01c6\u0001\u0000\u0000\u0000\u01cf\u01c7\u0001\u0000"+
		"\u0000\u0000\u01cf\u01c8\u0001\u0000\u0000\u0000\u01cf\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cf\u01ca\u0001\u0000\u0000\u0000\u01cf\u01cb\u0001\u0000"+
		"\u0000\u0000\u01cf\u01cc\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01d01\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d2\u0005m\u0000\u0000\u01d2\u01d4\u0005u\u0000\u0000\u01d3"+
		"\u01d5\u0003\u0086C\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d4\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d8"+
		"\u00034\u001a\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0005"+
		"v\u0000\u0000\u01da\u01db\u0005w\u0000\u0000\u01db3\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0005n\u0000\u0000\u01dd\u01de\u0005o\u0000\u0000\u01de"+
		"\u01df\u00030\u0018\u0000\u01df5\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005"+
		"l\u0000\u0000\u01e1\u01e2\u00030\u0018\u0000\u01e27\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e4\u0005l\u0000\u0000\u01e4\u01e5\u0007\u0001\u0000\u0000"+
		"\u01e5\u01ec\u0005u\u0000\u0000\u01e6\u01e7\u0005\u0018\u0000\u0000\u01e7"+
		"\u01e8\u0005o\u0000\u0000\u01e8\u01e9\u0005z\u0000\u0000\u01e9\u01ea\u0005"+
		"u\u0000\u0000\u01ea\u01eb\u0005v\u0000\u0000\u01eb\u01ed\u0005w\u0000"+
		"\u0000\u01ec\u01e6\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005v\u0000\u0000"+
		"\u01ef\u01f0\u0005w\u0000\u0000\u01f09\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0005P\u0000\u0000\u01f2\u01f4\u0005u\u0000\u0000\u01f3\u01f5\u0003^"+
		"/\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005v\u0000\u0000"+
		"\u01f7\u01f8\u0005\u0080\u0000\u0000\u01f8;\u0001\u0000\u0000\u0000\u01f9"+
		"\u01fa\u0005Q\u0000\u0000\u01fa\u01fc\u0005u\u0000\u0000\u01fb\u01fd\u0003"+
		">\u001f\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000"+
		"\u0000\u0000\u01fd\u01ff\u0001\u0000\u0000\u0000\u01fe\u0200\u0003^/\u0000"+
		"\u01ff\u01fe\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0202\u0005v\u0000\u0000\u0202"+
		"\u0203\u0005\u0080\u0000\u0000\u0203=\u0001\u0000\u0000\u0000\u0204\u0206"+
		"\u0003@ \u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000"+
		"\u0000\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u0209\u0003B!\u0000"+
		"\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000"+
		"\u0209?\u0001\u0000\u0000\u0000\u020a\u020b\u0005U\u0000\u0000\u020b\u020c"+
		"\u0005o\u0000\u0000\u020c\u020d\u0005V\u0000\u0000\u020d\u020e\u0005k"+
		"\u0000\u0000\u020e\u020f\u0003D\"\u0000\u020f\u0210\u0005\u0080\u0000"+
		"\u0000\u0210A\u0001\u0000\u0000\u0000\u0211\u0212\u0005W\u0000\u0000\u0212"+
		"\u0213\u0005o\u0000\u0000\u0213\u0214\u0005X\u0000\u0000\u0214\u0215\u0005"+
		"k\u0000\u0000\u0215\u0216\u0003F#\u0000\u0216\u0217\u0005\u0080\u0000"+
		"\u0000\u0217C\u0001\u0000\u0000\u0000\u0218\u0219\u0007\u0002\u0000\u0000"+
		"\u0219E\u0001\u0000\u0000\u0000\u021a\u021b\u0007\u0002\u0000\u0000\u021b"+
		"G\u0001\u0000\u0000\u0000\u021c\u021d\u0005Y\u0000\u0000\u021d\u021e\u0005"+
		"o\u0000\u0000\u021e\u021f\u0005\u001b\u0000\u0000\u021f\u0220\u0005\u0080"+
		"\u0000\u0000\u0220I\u0001\u0000\u0000\u0000\u0221\u0222\u0005Z\u0000\u0000"+
		"\u0222\u0223\u0005o\u0000\u0000\u0223\u0224\u0005\u001b\u0000\u0000\u0224"+
		"\u0225\u0005\u0080\u0000\u0000\u0225K\u0001\u0000\u0000\u0000\u0226\u0227"+
		"\u0005T\u0000\u0000\u0227\u0228\u0005u\u0000\u0000\u0228\u022c\u0007\u0003"+
		"\u0000\u0000\u0229\u022b\u0005z\u0000\u0000\u022a\u0229\u0001\u0000\u0000"+
		"\u0000\u022b\u022e\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022f\u0001\u0000\u0000"+
		"\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022f\u0231\u0007\u0003\u0000"+
		"\u0000\u0230\u0232\u0005\u0080\u0000\u0000\u0231\u0230\u0001\u0000\u0000"+
		"\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000"+
		"\u0000\u0233\u0234\u0005v\u0000\u0000\u0234\u0235\u0005\u0080\u0000\u0000"+
		"\u0235M\u0001\u0000\u0000\u0000\u0236\u0237\u0005O\u0000\u0000\u0237\u0239"+
		"\u0005u\u0000\u0000\u0238\u023a\u0003H$\u0000\u0239\u0238\u0001\u0000"+
		"\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023c\u0001\u0000"+
		"\u0000\u0000\u023b\u023d\u0003J%\u0000\u023c\u023b\u0001\u0000\u0000\u0000"+
		"\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023f\u0001\u0000\u0000\u0000"+
		"\u023e\u0240\u0003P(\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u023f\u0240"+
		"\u0001\u0000\u0000\u0000\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u0243"+
		"\u0003Z-\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000"+
		"\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0245\u0005v\u0000"+
		"\u0000\u0245\u0246\u0005\u0080\u0000\u0000\u0246O\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u0005\u0019\u0000\u0000\u0248\u0249\u0005o\u0000\u0000\u0249"+
		"\u024a\u0003R)\u0000\u024a\u024b\u0005w\u0000\u0000\u024bQ\u0001\u0000"+
		"\u0000\u0000\u024c\u024d\u0005\u001e\u0000\u0000\u024d\u024e\u0005k\u0000"+
		"\u0000\u024e\u024f\u0005\u001d\u0000\u0000\u024f\u0250\u0005u\u0000\u0000"+
		"\u0250\u0251\u0005\u001b\u0000\u0000\u0251\u0252\u0005\u0080\u0000\u0000"+
		"\u0252\u0253\u0005\u001b\u0000\u0000\u0253\u0254\u0005\u0080\u0000\u0000"+
		"\u0254\u0255\u0005\u001b\u0000\u0000\u0255\u0256\u0005\u0080\u0000\u0000"+
		"\u0256\u0257\u0005\u001c\u0000\u0000\u0257\u0258\u0005v\u0000\u0000\u0258"+
		"S\u0001\u0000\u0000\u0000\u0259\u025a\u0005R\u0000\u0000\u025a\u025b\u0005"+
		"u\u0000\u0000\u025b\u025d\u0003Z-\u0000\u025c\u025e\u0003X,\u0000\u025d"+
		"\u025c\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e"+
		"\u025f\u0001\u0000\u0000\u0000\u025f\u0260\u0005v\u0000\u0000\u0260\u0261"+
		"\u0005\u0080\u0000\u0000\u0261U\u0001\u0000\u0000\u0000\u0262\u0263\u0005"+
		"S\u0000\u0000\u0263\u0264\u0005u\u0000\u0000\u0264\u0265\u0003Z-\u0000"+
		"\u0265\u0266\u0005v\u0000\u0000\u0266\u0267\u0005\u0080\u0000\u0000\u0267"+
		"W\u0001\u0000\u0000\u0000\u0268\u0269\u0005[\u0000\u0000\u0269\u026a\u0005"+
		"o\u0000\u0000\u026a\u026b\u0005u\u0000\u0000\u026b\u026c\u0005v\u0000"+
		"\u0000\u026c\u026e\u0005{\u0000\u0000\u026d\u026f\u0003`0\u0000\u026e"+
		"\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f"+
		"\u0270\u0001\u0000\u0000\u0000\u0270\u0271\u0005j\u0000\u0000\u0271\u0272"+
		"\u0005\u0080\u0000\u0000\u0272Y\u0001\u0000\u0000\u0000\u0273\u0274\u0005"+
		"r\u0000\u0000\u0274\u0275\u0005o\u0000\u0000\u0275\u0276\u00030\u0018"+
		"\u0000\u0276[\u0001\u0000\u0000\u0000\u0277\u0279\u00030\u0018\u0000\u0278"+
		"\u0277\u0001\u0000\u0000\u0000\u0279\u027c\u0001\u0000\u0000\u0000\u027a"+
		"\u0278\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b"+
		"]\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027d\u027e"+
		"\u00059\u0000\u0000\u027e\u027f\u0005o\u0000\u0000\u027f\u0280\u0005s"+
		"\u0000\u0000\u0280\u0281\u0003\\.\u0000\u0281\u0283\u0005t\u0000\u0000"+
		"\u0282\u0284\u0005\u0080\u0000\u0000\u0283\u0282\u0001\u0000\u0000\u0000"+
		"\u0283\u0284\u0001\u0000\u0000\u0000\u0284_\u0001\u0000\u0000\u0000\u0285"+
		"\u0286\u0005\\\u0000\u0000\u0286\u028a\u0005k\u0000\u0000\u0287\u028b"+
		"\u0003b1\u0000\u0288\u028b\u0003h4\u0000\u0289\u028b\u0003j5\u0000\u028a"+
		"\u0287\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028a"+
		"\u0289\u0001\u0000\u0000\u0000\u028ba\u0001\u0000\u0000\u0000\u028c\u028d"+
		"\u0005]\u0000\u0000\u028d\u028e\u0005u\u0000\u0000\u028e\u028f\u0005i"+
		"\u0000\u0000\u028f\u0290\u0005\u0080\u0000\u0000\u0290\u0291\u0003d2\u0000"+
		"\u0291\u0292\u0005v\u0000\u0000\u0292\u0293\u0005\u0080\u0000\u0000\u0293"+
		"c\u0001\u0000\u0000\u0000\u0294\u0295\u0005a\u0000\u0000\u0295\u0296\u0005"+
		"u\u0000\u0000\u0296\u0297\u0005b\u0000\u0000\u0297\u0298\u0005o\u0000"+
		"\u0000\u0298\u0299\u0005u\u0000\u0000\u0299\u029a\u0005i\u0000\u0000\u029a"+
		"\u029b\u0005v\u0000\u0000\u029b\u029c\u0005I\u0000\u0000\u029c\u029d\u0003"+
		"f3\u0000\u029d\u029e\u0005v\u0000\u0000\u029e\u029f\u0005w\u0000\u0000"+
		"\u029fe\u0001\u0000\u0000\u0000\u02a0\u02a1\u0005z\u0000\u0000\u02a1\u02a2"+
		"\u0005u\u0000\u0000\u02a2\u02a3\u0005;\u0000\u0000\u02a3\u02a4\u0005z"+
		"\u0000\u0000\u02a4\u02a5\u0005;\u0000\u0000\u02a5\u02a6\u0005v\u0000\u0000"+
		"\u02a6g\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005`\u0000\u0000\u02a8\u02a9"+
		"\u0005u\u0000\u0000\u02a9\u02aa\u0005i\u0000\u0000\u02aa\u02ab\u0005v"+
		"\u0000\u0000\u02ab\u02ac\u0005w\u0000\u0000\u02aci\u0001\u0000\u0000\u0000"+
		"\u02ad\u02ae\u0005^\u0000\u0000\u02ae\u02af\u0005u\u0000\u0000\u02af\u02b0"+
		"\u0005i\u0000\u0000\u02b0\u02b1\u0005\u0080\u0000\u0000\u02b1\u02b2\u0007"+
		"\u0003\u0000\u0000\u02b2\u02b3\u0005z\u0000\u0000\u02b3\u02b4\u0007\u0003"+
		"\u0000\u0000\u02b4\u02b5\u0005v\u0000\u0000\u02b5\u02b6\u0005w\u0000\u0000"+
		"\u02b6k\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005\u0006\u0000\u0000\u02b8"+
		"\u02ba\u0005u\u0000\u0000\u02b9\u02bb\u0003n7\u0000\u02ba\u02b9\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bc\u02be\u0003^/\u0000\u02bd\u02bc\u0001\u0000\u0000"+
		"\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000"+
		"\u0000\u02bf\u02c0\u0005v\u0000\u0000\u02c0\u02c1\u0005\u0080\u0000\u0000"+
		"\u02c1m\u0001\u0000\u0000\u0000\u02c2\u02c4\u0003p8\u0000\u02c3\u02c2"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c6"+
		"\u0001\u0000\u0000\u0000\u02c5\u02c7\u0003r9\u0000\u02c6\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7o\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c9\u0005\u0007\u0000\u0000\u02c9\u02ca\u0005o\u0000\u0000"+
		"\u02ca\u02cb\u0005\b\u0000\u0000\u02cb\u02cc\u0005k\u0000\u0000\u02cc"+
		"\u02cd\u0003t:\u0000\u02cd\u02ce\u0005\u0080\u0000\u0000\u02ceq\u0001"+
		"\u0000\u0000\u0000\u02cf\u02d0\u0005\u0011\u0000\u0000\u02d0\u02d1\u0005"+
		"o\u0000\u0000\u02d1\u02d2\u0007\u0000\u0000\u0000\u02d2\u02d3\u0005\u0080"+
		"\u0000\u0000\u02d3s\u0001\u0000\u0000\u0000\u02d4\u02d5\u0005\u001a\u0000"+
		"\u0000\u02d5u\u0001\u0000\u0000\u0000\u02d6\u02d8\u0005_\u0000\u0000\u02d7"+
		"\u02d6\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8"+
		"\u02d9\u0001\u0000\u0000\u0000\u02d9\u02da\u0005\u0003\u0000\u0000\u02da"+
		"\u02dc\u0005z\u0000\u0000\u02db\u02dd\u00052\u0000\u0000\u02dc\u02db\u0001"+
		"\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02df\u0001"+
		"\u0000\u0000\u0000\u02de\u02e0\u0007\u0003\u0000\u0000\u02df\u02de\u0001"+
		"\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e2\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e3\u0005z\u0000\u0000\u02e2\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e5\u0001\u0000"+
		"\u0000\u0000\u02e4\u02e6\u0007\u0003\u0000\u0000\u02e5\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e8\u0005w\u0000\u0000\u02e8w\u0001\u0000\u0000\u0000"+
		"\u02e9\u02eb\u0005_\u0000\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000\u02ea"+
		"\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec"+
		"\u02ed\u0005\u0004\u0000\u0000\u02ed\u02f0\u0005z\u0000\u0000\u02ee\u02ef"+
		"\u00052\u0000\u0000\u02ef\u02f1\u0005\u001b\u0000\u0000\u02f0\u02ee\u0001"+
		"\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f3\u0005w\u0000\u0000\u02f3y\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f6\u0005_\u0000\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000"+
		"\u02f7\u02f8\u0005\u0012\u0000\u0000\u02f8\u02fb\u0005z\u0000\u0000\u02f9"+
		"\u02fa\u00052\u0000\u0000\u02fa\u02fc\u0007\u0000\u0000\u0000\u02fb\u02f9"+
		"\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd"+
		"\u0001\u0000\u0000\u0000\u02fd\u02fe\u0005w\u0000\u0000\u02fe{\u0001\u0000"+
		"\u0000\u0000\u02ff\u0300\u0005*\u0000\u0000\u0300\u0301\u0005\u0015\u0000"+
		"\u0000\u0301\u0302\u0005u\u0000\u0000\u0302\u0303\u0005v\u0000\u0000\u0303"+
		"\u0304\u0005{\u0000\u0000\u0304\u0305\u0005\u0016\u0000\u0000\u0305\u0306"+
		"\u0005u\u0000\u0000\u0306\u0307\u0005z\u0000\u0000\u0307\u0308\u0005u"+
		"\u0000\u0000\u0308\u0309\u0005v\u0000\u0000\u0309\u030a\u0005v\u0000\u0000"+
		"\u030a\u030b\u0005w\u0000\u0000\u030b\u030c\u0005j\u0000\u0000\u030c}"+
		"\u0001\u0000\u0000\u0000\u030d\u030e\u0005\u0001\u0000\u0000\u030e\u030f"+
		"\u0005z\u0000\u0000\u030f\u0310\u0005p\u0000\u0000\u0310\u0311\u0005q"+
		"\u0000\u0000\u0311\u0312\u0005{\u0000\u0000\u0312\u0313\u0003.\u0017\u0000"+
		"\u0313\u0314\u0005j\u0000\u0000\u0314\u007f\u0001\u0000\u0000\u0000\u0315"+
		"\u0316\u0005\t\u0000\u0000\u0316\u0317\u0005u\u0000\u0000\u0317\u0318"+
		"\u0003\u0082A\u0000\u0318\u0319\u0005v\u0000\u0000\u0319\u031a\u0005w"+
		"\u0000\u0000\u031a\u0081\u0001\u0000\u0000\u0000\u031b\u031d\u0003\u0084"+
		"B\u0000\u031c\u031e\u0003Z-\u0000\u031d\u031c\u0001\u0000\u0000\u0000"+
		"\u031d\u031e\u0001\u0000\u0000\u0000\u031e\u0083\u0001\u0000\u0000\u0000"+
		"\u031f\u0320\u0005\u0085\u0000\u0000\u0320\u0321\u0005o\u0000\u0000\u0321"+
		"\u0322\u0005&\u0000\u0000\u0322\u0085\u0001\u0000\u0000\u0000\u0323\u0324"+
		"\u0005\n\u0000\u0000\u0324\u0325\u0005o\u0000\u0000\u0325\u0326\u0005"+
		"\u000b\u0000\u0000\u0326\u0328\u0005u\u0000\u0000\u0327\u0329\u0003\u0088"+
		"D\u0000\u0328\u0327\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000"+
		"\u0000\u0329\u032a\u0001\u0000\u0000\u0000\u032a\u032b\u0005v\u0000\u0000"+
		"\u032b\u032c\u0005\u0080\u0000\u0000\u032c\u0087\u0001\u0000\u0000\u0000"+
		"\u032d\u032f\u0003\u008aE\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032e"+
		"\u032f\u0001\u0000\u0000\u0000\u032f\u0089\u0001\u0000\u0000\u0000\u0330"+
		"\u0331\u0005\f\u0000\u0000\u0331\u0332\u0005o\u0000\u0000\u0332\u0333"+
		"\u00030\u0018\u0000\u0333\u008b\u0001\u0000\u0000\u0000\u0334\u0335\u0005"+
		"\r\u0000\u0000\u0335\u0337\u0005u\u0000\u0000\u0336\u0338\u0003\u008e"+
		"G\u0000\u0337\u0336\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000"+
		"\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u033a\u0005v\u0000\u0000"+
		"\u033a\u033b\u0005\u0080\u0000\u0000\u033b\u008d\u0001\u0000\u0000\u0000"+
		"\u033c\u033e\u0003\u0090H\u0000\u033d\u033c\u0001\u0000\u0000\u0000\u033d"+
		"\u033e\u0001\u0000\u0000\u0000\u033e\u0340\u0001\u0000\u0000\u0000\u033f"+
		"\u0341\u0003\u008aE\u0000\u0340\u033f\u0001\u0000\u0000\u0000\u0340\u0341"+
		"\u0001\u0000\u0000\u0000\u0341\u0343\u0001\u0000\u0000\u0000\u0342\u0344"+
		"\u0003\u0092I\u0000\u0343\u0342\u0001\u0000\u0000\u0000\u0343\u0344\u0001"+
		"\u0000\u0000\u0000\u0344\u0346\u0001\u0000\u0000\u0000\u0345\u0347\u0003"+
		"\u0094J\u0000\u0346\u0345\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000"+
		"\u0000\u0000\u0347\u008f\u0001\u0000\u0000\u0000\u0348\u0349\u0005\u000e"+
		"\u0000\u0000\u0349\u034a\u0005o\u0000\u0000\u034a\u034b\u00030\u0018\u0000"+
		"\u034b\u0091\u0001\u0000\u0000\u0000\u034c\u034d\u0005\u0010\u0000\u0000"+
		"\u034d\u034e\u0005o\u0000\u0000\u034e\u034f\u00030\u0018\u0000\u034f\u0093"+
		"\u0001\u0000\u0000\u0000\u0350\u0351\u0005\u000f\u0000\u0000\u0351\u0352"+
		"\u0005o\u0000\u0000\u0352\u0353\u00030\u0018\u0000\u0353\u0095\u0001\u0000"+
		"\u0000\u0000I\u009b\u00a1\u00a7\u00c5\u00cb\u00d1\u00d5\u00d8\u00db\u00de"+
		"\u00e5\u00ee\u00f8\u0126\u012c\u0132\u0136\u0139\u013e\u0148\u015b\u0164"+
		"\u016f\u0178\u017e\u0197\u019d\u01a6\u01a9\u01ac\u01af\u01c0\u01cf\u01d4"+
		"\u01d7\u01ec\u01f4\u01fc\u01ff\u0205\u0208\u022c\u0231\u0239\u023c\u023f"+
		"\u0242\u025d\u026e\u027a\u0283\u028a\u02ba\u02bd\u02c3\u02c6\u02d7\u02dc"+
		"\u02df\u02e2\u02e5\u02ea\u02f0\u02f5\u02fb\u031d\u0328\u032e\u0337\u033d"+
		"\u0340\u0343\u0346";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}