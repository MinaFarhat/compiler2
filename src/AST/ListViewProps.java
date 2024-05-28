package AST;

public class ListViewProps {
    private String scrollDirection;
    private boolean reverse;

    public ListViewProps(String scrollDirection, boolean reverse) {
        this.scrollDirection = scrollDirection;
        this.reverse = reverse;
    }

    public String getScrollDirection() {
        return scrollDirection;
    }

    public boolean isReverse() {
        return reverse;
    }

    @Override
    public String toString() {
        return "ListViewPropsNode: ScrollDirection=" + scrollDirection + ", Reverse=" + reverse;
    }
    public String ToHTML() {
        String scrollDirectionHTML = (scrollDirection != null) ? "<span style=\"color: #333; font-weight: bold;\">" + "</span>" : "";

        String scrollStyle = "";
        if (scrollDirection != null) {
            if (scrollDirection.equals("vertical")) {
                scrollStyle = "overflow-x: auto;";
            } else if (scrollDirection.equals("horizontal")) {
                scrollStyle = "overflow-y: auto; ";
            }
        }

        return "<div style=\"background-color: #f1f1f1; padding: 10px; margin-bottom: 10px; " + scrollStyle + "\">\n"
                + "<div>" + scrollDirectionHTML + "</div>\n"
                + "</div>";

    }




}
