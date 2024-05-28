package AST;

import java.io.IOException;

public class Child extends Widget {

    public Widget widget;

    public Child() {}

    public Child(Widget widget) {
        this.widget = widget;
    }

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    @Override
    public String toString() {
        return "child:" + widget ;
    }

    public String ToHTML() throws IOException {
        return widget.ToHTML();
    }
}
