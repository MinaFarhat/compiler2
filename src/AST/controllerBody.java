package AST;

import java.util.List;

public class controllerBody {
    public List<declareRxInt> declareRxIntList = null;
    public List<declareRxBool> declareRxBoolList = null;
    public List<declareRxList> declareRxListList = null;
    public onInitFunction initFunction = null;
    public onCloseFunction closeFunction = null;
    public disposeFunction function = null;

    public controllerBody(List<declareRxInt> declareRxIntList, List<declareRxBool> declareRxBoolList,
                          List<declareRxList> declareRxListList, onInitFunction initFunction,
                          onCloseFunction closeFunction, disposeFunction function) {
        this.declareRxIntList = declareRxIntList;
        this.declareRxBoolList = declareRxBoolList;
        this.declareRxListList = declareRxListList;
        this.initFunction = initFunction;
        this.closeFunction = closeFunction;
        this.function = function;
    }

    controllerBody() {
    }

    public List<declareRxInt> getDeclareRxIntList() {
        return declareRxIntList;
    }

    public void setDeclareRxIntList(List<declareRxInt> declareRxIntList) {
        this.declareRxIntList = declareRxIntList;
    }

    public List<declareRxBool> getDeclareRxBoolList() {
        return declareRxBoolList;
    }

    public void setDeclareRxBoolList(List<declareRxBool> declareRxBoolList) {
        this.declareRxBoolList = declareRxBoolList;
    }

    public List<declareRxList> getDeclareRxListList() {
        return declareRxListList;
    }

    public void setDeclareRxListList(List<declareRxList> declareRxListList) {
        this.declareRxListList = declareRxListList;
    }

    public onInitFunction getInitFunction() {
        return initFunction;
    }

    public void setInitFunction(onInitFunction initFunction) {
        this.initFunction = initFunction;
    }

    public onCloseFunction getCloseFunction() {
        return closeFunction;
    }

    public void setCloseFunction(onCloseFunction closeFunction) {
        this.closeFunction = closeFunction;
    }

    public disposeFunction getFunction() {
        return function;
    }

    public void setFunction(disposeFunction function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "controllerBody{" +
                "declareRxIntList=" + declareRxIntList +
                ", declareRxBoolList=" + declareRxBoolList +
                ", declareRxListList=" + declareRxListList +
                ", initFunction=" + initFunction +
                ", closeFunction=" + closeFunction +
                ", function=" + function +
                '}';
    }

    public String ToHTML() {
        StringBuilder sb = new StringBuilder();

        if (declareRxIntList != null) {
            for (declareRxInt declare : declareRxIntList) {
                sb.append(declare.ToHTML()).append("\n");
            }
        }

        if (declareRxBoolList != null) {
            for (declareRxBool declare : declareRxBoolList) {
                sb.append(declare.ToHTML()).append("\n");
            }
        }

        if (declareRxListList != null) {
            for (declareRxList declare : declareRxListList) {
                sb.append(declare.ToHTML()).append("\n");
            }
        }

        if (initFunction != null) {
            sb.append(initFunction.ToHTML()).append("\n");
        }

        if (closeFunction != null) {
            sb.append(closeFunction.ToHTML()).append("\n");
        }

        if (function != null) {
            sb.append(function.ToHTML()).append("\n");
        }

        return sb.toString();
    }
}
