package AST;

public class AxisAttr {
    private String value;

    public AxisAttr(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "AxisAttrNode: Value=" + value;
    }
    public String ToHTML() {
        return value;
    }

}
