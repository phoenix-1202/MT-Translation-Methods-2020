import java.util.ArrayList;

public class NonTerminalRule {
    public String name;
    public String inhArg = "";
    public String synthArg = "";
    public ArrayList<ArrayList<Opt>> opts;

    NonTerminalRule(String n) {
        name = n;
    }
}
