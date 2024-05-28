package AST;

public class MethodCallBack {
    private String methodName;

    public MethodCallBack(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    @Override
    public String toString() {
        return "MethodCallBackNode: " + methodName;
    }

    public String ToHTML() {
        return "<div class=\"method-callback\">" + methodName + "</div>\n";
    }
}
