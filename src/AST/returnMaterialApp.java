package AST;

public class returnMaterialApp {
    private String name;
    private boolean isGet;
    private boolean isHome;

    public returnMaterialApp(String name, boolean isGet, boolean isHome) {
        this.name = name;
        this.isGet = isGet;
        this.isHome = isHome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGet() {
        return isGet;
    }

    public void setGet(boolean get) {
        isGet = get;
    }

    public boolean isHome() {
        return isHome;
    }

    public void setHome(boolean home) {
        isHome = home;
    }

    @Override
    public String toString() {
        if (isGet) {
            if (isHome) {
                return "return GetMaterialApp(" + "home" + ":" + name + "(" + ")" + ",\n)" + ",\n";
            } else {
                return "return GetMaterialApp()" + ",\n";
            }
        } else {
            if (isHome) {
                return "return MaterialApp(\n" + "home" + ":" + name + "(" + ")" + ",\n)" + ",";
            } else {
                return "return MaterialApp()" + ",\n";
            }
        }
    }
    public String ToHTML() {
        return "";
    }
}
