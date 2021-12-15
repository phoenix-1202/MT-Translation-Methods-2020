package generated;

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    private static StringBuilder STRING_RESULT;

    static void print(Node node, long counter) {
        if (counter == 1)
            STRING_RESULT = new StringBuilder();
        STRING_RESULT.append("a").append(counter).append(" [label=\"").append(node.type);
        if (node.text != null)
            STRING_RESULT.append(": ").append(node.text);
        STRING_RESULT.append("\"];\n");
        for (int i = 0; i < node.children.size(); i++) {
            long newIdx = counter * 4 + i;
            print(node.children.get(i), newIdx);
            STRING_RESULT.append("a").append(counter).append(" -- a").append(newIdx).append(";\n");
        }
    }

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        int i = 0;
        while (true) {
            i++;
            String testStr = "";
            try {
                Path test = Path.of("test/" + args[0] + "/" + i + ".in");
                testStr = Files.readString(test);
            } catch (Exception e) {
                System.out.println(TEXT_CYAN + "All test from \"test/" + args[0] + "\" completed! Now you can build trees from .dot files." + TEXT_RESET);
                System.exit(0);
            }
            try {
                Lexer lexer = new Lexer(new ByteArrayInputStream(testStr.getBytes(StandardCharsets.UTF_8)));;
                Parser parser = new Parser(lexer);
                Node ans = parser.parse();
                print(ans, 1);
                FileWriter writer = new FileWriter("test/" + args[0] + "/" + i + ".dot");
                writer.write("graph example {\n");
                writer.write(STRING_RESULT.toString());
                writer.write("}");
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
