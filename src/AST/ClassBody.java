package AST;
import java.io.IOException;
import java.util.List;

public class ClassBody {
    private List<declareString> strings;
    private List<declareInt> ints;
    private List<declareBool> bools;
    private declareController controller;
    private Constructor constructor;
    private Build build;

    public ClassBody(List<declareString> strings, List<declareInt> ints, List<declareBool> bools,
                     declareController controller, Constructor constructor, Build build) {
        this.strings = strings;
        this.ints = ints;
        this.bools = bools;
        this.controller = controller;
        this.constructor = constructor;
        this.build = build;
    }

    public List<declareString> getStrings() {
        return strings;
    }

    public void setStrings(List<declareString> strings) {
        this.strings = strings;
    }

    public List<declareInt> getInts() {
        return ints;
    }

    public void setInts(List<declareInt> ints) {
        this.ints = ints;
    }

    public List<declareBool> getBools() {
        return bools;
    }

    public void setBools(List<declareBool> bools) {
        this.bools = bools;
    }

    public declareController getController() {
        return controller;
    }

    public void setController(declareController controller) {
        this.controller = controller;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (strings != null) {
            builder.append(strings).append("\n");
        }
        if (ints != null) {
            builder.append(ints).append("\n");
        }
        if (bools != null) {
            builder.append(bools).append("\n");
        }
        if (controller != null) {
            builder.append(controller).append("\n");
        }
        if (constructor != null) {
            builder.append(constructor).append("\n");
        }
        if (build != null) {
            builder.append(build).append("\n");
        }
        return builder.toString();
    }

    public String ToHTML() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder("<div>\n");
        if (strings != null) {
            for (declareString str : strings) {
                if (str != null) {
                    htmlBuilder.append("<span>").append(str.ToHTML()).append("</span>\n");
                }
            }
        }
        if (ints != null) {
            for (declareInt integer : ints) {
                if (integer != null) {
                    htmlBuilder.append("<span>").append(integer.ToHTML()).append("</span>\n");
                }
            }
        }
        if (bools != null) {
            for (declareBool bool : bools) {
                if (bool != null) {
                    htmlBuilder.append("<span>").append(bool.ToHTML()).append("</span>\n");
                }
            }
        }
        if (controller != null) {
            htmlBuilder.append("<span>").append(controller.ToHTML()).append("</span>\n");
        }
        if (constructor != null) {
            htmlBuilder.append("<span>").append(constructor.ToHTML()).append("</span>\n");
        }
        if (build != null) {
            htmlBuilder.append("<span>").append(build.ToHTML()).append("</span>\n");
        }
        htmlBuilder.append("</div>\n");
        return htmlBuilder.toString();
    }
}
