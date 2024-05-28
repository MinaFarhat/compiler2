package AST;

import java.io.IOException;

public class push {
    private materialPageRoute route;

    public push(materialPageRoute route) {
        this.route = route;
    }

    public push() {}

    public materialPageRoute getRoute() {
        return route;
    }

    public void setRoute(materialPageRoute route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "push(context, " + route + "),";
    }

    public String ToHTML() throws IOException {
        return  route.ToHTML();
    }
}
