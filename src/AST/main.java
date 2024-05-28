package AST;

public class main {
    private String name;

    public main(String name) {
        this.name = name;
    }

    public main() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "void main() {\n" +
                "    runApp(" + name + "());\n" +
                "}";
    }

    public String ToHTML() {
        return "";
    }
}
