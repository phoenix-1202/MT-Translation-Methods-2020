package com.antlr;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_CYAN = "\u001B[36m";

    public static void main(String[] args)
    {
        for (int i = 1; i <= 12; i++) {
            BufferedReader reader;
            String message = "";
            boolean globalFlag = false;
            try {
                reader = new BufferedReader(new FileReader("test/" + i + ".in"));
                StringBuilder code = new StringBuilder();
                while (true) {
                    code.append("\n");
                    String line = reader.readLine();
                    if (line == null)
                        break;
                    if (!line.equals(""))
                        code.append(line);
                }
                System.out.println(code);
                reader.close();
                HaskellLexer lexer = new HaskellLexer(CharStreams.fromString(code.toString()));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                HaskellParser parser = new HaskellParser(tokens);
                ParseTree tree = parser.start();
                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(new MyListener("code.cpp"), tree);
            } catch (Exception e) {
                globalFlag = true;
                message = e.getMessage();
            }
            try {
                BufferedReader reader1 = new BufferedReader(new FileReader("test/" + i + ".out"));
                BufferedReader reader2 = new BufferedReader(new FileReader("code.cpp"));
                boolean flag = true;
                if (globalFlag) {
                    flag = message.equals(reader1.readLine());
                }
                else {
                    while (true) {
                        try {
                            String line1 = reader1.readLine();
                            String line2 = reader2.readLine();
                            if (line1 == null && line2 == null)
                                break;
                            if (line1 == null || !line1.equals(line2)) {
                                flag = false;
                                break;
                            }
                        } catch (Exception e) {
                            flag = false;
                            break;
                        }
                    }
                }
                reader1.close();
                reader2.close();
                if (!flag) {
                    System.err.println("Test #" + i + " failed");
                    return;
                }
                else {
                    System.out.println(TEXT_GREEN + "Test #" + i + " passed" + TEXT_RESET);
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
                return;
            }
        }
        System.out.println("\n" + TEXT_CYAN + "CONGRATULATIONS! ALL TESTS PASSED" + TEXT_RESET);
    }
}
