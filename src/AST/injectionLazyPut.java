package AST;

import java.io.IOException;
import java.util.AbstractList;

public class injectionLazyPut {
    public injectionLazyPut(AST.newScreen newScreen) {
        this.newScreen = newScreen;
    }

    public AST.newScreen getNewScreen() {
        return newScreen;
    }

    public void setNewScreen(AST.newScreen newScreen) {
        this.newScreen = newScreen;
    }

    newScreen newScreen;
public injectionLazyPut(){}
    public String ToHTML() throws IOException {
        if (newScreen == null) {

            return "";
        } else {
            return newScreen.ToHTML();
        }
    }

}
