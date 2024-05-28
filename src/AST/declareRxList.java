package AST;

public class declareRxList {
    public DataType dataType;
    String name;
    String pp = "[]";
    boolean isFinal;

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    public declareRxList(boolean isFinal, DataType dataType, String name, String pp) {
        this.isFinal = isFinal;
        this.dataType = dataType;
        this.name = name;
        this.pp = pp;
    }

    declareRxList() {
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

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }

    @Override
    public String toString() {
        return (isFinal ? "final " : "") + dataType + " " + name + "=" + pp + ".RxList" + ";";
    }

    public String ToHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<span>");

        if (isFinal) {
            sb.append("final ");
        }

        sb.append(dataType.ToHTML()).append(" ").append(name).append("=").append(pp).append(".RxList").append(";");

        sb.append("</span>");
        return sb.toString();
    }
}
