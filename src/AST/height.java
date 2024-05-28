package AST;

public class height {
    public double number;

    public height(double number) {
        this.number = number;
    }

    public height() {
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "height:" + number + ",";
    }

    public String ToHTML() {
        return "<div style=\"height: " + number + "px;\"></div>";
    }
}
