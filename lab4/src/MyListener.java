import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MyListener extends GrammarBaseListener {

    public ArrayList<NonTerminalRule> nonTerminalRules = new ArrayList<>();
    public ArrayList<TerminalRule> terminalRules = new ArrayList<>();

    public HashMap<String, HashSet<String>> FIRST = new HashMap<>();
    public HashMap<String, HashSet<String>> FOLLOW = new HashMap<>();

    public HashSet<String> synthAttrs = new HashSet<>();

    public String header = "";
    public String members = "";

    public String startNonTerminalName = "";

    private int maxRuleLength = 0;

    @Override public void exitStart(GrammarParser.StartContext ctx) {
        for (var x : nonTerminalRules) {
            for (var y : x.opts) {
                int maxCurRuleLength = 0;
                for (var z : y)
                    if (z.type != 0)
                        maxCurRuleLength++;
                maxRuleLength = Math.max(maxCurRuleLength, maxRuleLength);
            }
            if (startNonTerminalName.isEmpty())
                startNonTerminalName = x.name;
            FIRST.put(x.name, new HashSet<>());
            FOLLOW.put(x.name, new HashSet<>());
        }

        boolean flag = true;
        while (flag) {
            flag = false;
            for (var x : nonTerminalRules) {
                for (var y : x.opts) {
                    for (var z : y) {
                        if (z.type == 2) {
                            int old_set_size = FIRST.get(x.name).size();
                            HashSet<String> new_set = FIRST.get(x.name);
                            new_set.add(z.name);
                            FIRST.replace(x.name, new_set);
                            if (new_set.size() != old_set_size)
                                flag = true;
                            if (!z.name.equals("EPS"))
                                break;
                        }
                        else if (z.type == 1) {
                            int old_set_size = FIRST.get(x.name).size();
                            HashSet<String> new_set = FIRST.get(x.name);
                            var st = FIRST.get(z.name);
                            new_set.addAll(st);
                            FIRST.replace(x.name, new_set);
                            if (new_set.size() != old_set_size)
                                flag = true;
                            if (!st.contains("EPS"))
                                break;
                        }
                    }
                }
            }
        }

        System.out.println("FIRST:\n");
        for (var x : FIRST.keySet()) {
            System.out.print(x + "  :  { ");
            for (var y : FIRST.get(x)) {
                System.out.print(y + " ");
            }
            System.out.println("}");
        }

        HashSet<String> s = new HashSet<>();
        s.add("EOF");
        FOLLOW.replace(startNonTerminalName, s);
        System.out.println("\n--------------------------\n");

        flag = true;
        while (flag) {
            flag = false;
            for (var x : nonTerminalRules) {
                for (var y : x.opts) {
                    var first_gamma = new HashSet<String>();
                    first_gamma.add("EPS");
                    ArrayList<Opt> yy = new ArrayList<>();
                    for (var z : y)
                        if (z.type != 0) yy.add(z);
                    for (int i = yy.size() - 1; i >= 0; i--) {
                        var z = yy.get(i);
                        if (z.type == 1) {
                            int old_set_size = FOLLOW.get(z.name).size();
                            HashSet<String> new_set = FOLLOW.get(z.name);
                            if (new_set.contains("EPS"))
                                new_set.addAll(first_gamma);
                            else {
                                new_set.addAll(first_gamma);
                                if (first_gamma.contains("EPS"))
                                    new_set.remove("EPS");
                            }
                            if (first_gamma.contains("EPS"))
                                new_set.addAll(FOLLOW.get(x.name));
                            FOLLOW.replace(z.name, new_set);
                            if (new_set.size() != old_set_size)
                                flag = true;
                        }
                        if (z.name.equals("EPS"))
                            first_gamma.add(z.name);
                        else if (z.type == 1 && FIRST.get(z.name).contains("EPS"))
                            first_gamma.addAll(FIRST.get(z.name));
                        else {
                            first_gamma.clear();
                            if (z.type == 1)
                                first_gamma.addAll(FIRST.get(z.name));
                            else first_gamma.add(z.name);
                        }
                    }
                }
            }
        }

        System.out.println("FOLLOW:\n");
        for (var x : FOLLOW.keySet()) {
            System.out.print(x + "  :  { ");
            for (var y : FOLLOW.get(x)) {
                System.out.print(y + " ");
            }
            System.out.println("}");
        }

        generateClassNode();
        generateClassLexer();
        generateClassParser();
        generateClassMain();
        System.out.println(maxRuleLength);
    }

    public void generateClassNode() {
        BufferedWriter writer;
        try {
            Path template = Path.of("NodeTemplate");
            writer = new BufferedWriter(new FileWriter("src/generated/Node.java"));
            StringBuilder attrs = new StringBuilder();
            HashSet<String> allAttrs = new HashSet<>();
            for (var x : nonTerminalRules) {
                String[] arr = x.synthArg.split("[,\\[\\]]");
                for (var xx : arr) {
                    String r = xx.trim();
                    if (!r.matches("\\s*")) {
                        allAttrs.add(r);
                        String[] str = r.split("\\s+");
                        synthAttrs.add(str[str.length - 1]);
                    }
                }
            }
            for (var x : allAttrs) {
                attrs.append(x).append(";\n");
            }
            writer.write(Files.readString(template).formatted(attrs.toString()));
            writer.close();
        } catch (Exception e) {
            System.err.println("Some problems while reading text from NodeTemplate or writing to file");
            System.err.println(e.getMessage());
        }
    }

    public void generateClassLexer() {
        BufferedWriter writer;
        try {
            Path template = Path.of("LexerTemplate");
            writer = new BufferedWriter(new FileWriter("src/generated/Lexer.java"));
            StringBuilder tokens = new StringBuilder();
            for (var x : terminalRules) {
                String regex = x.regex.substring(2, x.regex.length() - 2);
                tokens.append("tokens.put(\"").append(x.name).append("\", \"").append(regex).append("\");\n");
            }
            writer.write(Files.readString(template).formatted(tokens.toString()));
            writer.close();
        }
        catch (Exception e) {
            System.err.println("Some problems while reading text from LexerTemplate or writing to file");
            System.err.println(e.getMessage());
        }
    }

    public void generateClassParser() {
        BufferedWriter writer;
        try {
            Path template = Path.of("ParserTemplate");
            writer = new BufferedWriter(new FileWriter("src/generated/Parser.java"));
            StringBuilder methods = new StringBuilder();
            for (var x : nonTerminalRules) {
                StringBuilder method = new StringBuilder();
                String args = x.inhArg.isEmpty() ? "" : x.inhArg.substring(1, x.inhArg.length() - 1);
                method.append("public Node ").append(x.name).append("(").append(args).append(") throws ParseException {\n");
                method.append("Node res = new Node(\"").append(x.name).append("\");\n");
                method.append("switch (lex.curToken) {\n");
                boolean flag = false;
                StringBuilder epsCode = new StringBuilder();
                for (var y : x.opts) {
                    StringBuilder tokens = new StringBuilder();
                    HashSet<String> ts = new HashSet<>();
                    for (var z : y) {
                        if (z.type == 2) {
                            ts.add(z.name);
                            if (!z.name.equals("EPS"))
                                break;
                        } else if (z.type == 1) {
                            ts.addAll(FIRST.get(z.name));
                            if (!FIRST.get(z.name).contains("EPS"))
                                break;
                        }
                    }
                    int cnt = 0;
                    for (var t : ts) {
                        if (t.equals("EPS")) {
                            flag = true;
                            continue;
                        }
                        if (cnt != 0)
                            tokens.append(", ");
                        tokens.append("\"").append(t).append("\"");
                        cnt++;
                    }
                    if (tokens.isEmpty()) {
                        for (var z : y) {
                            if (z.type == 0) {
                                String code = z.name.substring(2, z.name.length() - 2);
                                for (var argName : synthAttrs)
                                    code = code.replace("$" + argName, "res." + argName);
                                epsCode.append(code).append("\n");
                            }
                        }
                        continue;
                    }
                    method.append("case ").append(tokens).append(" -> {\n");
                    for (var z : y) {
                        if (z.type == 1) {
                            String arg = z.arg.isEmpty() ? "" : z.arg.substring(1, z.arg.length() - 1);
                            method.append("Node $").append(z.name).append(" = ").append(z.name).append("(").append(arg).append(");\n");
                            method.append("res.addChild($").append(z.name).append(");\n");
                        } else if (z.type == 0) {
                            String code = z.name.substring(2, z.name.length() - 2);
                            for (var argName : synthAttrs) {
                                code = code.replace("$" + argName, "res." + argName);
                            }
                            method.append(code).append("\n");
                        } else {
                            method.append("Node $").append(z.name).append(" = new Node(\"").append(z.name).append("\", lex.curStr);\n");
                            method.append("res.addChild($").append(z.name).append(");\n");
                            method.append("lex.nextToken();\n");
                        }
                    }
                    method.append("}\n");
                }
                if (flag) {
                    StringBuilder tokens = new StringBuilder();
                    int cnt = 0;
                    for (var t : FOLLOW.get(x.name)) {
                        if (t.equals("EPS")) {
                            continue;
                        }
                        if (cnt != 0)
                            tokens.append(", ");
                        tokens.append("\"").append(t).append("\"");
                        cnt++;
                    }
                    method.append("case ").append(tokens).append(" -> {\n");
                    method.append("res.addChild(new Node(\"EPS\"));\n");
                    method.append(epsCode);
                    method.append("}\n");
                }
                method.append("default -> throw new ParseException(\"Unexpected token \" + lex.curToken, lex.curPos);\n");
                method.append("}\n");
                method.append("return res;\n}\n");
                methods.append(method).append("\n");
            }
            writer.write(Files.readString(template).formatted(header, members, methods.toString(), startNonTerminalName));
            writer.close();
        }
        catch (Exception e) {
            System.err.println("Some problems while reading text from ParserTemplate or writing to file");
            System.err.println(e.getMessage());
        }
    }

    public void generateClassMain() {
        BufferedWriter writer;
        try {
            Path template = Path.of("MainTemplate");
            writer = new BufferedWriter(new FileWriter("src/generated/Main.java"));
            writer.write(Files.readString(template).formatted(maxRuleLength));
            writer.close();
        }
        catch (Exception e) {
            System.err.println("Some problems while reading text from MainTemplate or writing to file");
            System.err.println(e.getMessage());
        }
    }

    @Override public void exitHeader(GrammarParser.HeaderContext ctx) {
        header = ctx.txt;
    }

    @Override
    public void exitNonTerminalRule(GrammarParser.NonTerminalRuleContext ctx) {
        nonTerminalRules.add(ctx.ntr);
    }

    @Override
    public void exitTerminalRule(GrammarParser.TerminalRuleContext ctx) {
        terminalRules.add(ctx.tr);
    }

    @Override public void exitMembers(GrammarParser.MembersContext ctx) {
        members = ctx.txt;
    }

}
