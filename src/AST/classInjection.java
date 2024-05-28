package AST;

import java.io.IOException;

public class classInjection {
    private dependenciesInje dependenciesInje;

    public classInjection(dependenciesInje dependenciesInje) {
        this.dependenciesInje = dependenciesInje;
    }

    public dependenciesInje getDependenciesInje() {
        return dependenciesInje;
    }

    public void setDependenciesInje(dependenciesInje dependenciesInje) {
        this.dependenciesInje = dependenciesInje;
    }

    @Override
    public String toString() {
        return "classInjection{" +
                "inje=" + dependenciesInje +
                '}';
    }

    public String ToHTML() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<div>\n");
        if (dependenciesInje != null) {
            htmlBuilder.append("<span>").append(dependenciesInje.ToHTML()).append("</span>\n");
        }
        htmlBuilder.append("</div>\n");
        return htmlBuilder.toString();
    }
}
