package AST;

public class onInitFunction {
    private oninitBody body;

    public onInitFunction(oninitBody body) {
        this.body = body;
    }

    public onInitFunction() {
    }

    public oninitBody getBody() {
        return body;
    }

    public void setBody(oninitBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "onInitFunction{" +
                "body=" + body +
                '}';
    }

    public String ToHTML() {
        return body.ToHTML();
    }
}
