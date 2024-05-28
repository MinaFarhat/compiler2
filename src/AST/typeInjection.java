package AST;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class typeInjection {
    public List<injectionLazyPut> injectionLazyPuts;
    public List<injectionPut> injectionPuts;

    public typeInjection(List<injectionLazyPut> injectionLazyPuts, List<injectionPut> injectionPuts) {
        this.injectionLazyPuts = injectionLazyPuts;
        this.injectionPuts = injectionPuts;
    }

    public typeInjection() {
        this.injectionLazyPuts = new ArrayList<>();
        this.injectionPuts = new ArrayList<>();
    }

    public List<injectionLazyPut> getInjectionLazyPuts() {
        return injectionLazyPuts;
    }

    public void setInjectionLazyPuts(List<injectionLazyPut> injectionLazyPuts) {
        this.injectionLazyPuts = injectionLazyPuts;
    }

    public List<injectionPut> getInjectionPuts() {
        return injectionPuts;
    }

    public void setInjectionPuts(List<injectionPut> injectionPuts) {
        this.injectionPuts = injectionPuts;
    }

    @Override
    public String toString() {
        return "typeInjection{" +
                "injectionLazyPuts=" + injectionLazyPuts +
                ", injectionPuts=" + injectionPuts +
                '}';
    }

    public String ToHTML() throws IOException {
        StringBuilder html = new StringBuilder();

       // html.append("<div class=\"type-injection\">");
       // html.append("<h4>Type Injection</h4>");

        if (!injectionLazyPuts.isEmpty()) {
           // html.append("<h5>Lazy Puts:</h5>");
           // html.append("<ul>");

            for (injectionLazyPut lazyPut : injectionLazyPuts) {
                html.append(lazyPut.ToHTML());
            }

           // html.append("</ul>");
        }

        if (!injectionPuts.isEmpty()) {
            //html.append("<h5>Puts:</h5>");
            //html.append("<ul>");

            for (injectionPut put : injectionPuts) {
               html.append(put.ToHTML());
            }

            //html.append("</ul>");
        }

        //html.append("</div>");

        return html.toString();
    }
}
