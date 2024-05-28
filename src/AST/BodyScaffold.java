package AST;
import java.io.IOException;
import java.util.Objects;

public class BodyScaffold {
    private Widget widget;

    public BodyScaffold(Widget widget) {
        this.widget = widget;
    }

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    @Override
    public String toString() {
        return "body:"+widget.toString();
    }

    public String ToHTML() throws IOException {
        return widget.ToHTML();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodyScaffold that = (BodyScaffold) o;
        return Objects.equals(widget, that.widget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(widget);
    }
}
