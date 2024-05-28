package AST;

public class disposeBody {
    private String name;

    public disposeBody(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "disposeBody{" +
                "name='" + name + '\'' +
                '}';
    }

    public String ToHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div>");
        sb.append("disposeBody{<br>");
        sb.append("&nbsp;&nbsp;&nbsp;&nbsp;name=").append(name).append("<br>");
        sb.append("}");
        sb.append("</div>");
        return sb.toString();
    }
}
