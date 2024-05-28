package AST;

public class ScrollDirection {
    private String axisAttr;

    public ScrollDirection(String axisAttr) {
        this.axisAttr = axisAttr;
    }

    public String getAxisAttr() {
        return axisAttr;
    }

    @Override
    public String toString() {
        return "ScrollDirectionNode: AxisAttr=" + axisAttr;
    }

    public String ToHTML() {
        return "<span class=\"scroll-direction\">" + axisAttr + "</span>";
    }
}
