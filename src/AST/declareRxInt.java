package AST;

public class declareRxInt {
    public DataType dataType;
    String name;
    int number;
    boolean isFinal; // Added isFinal variable

    public declareRxInt(boolean isFinal, DataType dataType, String name, int number) {
        this.isFinal = isFinal;
        this.dataType = dataType;
        this.name = name;
        this.number = number;
    }

    declareRxInt() {}

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    @Override
    public String toString() {
        return (isFinal ? "final " : "") + dataType + " " + name + "=" + number + ".RxInt" + ";";
    }

    public String ToHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<span>");

        if (isFinal) {
            sb.append("final ");
        }

        sb.append(dataType.ToHTML()).append(" ").append(name).append("=").append(number).append(".RxInt").append(";");

        sb.append("</span>");
        return sb.toString();
    }
}
