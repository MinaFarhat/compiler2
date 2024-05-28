package AST;

public class Reverse {
    private boolean value;

    public Reverse(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ReverseNode: Value=" + value;
    }

    public String ToHTML() {
        return "<span class=\"reverse\">" + value + "</span>";
    }
}
