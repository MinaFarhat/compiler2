package AST;


import java.io.IOException;

public class ListTile extends Widget {
    private ListTileProps listTileProps;

    public ListTile(ListTileProps listTileProps) {
        this.listTileProps = listTileProps;
    }

    public ListTileProps getListTileProps() {
        return listTileProps;
    }

    @Override
    public String toString() {
        return "ListTileNode: \n"
                + "ListTileProps: " + listTileProps;
    }

    @Override
    public String ToHTML() throws IOException {
        String listTilePropsHTML = (listTileProps != null) ? listTileProps.ToHTML() : "";

        return "<div class=\"list-tile\">\n"
                + listTilePropsHTML
                + "</div>";
    }
}
