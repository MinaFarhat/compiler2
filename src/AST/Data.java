package AST;

import java.util.*;

public class Data {
    public String thisKeyword;
    public String dotData;
    public String nameData;

    public Data(String thisKeyword, String dotData, String nameData) {
        this.thisKeyword = thisKeyword;
        this.dotData = dotData;
        this.nameData = nameData;
    }

    public Data() {
    }

    public String getThisKeyword() {
        return thisKeyword;
    }

    public void setThisKeyword(String thisKeyword) {
        this.thisKeyword = thisKeyword;
    }

    public String getDotData() {
        return dotData;
    }

    public void setDotData(String dotData) {
        this.dotData = dotData;
    }

    public String getNameData() {
        return nameData;
    }

    public void setNameData(String nameData) {
        this.nameData = nameData;
    }

    @Override
    public String toString() {
        return "2";
    }

    public String ToHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<span>");

        if (thisKeyword != null) {
            sb.append(thisKeyword);
        }

        if (dotData != null) {
            sb.append(".");
            sb.append(dotData);
        }

        if (nameData != null) {
            sb.append(nameData);
        }

        sb.append("</span>");
        return sb.toString();
    }
}
