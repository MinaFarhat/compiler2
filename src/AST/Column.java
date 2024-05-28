package AST;

import java.io.IOException;

public class Column extends Widget {
    private Children children = null;
    private columnProps props = null;

    public Column(Children children, columnProps props) {
        this.children = children;
        this.props = props;
    }

    public Column() {
    }

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    public columnProps getProps() {
        return props;
    }

    public void setProps(columnProps props) {
        this.props = props;
    }

    @Override
    public String toString() {
        if (props == null) {
            return "Column(\n" +
                    children + "\n" +
                    "),";
        } else if (children == null) {
            return "Column(\n" +
                    props + "\n" +
                    "),";
        } else if (children == null && props == null) {
            return "Column(),";
        } else {
            return "Column(\n" +
                    props + "\n" +
                    children + "\n" +
                    "),";
        }
    }

    public String ToHTML() throws IOException {
        if (props == null || props.getMalignment() == null) {
            return "<div style=\"display: flex; flex-direction: column;\">"+children.ToHTML()+"</div>";
        } else {
            String alignment = props.getMalignment().ToHTML();
            String justifyContent = "flex-start";
            String alignItems = "flex-start";

            switch (alignment) {
                case "center" -> {
                    justifyContent = "center";
                    alignItems = "center";
                }
                case "end" -> {
                    justifyContent = "flex-end";
                    alignItems = "flex-end";
                }
                case "start" -> {
                    justifyContent = "flex-start";
                    alignItems = "flex-start";
                }
            }

            return "<div style=\"display: flex; flex-direction: column; justify-content: "+ justifyContent +"; align-items: "+ alignItems +";\">"+children.ToHTML()+"</div>";
        }
    }


}
