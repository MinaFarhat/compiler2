package AST;

import java.io.IOException;

public class AppBarProps {
    private Widget title;

    public AppBarProps(Widget title) {
        this.title = title;
    }

    public Widget getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "title: " + title;
    }
    public String ToHTML() throws IOException {
        return "<html>\n" +
                "<head>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "        }\n" +
                "        .app-bar {\n" +
                "             background-color: #70a7f9;\n" +
                "            padding: 8px;\n" +
                "            position: fixed;\n" +
                "            top: 0;\n" +
                "            left: 0;\n" +
                "            width: 100%;\n" +
                "            display: flex;\n" +
                "            align-items: center;\n" +
                "            justify-content: center;\n" +
                "            box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.2);\n" +
                "        }\n" +
                "        .app-bar h1 {\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "            color: #333;\n" +
                "            font-size: 20px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"app-bar\">\n" +
                "        <!-- Add your AppBar content here -->\n" +
                "        <h1>" + title.ToHTML() + "</h1>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
    }

}
