package AST;

import java.io.IOException;

public class FloatingActionButton {
    private FloatingActionButtonProps floatingActionButtonProps;

    public FloatingActionButton(FloatingActionButtonProps floatingActionButtonProps) {
        this.floatingActionButtonProps = floatingActionButtonProps;
    }

    public FloatingActionButtonProps getFloatingActionButtonProps() {
        return floatingActionButtonProps;
    }

    @Override
    public String toString() {
        return "FloatingActionButtonNode: \n"
                + "FloatingActionButtonProps: " + floatingActionButtonProps;
    }

    public String ToHTML() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<div class=\"floating-action-button\">\n");
        htmlBuilder.append("<div class=\"floating-action-button-props\">\n");
        htmlBuilder.append(floatingActionButtonProps.ToHTML());
        htmlBuilder.append("</div>\n");
        htmlBuilder.append("</div>\n");
        return htmlBuilder.toString();
    }
}
