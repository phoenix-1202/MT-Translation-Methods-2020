package generated;

import java.text.ParseException;


public class Parser {
    public final Lexer lex;
	

	public Parser(Lexer lex) {
		this.lex = lex;
	}

    public Node start() throws ParseException {
Node res = new Node("start");
switch (lex.curToken) {
case "NUMBER", "OB" -> {
Node $expr = expr();
res.addChild($expr);
System.out.println($expr.val);
}
default -> throw new ParseException("Unexpected token " + lex.curToken, lex.curPos);
}
return res;
}

public Node expr() throws ParseException {
Node res = new Node("expr");
switch (lex.curToken) {
case "NUMBER", "OB" -> {
Node $term = term();
res.addChild($term);
Node $exprP = exprP($term.val);
res.addChild($exprP);
res.val = $exprP.val;
}
default -> throw new ParseException("Unexpected token " + lex.curToken, lex.curPos);
}
return res;
}

public Node exprP(int i) throws ParseException {
Node res = new Node("exprP");
switch (lex.curToken) {
case "PLUS" -> {
Node $PLUS = new Node("PLUS", lex.curStr);
res.addChild($PLUS);
lex.nextToken();
Node $term = term();
res.addChild($term);
Node $exprP = exprP(i+$term.val);
res.addChild($exprP);
res.val=$exprP.val;
}
case "SUB" -> {
Node $SUB = new Node("SUB", lex.curStr);
res.addChild($SUB);
lex.nextToken();
Node $term = term();
res.addChild($term);
Node $exprP = exprP(i-$term.val);
res.addChild($exprP);
res.val=$exprP.val;
}
case "EOF", "CB" -> {
res.addChild(new Node("EPS"));
res.val=i;
}
default -> throw new ParseException("Unexpected token " + lex.curToken, lex.curPos);
}
return res;
}

public Node term() throws ParseException {
Node res = new Node("term");
switch (lex.curToken) {
case "NUMBER", "OB" -> {
Node $fact = fact();
res.addChild($fact);
Node $termP = termP($fact.val);
res.addChild($termP);
res.val = $termP.val;
}
default -> throw new ParseException("Unexpected token " + lex.curToken, lex.curPos);
}
return res;
}

public Node termP(int i) throws ParseException {
Node res = new Node("termP");
switch (lex.curToken) {
case "MUL" -> {
Node $MUL = new Node("MUL", lex.curStr);
res.addChild($MUL);
lex.nextToken();
Node $fact = fact();
res.addChild($fact);
Node $termP = termP(i*$fact.val);
res.addChild($termP);
res.val=$termP.val;
}
case "DIV" -> {
Node $DIV = new Node("DIV", lex.curStr);
res.addChild($DIV);
lex.nextToken();
Node $fact = fact();
res.addChild($fact);
Node $termP = termP(i/$fact.val);
res.addChild($termP);
res.val=$termP.val;
}
case "SUB", "EOF", "PLUS", "CB" -> {
res.addChild(new Node("EPS"));
res.val=i;
}
default -> throw new ParseException("Unexpected token " + lex.curToken, lex.curPos);
}
return res;
}

public Node fact() throws ParseException {
Node res = new Node("fact");
switch (lex.curToken) {
case "OB" -> {
Node $OB = new Node("OB", lex.curStr);
res.addChild($OB);
lex.nextToken();
Node $expr = expr();
res.addChild($expr);
Node $CB = new Node("CB", lex.curStr);
res.addChild($CB);
lex.nextToken();
Node $factorial = factorial($expr.val);
res.addChild($factorial);
res.val=$factorial.val;
}
case "NUMBER" -> {
Node $NUMBER = new Node("NUMBER", lex.curStr);
res.addChild($NUMBER);
lex.nextToken();
Node $factorial = factorial(Integer.parseInt($NUMBER.text));
res.addChild($factorial);
res.val=$factorial.val;
}
default -> throw new ParseException("Unexpected token " + lex.curToken, lex.curPos);
}
return res;
}

public Node factorial(int i) throws ParseException {
Node res = new Node("factorial");
switch (lex.curToken) {
case "FACTORIZE" -> {
Node $FACTORIZE = new Node("FACTORIZE", lex.curStr);
res.addChild($FACTORIZE);
lex.nextToken();
int k = i;for(int t=0;t<$FACTORIZE.text.length();t++){res.val=1;for(int j=2; j<=k; j++) res.val*=j;k=res.val;}
}
case "DIV", "SUB", "MUL", "EOF", "PLUS", "CB" -> {
res.addChild(new Node("EPS"));
res.val=i;
}
default -> throw new ParseException("Unexpected token " + lex.curToken, lex.curPos);
}
return res;
}



    public Node parse() throws ParseException {
        lex.nextToken();
        return start();
    }
}