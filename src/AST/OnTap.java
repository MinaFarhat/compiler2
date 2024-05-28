package AST;

import java.io.IOException;

public class OnTap {
    private navigator nav = null;

    public OnTap(navigator nav) {
        this.nav = nav;
    }

    public navigator getNav() {
        return nav;
    }

    public void setNav(navigator nav) {
        this.nav = nav;
    }

    @Override
    public String toString() {
        if (getNav() == null) {
            return "onTap(){},\n";
        } else {
            return "onTap(){\n" + nav + "},\n";
        }
    }

    public String ToHTML() throws IOException {
        if (getNav() == null) {
            return "";
        } else {
            return nav.ToHTML();
        }
    }
}
