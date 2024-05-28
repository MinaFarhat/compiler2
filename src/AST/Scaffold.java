package AST;
import java.io.IOException;
import java.util.Objects;

public class Scaffold {
    private BodyScaffold bodyScaffold;
    private AppBar appBar;

    public Scaffold(BodyScaffold bodyScaffold) {
        this.bodyScaffold = bodyScaffold;
    }

    public BodyScaffold getBodyScaffold() {
        return bodyScaffold;
    }

    public void setBodyScaffold(BodyScaffold bodyScaffold) {
        this.bodyScaffold = bodyScaffold;
    }

    public AppBar getAppBar() {
        return appBar;
    }

    public void setAppBar(AppBar appBar) {
        this.appBar = appBar;
    }

    @Override
    public String toString() {
     if (appBar==null){
         return "Scaffold"+"(\n"+bodyScaffold.toString() + "\n"+");\n";
     }else {
         return "Scaffold"+"(\n"+appBar+"\n"+bodyScaffold + "\n"+");\n";
     }
    }

    public String ToHTML() throws IOException {
        StringBuilder html = new StringBuilder();

        html.append("<div class=\"scaffold\">");

        if (appBar != null) {
            html.append(appBar.ToHTML());
        }

        if (bodyScaffold != null) {
            html.append(bodyScaffold.ToHTML());
        }

        html.append("</div>");

        return html.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scaffold scaffold = (Scaffold) o;
        return Objects.equals(bodyScaffold, scaffold.bodyScaffold) &&
                Objects.equals(appBar, scaffold.appBar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyScaffold, appBar);
    }
}
