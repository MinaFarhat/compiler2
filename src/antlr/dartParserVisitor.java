// Generated from F:/Projects/java/MinaCom/src/antlr\dartParser.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dartParser#plur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlur(dartParser.PlurContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#classInjection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInjection(dartParser.ClassInjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(dartParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#classController}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassController(dartParser.ClassControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#controllerBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControllerBody(dartParser.ControllerBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declareRxList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareRxList(dartParser.DeclareRxListContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declareRxBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareRxBool(dartParser.DeclareRxBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declareRxInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareRxInt(dartParser.DeclareRxIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#onInitFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnInitFunction(dartParser.OnInitFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#oninitBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOninitBody(dartParser.OninitBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#onCloseFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnCloseFunction(dartParser.OnCloseFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#oncloseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOncloseBody(dartParser.OncloseBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(dartParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declareController}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareController(dartParser.DeclareControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#dependenciesInje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependenciesInje(dartParser.DependenciesInjeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#disposeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisposeFunction(dartParser.DisposeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#disposeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisposeBody(dartParser.DisposeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#typeInjection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInjection(dartParser.TypeInjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#injectionLazyPut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectionLazyPut(dartParser.InjectionLazyPutContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#injectionPut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectionPut(dartParser.InjectionPutContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(dartParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(dartParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#constracterInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstracterInit(dartParser.ConstracterInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild(dartParser.BuildContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(dartParser.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#bodyScaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyScaffold(dartParser.BodyScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(dartParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#returnMaterialApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnMaterialApp(dartParser.ReturnMaterialAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(dartParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(dartParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#columnProps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnProps(dartParser.ColumnPropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#mainAxisAligment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainAxisAligment(dartParser.MainAxisAligmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#crossAxisAligment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossAxisAligment(dartParser.CrossAxisAligmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#mainPropertiesAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainPropertiesAttr(dartParser.MainPropertiesAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#crossPropertiesAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossPropertiesAttr(dartParser.CrossPropertiesAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(dartParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(dartParser.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(dartParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(dartParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(dartParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#colorValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorValue(dartParser.ColorValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#gestureDetector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGestureDetector(dartParser.GestureDetectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#card}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard(dartParser.CardContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#onTap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnTap(dartParser.OnTapContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(dartParser.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgets(dartParser.WidgetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren(dartParser.ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#navigator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigator(dartParser.NavigatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(dartParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#materialPageRoute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialPageRoute(dartParser.MaterialPageRouteContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#newScreen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewScreen(dartParser.NewScreenContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#pop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPop(dartParser.PopContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#pushNamed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushNamed(dartParser.PushNamedContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#listView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListView(dartParser.ListViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#listViewProps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListViewProps(dartParser.ListViewPropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#scrollDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrollDirection(dartParser.ScrollDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#reverse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverse(dartParser.ReverseContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#axisAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxisAttr(dartParser.AxisAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declareString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareString(dartParser.DeclareStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declareInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareInt(dartParser.DeclareIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declareBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareBool(dartParser.DeclareBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(dartParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#classMaterial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMaterial(dartParser.ClassMaterialContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#floatingActionButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingActionButton(dartParser.FloatingActionButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#floatingActionButtonProps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingActionButtonProps(dartParser.FloatingActionButtonPropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#onPressed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnPressed(dartParser.OnPressedContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#appBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBar(dartParser.AppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#appBarProps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBarProps(dartParser.AppBarPropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(dartParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#listTile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListTile(dartParser.ListTileContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#listTileProps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListTileProps(dartParser.ListTilePropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#leading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeading(dartParser.LeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#subtitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtitle(dartParser.SubtitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#trailing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailing(dartParser.TrailingContext ctx);
}