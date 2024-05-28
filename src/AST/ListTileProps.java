package AST;

import java.io.IOException;

public class ListTileProps {
    private Widget leading;
    private Widget title;
    private Widget subtitle;
    private Widget trailing;

    public ListTileProps(Widget leading, Widget title, Widget subtitle, Widget trailing) {
        this.leading = leading;
        this.title = title;
        this.subtitle = subtitle;
        this.trailing = trailing;
    }

    public Widget getLeading() {
        return leading;
    }

    public Widget getTitle() {
        return title;
    }

    public Widget getSubtitle() {
        return subtitle;
    }

    public Widget getTrailing() {
        return trailing;
    }

    @Override
    public String toString() {
        return "ListTilePropsNode: \n"
                + "Leading: " + leading + "\n"
                + "Title: " + title + "\n"
                + "Subtitle: " + subtitle + "\n"
                + "Trailing: " + trailing;
    }

    public String ToHTML() throws IOException {
        String leadingHTML = (leading != null) ? leading.ToHTML() : "";
        String titleHTML = (title != null) ? title.ToHTML() : "";
        String subtitleHTML = (subtitle != null) ? subtitle.ToHTML() : "";
        String trailingHTML = (trailing != null) ? trailing.ToHTML() : "";

        return "<div class=\"list-tile-props\">\n"
                + "<div class=\"leading\">" + leadingHTML + "</div>\n"
                + "<div class=\"title\">" + titleHTML + "</div>\n"
                + "<div class=\"subtitle\">" + subtitleHTML + "</div>\n"
                + "<div class=\"trailing\">" + trailingHTML + "</div>\n"
                + "</div>";
    }
}
