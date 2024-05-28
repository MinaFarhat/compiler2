package AST;

import java.io.IOException;

public class Container extends Widget {
    public Child child = null;
    public width w = null;
    public height h = null;

    public Color color = null;

    public Container(Child child, width w, height h, Color color) {
        this.child = child;
        this.w = w;
        this.h = h;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    Container() {
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public width getW() {
        return w;
    }

    public void setW(width w) {
        this.w = w;
    }

    public height getH() {
        return h;
    }

    public void setH(height h) {
        this.h = h;
    }

    @Override
    public String toString() {
        if (child == null && w == null && h == null && color == null) {
            return "Container()";
        } else {
            return "Container(" + "\n" + (w != null ? w.toString() : "") + (h != null ? h.toString() : "")
                    + (child != null ? child.toString() : "") + (color != null ? color.toString() : "") + "),";
        }
    }
    public String ToHTML() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<div");

        if (color != null) {
            sb.append(" style=\"background-color: rgba(")
                    .append(color.getColorValue().getRed()).append(", ")
                    .append(color.getColorValue().getGreen()).append(", ")
                    .append(color.getColorValue().getBlue()).append(", ")
                    .append(color.getColorValue().getOpacity()).append(")\"");
        }

        sb.append(">");

        if (w != null) {
            sb.append(w.ToHTML());
        }

        if (h != null) {
            sb.append(h.ToHTML());
        }

        if (child != null) {
            sb.append("<div style=\"padding: 10px;\">")
                    .append(child.ToHTML())
                    .append("</div>");
        }

        sb.append("</div>");
        return sb.toString();
    }

}
