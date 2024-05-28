package AST;

public class pop {
    public pop() {}

    @Override
    public String toString() {
        return "pop(context);\n";
    }

    public String ToHTML() {
        return "<span class=\"pop\">pop(context);</span><br/>";
    }
}
