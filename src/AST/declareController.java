package AST;

public class declareController {
    String name;
    boolean isFinal = false;

    public declareController(boolean isFinal, String name) {
        this.isFinal = isFinal;
        this.name = name;
    }

    declareController() {}

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (isFinal) {
            return "final " + name + "=" + "Get.Find()" + ";";
        } else {
            return name + "=" + "Get.Find()" + ";";
        }
    }

    public String ToHTML() {
        StringBuilder sb = new StringBuilder();
//        sb.append("<span>");
//
//        if (isFinal) {
//            sb.append("final ");
//        }
//
//        sb.append(name).append("=").append("Get.Find()").append(";");
//
//        sb.append("</span>");
        return sb.toString();
    }
}
