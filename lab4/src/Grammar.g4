grammar Grammar;

/*
@header {import java.io.*;import java.lang;}

@members {private List<Integer> x = new ArrayList<>();}

nonTerminal [int val] returns [int curSum] : {int temp = val;} a b {$curSum += $a.val * $b.val} C {} | something;
TERMINAL : [[[a-z]]];
*/

start : header? members? rules EOF;
header returns [String txt] : '@header' JAVA_CODE {$txt = $JAVA_CODE.text;};
members returns [String txt] : '@members' JAVA_CODE {$txt = $JAVA_CODE.text;};

rules : rulex+;
rulex : nonTerminalRule | terminalRule;
nonTerminalRule returns [NonTerminalRule ntr]: NON_TERMINAL_NAME
                                               {$ntr = new NonTerminalRule($NON_TERMINAL_NAME.text);}
                                               (ARG {$ntr.inhArg = $ARG.text;})?
                                               ('returns' ARG {$ntr.synthArg = $ARG.text;})?
                                               ':'
                                               opts {$ntr.opts = $opts.optionals;}
                                               ';';
terminalRule returns [TerminalRule tr] : TERMINAL_NAME ':' REGEX ';' {$tr = new TerminalRule($TERMINAL_NAME.text, $REGEX.text);};

opts returns [ArrayList<ArrayList<Opt>> optionals] : {$optionals = new ArrayList<>();}
                                                     opt {$optionals.add($opt.lst);}
                                                     ('|' opt {$optionals.add($opt.lst);})*;
opt returns [ArrayList<Opt> lst] : {$lst = new ArrayList<>();}
                                   ({Opt o;} (JAVA_CODE {o = new Opt($JAVA_CODE.text, 0);}
                                            | NON_TERMINAL_NAME {o = new Opt($NON_TERMINAL_NAME.text, 1);}
                                              (ARG {o.arg = $ARG.text;})?
                                            | TERMINAL_NAME {o = new Opt($TERMINAL_NAME.text, 2);})
                                    {$lst.add(o);})+;

ARG : '[' .+? ']';
JAVA_CODE : '{:' .+? ':}';
NON_TERMINAL_NAME : [a-z][a-zA-Z0-9_]*;
TERMINAL_NAME : [A-Z][a-zA-Z0-9_]*;
REGEX : '[[' .+? ']]';
WS : [ \t\n\r] -> skip;
