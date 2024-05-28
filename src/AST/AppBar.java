package AST;

import java.io.IOException;

public class AppBar {
    private AppBarProps appBarProps;

    public AppBar(AppBarProps appBarProps) {
        this.appBarProps = appBarProps;
    }

    public AppBarProps getAppBarProps() {
        return appBarProps;
    }

    @Override
    public String toString() {
        return "appBar:" +"AppBar(\n"+appBarProps+"),";
    }

    public String ToHTML() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();
        //htmlBuilder.append("<div class=\"app-bar\">\n");
        //htmlBuilder.append("<div class=\"app-bar-props\">\n");
        htmlBuilder.append(appBarProps.ToHTML());
        //htmlBuilder.append("</div>\n");
        //htmlBuilder.append("</div>\n");
        return htmlBuilder.toString();
    }

}
