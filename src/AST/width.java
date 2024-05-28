package AST;

public class width {
    double number;
    public width(double number){
        this.number=number;
    }
    width(){}

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "width:"+number+",";
    }

    public String ToHTML() {
        return "<div style=\"width: " + number + "px;\"></div>";
    }
}
