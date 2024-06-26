parser grammar dartParser;
options {tokenVocab=dartLexer;}
plur :main  classMaterial   class*   classInjection*   classController* ;
classInjection:CLASS  Name  (Implements_keyWord)  Bindings  OBracketC  dependenciesInje   CBracketC ;
class:CLASS  Name  INHERITS_KEYWORD  TypeWidget  OBracketC   classBody   CBracketC ;
classController :CLASS  Name  INHERITS_KEYWORD  GetxController  OBracketC  controllerBody  CBracketC ;
controllerBody: declareRxInt*  declareRxBool*  declareRxList*  onInitFunction?  onCloseFunction?  disposeFunction?;
declareRxList: FINAL?  Name  EQUALS  (LESS_THAN Name GREATER_THAN)? OSP  CSP Dot RxGetter SemiC ;
declareRxBool: FINAL?  Name  EQUALS  (True|False) Dot RxGetter  SemiC   ;
declareRxInt: FINAL?  Name  EQUALS  INTEGER Dot RxGetter  SemiC ;
onInitFunction:OVERRIDE_   VoidDataType  OnInit  OP  CP  OBracketC  oninitBody  Super Dot  OnInit  OP   CP SemiC   CBracketC  ;
oninitBody: Newline;
onCloseFunction:OVERRIDE_  VoidDataType  OnClose  OP  CP  OBracketC  oncloseBody  Super Dot  OnClose  OP   CP  SemiC  CBracketC ;
oncloseBody: Newline;
classBody : declareString* declareInt*  declareBool*  declareController? constructor?  build ;
declareController: FINAL?  Name EQUALS  Get Dot Find (LESS_THAN Name GREATER_THAN)? OP  CP SemiC ;
dependenciesInje: OVERRIDE_  VoidDataType  Dependencies  OP  CP  OBracketC  typeInjection  CBracketC  ;
disposeFunction: OVERRIDE_  VoidDataType + Dispose   OP   CP   OBracketC    disposeBody*   CBracketC   ;
disposeBody: Get Dot Delete (LESS_THAN Name GREATER_THAN)? OP   CP SemiC  ;
typeInjection:(injectionLazyPut*injectionPut*);
injectionLazyPut: Get  Dot LazyPut   OP   MethodCallBack   newScreen CP SemiC  ;
injectionPut: Get  Dot Put OP Name  OP  CP CP SemiC   ;
constructor: Name OP constructorBody? CP SemiC;
constructorBody: OBracketC? Super Dot Key (COMMAWidget constracterInit*)? CBracketC?;
constracterInit: Required? THIS Dot Name COMMAWidget;
build: OVERRIDE_ WIDGET BUILDM OP BUILDContext Context CP OBracketC (return | returnMaterialApp) CBracketC;
widget: container | row | column | scaffold | gestureDetector | text | card | listView |floatingActionButton | appBar | listTile;
scaffold: Scaffold OP appBar? bodyScaffold? CP SemiC;
bodyScaffold:BodyScaffold TWODOT widget;
return: Return widget;
returnMaterialApp: Return (MaterialAppKeyWord | GetMaterialApp) OP (Home TWODOT Name OP CP SemiC)? CP SemiC;
row: Row OP children? CP COMMAWidget;
column: COLUMN OP columnProps? children? CP COMMAWidget;
columnProps: mainAxisAligment? crossAxisAligment?;
mainAxisAligment: MainAxisAligmentKeyWord TWODOT MainAxisProperties Dot mainPropertiesAttr COMMAWidget;
crossAxisAligment: CrossAxisAligmentKeyWord TWODOT CrossProperties Dot crossPropertiesAttr COMMAWidget;
mainPropertiesAttr: START | END | CENTER | STRETCH;
crossPropertiesAttr: START | END | CENTER | STRETCH;
width: WidthKeyWord TWODOT INTEGER COMMAWidget;
height: HeightKeyWord TWODOT INTEGER COMMAWidget;
text: Text OP (SingleQ | DoubleQ) Name* (SingleQ | DoubleQ) COMMAWidget? CP COMMAWidget;
container: CONTAINAR OP width? height? color? child? CP COMMAWidget;
color: ColorKey TWODOT colorValue SemiC;
colorValue: Color Dot FromRGBO OP INTEGER COMMAWidget INTEGER COMMAWidget INTEGER COMMAWidget DOUBLE CP;
gestureDetector: GESTUREDETECTOR OP child onTap? CP COMMAWidget;
card: CARD OP child CP COMMAWidget;
onTap: ONTAP TWODOT OP CP OBracketC navigator? CBracketC COMMAWidget;
child: CHILD TWODOT widget;
widgets: (widget)*;
children: CHILDREN TWODOT OSP widgets CSP COMMAWidget?;
navigator: NavigatorKeyWord Dot (push | pop | pushNamed);
push: PushMethods OP Context COMMAWidget materialPageRoute CP COMMAWidget;
materialPageRoute: MaterialPageRoute OP Builder TWODOT OP Context CP Arrow newScreen CP SemiC;
newScreen: Name OP DoubleQ Name DoubleQ CP;
pop: PopMethods OP Context CP SemiC;
pushNamed: PushNamed OP Context COMMAWidget (SingleQ | DoubleQ) Name (SingleQ | DoubleQ) CP SemiC;

listView: LISTVIEW OP listViewProps? children? CP COMMAWidget;
listViewProps: scrollDirection? reverse? ;
scrollDirection: ScrollDirectionKeyWord TWODOT Axis Dot axisAttr COMMAWidget;
reverse: ReverseKeyWord TWODOT (False|True) COMMAWidget;
axisAttr: AXISATTR;
declareString:FINAL?  STRING  Name  EQUALS?   (SingleQ|DoubleQ)?  Name?  (SingleQ|DoubleQ)? SemiC   ;
declareInt : FINAL?  INT  Name  (EQUALS  INTEGER)?   SemiC   ;
declareBool : FINAL?  BOOLEAN  Name  (EQUALS  (True|False))?   SemiC   ;
main:VoidDataType MainKeyWord OP   CP   OBracketC   RunAppKeyWord OP   Name   OP   CP   CP  SemiC    CBracketC    ;
classMaterial:CLASS  Name INHERITS_KEYWORD TypeWidget  OBracketC  build  CBracketC     ;
floatingActionButton: FLOATINGACTIONBUTTON OP floatingActionButtonProps CP SemiC;
floatingActionButtonProps:  onPressed child?;
onPressed: OnPressedKeyWord TWODOT MethodCallBack; ///todo:what  after methodcallback
appBar: APPBARScaff TWODOT APPBARInScaffold OP appBarProps? CP COMMAWidget;
appBarProps: title?;
title: TitleKeyWord TWODOT widget;
listTile: LISTTILE OP listTileProps? CP COMMAWidget;
listTileProps: leading? title? subtitle? trailing?;
leading: LeadingKeyWord TWODOT widget;
subtitle: SubtitleKeyWord TWODOT widget;
trailing: TrailingKeyWord TWODOT widget;
