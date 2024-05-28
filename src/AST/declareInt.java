package AST;

public class declareInt {
    private boolean isFinal;
    private DataType dataType;
    private String name;
    private int value;

    public declareInt(boolean isFinal, DataType dataType, String name, int value) {
        this.isFinal = isFinal;
        this.dataType = dataType;
        this.name = name;
        this.value = value;
    }
public declareInt(){}
    public boolean getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(boolean isFinal) {
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String finalString = (isFinal ? "final " : "");
        return finalString + dataType + " " + name + "=" + value + ";";
    }

    public String ToHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<span>");

        if (isFinal) {
            sb.append("final ");
        }

        sb.append(dataType).append(" ").append(name).append("=").append(value).append(";");

        sb.append("</span>");
        return sb.toString();
    }
}
