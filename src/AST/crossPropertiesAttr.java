package AST;

public class crossPropertiesAttr {
    private String crossProperties;

    public crossPropertiesAttr(String crossProperties) {
        this.crossProperties = crossProperties;
    }

    public crossPropertiesAttr() {
    }

    public String getCrossProperties() {
        return crossProperties;
    }

    public void setCrossProperties(String crossProperties) {
        this.crossProperties = crossProperties;
    }

    @Override
    public String toString() {
        return "CrossAxisAlignment"+"." + crossProperties+",";
    }

    public String ToHTML() {
        return "<span class=\"" + crossProperties + "\"></span>";
    }
}
