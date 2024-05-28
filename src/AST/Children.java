package AST;

import java.io.IOException;

public class Children {
    public Widgets widgets;

    public Children(Widgets widgets) {
        this.widgets = widgets;
    }

    public Widgets getWidgets() {
        return widgets;
    }

    public void setWidgets(Widgets widgets) {
        this.widgets = widgets;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Children:[");
        for (Widget widget : widgets.getWidgets()) {
            sb.append("\n\t");
            sb.append(widget.toString());
        }
        sb.append("\n],");
        return sb.toString();
    }

    public String ToHTML() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();

       // htmlBuilder.append("<div class=\"children\">");

        for (Widget widget : widgets.getWidgets()) {
            htmlBuilder.append(widget.ToHTML());
        }

        //htmlBuilder.append("</div>");

        return htmlBuilder.toString();
    }

}
