package AST;

import java.util.List;

public class constructorBody {
    public List<constracterInit> list = null;

    public constructorBody(List<constracterInit> list) {
        this.list = list;
    }

    constructorBody() {
    }

    public List<constracterInit> getList() {
        return list;
    }

    public void setList(List<constracterInit> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "{Super.Key," + list + "}";
    }

    public String ToHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>");

        if (list != null) {
            for (constracterInit init : list) {
                sb.append("<li>").append(init.ToHTML()).append("</li>");
            }
        }

        sb.append("</ul>");
        return sb.toString();
    }
}
