package AST;

import java.io.IOException;

public class Title extends Widget{
    private Widget widget;

    public Title(Widget widget) {
        this.widget = widget;
    }
public Title(){}
    public Widget getWidget() {
        return widget;
    }

    @Override
    public String toString() {
        return "TitleNode: \n"
                + "Widget: " + widget;
    }

    public String ToHTML() throws IOException {
        return  widget.ToHTML() ;
    }
}
