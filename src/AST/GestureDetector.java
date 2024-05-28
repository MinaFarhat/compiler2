package AST;

import java.io.IOException;

public class GestureDetector extends Widget {
    private Child child;
    private OnTap onTap;

    public GestureDetector(Child child, OnTap onTap) {
        this.child = child;
        this.onTap = onTap;
    }

    public GestureDetector() {
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public OnTap getOnTap() {
        return onTap;
    }

    public void setOnTap(OnTap onTap) {
        this.onTap = onTap;
    }

    @Override
    public String toString() {
        if (getOnTap() == null) {
            return "GestureDetector(\n" +
                    child +
                    ");";
        } else {
            return "GestureDetector(\n" +
                    child +
                    onTap +
                    "),";
        }
    }

    public String ToHTML() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<div style=\"display: inline-block;\">");
        sb.append("<a href=\"");
        sb.append(onTap.ToHTML());
        sb.append("\" style=\"color: blue; text-decoration: none; font-weight: bold;\">");
        sb.append(child.ToHTML());
        sb.append("</a>");
        sb.append("</div>");
        return sb.toString();
    }

}
