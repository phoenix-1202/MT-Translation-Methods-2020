import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        GrammarLexer lexer = new GrammarLexer(CharStreams.fromString("""
                
                start : expr {:System.out.println($expr.val);:};
                                
                expr returns [int val] : term exprP[$term.val] {:$val = $exprP.val;:};
                exprP [int i] returns [int val] : EPS {:$val=i;:} | PLUS term exprP[i+$term.val] {:$val=$exprP.val;:} | SUB term exprP[i-$term.val] {:$val=$exprP.val;:};
                                
                term returns [int val] : fact termP[$fact.val] {:$val = $termP.val;:};
                termP[int i] returns [int val] : EPS {:$val=i;:} | MUL fact termP[i*$fact.val] {:$val=$termP.val;:} | DIV fact termP[i/$fact.val] {:$val=$termP.val;:};
                                              
                fact returns [int val] : OB expr CB factorial[$expr.val] {:$val=$factorial.val;:} | NUMBER factorial[Integer.parseInt($NUMBER.text)] {:$val=$factorial.val;:};
                factorial [int i] returns [int val] : EPS {:$val=i;:} | FACTORIZE {:int k = i;for(int t=0;t<$FACTORIZE.text.length();t++){$val=1;for(int j=2; j<=k; j++) $val*=j;k=$val;}:};
               
                NUMBER : [[[0-9]+]];
                FACTORIZE : [[[!]+]];
                PLUS : [[\\\\+]];
                MUL : [[\\\\*]];
                SUB : [[-]];
                DIV : [[/]];
                OB : [[\\\\(]];
                CB : [[\\\\)]];
                """));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree tree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MyListener(), tree);
    }
}
