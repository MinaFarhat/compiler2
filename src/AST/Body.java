package AST;

import java.io.IOException;

public class Body {

    public Widget widget;

    public Body(Widget widget) {
        this.widget = widget;
    }

    public Widget getWidgets() {
        return widget;
    }

    public void setWidgets(Widget widget) {
        this.widget = widget;
    }

    @Override
    public String toString() {
        return "Body{" +
                "widgets=" + widget +
                '}';
    }

    public String ToHTML() throws IOException {
        return "<html>\n" +
                "<body>\n" +
                widget.ToHTML() +
                "</body>\n" +
                "</html>\n";
    }
}
