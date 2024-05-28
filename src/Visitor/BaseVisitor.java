package Visitor;

import AST.Class;
import AST.Class;
import AST.*;
import SymbolTable.Rows;
import SymbolTable.Symbol;
import SymbolTable.SymbolList;
import SymbolTable.SymbolTable;
import antlr.dartParser;
import antlr.dartParserBaseVisitor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaseVisitor extends dartParserBaseVisitor<Object> {
    SymbolList symbolTable1 = new SymbolList();
    @Override
    public Plur visitPlur(dartParser.PlurContext ctx) {
        if (ctx == null) {
            return null; // Or handle the case where ctx is null as per your requirement
        }

        main main = visitMain(ctx.main());
        classMaterial classMaterial = visitClassMaterial(ctx.classMaterial());
        List<Class> classes = ctx.class_().stream()
                .map(classContext -> (Class) visitClass(classContext))
                .collect(Collectors.toList());
        List<classInjection> classInjections = ctx.classInjection().stream()
                .map(injectionContext -> visitClassInjection(injectionContext))
                .collect(Collectors.toList());
        List<classController> classControllers = ctx.classController().stream()
                .map(controllerContext -> (classController) visitClassController(controllerContext))
                .collect(Collectors.toList());

        Plur plur = new Plur(main, classMaterial,  classes, classInjections, classControllers);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Plur", plur);
        symbolTable.put("Plur", symbol);

        Rows row = new Rows();
        row.setType("Plur");
        row.setValue(plur.toString());
        symbolTable1.getRows().add(row);

        return plur;
    }


    @Override
    public Class visitClass(dartParser.ClassContext ctx) {
        if (ctx != null) {
            String className = ctx.Name().getText();
            String inheritsClassName = ctx.TypeWidget().getText();
            ClassBody bodyClass = visitClassBody(ctx.classBody());

            SymbolTable symbolTable = SymbolTable.getInstance();
            int lineNumber = ctx.Name().getSymbol().getLine();

            // Check for duplicate class name
            if (symbolTable.containsDuplicateClassName(className)) {
                String error = "Semantic Error: Duplicate class name '" + className + "'";
                symbolTable.semanticError(error, lineNumber);
                symbolTable.hasSemanticError=true;
            } else {
                symbolTable.enterScope();

                // Add the class name to the symbol table
                symbolTable.putClassName(className, lineNumber);

                // Add the inherited class name to the symbol table
                Symbol inheritsClassNameSymbol = new Symbol("Inherits", inheritsClassName);
                symbolTable.put(inheritsClassName, inheritsClassNameSymbol);

                Rows row = new Rows();
                row.setType("Class");
                row.setValue(className);

                Rows row2 = new Rows();
                row2.setType("Inherits");
                row2.setValue(inheritsClassName);

                symbolTable1.getRows().add(row);
                symbolTable1.getRows().add(row2);
                symbolTable.exitScope();
            }

            Class classNode = new Class(className, inheritsClassName, bodyClass);

            return classNode;
        }

        return null;
    }

    @Override
    public ClassBody visitClassBody(dartParser.ClassBodyContext ctx) {
        if (ctx == null) {
            return null; // or handle the null case as per your requirements
        }

        List<declareString> strings = ctx.declareString()
                .stream()
                .map(this::visitDeclareString)
                .collect(Collectors.toList());

        List<declareInt> ints = ctx.declareInt()
                .stream()
                .map(this::visitDeclareInt)
                .collect(Collectors.toList());

        List<declareBool> bools = ctx.declareBool()
                .stream()
                .map(this::visitDeclareBool)
                .collect(Collectors.toList());

        declareController controller = null;
        if (ctx.declareController() != null) {
            controller = visitDeclareController(ctx.declareController());
        }

        Constructor constructor = null;
        if (ctx.constructor() != null) {
            constructor = visitConstructor(ctx.constructor());
        }

        Build build = visitBuild(ctx.build());

        ClassBody classBody = new ClassBody(strings, ints, bools, controller, constructor, build);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("ClassBody", classBody);
        symbolTable.put("ClassBody", symbol);

        Rows row = new Rows();
        row.setType("ClassBody");
        row.setValue(classBody.toString());
        symbolTable1.getRows().add(row);

        return classBody;
    }
    @Override
    public declareString visitDeclareString(dartParser.DeclareStringContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        boolean isFinal = ctx.FINAL() != null;
        DataType dataType = new DataType(ctx.STRING().getText());
        String name = ctx.Name(0).getText();
        String value = null;

        if (ctx.EQUALS() != null) {
            if (ctx.SingleQ(0) != null) {
                value = ctx.SingleQ(0).getText();
            } else if (ctx.DoubleQ(0) != null) {
                value = ctx.DoubleQ(0).getText();
            }

            if (ctx.Name(0) != null) {
                value += ctx.Name(0).getText();
            }

            if (ctx.SingleQ(1) != null || ctx.DoubleQ(1) != null) {
                value += ctx.SingleQ(1).getText();
            }
        }

        SymbolTable symbolTable = SymbolTable.getInstance();

        if (symbolTable.containsSymbol(name)) {
            // Variable with the same name already exists, generate a semantic error
            String errorMessage = "Variable '" + name + "' already declared.";
            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
            int lineNumber = ctx.Name(0).getSymbol().getLine();

            // Add the error message to the SemanticErrorhandling class
            symbolTable.semanticError(errorMessage, lineNumber);
        } else {
            Symbol symbol = new Symbol(String.valueOf(dataType), value);
            symbolTable.put(name, symbol);

            Rows row = new Rows();
            row.setType(String.valueOf(dataType));
            row.setValue(value);
            symbolTable1.getRows().add(row);
        }

        declareString declareStr = new declareString(isFinal, dataType, name, value);
        return declareStr;
    }

    @Override
    public declareInt visitDeclareInt(dartParser.DeclareIntContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        boolean isFinal = ctx.FINAL() != null;
        DataType dataType = new DataType(ctx.INT().getText());
        String name = ctx.Name().getText();
        int value = 0;

        if (ctx.EQUALS() != null && ctx.INTEGER() != null) {
            value = Integer.parseInt(ctx.INTEGER().getText());
        }

        SymbolTable symbolTable = SymbolTable.getInstance();

        if (symbolTable.containsSymbol(name)) {
            // Handle the case where a symbol with the same name already exists
            String errorMessage = "Semantic Error: Variable '" + name + "' already exists";
            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
            return null; // Return null or handle the error case as per your requirements
        }

        Symbol symbol = new Symbol(String.valueOf(dataType), value);
        symbolTable.put(name, symbol);

        Rows row = new Rows();
        row.setType(String.valueOf(dataType));
        row.setValue(String.valueOf(value));
        symbolTable.getRows().add(row);

        declareInt declareInt = new declareInt(isFinal, dataType, name, value);
        return declareInt;
    }

    @Override
    public declareBool visitDeclareBool(dartParser.DeclareBoolContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        boolean isFinal = ctx.FINAL() != null;
        DataType dataType = new DataType(ctx.BOOLEAN().getText());
        String name = ctx.Name().getText();
        boolean value = false;

        if (ctx.EQUALS() != null && ctx.True() != null) {
            value = true;
        } else if (ctx.EQUALS() != null && ctx.False() != null) {
            value = false;
        }

        SymbolTable symbolTable = SymbolTable.getInstance();

        if (symbolTable.containsSymbol(name)) {
            // Handle the case where a symbol with the same name already exists
            String errorMessage = "Semantic Error: Variable '" + name + "' already exists";
            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
            return null; // Return null or handle the error case as per your requirements
        }

        Symbol symbol = new Symbol(String.valueOf(dataType), value);
        symbolTable.put(name, symbol);

        Rows row = new Rows();
        row.setType(String.valueOf(dataType));
        row.setValue(String.valueOf(value));
        symbolTable.getRows().add(row);

        declareBool declareBool = new declareBool(isFinal, dataType, name, value);
        return declareBool;
    }


    @Override
    public declareController visitDeclareController(dartParser.DeclareControllerContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        boolean isFinal = ctx.FINAL() != null;
        String name = ctx.Name(0).getText();

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("controller", name);
        symbolTable.put(name, symbol);

        Rows row = new Rows();
        row.setType("controller");
        row.setValue(name);
        symbolTable1.getRows().add(row);

        declareController controller = new declareController(isFinal, name);
        return controller;
    }

    @Override
    public Build visitBuild(dartParser.BuildContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        Return aReturn = null;
        if (ctx.return_() != null) {
            aReturn = (Return) visitReturn(ctx.return_());
            SymbolTable.getInstance().put("aReturn", new Symbol("Return", aReturn.toString()));
            Rows row1 = new Rows();
            row1.setType("Return");
            row1.setValue(aReturn.toString());
            SymbolTable.getInstance().getRows().add(row1);
        }

        returnMaterialApp app = null;
        if (ctx.returnMaterialApp() != null) {
            app = (returnMaterialApp) visitReturnMaterialApp(ctx.returnMaterialApp());
            SymbolTable.getInstance().put("app", new Symbol("ReturnMaterialApp", app.toString()));
            Rows row2 = new Rows();
            row2.setType("ReturnMaterialApp");
            row2.setValue(app.toString());
            SymbolTable.getInstance().getRows().add(row2);
        }

        boolean isMaterial = ctx.returnMaterialApp() != null;

        return new Build(aReturn, app, isMaterial);
    }

    @Override
    public declareRxList visitDeclareRxList(dartParser.DeclareRxListContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        boolean isFinal = ctx.FINAL() != null;
        DataType dataType = new DataType(ctx.Name(0).getText());
        String name = ctx.Name(0).getText();
        String pp = ctx.Name(1) != null ? ctx.Name(1).getText() : "[]";

        declareRxList rxList = new declareRxList(isFinal, dataType, name, pp);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol(String.valueOf(dataType), pp);
        symbolTable.put(name, symbol);

        Rows row = new Rows();
        row.setType(String.valueOf(dataType));
        row.setValue(pp);
        symbolTable1.getRows().add(row);

        return rxList;
    }

    @Override
    public declareRxBool visitDeclareRxBool(dartParser.DeclareRxBoolContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        boolean isFinal = ctx.FINAL() != null;
        DataType dataType = new DataType(ctx.Name().getText());
        String name = ctx.Name().getText();
        boolean condition = ctx.True() != null;

        declareRxBool rxBool = new declareRxBool(isFinal, dataType, name, condition);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol(String.valueOf(dataType), condition);
        symbolTable.put(name, symbol);

        Rows row = new Rows();
        row.setType(String.valueOf(dataType));
        row.setValue(String.valueOf(condition));
        symbolTable1.getRows().add(row);

        return rxBool;
    }

    @Override
    public declareRxInt visitDeclareRxInt(dartParser.DeclareRxIntContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        boolean isFinal = ctx.FINAL() != null;
        DataType dataType = new DataType(ctx.Name().getText());
        String name = ctx.Name().getText();
        int number = Integer.parseInt(ctx.INTEGER().getText());

        declareRxInt rxInt = new declareRxInt(isFinal, dataType, name, number);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol(String.valueOf(dataType), number);
        symbolTable.put(name, symbol);

        Rows row = new Rows();
        row.setType(String.valueOf(dataType));
        row.setValue(String.valueOf(number));
        symbolTable1.getRows().add(row);

        return rxInt;
    }

    @Override
    public Return visitReturn(dartParser.ReturnContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        String returnKeyword = ctx.Return().getText();
        Widget widget = (Widget) visitWidget(ctx.widget());
        Return returnNode = new Return(returnKeyword, widget);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Return", returnNode);
        symbolTable.put("return", symbol);

        Rows row = new Rows();
        row.setType("Return");
        row.setValue(returnNode.toString());
        symbolTable1.getRows().add(row);

        return returnNode;
    }

    @Override
    public returnMaterialApp visitReturnMaterialApp(dartParser.ReturnMaterialAppContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        String name = ctx.Name() != null ? ctx.Name().getText() : null;
        boolean isGet = ctx.GetMaterialApp() != null;
        boolean isHome = ctx.Home() != null;

        returnMaterialApp app = new returnMaterialApp(name, isGet, isHome);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("MaterialApp", app);
        symbolTable.put("MaterialApp", symbol);

        Rows row = new Rows();
        row.setType("MaterialApp");
        row.setValue(app.toString());
        symbolTable1.getRows().add(row);

        return app;
    }

    @Override
    public Constructor visitConstructor(dartParser.ConstructorContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        String name = ctx.Name().getText();
        constructorBody body = (constructorBody) visitConstructorBody(ctx.constructorBody());
        boolean isExist = body != null;
        Constructor constructor = new Constructor(name, body, isExist);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Constructor", constructor);
        symbolTable.put(name, symbol);

        Rows row = new Rows();
        row.setType("Constructor");
        row.setValue(constructor.toString());
        symbolTable1.getRows().add(row);

        return constructor;
    }

    @Override
    public classInjection visitClassInjection(dartParser.ClassInjectionContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        dependenciesInje dependenciesInje = (dependenciesInje) visitDependenciesInje(ctx.dependenciesInje());
        classInjection classInjection = new classInjection(dependenciesInje);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("classInjection", classInjection);
        symbolTable.put("classInjection", symbol);

        Rows row = new Rows();
        row.setType("classInjection");
        row.setValue(classInjection.toString());
        symbolTable1.getRows().add(row);

        return classInjection;
    }


    @Override
    public dependenciesInje visitDependenciesInje(dartParser.DependenciesInjeContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        typeInjection injection = (typeInjection) visitTypeInjection(ctx.typeInjection());
        dependenciesInje dependenciesInje = new dependenciesInje(injection);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("dependenciesInje", dependenciesInje);
        symbolTable.put("dependenciesInje", symbol);

        Rows row = new Rows();
        row.setType("dependenciesInje");
        row.setValue(dependenciesInje.toString());
        symbolTable1.getRows().add(row);

        return dependenciesInje;
    }


    @Override
    public typeInjection visitTypeInjection(dartParser.TypeInjectionContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        List<injectionLazyPut> injectionLazyPuts = new ArrayList<>();
        List<injectionPut> injectionPuts = new ArrayList<>();

        if (ctx.injectionLazyPut() != null) {
            for (dartParser.InjectionLazyPutContext injectionLazyPutCtx : ctx.injectionLazyPut()) {
                injectionLazyPut injectionLazyPut = (injectionLazyPut) visitInjectionLazyPut(injectionLazyPutCtx);
                injectionLazyPuts.add(injectionLazyPut);
            }
        }

        if (ctx.injectionPut() != null) {
            for (dartParser.InjectionPutContext injectionPutCtx : ctx.injectionPut()) {
                injectionPut injectionPut = (injectionPut) visitInjectionPut(injectionPutCtx);
                injectionPuts.add(injectionPut);
            }
        }

        typeInjection typeInjection = new typeInjection(injectionLazyPuts, injectionPuts);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("typeInjection", typeInjection);
        symbolTable.put("typeInjection", symbol);

        Rows row = new Rows();
        row.setType("typeInjection");
        row.setValue(typeInjection.toString());
        symbolTable1.getRows().add(row);

        return typeInjection;
    }

    @Override
    public classController visitClassController(dartParser.ClassControllerContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        controllerBody body = (controllerBody) visitControllerBody(ctx.controllerBody());
        classController classCtrl = new classController(body);
        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("classController", classCtrl);
        symbolTable.put("classController", symbol);
        Rows row = new Rows();
        row.setType("classController");
        row.setValue(classCtrl.toString());
        symbolTable1.getRows().add(row);

        return classCtrl;
    }



    @Override
    public controllerBody visitControllerBody(dartParser.ControllerBodyContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        controllerBody body = (controllerBody) visitControllerBody(ctx);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("controllerBody", body);
        symbolTable.put("controllerBody", symbol);

        Rows row = new Rows();
        row.setType("controllerBody");
        row.setValue(body.toString());
        symbolTable1.getRows().add(row);

        return body;
    }


    @Override
    public onInitFunction visitOnInitFunction(dartParser.OnInitFunctionContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        oninitBody body = (oninitBody) visitOninitBody(ctx.oninitBody());

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("onInitFunction", body);
        symbolTable.put("onInitFunction", symbol);

        Rows row = new Rows();
        row.setType("onInitFunction");
        row.setValue(body.toString());
        symbolTable1.getRows().add(row);

        return new onInitFunction(body);
    }


    @Override
    public oninitBody visitOninitBody(dartParser.OninitBodyContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        oninitBody body = new oninitBody();

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("oninitBody", body);
        symbolTable.put("oninitBody", symbol);

        Rows row = new Rows();
        row.setType("oninitBody");
        row.setValue(body.toString());
        symbolTable1.getRows().add(row);

        return body;
    }

    @Override
    public onCloseFunction visitOnCloseFunction(dartParser.OnCloseFunctionContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        oncloseBody body = (oncloseBody) visitOncloseBody(ctx.oncloseBody());

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("onCloseFunction", body);
        symbolTable.put("onCloseFunction", symbol);

        Rows row = new Rows();
        row.setType("onCloseFunction");
        row.setValue(body.toString());
        symbolTable1.getRows().add(row);

        return new onCloseFunction(body);
    }


    @Override
    public oncloseBody visitOncloseBody(dartParser.OncloseBodyContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        oncloseBody body = new oncloseBody();

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("oncloseBody", body);
        symbolTable.put("oncloseBody", symbol);

        Rows row = new Rows();
        row.setType("oncloseBody");
        row.setValue(body.toString());
        symbolTable1.getRows().add(row);

        return body;
    }

    @Override
    public disposeFunction visitDisposeFunction(dartParser.DisposeFunctionContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        disposeBody body = (disposeBody) visit(ctx);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("disposeFunction", body);
        symbolTable.put("disposeFunction", symbol);

        Rows row = new Rows();
        row.setType("disposeFunction");
        row.setValue(body.toString());
        symbolTable1.getRows().add(row);

        return new disposeFunction(body);
    }

    @Override
    public disposeBody visitDisposeBody(dartParser.DisposeBodyContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        String name = ctx.Name().getText();
        disposeBody body = new disposeBody(name);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("disposeBody", body);
        symbolTable.put("disposeBody", symbol);

        Rows row = new Rows();
        row.setType("disposeBody");
        row.setValue(body.toString());
        symbolTable1.getRows().add(row);

        return body;
    }

    @Override
    public injectionLazyPut visitInjectionLazyPut(dartParser.InjectionLazyPutContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        injectionLazyPut lazyPut = new injectionLazyPut();

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("injectionLazyPut", lazyPut);
        symbolTable.put("injectionLazyPut", symbol);

        Rows row = new Rows();
        row.setType("injectionLazyPut");
        row.setValue(lazyPut.toString());
        symbolTable1.getRows().add(row);

        return lazyPut;
    }

    @Override
    public injectionPut visitInjectionPut(dartParser.InjectionPutContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        injectionPut put = new injectionPut();

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("injectionPut", put);
        symbolTable.put("injectionPut", symbol);

        Rows row = new Rows();
        row.setType("injectionPut");
        row.setValue(put.toString());
        symbolTable1.getRows().add(row);

        return put;
    }

    @Override
    public constructorBody visitConstructorBody(dartParser.ConstructorBodyContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        List<constracterInit> initList = new ArrayList<>();
        if (ctx.constracterInit() != null) {
            for (dartParser.ConstracterInitContext initCtx : ctx.constracterInit()) {
                constracterInit init = visitConstracterInit(initCtx);
                initList.add(init);
            }
        }
        constructorBody body = new constructorBody(initList);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("constructorBody", body);
        symbolTable.put("constructorBody", symbol);

        Rows row = new Rows();
        row.setType("constructorBody");
        row.setValue(body.toString());
        symbolTable1.getRows().add(row);

        return body;
    }

    @Override
    public constracterInit visitConstracterInit(dartParser.ConstracterInitContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        String name = ctx.Name().getText();
        boolean isRequired = ctx.Required() != null;
        constracterInit init = new constracterInit(name, isRequired);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("constracterInit", init);
        symbolTable.put(name, symbol);

        Rows row = new Rows();
        row.setType("constracterInit");
        row.setValue(init.toString());
        symbolTable1.getRows().add(row);

        return init;
    }
    @Override
    public Scaffold visitScaffold(dartParser.ScaffoldContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        BodyScaffold bodyScaffold = visitBodyScaffold(ctx.bodyScaffold());
        AppBar appBar = visitAppBar(ctx.appBar());

        Scaffold scaffold = new Scaffold(bodyScaffold);
        scaffold.setAppBar(appBar);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Scaffold", scaffold);
        symbolTable.put("Scaffold", symbol);

        Rows row = new Rows();
        row.setType("Scaffold");
        row.setValue(scaffold.toString());
        symbolTable1.getRows().add(row);

        return scaffold;
    }
    @Override
    public BodyScaffold visitBodyScaffold(dartParser.BodyScaffoldContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        Widget widget = visitWidget(ctx.widget());

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Body Scaffold", widget);
        symbolTable.put("Body Scaffold", symbol);

        Rows row = new Rows();
        row.setType("Body Scaffold");
        row.setValue(widget.toString());
        symbolTable1.getRows().add(row);

        return new BodyScaffold(widget);
    }

    @Override
    public Text visitText(dartParser.TextContext ctx) {
        if (ctx == null) {
            return null;
        }
        StringBuilder inputIntoText = new StringBuilder(); // Initialize the clicked value
        if (ctx.Name() != null && !ctx.Name().isEmpty()) {
            for (int i = 0; i < ctx.Name().size(); i++) {
                if (ctx.Name(i) != null) {
                    if (i > 0) {
                        inputIntoText.append(" "); // Add a space before each word except the first one
                    }
                    inputIntoText.append(ctx.Name(i).getText());
                }
            }

        }

        Text text = new Text(inputIntoText.toString());

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Text", text);
        symbolTable.put("Text", symbol);

        Rows row = new Rows();
        row.setType("Text");
        row.setValue(text.toString());
        symbolTable1.getRows().add(row);

        return text;
    }




    @Override
    public Widget visitWidget(dartParser.WidgetContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        Widget widget = null;

        if (ctx.container() != null) {
            Container container = (Container) visitContainer(ctx.container());
            widget = new Widget(container, null, null, null, null, null, null, null, null, null);
        } else if (ctx.row() != null) {
            Row row = (Row) visitRow(ctx.row());
            widget = new Widget(null, row, null, null, null, null, null, null, null, null);
        } else if (ctx.column() != null) {
            Column column = (Column) visitColumn(ctx.column());
            widget = new Widget(null, null, column, null, null, null, null, null, null, null);
        } else if (ctx.scaffold() != null) {
            Scaffold scaffold = visitScaffold(ctx.scaffold());
            widget = new Widget(null, null, null, scaffold, null, null, null, null, null, null);
        } else if (ctx.gestureDetector() != null) {
            GestureDetector gestureDetector = (GestureDetector) visitGestureDetector(ctx.gestureDetector());
            widget = new Widget(null, null, null, null, gestureDetector, null, null, null, null, null);
        } else if (ctx.text() != null) {
            Text text = visitText(ctx.text());
            widget = new Widget(null, null, null, null, null, text, null, null, null, null);
        } else if (ctx.card() != null) {
            Card card = (Card) visitCard(ctx.card());
            widget = new Widget(null, null, null, null, null, null, card, null, null, null);
        } else if (ctx.listView() != null) {
            ListView listView = (ListView) visitListView(ctx.listView());
            widget = new Widget(null, null, null, null, null, null, null, listView, null, null);
        } else if (ctx.listTile() != null) {
            ListTile listTile = (ListTile) visitListTile(ctx.listTile());
            widget = new Widget(null, null, null, null, null, null, null, null, null, listTile);
        } else if (ctx.floatingActionButton() != null) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) visitFloatingActionButton(ctx.floatingActionButton());
            widget = new Widget(null, null, null, null, null, null, null, null, floatingActionButton, null);
        } else {
            // Handle other widget types as needed
        }

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Widget", widget);
        symbolTable.put("Widget", symbol);

        Rows row = new Rows();
        row.setType("Widget");
        row.setValue(widget.toString());
        symbolTable1.getRows().add(row);

        return widget;
    }

    @Override
    public Widgets visitWidgets(dartParser.WidgetsContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        List<Widget> widgets = new ArrayList<>();

        for (dartParser.WidgetContext widgetContext : ctx.widget()) {
            Widget widget = (Widget) visitWidget(widgetContext);
            widgets.add(widget);
        }

        Widgets widgetList = new Widgets(widgets);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Widgets", widgetList);
        symbolTable.put("Widgets", symbol);

        Rows row = new Rows();
        row.setType("Widgets");
        row.setValue(widgetList.toString());
        symbolTable1.getRows().add(row);

        return widgetList;
    }


    @Override
    public Child visitChild(dartParser.ChildContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        Widget widget = (Widget) super.visitChild(ctx); // Visit the 'widget' child context using the superclass method
        Child child = new Child(widget); // Create a new Child object with the retrieved Widget

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Child", child);
        symbolTable.put("Child", symbol);

        Rows row = new Rows();
        row.setType("Child");
        row.setValue(child.toString());
        symbolTable1.getRows().add(row);

        return child;
    }


    @Override
    public Children visitChildren(dartParser.ChildrenContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        List<Widget> widgets = new ArrayList<>();

        for (dartParser.WidgetContext widgetContext : ctx.widgets().widget()) {
            Widget widget = visitWidget(widgetContext);
            widgets.add(widget);
        }

        Children children = new Children(new Widgets(widgets));

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Children", children);
        symbolTable.put("Children", symbol);

        Rows row = new Rows();
        row.setType("Children");
        row.setValue(children.toString());
        symbolTable1.getRows().add(row);

        return children;
    }


    @Override
    public Row visitRow(dartParser.RowContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        Children children = (Children) visitChildren(ctx.children()); // Assuming `children` is a valid context rule in your parser

        Row row = new Row(children);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Row", row);
        symbolTable.put("Row", symbol);

        Rows rowEntry = new Rows();
        rowEntry.setType("Row");
        rowEntry.setValue(row.toString());
        symbolTable1.getRows().add(rowEntry);

        return row;
    }


    @Override
    public Column visitColumn(dartParser.ColumnContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        Children children = (Children) visitChildren(ctx.children()); // Visit the 'children' child context to retrieve the Children object
        columnProps props = (columnProps) visitColumnProps(ctx.columnProps()); // Visit the 'columnProps' child context to retrieve the columnProps object
        Column column = new Column(children, props); // Create a new Column object with the retrieved Children and columnProps

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Column", column);
        symbolTable.put("Column", symbol);

        Rows row = new Rows();
        row.setType("Column");
        row.setValue(column.toString());
        symbolTable1.getRows().add(row);

        return column;
    }


    @Override
    public columnProps visitColumnProps(dartParser.ColumnPropsContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        mainAxisAligment maligment = (mainAxisAligment) visitMainAxisAligment(ctx.mainAxisAligment()); // Visit the 'mainAxisAligment' child context to retrieve the mainAxisAligment object
        crossAxisAligment caligment = (crossAxisAligment) visitCrossAxisAligment(ctx.crossAxisAligment()); // Visit the 'crossAxisAligment' child context to retrieve the crossAxisAligment object
        columnProps props = new columnProps(maligment, caligment); // Create a new columnProps object with the retrieved mainAxisAligment and crossAxisAligment

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("columnProps", props);
        symbolTable.put("columnProps", symbol);

        Rows row = new Rows();
        row.setType("columnProps");
        row.setValue(props.toString());
        symbolTable1.getRows().add(row);

        return props;
    }


    @Override
    public mainAxisAligment visitMainAxisAligment(dartParser.MainAxisAligmentContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        mainPropertiesAttr attr = (mainPropertiesAttr) visitMainPropertiesAttr(ctx.mainPropertiesAttr()); // Visit the 'mainPropertiesAttr' child context to retrieve the mainPropertiesAttr object

        // Create a new mainAxisAligment object with the retrieved mainPropertiesAttr
        mainAxisAligment alignment = new mainAxisAligment(attr);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("mainAxisAlignment", alignment);
        symbolTable.put("mainAxisAlignment", symbol);

        Rows row = new Rows();
        row.setType("mainAxisAlignment");
        row.setValue(attr.toString());
        symbolTable1.getRows().add(row);

        return alignment;
    }

    @Override
    public crossAxisAligment visitCrossAxisAligment(dartParser.CrossAxisAligmentContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        crossPropertiesAttr attr = (crossPropertiesAttr) visitCrossPropertiesAttr(ctx.crossPropertiesAttr()); // Visit the 'crossPropertiesAttr' child context to retrieve the crossPropertiesAttr object

        // Create a new crossAxisAligment object with the retrieved crossPropertiesAttr
        crossAxisAligment alignment = new crossAxisAligment(attr);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("crossAxisAlignment", alignment);
        symbolTable.put("crossAxisAlignment", symbol);

        Rows row = new Rows();
        row.setType("crossAxisAlignment");
        row.setValue(attr.toString());
        symbolTable1.getRows().add(row);

        return alignment;
    }


    @Override
    public mainPropertiesAttr visitMainPropertiesAttr(dartParser.MainPropertiesAttrContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        String mainProperties = ctx.getText(); // Retrieve the main properties as a String from the context

        // Create a new mainPropertiesAttr object with the retrieved main properties
        mainPropertiesAttr attr = new mainPropertiesAttr(mainProperties);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("mainPropertiesAttr", attr);
        symbolTable.put("mainPropertiesAttr", symbol);

        Rows row = new Rows();
        row.setType("mainPropertiesAttr");
        row.setValue(mainProperties);
        symbolTable1.getRows().add(row);

        return attr;
    }


    @Override
    public crossPropertiesAttr visitCrossPropertiesAttr(dartParser.CrossPropertiesAttrContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        String crossProperties = ctx.getText(); // Retrieve the cross properties as a String from the context

        // Create a new crossPropertiesAttr object with the retrieved cross properties
        crossPropertiesAttr attr = new crossPropertiesAttr(crossProperties);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("crossPropertiesAttr", attr);
        symbolTable.put("crossPropertiesAttr", symbol);

        Rows row = new Rows();
        row.setType("crossPropertiesAttr");
        row.setValue(crossProperties);
        symbolTable1.getRows().add(row);

        return attr;
    }


    @Override
    public height visitHeight(dartParser.HeightContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        double number = Double.parseDouble(ctx.INTEGER().getText()); // Retrieve the height value as a double from the context

        // Create a new height object with the retrieved height value
        height h = new height(number);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("height", h);
        symbolTable.put("height", symbol);

        Rows row = new Rows();
        row.setType("height");
        row.setValue(String.valueOf(number));
        symbolTable1.getRows().add(row);

        return h;
    }


    @Override
    public width visitWidth(dartParser.WidthContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        double number = Double.parseDouble(ctx.INTEGER().getText()); // Retrieve the width value as a double from the context

        // Create a new width object with the retrieved width value
        width w = new width(number);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("width", w);
        symbolTable.put("width", symbol);

        Rows row = new Rows();
        row.setType("width");
        row.setValue(String.valueOf(number));
        symbolTable1.getRows().add(row);

        return w;
    }


    @Override
    public Container visitContainer(dartParser.ContainerContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        Child child = (Child) visitChild(ctx.child()); // Visit the 'child' child context to retrieve the Child object
        width w = (width) visitWidth(ctx.width()); // Visit the 'width' child context to retrieve the width object
        height h = (height) visitHeight(ctx.height()); // Visit the 'height' child context to retrieve the height object
        Color c =(Color)visitColor(ctx.color());
        // Create a new Container object with the retrieved Child, width, and height
        Container container = new Container(child, w, h,c);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Container", container);
        symbolTable.put("Container", symbol);

        Rows row = new Rows();
        row.setType("Container");
        row.setValue(container.toString());
        symbolTable1.getRows().add(row);

        return container;
    }


    @Override
    public Card visitCard(dartParser.CardContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        Child child = (Child) visitChild(ctx.child()); // Visit the 'child' child context to retrieve the Child object

        // Create a new Card object with the retrieved Child
        Card card = new Card(child);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("Card", card);
        symbolTable.put("Card", symbol);

        Rows row = new Rows();
        row.setType("Card");
        row.setValue(card.toString());
        symbolTable1.getRows().add(row);

        return card;
    }


    @Override
    public GestureDetector visitGestureDetector(dartParser.GestureDetectorContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        Child child = (Child) visitChild(ctx.child()); // Visit the 'child' child context to retrieve the Child object
        OnTap onTap = (OnTap) visitOnTap(ctx.onTap()); // Visit the 'onTap' child context to retrieve the OnTap object

        // Create a new GestureDetector object with the retrieved Child and OnTap
        GestureDetector gestureDetector = new GestureDetector(child, onTap);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("GestureDetector", gestureDetector);
        symbolTable.put("GestureDetector", symbol);

        Rows row = new Rows();
        row.setType("GestureDetector");
        row.setValue(gestureDetector.toString());
        symbolTable1.getRows().add(row);

        return gestureDetector;
    }


    @Override
    public OnTap visitOnTap(dartParser.OnTapContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        navigator nav = (navigator) visitNavigator(ctx.navigator()); // Visit the 'navigator' child context to retrieve the navigator object

        // Create a new OnTap object with the retrieved navigator
        OnTap onTap = new OnTap(nav);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("OnTap", onTap);
        symbolTable.put("OnTap", symbol);

        Rows row = new Rows();
        row.setType("OnTap");
        row.setValue(onTap.toString());
        symbolTable1.getRows().add(row);

        return onTap;
    }


    @Override
    public navigator visitNavigator(dartParser.NavigatorContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        push pu = (push) visitPush(ctx.push()); // Visit the 'push' child context to retrieve the push object
        pop po = (pop) visitPop(ctx.pop()); // Visit the 'pop' child context to retrieve the pop object
        pushNamed named = (pushNamed) visitPushNamed(ctx.pushNamed()); // Visit the 'pushNamed' child context to retrieve the pushNamed object

        // Create a new navigator object with the retrieved push, pop, and pushNamed objects
        navigator nav = new navigator(pu, po, named);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("navigator", nav);
        symbolTable.put("navigator", symbol);

        Rows row = new Rows();
        row.setType("navigator");
        row.setValue(nav.toString());
        symbolTable1.getRows().add(row);

        return nav;
    }


    @Override
    public push visitPush(dartParser.PushContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        materialPageRoute route = (materialPageRoute) visitMaterialPageRoute(ctx.materialPageRoute()); // Visit the 'materialPageRoute' child context to retrieve the route object

        // Create a new push object with the retrieved route object
        push pu = new push(route);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("push", pu);
        symbolTable.put("push", symbol);

        Rows row = new Rows();
        row.setType("push");
        row.setValue(pu.toString());
        symbolTable1.getRows().add(row);

        return pu;
    }

    @Override
    public pop visitPop(dartParser.PopContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        // Create a new pop object
        pop po = new pop();

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("pop", po);
        symbolTable.put("pop", symbol);

        Rows row = new Rows();
        row.setType("pop");
        row.setValue(po.toString());
        symbolTable1.getRows().add(row);

        return po;
    }


    @Override
    public pushNamed visitPushNamed(dartParser.PushNamedContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        String name = ctx.getText(); // Get the name from the context

        // Create a new pushNamed object
        pushNamed named = new pushNamed(name);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("pushNamed", named);
        symbolTable.put("pushNamed", symbol);

        Rows row = new Rows();
        row.setType("pushNamed");
        row.setValue(named.toString());
        symbolTable1.getRows().add(row);

        return named;
    }


    @Override
    public classMaterial visitClassMaterial(dartParser.ClassMaterialContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        String name = ctx.Name().getText(); // Get the name from the context
        String inheritsClassName = ctx.TypeWidget().getText(); // Get the inherits class name from the context
        Build build = (Build) visitBuild(ctx.build()); // Visit the build context to get the Build object

        // Create a new ClassMaterial object
        classMaterial classMaterialObj = new classMaterial(name, inheritsClassName, build);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("classMaterial", classMaterialObj);
        symbolTable.put("classMaterial", symbol);

        Rows row = new Rows();
        row.setType("classMaterial");
        row.setValue(classMaterialObj.toString());
        symbolTable1.getRows().add(row);

        return classMaterialObj;
    }


    @Override
    public materialPageRoute visitMaterialPageRoute(dartParser.MaterialPageRouteContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        newScreen screen = (newScreen) visitNewScreen(ctx.newScreen()); // Visit the newScreen context to get the newScreen object

        // Create a new materialPageRoute object
        materialPageRoute pageRoute = new materialPageRoute(screen);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("materialPageRoute", pageRoute);
        symbolTable.put("materialPageRoute", symbol);

        Rows row = new Rows();
        row.setType("materialPageRoute");
        row.setValue(pageRoute.toString());
        symbolTable1.getRows().add(row);

        return pageRoute;
    }



    @Override
    public newScreen visitNewScreen(dartParser.NewScreenContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        String name = ctx.Name().get(0).getText();
        String sendName=ctx.Name().get(1).getText();
        SymbolTable symbolTable = SymbolTable.getInstance();
        if (symbolTable.containsKey("Text")) {
            Symbol symbol = symbolTable.get("Text");
            if (symbol.getType().equals("Text")) {
                Text text = (Text) symbol.getValue();

                newScreen screen = new newScreen(name,sendName);
                String filePath = "F:\\Projects\\java\\MinaCom\\tyy.php";

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true)); // Open file in append mode
                    writer.newLine(); // Move to a new line
                    writer.write("<?php\n");
                    writer.write("$result = '" + sendName + "';"); // Write the result to the file
                    writer.write("?>");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Symbol newScreenSymbol = new Symbol("newScreen", screen);
                symbolTable.put("newScreen", newScreenSymbol);

                Rows row = new Rows();
                row.setType("newScreen");
                row.setValue(screen.toString());
                symbolTable1.getRows().add(row);

                return screen;
            }
        }
        return null;
    }




    @Override
    public main visitMain(dartParser.MainContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        String name = ctx.Name().getText(); // Get the main function name from the context

        // Create a new main object
        main mainObj = new main(name);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("main", mainObj);
        symbolTable.put("main", symbol);

        Rows row = new Rows();
        row.setType("main");
        row.setValue(mainObj.toString());
        symbolTable1.getRows().add(row);

        return mainObj;
    }

    @Override
    public ListTile visitListTile(dartParser.ListTileContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        ListTileProps listTileProps = visitListTileProps(ctx.listTileProps());

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol = new Symbol("ListTile", listTileProps);
        symbolTable.put("ListTile", symbol);

        Rows row = new Rows();
        row.setType("ListTile");
        row.setValue(listTileProps.toString());
        symbolTable1.getRows().add(row);

        return new ListTile(listTileProps);
    }


    @Override
    public ListTileProps visitListTileProps(dartParser.ListTilePropsContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        Widget leading = null;
        Widget title = null;
        Widget subtitle = null;
        Widget trailing = null;

        if (ctx.leading() != null) {
            leading = (Widget) visit(ctx.leading());
        }
        if (ctx.title() != null) {
            title = (Widget) visit(ctx.title());
        }
        if (ctx.subtitle() != null) {
            subtitle = (Widget) visit(ctx.subtitle());
        }
        if (ctx.trailing() != null) {
            trailing = (Widget) visit(ctx.trailing());
        }

        ListTileProps props = new ListTileProps(leading, title, subtitle, trailing);

        // Add ListTileProps to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol listTilePropsSymbol = new Symbol("ListTileProps", props.toString());
        symbolTable.put(props.toString(), listTilePropsSymbol);

        Rows row = new Rows();
        row.setType("ListTileProps");
        row.setValue(props.toString());
        symbolTable1.getRows().add(row);

        return props;
    }


    @Override
    public Widget visitLeading(dartParser.LeadingContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        Widget widget = (Widget) visitWidget(ctx.widget());
        String leadingKeyWord = ctx.LeadingKeyWord().getText();

        Widget leadingWidget = new Widget(leadingKeyWord, widget);

        // Add leadingWidget to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol leadingWidgetSymbol = new Symbol("LeadingWidget", leadingWidget.toString());
        symbolTable.put(leadingWidget.toString(), leadingWidgetSymbol);

        Rows row = new Rows();
        row.setType("LeadingWidget");
        row.setValue(leadingWidget.toString());
        symbolTable1.getRows().add(row);

        return leadingWidget;
    }


    @Override
    public Widget visitTitle(dartParser.TitleContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        Widget widget = (Widget) visitWidget(ctx.widget());
        String titleKeyWord = ctx.TitleKeyWord().getText();

        // Add widget to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol widgetSymbol = new Symbol("TitleWidget", widget.toString());
        symbolTable.put(widget.toString(), widgetSymbol);

        Rows row = new Rows();
        row.setType("TitleWidget");
        row.setValue(widget.toString());
        symbolTable1.getRows().add(row);

        return widget;
    }


    @Override
    public Widget visitSubtitle(dartParser.SubtitleContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        Widget widget = (Widget) visitWidget(ctx.widget());
        String subtitleKeyWord = ctx.SubtitleKeyWord().getText();

        // Add widget to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol widgetSymbol = new Symbol("SubtitleWidget", widget.toString());
        symbolTable.put(widget.toString(), widgetSymbol);

        Rows row = new Rows();
        row.setType("SubtitleWidget");
        row.setValue(widget.toString());
        symbolTable1.getRows().add(row);

        return new Widget(subtitleKeyWord, widget);
    }


    @Override
    public Widget visitTrailing(dartParser.TrailingContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        Widget widget = (Widget) visitWidget(ctx.widget());
        String trailingKeyWord = ctx.TrailingKeyWord().getText();

        // Add widget to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol widgetSymbol = new Symbol("TrailingWidget", widget.toString());
        symbolTable.put(widget.toString(), widgetSymbol);

        Rows row = new Rows();
        row.setType("TrailingWidget");
        row.setValue(widget.toString());
        symbolTable1.getRows().add(row);

        return new Widget(trailingKeyWord, widget);
    }


    @Override
    public FloatingActionButton visitFloatingActionButton(dartParser.FloatingActionButtonContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        FloatingActionButtonProps floatingActionButtonProps = visitFloatingActionButtonProps(ctx.floatingActionButtonProps());

        // Add FloatingActionButtonProps to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol propsSymbol = new Symbol("FloatingActionButton", floatingActionButtonProps.toString());
        symbolTable.put(floatingActionButtonProps.toString(), propsSymbol);

        Rows row = new Rows();
        row.setType("FloatingActionButton");
        row.setValue(floatingActionButtonProps.toString());
        symbolTable1.getRows().add(row);

        return new FloatingActionButton(floatingActionButtonProps);
    }


    @Override
    public FloatingActionButtonProps visitFloatingActionButtonProps(dartParser.FloatingActionButtonPropsContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        MethodCallBack onPressed = visitOnPressed(ctx.onPressed());
        Widget child = null;

        if (ctx.child() != null) {
            child = (Widget) visitChild(ctx.child());
        }

        // Add onPressed to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol onPressedSymbol = new Symbol("FloatingActionButtonProps", onPressed.toString());
        symbolTable.put(onPressed.toString(), onPressedSymbol);

        Rows row = new Rows();
        row.setType("FloatingActionButtonProps");
        row.setValue(onPressed.toString());
        symbolTable1.getRows().add(row);

        return new FloatingActionButtonProps(onPressed, child);
    }

    @Override
    public MethodCallBack visitOnPressed(dartParser.OnPressedContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        String methodName = ctx.MethodCallBack().getText();

        // Add methodName to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        symbolTable.enterScope();
        Symbol methodNameSymbol = new Symbol("OnPressed", methodName);
        symbolTable.put("OnPressed", methodNameSymbol);

        Rows row = new Rows();
        row.setType("OnPressed");
        row.setValue(methodName);
        symbolTable1.getRows().add(row);

        return new MethodCallBack(methodName);
    }


    @Override
    public AppBar visitAppBar(dartParser.AppBarContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        AppBarProps appBarProps = (AppBarProps) visitAppBarProps(ctx.appBarProps());

        // Add appBarProps to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol appBarPropsSymbol = new Symbol("AppBar", appBarProps);
        symbolTable.put("AppBar", appBarPropsSymbol);

        Rows row = new Rows();
        row.setType("AppBar");
        row.setValue(appBarProps.toString());
        symbolTable1.getRows().add(row);

        return new AppBar(appBarProps);
    }

    @Override
    public Object visitAppBarProps(dartParser.AppBarPropsContext ctx) {
        if (ctx.title() == null) {
            return null; // Or handle the null case as per your requirements
        }
        Widget title = new Title();
        if (ctx.title() != null) {
            title = visitTitle(ctx.title());
        }

        // Add title to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol titleSymbol = new Symbol("AppBarProps", title);
        symbolTable.put("AppBarProps", titleSymbol);

        Rows row = new Rows();
        row.setType("AppBarProps");
        row.setValue(title.toString());
        symbolTable1.getRows().add(row);

        return new AppBarProps(title);
    }

    @Override
    public Color visitColor(dartParser.ColorContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        ColorValue colorValue = visitColorValue(ctx.colorValue());

        // Add colorValue to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol colorValueSymbol = new Symbol("Color", colorValue);
        symbolTable.put("Color", colorValueSymbol);

        Rows row = new Rows();
        row.setType("Color");
        row.setValue(colorValue.toString());
        symbolTable1.getRows().add(row);

        return new Color(colorValue);
    }


    @Override
    public ColorValue visitColorValue(dartParser.ColorValueContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        int red = Integer.parseInt(ctx.INTEGER(0).getText());
        int green = Integer.parseInt(ctx.INTEGER(1).getText());
        int blue = Integer.parseInt(ctx.INTEGER(2).getText());
        double opacity = Double.parseDouble(ctx.DOUBLE().getText());

        // Add colorValue to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol redSymbol = new Symbol("Red", String.valueOf(red));
        symbolTable.put("red", redSymbol);
        Symbol greenSymbol = new Symbol("Green", String.valueOf(green));
        symbolTable.put("green", greenSymbol);
        Symbol blueSymbol = new Symbol("Blue", String.valueOf(blue));
        symbolTable.put("blue", blueSymbol);
        Symbol opacitySymbol = new Symbol("Opacity", String.valueOf(opacity));
        symbolTable.put("opacity", opacitySymbol);

        Rows row = new Rows();
        row.setType("Red");
        row.setValue(String.valueOf(red));
        symbolTable1.getRows().add(row);

        Rows row2 = new Rows();
        row2.setType("Green");
        row2.setValue(String.valueOf(green));
        symbolTable1.getRows().add(row2);

        Rows row3 = new Rows();
        row3.setType("Blue");
        row3.setValue(String.valueOf(blue));
        symbolTable1.getRows().add(row3);

        Rows row4 = new Rows();
        row4.setType("Opacity");
        row4.setValue(String.valueOf(opacity));
        symbolTable1.getRows().add(row4);

        return new ColorValue(red, green, blue, opacity);
    }

    @Override
    public ListView visitListView(dartParser.ListViewContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }

        ListViewProps listViewProps = visitListViewProps(ctx.listViewProps());

        List<Widget> children = new ArrayList<>();
        if (ctx.children() != null) {
            for (dartParser.WidgetContext childCtx : ctx.children().widgets().widget()) {
                Widget childWidget = visitWidget(childCtx);
                children.add(childWidget);
            }
        }

        // Add ListViewProps to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        symbolTable.put("ListView", new Symbol("ListView", listViewProps.toString()));

        Rows row = new Rows();
        row.setType("ListView");
        row.setValue(listViewProps.toString());
        symbolTable1.getRows().add(row);

        return new ListView(listViewProps, children);
    }


    @Override
    public ListViewProps visitListViewProps(dartParser.ListViewPropsContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        String scrollDirection = null;
        boolean reverse = false;

        if (ctx.scrollDirection() != null) {
            scrollDirection = visitScrollDirection(ctx.scrollDirection());
        }
        if (ctx.reverse() != null) {
            reverse = visitReverse(ctx.reverse());
        }

        // Add scrollDirection and reverse to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        symbolTable.put("scrollDirection", new Symbol("ScrollDirection", scrollDirection));
        symbolTable.put("reverse", new Symbol("Reverse", String.valueOf(reverse)));

        Rows row1 = new Rows();
        row1.setType("ScrollDirection");
        row1.setValue(scrollDirection);
        symbolTable1.getRows().add(row1);

        Rows row2 = new Rows();
        row2.setType("Reverse");
        row2.setValue(String.valueOf(reverse));
        symbolTable1.getRows().add(row2);

        return new ListViewProps(scrollDirection, reverse);
    }


    @Override
    public String visitScrollDirection(dartParser.ScrollDirectionContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        String axisAttr = ctx.axisAttr().getText();

        // Add axisAttr to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        symbolTable.put("ScrollDirection", new Symbol("ScrollDirection", axisAttr));

        Rows row = new Rows();
        row.setType("ScrollDirection");
        row.setValue(axisAttr);
        symbolTable1.getRows().add(row);

        return axisAttr;
    }


    @Override
    public Boolean visitReverse(dartParser.ReverseContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        String value = ctx.getText().toLowerCase();
        boolean reverse = value.equals("true");

        // Add reverse to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        symbolTable.put("Reverse", new Symbol("Reverse", String.valueOf(reverse)));

        Rows row = new Rows();
        row.setType("Reverse");
        row.setValue(String.valueOf(reverse));
        symbolTable1.getRows().add(row);

        return reverse;
    }


    @Override
    public String visitAxisAttr(dartParser.AxisAttrContext ctx) {
        if (ctx == null) {
            return null; // Or handle the null case as per your requirements
        }
        String axisAttr = ctx.getText();

        // Add axisAttr to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();
        symbolTable.put("AxisAttr", new Symbol("AxisAttr", axisAttr));

        Rows row = new Rows();
        row.setType("AxisAttr");
        row.setValue(axisAttr);
        symbolTable1.getRows().add(row);

        return axisAttr;
    }

}
