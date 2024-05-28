package AST;

import java.io.IOException;

public class FloatingActionButtonProps {
    private MethodCallBack onPressed;
    private Widget child;

    public FloatingActionButtonProps(MethodCallBack onPressed, Widget child) {
        this.onPressed = onPressed;
        this.child = child;
    }

    public MethodCallBack getOnPressed() {
        return onPressed;
    }

    public Widget getChild() {
        return child;
    }

    @Override
    public String toString() {
        return "FloatingActionButtonPropsNode: \n"
                + "OnPressed: " + onPressed + "\n"
                + "Child: " + child;
    }

    public String ToHTML() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<div class=\"floating-action-button-props\">\n");
        htmlBuilder.append("<div class=\"on-pressed\">\n");
        htmlBuilder.append(onPressed.ToHTML());
        htmlBuilder.append("</div>\n");
        htmlBuilder.append("<div class=\"child\">\n");
        htmlBuilder.append(child.ToHTML());
        htmlBuilder.append("</div>\n");
        htmlBuilder.append("</div>\n");
        return htmlBuilder.toString();
    }
}
