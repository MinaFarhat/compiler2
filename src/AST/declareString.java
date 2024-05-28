package AST;

public class declareString {
    private boolean isFinal;
    private DataType dataType;
    private String name;
    private String value;

    public declareString(boolean isFinal, DataType dataType, String name, String value) {
        this.isFinal = isFinal;
        this.dataType = dataType;
        this.name = name;
        this.value = value;
    }
public declareString(){}
    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return (isFinal ? "final " : "") + dataType + " " + name + "=" + value + ";";
    }

    public String ToHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<span>");

        if (isFinal) {
            sb.append("final ");
        }

        sb.append(dataType.ToHTML()).append(" ").append(name).append("=").append(value).append(";");

        sb.append("</span>");
        return sb.toString();
    }
}
