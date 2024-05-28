package AST;

public class constracterInit {
    private String name;
    private boolean isRequired = false;

    public constracterInit(String name, boolean isRequired) {
        this.name = name;
        this.isRequired = isRequired;
    }

    public constracterInit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    public String ToHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<span>");

        if (isRequired) {
            sb.append("<strong>required</strong> ");
        }

        sb.append("this.").append(name);

        sb.append("</span>");
        return sb.toString();
    }

    @Override
    public String toString() {
        if (isRequired) {
            return "required this." + name + ",";
        } else {
            return "this." + name + ",";
        }
    }
}
