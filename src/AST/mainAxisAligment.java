package AST;

public class mainAxisAligment {
    private mainPropertiesAttr attr;

    public mainAxisAligment(mainPropertiesAttr attr) {
        this.attr = attr;
    }

    public mainAxisAligment() {
    }

    public mainPropertiesAttr getMainPropertiesAttr() {
        return attr;
    }

    public void setMainPropertiesAttr(mainPropertiesAttr attr) {
        this.attr = attr;
    }

    @Override
    public String toString() {
        return attr.toString();
    }

    public String ToHTML() {
        if(attr == null){
            return null;
        }
        return attr.ToHTML();
    }
}
