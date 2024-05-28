package AST;

import java.io.IOException;

public class Row  extends Widget{

        public Children children =null;

        public Row(Children children) {

            this.children = children;
        }


    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    @Override
    public String toString() {
            if (children!=null){
                return "Row(\n" +
                        "children:"+
                        children+
                        ");";
            }
       else {
                return "Row("+");";
            }
    }
    public String ToHTML() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<div style=\"display: flex; justify-content: center; align-items: center;\">");
        htmlBuilder.append(children.ToHTML());
        htmlBuilder.append("</div>");
        return htmlBuilder.toString();
    }


}


