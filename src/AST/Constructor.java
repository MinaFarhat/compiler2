package AST;

public class Constructor {
    public String name;
    public constructorBody body = null;
    boolean isExist = false;

    public Constructor(String name, constructorBody body, boolean isExist) {
        this.name = name;
        this.body = body;
        this.isExist = isExist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public constructorBody getBody() {
        return body;
    }

    public void setBody(constructorBody body) {
        this.body = body;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }

    @Override
    public String toString() {
        if (isExist) {
            return name + "(" + body + ")";
        } else {
            return name + "()";
        }
    }

    public String ToHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div>");
        sb.append("<span>Constructor: ").append(name).append("</span>");
        sb.append("<br/>");

        if (isExist) {
            sb.append("<span>Body: ").append(body.ToHTML()).append("</span>");
        } else {
            sb.append("<span>No body</span>");
        }

        sb.append("</div>");
        return sb.toString();
    }
}
