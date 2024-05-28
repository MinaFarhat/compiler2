package AST;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class DataType {
    public String dataType;

    public DataType(String dataType) {
        this.dataType = dataType;
    }

    public DataType() {
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        return dataType;
    }

    public String ToHTML() {
        return "<span>" + dataType + "</span>";
    }
}
