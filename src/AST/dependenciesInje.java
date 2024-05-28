package AST;

import java.io.IOException;

public class dependenciesInje {
    private typeInjection injection;

    public dependenciesInje(typeInjection injection) {
        this.injection = injection;
    }

    public typeInjection getInjection() {
        return injection;
    }

    public void setInjection(typeInjection injection) {
        this.injection = injection;
    }

    @Override
    public String toString() {
        return "dependenciesInje{" +
                "injection=" + injection +
                '}';
    }

    public String ToHTML() throws IOException {
        StringBuilder sb = new StringBuilder();
        //sb.append("<div>");
       // sb.append("dependenciesInje{<br>");
        sb.append(injection.ToHTML());
        //sb.append("}");
        //sb.append("</div>");
        return sb.toString();
    }
}
