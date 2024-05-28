package AST;

public class classController {
    private controllerBody body;

    public classController(controllerBody body) {
        this.body = body;
    }

    public classController() {
    }

    public controllerBody getBody() {
        return body;
    }

    public void setBody(controllerBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "classController{" +
                "body=" + body +
                '}';
    }

    public String ToHTML() {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<div>\n");
        if (body != null) {
            htmlBuilder.append("<span>").append(body.ToHTML()).append("</span>\n");
        }
        htmlBuilder.append("</div>\n");
        return htmlBuilder.toString();
    }
}
