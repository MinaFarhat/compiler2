package AST;

import java.io.IOException;

public class materialPageRoute {
    private newScreen screen;

    public materialPageRoute(newScreen screen) {
        this.screen = screen;
    }

    public materialPageRoute() {
    }

    public newScreen getScreen() {
        return screen;
    }

    public void setScreen(newScreen screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "MaterialPageRoute(\nbuilder: (context) => " + screen + ");\n";
    }

    public String ToHTML() throws IOException {
        StringBuilder sb = new StringBuilder();
       // sb.append("<a href=\"");
        sb.append(screen.ToHTML());
       // sb.append("\" style=\"color: blue; text-decoration: none; font-weight: bold;\">Link</a>");
        return sb.toString();
    }

}
