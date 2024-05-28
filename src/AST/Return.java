package AST;

import java.io.IOException;

public class Return {
    private String returnKeyword;
    private Widget widget;

    public Return(String returnKeyword, Widget widget) {
        this.returnKeyword = returnKeyword;
        this.widget = widget;
    }

    public Return() {}

    public Return(Widget visitWidget) {
        this.widget = visitWidget;
    }

    public String getReturnKeyword() {
        return returnKeyword;
    }

    public Widget getWidget() {
        return widget;
    }

    public void setReturnKeyword(String returnKeyword) {
        this.returnKeyword = returnKeyword;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    @Override
    public String toString() {
        return "return " + widget;
    }

    public String ToHTML() throws IOException {
        return  widget.ToHTML();
    }
}
