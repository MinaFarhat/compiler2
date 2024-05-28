package AST;

public class columnProps {
    private mainAxisAligment malignment = null;
    private crossAxisAligment calignment = null;

    public columnProps(mainAxisAligment malignment, crossAxisAligment calignment) {
        this.malignment = malignment;
        this.calignment = calignment;
    }

    public columnProps() {
    }

    public mainAxisAligment getMalignment() {
        return malignment;
    }

    public void setMalignment(mainAxisAligment malignment) {
        this.malignment = malignment;
    }

    public crossAxisAligment getCalignment() {
        return calignment;
    }

    public void setCalignment(crossAxisAligment calignment) {
        this.calignment = calignment;
    }

    @Override
    public String toString() {
        if (calignment == null) {
            return "mainAxisAlignment: " + malignment;
        } else if (malignment == null) {
            return "crossAxisAlignment: " + calignment;
        } else {
            return "mainAxisAlignment: " + malignment + "\n" +
                    "crossAxisAlignment: " + calignment;
        }
    }

    public String ToHTML() {
        StringBuilder htmlBuilder = new StringBuilder();
       // htmlBuilder.append("<p>Column Props:</p>\n");
        //htmlBuilder.append("<ul>\n");
        if (malignment != null) {
            htmlBuilder.append(malignment.ToHTML());
        }
        if (calignment != null) {
            htmlBuilder.append(calignment.ToHTML());
        }
        //htmlBuilder.append("</ul>\n");
        return htmlBuilder.toString();
    }
}
