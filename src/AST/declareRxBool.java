package AST;

public class declareRxBool {
    public DataType dataType;
    String name;
    boolean condition;
    boolean isFinal; // Added isFinal variable

    public declareRxBool(boolean isFinal, DataType dataType, String name, boolean condition) {
        this.isFinal = isFinal;
        this.dataType = dataType;
        this.name = name;
        this.condition = condition;
    }

    declareRxBool() {}

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

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    @Override
    public String toString() {
        return (isFinal ? "final " : "") + dataType + " " + name + "=" + condition + ".RxBool" + ";";
    }

    public String ToHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<span>");

        if (isFinal) {
            sb.append("final ");
        }

        sb.append(dataType.ToHTML()).append(" ").append(name).append("=").append(condition).append(".RxBool").append(";");

        sb.append("</span>");
        return sb.toString();
    }
}
