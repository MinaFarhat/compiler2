package AST;

import java.io.IOException;
import java.util.List;

public class Plur {
    private main main;
    private classMaterial classMaterial;
    private List<Class> classes;
    private List<classInjection> classInjections;
    private List<classController> classControllers;

    public Plur(main main, classMaterial classMaterial, List<Class> classes, List<classInjection> classInjections, List<classController> classControllers) {
        this.main = main;
        this.classMaterial = classMaterial;
        this.classes = classes;
        this.classInjections = classInjections;
        this.classControllers = classControllers;
    }

    public main getMain() {
        return main;
    }

    public classMaterial getClassMaterial() {
        return classMaterial;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public List<classInjection> getClassInjections() {
        return classInjections;
    }

    public List<classController> getClassControllers() {
        return classControllers;
    }

    public void setMain(AST.main main) {
        this.main = main;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public void setClassMaterial(AST.classMaterial classMaterial) {
        this.classMaterial = classMaterial;
    }

    public void setClassInjections(List<classInjection> classInjections) {
        this.classInjections = classInjections;
    }

    public void setClassControllers(List<classController> classControllers) {
        this.classControllers = classControllers;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(main).append("\n").append(classMaterial).append("\n");

        if (!classes.isEmpty()) {
            result.append(classes.toString().replaceAll("\\[null\\]|\\[\\]", ""));
        }

        if (!classInjections.isEmpty()) {
            result.append(classInjections.toString().replaceAll("\\[null\\]|\\[\\]", ""));
        }

        if (!classControllers.isEmpty()) {
            result.append(classControllers.toString().replaceAll("\\[null\\]|\\[\\]", ""));
        }

        return result.toString();
    }




    public String ToHTML() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>\n");
        sb.append("<head>\n");
        sb.append("<title>Generated Code</title>\n");
        sb.append("</head>\n");
        sb.append("<body>\n");
        sb.append("<pre>\n");

        sb.append(main.ToHTML());
        sb.append(classMaterial.ToHTML());

        for (Class clazz : classes) {
            sb.append(clazz.ToHTML());
        }

        for (classInjection injection : classInjections) {
            sb.append(injection.ToHTML());
        }

        for (classController controller : classControllers) {
            sb.append(controller.ToHTML());
        }

        sb.append("</pre>\n");
        sb.append("</body>\n");
        sb.append("</html>");

        return sb.toString();
    }


}
