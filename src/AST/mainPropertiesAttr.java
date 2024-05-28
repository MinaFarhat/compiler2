package AST;

public class mainPropertiesAttr {
    private String mainProperties;

    public mainPropertiesAttr(String mainProperties) {
        this.mainProperties = mainProperties;
    }

    public mainPropertiesAttr() {
    }

    public String getMainProperties() {
        return mainProperties;
    }

    public void setMainProperties(String mainProperties) {
        this.mainProperties = mainProperties;
    }

    @Override
    public String toString() {
        return "MainAxisAlignment"+"." + mainProperties+",";
    }


    public String ToHTML() {
        if (mainProperties == null) {
            return null;
        } else {
            return mainProperties;

        }
    }

}
