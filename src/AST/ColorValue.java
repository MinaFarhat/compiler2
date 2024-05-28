package AST;

public class ColorValue {
    private int red;
    private int green;
    private int blue;
    private double opacity;

    public ColorValue(int red, int green, int blue, double opacity) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.opacity = opacity;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public double getOpacity() {
        return opacity;
    }

    @Override
    public String toString() {
        return "ColorValue: Red=" + red + ", Green=" + green + ", Blue=" + blue + ", Opacity=" + opacity + "\n";
    }

    public String ToHTML() {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<span>ColorValue: Red=").append(red).append(", Green=").append(green).append(", Blue=").append(blue).append(", Opacity=").append(opacity).append("</span>\n");
        htmlBuilder.append("<span style=\"background-color: ").append(ToCSS().ToCSS()).append(";\">&nbsp;</span>\n");
        return htmlBuilder.toString();
    }

    public ColorValue ToCSS() {
        return new ColorValue(red, green, blue, opacity);
    }
}
