package AST;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Widget {
    private List<Widget> widgets = new ArrayList<>();

    private Container container;
    private Row row;
    private Column column;
    private Scaffold scaffold;
    private GestureDetector gestureDetector;
    private Text text;
    private Card card;
    private Child child;
    private ListView listView;
    private FloatingActionButton floatingActionButton;
    private ListTile listTile;

    private String keyword;
    private Widget content;

    public Widget(String keyword, Widget content) {
        this.keyword = keyword;
        this.content = content;
    }

    public ListTile getListTile() {
        return listTile;
    }

    public void setListTile(ListTile listTile) {
        this.listTile = listTile;
    }

    public FloatingActionButton getFloatingActionButton() {
        return floatingActionButton;
    }

    public void setFloatingActionButton(FloatingActionButton floatingActionButton) {
        this.floatingActionButton = floatingActionButton;
    }

    public Widget(Container container, Row row, Column column, Scaffold scaffold, GestureDetector gestureDetector, Text text, Card card, ListView listView, FloatingActionButton floatingActionButton, ListTile listTile) {
        this.container = container;
        this.row = row;
        this.column = column;
        this.scaffold = scaffold;
        this.gestureDetector = gestureDetector;
        this.text = text;
        this.card = card;
        this.listView = listView;
        this.floatingActionButton = floatingActionButton;
        this.listTile = listTile;
    }

    public Widget() {
    }

    public Widget(Text t) {
        this.text = t;
    }

    public ListView getListView() {
        return listView;
    }

    public void setListView(ListView listView) {
        this.listView = listView;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public Row getRow() {
        return row;
    }

    public void setRow(Row row) {
        this.row = row;
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public Scaffold getScaffold() {
        return scaffold;
    }

    public void setScaffold(Scaffold scaffold) {
        this.scaffold = scaffold;
    }

    public GestureDetector getGestureDetector() {
        return gestureDetector;
    }

    public void setGestureDetector(GestureDetector gestureDetector) {
        this.gestureDetector = gestureDetector;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        if (scaffold != null)
            return String.valueOf(scaffold);
        else if (container != null)
            return String.valueOf(container);
        else if (row != null)
            return String.valueOf(row);
        else if (column != null)
            return String.valueOf(column);
        else if (gestureDetector != null)
            return String.valueOf(gestureDetector);
        else if (text != null)
            return String.valueOf(text);
        else if (this.getCard() != null)
            return String.valueOf(card);
        else if (this.child != null)
            return String.valueOf(child);
        else if (this.listView != null)
            return String.valueOf(listView);
        else if (this.floatingActionButton != null)
            return String.valueOf(floatingActionButton);
        else if (this.listTile != null)
            return String.valueOf(listTile);

        return null;
    }

    public String ToHTML() throws IOException {
        StringBuilder html = new StringBuilder();

        for (Widget widget : widgets) {
            html.append(widget.ToHTML());
        }

        if (container != null) {
            html.append(container.ToHTML());
        } else if (row != null) {
            html.append(row.ToHTML());
        } else if (column != null) {
            html.append(column.ToHTML());
        } else if (scaffold != null) {
            html.append(scaffold.ToHTML());
        } else if (gestureDetector != null) {
            html.append(gestureDetector.ToHTML());
        } else if (text != null) {
            html.append(text.ToHTML());
        } else if (card != null) {
            html.append(card.ToHTML());
        } else if (listView != null) {
            html.append(listView.ToHTML());
        } else if (floatingActionButton != null) {
            html.append(floatingActionButton.ToHTML());
        } else if (listTile != null) {
            html.append(listTile.ToHTML());
        }

        return html.toString();
    }
}
