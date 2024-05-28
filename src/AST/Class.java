package AST;

import java.io.IOException;

public class Class {
    public String className;
    public String inheritsClassName;
    public ClassBody bodyClass;
    public Class() {
    }

    public Class(String className, String inheritsClassName, ClassBody bodyClass) {
        this.className = className;
        this.inheritsClassName = inheritsClassName;
        this.bodyClass = bodyClass;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getInheritsClassName() {
        return inheritsClassName;
    }

    public void setInheritsClassName(String inheritsClassName) {
        this.inheritsClassName = inheritsClassName;
    }

    public ClassBody getBodyClass() {
        return bodyClass;
    }

    public void setBodyClass(ClassBody bodyClass) {
        this.bodyClass = bodyClass;
    }

    @Override
    public String toString() {
        return "Class " + className + " extends " + inheritsClassName + "{ \n" + bodyClass + "}\n";
    }

    public String ToHTML() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();
        //htmlBuilder.append("<div>\n");
        //htmlBuilder.append("<span>Class " + className + " extends " + inheritsClassName + " {</span>\n");
        //htmlBuilder.append("<br>\n");
        htmlBuilder.append(bodyClass.ToHTML());
        //htmlBuilder.append("<span>}</span>\n");
        //htmlBuilder.append("</div>\n");
        return htmlBuilder.toString();
    }
//    public String ToHTML() {
//
//        return "";
//    }
}
