package AST;

public class disposeFunction {
    private disposeBody body;

    public disposeFunction(disposeBody body) {
        this.body = body;
    }

    public disposeBody getBody() {
        return body;
    }

    public void setBody(disposeBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "disposeFunction{" +
                "body=" + body +
                '}';
    }

    public String ToHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div>");
        sb.append("disposeFunction{<br>");
        sb.append("&nbsp;&nbsp;&nbsp;&nbsp;body=").append(body.ToHTML()).append("<br>");
        sb.append("}");
        sb.append("</div>");
        return sb.toString();
    }
}
