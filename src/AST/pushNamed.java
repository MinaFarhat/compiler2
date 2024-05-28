package AST;

public class pushNamed {
    private String name;

    public pushNamed(String name) {
        this.name = name;
    }

    public pushNamed() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "pushNamed(context, \"" + name + "\");\n";
    }

    public String ToHTML() {
        return "<span class=\"pushNamed\">pushNamed(context, \"" + name + "\");</span><br/>";
    }
}
