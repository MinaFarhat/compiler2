package AST;

public class onCloseFunction {
    private oncloseBody body;

    public onCloseFunction(oncloseBody body) {
        this.body = body;
    }

    public onCloseFunction() {
    }

    public oncloseBody getBody() {
        return body;
    }

    public void setBody(oncloseBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "onCloseFunction{" +
                "body=" + body +
                '}';
    }

    public String ToHTML() {
        return body.ToHTML();
    }
}
