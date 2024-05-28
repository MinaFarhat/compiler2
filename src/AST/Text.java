package AST;

public class Text extends Widget {

    public String inputIntoText;

    public Text(String t) {
        this.inputIntoText = t;
    }

    public void setInputIntoText(String inputIntoText) {
        this.inputIntoText = inputIntoText;
    }

    public String getInputIntoText() {
        return inputIntoText;
    }

    @Override
    public String toString() {
        return "Text("+"\n"+"\'" +""+ inputIntoText + '\'' +"\n"+')' + ",\n";
    }

    public String ToHTML() {
        return "<div style=\"padding: 10px; margin: 10px; text-align: center;\">\n" +
                "    <span style=\"color: #333; font-size: 20px;\">" + inputIntoText + "</span>\n" +
                "</div>";
    }

}
