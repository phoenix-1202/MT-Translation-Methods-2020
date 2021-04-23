grammar Haskell;

start : (function)*;

function : declaration body;
declaration : (NAME | TYPE) DOUBLE_COLON types TYPE;
types : (TYPE ARROW)*;
body : myCase+;
myCase : (NAME | TYPE) args caseStructure;
caseStructure : STICK condition result | EQ myIf myThen myElse | EQ expression;
result : EQ expression;
args : NAME*;

condition : logicExpression | LOGIC_OP condition restCondition | condition LOGIC_OP restCondition | OB condition CB;
restCondition : condition;
logicExpression : expression | COMPARE_OP expression restExpression | expression COMPARE_OP restExpression | OB expression CB;

expression : data | OP expression restExpression | expression OP restExpression | OB expression CB | callFunction;
restExpression : expression;
callFunction: OB (NAME | TYPE) (argsExpression | NO_ARGS) CB;
argsExpression : expression | expression argsExpression;
data : NUMBER | NAME;

myIf : 'if' condition;
myThen : 'then' expression;
myElse : 'else' expression;

NO_ARGS : '_';
LOGIC_OP : '||' | '&&';
COMPARE_OP : '<' | '<=' | '>' | '>=' | '==' | '/=';
OP : '+' | '-' | '/' | '`mod`' | '*';
OB : '(';
CB : ')';
NUMBER : [1-9][0-9]* | '0' | [1-9][0-9]* '.' [0-9]+ | '0.' [0-9]+;
NAME : [a-z][a-zA-Z0-9]*;
TYPE : [A-Z][a-zA-Z0-9]*;
DOUBLE_COLON : '::';
ARROW : '->';
EQ : '=';
STICK : '|';
WS : [ \t\n\r]+ -> skip;