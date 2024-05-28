package AST;

import java.io.IOException;

public class navigator {
    private push pu = null;
    private pop po = null;
    private pushNamed named = null;

    public navigator(push pu, pop po, pushNamed named) {
        this.pu = pu;
        this.po = po;
        this.named = named;
    }

    public navigator() {
    }

    public push getPu() {
        return pu;
    }

    public void setPu(push pu) {
        this.pu = pu;
    }

    public pop getPo() {
        return po;
    }

    public void setPo(pop po) {
        this.po = po;
    }

    public pushNamed getNamed() {
        return named;
    }

    public void setNamed(pushNamed named) {
        this.named = named;
    }

    @Override
    public String toString() {
        if (pu == null && po == null) {
            return "Navigator." + named + "\n";
        } else if (pu == null && named == null) {
            return "Navigator." + po + "\n";
        } else {
            return "Navigator." + pu + "\n";
        }
    }

    public String ToHTML() throws IOException {
        StringBuilder html = new StringBuilder();

        if (pu != null) {
            html.append(pu.ToHTML());
        } else if (po != null) {
            html.append(po.ToHTML());
        } else if (named != null) {
            html.append(named.ToHTML());
        }

        return html.toString();
    }
}
