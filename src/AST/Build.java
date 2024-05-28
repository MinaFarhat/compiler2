package AST;

import java.io.IOException;

public class Build {
    public Return aReturn = null;
    public returnMaterialApp app = null;
    public boolean isMaterial = false;

    public Build(Return aReturn, returnMaterialApp app, boolean isMaterial) {
        this.aReturn = aReturn;
        this.app = app;
        this.isMaterial = isMaterial;
    }

    public Build() {
    }

    public Return getaReturn() {
        return aReturn;
    }

    public void setaReturn(Return aReturn) {
        this.aReturn = aReturn;
    }

    public returnMaterialApp getApp() {
        return app;
    }

    public void setApp(returnMaterialApp app) {
        this.app = app;
    }

    public boolean isMaterial() {
        return isMaterial;
    }

    public void setMaterial(boolean material) {
        isMaterial = material;
    }

    @Override
    public String toString() {
        if (isMaterial()) {
            return "@override" + "\n" + "Widget" + " build" + "(" + "BuildContext context" + ")" + "{\n" + app + "\n}" + ",\n";
        } else {
            return "@override" + "\n" + "Widget" + " build" + "(" + "BuildContext context" + ")" + "{\n" + aReturn + "}" + ",";
        }
    }

    public String ToHTML() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();
        //htmlBuilder.append("<div>\n");
        //htmlBuilder.append("<span>@override</span>\n");
        //htmlBuilder.append("<span>Widget build(BuildContext context) {</span>\n");
        //htmlBuilder.append("<br>\n");
        if (isMaterial) {
            htmlBuilder.append(app.ToHTML());
        } else {
            htmlBuilder.append(aReturn.ToHTML());
        }
        //htmlBuilder.append("<span>}</span>\n");
        //htmlBuilder.append("</div>\n");
        return htmlBuilder.toString();
    }

}
