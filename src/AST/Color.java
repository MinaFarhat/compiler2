package AST;

public class Color {
    private ColorValue colorValue;

    public Color(ColorValue colorValue) {
        this.colorValue = colorValue;
    }

    public ColorValue getColorValue() {
        return colorValue;
    }

    @Override
    public String toString() {
        return "Color: " + colorValue.toString();
    }

    public String ToHTML() {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<div>\n");
        htmlBuilder.append("<span>Color: </span>\n");
        htmlBuilder.append("<span style=\"background-color: rgba(")
                .append(colorValue.getRed()).append(", ")
                .append(colorValue.getGreen()).append(", ")
                .append(colorValue.getBlue()).append(", ")
                .append(colorValue.getOpacity()).append(");\"></span>\n");
        htmlBuilder.append("</div>\n");
        return htmlBuilder.toString();
    }

}
