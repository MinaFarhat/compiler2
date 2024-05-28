package AST;

public class classMaterial {
    private String name;
    private String inheritsClassName;
    private Build build;

    public classMaterial(String name, String inheritsClassName, Build build) {
        this.name = name;
        this.inheritsClassName = inheritsClassName;
        this.build = build;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInheritsClassName() {
        return inheritsClassName;
    }

    public void setInheritsClassName(String inheritsClassName) {
        this.inheritsClassName = inheritsClassName;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    @Override
    public String toString() {
        return "Class " + name + " extends " + inheritsClassName + "{\n" + build + "}\n";
    }

    public String ToHTML() {
//        StringBuilder htmlBuilder = new StringBuilder();
//        htmlBuilder.append("<div>\n");
//        htmlBuilder.append("<h2>").append(name).append("</h2>\n");
//        htmlBuilder.append("<p>").append("Inherits: ").append(inheritsClassName).append("</p>\n");
//        if (build != null) {
//            htmlBuilder.append(build.ToHTML());
//        }
//        htmlBuilder.append("</div>\n");
        return "";
    }
//    public String ToHTML() {
//        StringBuilder htmlBuilder = new StringBuilder();
//        htmlBuilder.append("<div>\n");
//        htmlBuilder.append("<h2>").append(name).append("</h2>\n");
//        htmlBuilder.append("<p>").append("Inherits: ").append(inheritsClassName).append("</p>\n");
//        if (build != null) {
//            htmlBuilder.append(build.ToHTML());
//        }
//        htmlBuilder.append("</div>\n");
//        return htmlBuilder.toString();
//    }
}
