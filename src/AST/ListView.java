package AST;

import java.io.IOException;
import java.util.List;

public class ListView {
    private ListViewProps listViewProps;
    private List<Widget> children;

    public ListView(ListViewProps listViewProps, List<Widget> children) {
        this.listViewProps = listViewProps;
        this.children = children;
    }

    public ListViewProps getListViewProps() {
        return listViewProps;
    }

    public List<Widget> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        StringBuilder childrenString = new StringBuilder();
        for (Widget child : children) {
            childrenString.append(child.toString()).append("\n");
        }

        return "ListViewNode: \n"
                + "ListViewProps: " + listViewProps + "\n"
                + "Children: \n" + childrenString;
    }
    public String ToHTML() throws IOException {
        StringBuilder childrenHTML = new StringBuilder();
        for (Widget child : children) {
            childrenHTML.append(child.ToHTML()).append("\n");
        }

        return  listViewProps.ToHTML() + "\n"
                + "\n" + childrenHTML;
    }

}
