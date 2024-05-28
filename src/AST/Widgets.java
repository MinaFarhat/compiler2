package AST;

import java.io.IOException;
import java.util.List;

public class Widgets {
    public List<Widget> widgets;

    public Widgets(List<Widget> widgets) {
        this.widgets = widgets;
    }

    public Widgets() {
    }

    public List<Widget> getWidgets() {
        return widgets;
    }

    public void setWidgets(List<Widget> widgets) {
        this.widgets = widgets;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Widget widget : this.widgets) {
            stringBuilder.append(widget);
            stringBuilder.append("\n");
        }
        return "Widgets{" +
                "widget=" + stringBuilder +
                '}';
    }

    public String ToHTML() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();

        for (int i = 0; i < widgets.size(); i++) {
            Widget widget = widgets.get(i);
            htmlBuilder.append("<div style=\"margin-bottom: 10px;\">");
            htmlBuilder.append(widget.ToHTML());
            htmlBuilder.append("</div>");

            // Add spacing between widgets except for the last widget
            if (i < widgets.size() - 1) {
                htmlBuilder.append("<div style=\"height: 10px;\"></div>");
            }
        }

        return htmlBuilder.toString();
    }

}
