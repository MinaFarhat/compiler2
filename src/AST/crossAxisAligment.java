package AST;

public class crossAxisAligment {
    private crossPropertiesAttr attr;

    public crossAxisAligment(crossPropertiesAttr attr) {
        this.attr = attr;
    }

    public crossAxisAligment() {
    }

    public crossPropertiesAttr getCrossPropertiesAttr() {
        return attr;
    }

    public void setCrossPropertiesAttr(crossPropertiesAttr attr) {
        this.attr = attr;
    }

    @Override
    public String toString() {
        return "" + attr;
    }

    public String ToHTML() {
        return attr.ToHTML();
    }
}
