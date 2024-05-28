package AST;

import java.io.IOException;

public class Card extends Widget {

    public Child child;

    public Card(String card, String opCard, Child child) {
        this.child = child;
    }

    public Card(Child visitChild) {
        this.child = visitChild;
    }

    public Card() {
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Card(\n" +
                child +
                "),\n";
    }

    public String ToHTML() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<div style=\"background-color: #f1f1f1; padding: 10px; margin: 10px; max-width: 300px; border-radius: 8px; box-shadow: 0 2px 4px rgba(2, 5, 8, 0.1); display: flex; justify-content: center; align-items: center;\" class=\"card\">\n");
        htmlBuilder.append("<div style=\"color: #333; padding: 8px;\">").append(child.ToHTML()).append("</div>\n");
        htmlBuilder.append("</div>\n");
        return htmlBuilder.toString();
    }



}
