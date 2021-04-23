package com.antlr;

import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MyListener extends HaskellBaseListener {

    private final Map<String, String> argsNames = new HashMap<>();
    private String functionName;
    private final Stack<String> curOp = new Stack<>();
    private final Stack<Integer> argsCounts = new Stack<>();
    private final BufferedWriter writer;
    private int conditionDepth = 0;

    MyListener(String filename) throws Exception {
        writer = new BufferedWriter(new FileWriter(filename));
    }

    @Override public void enterStart(HaskellParser.StartContext ctx) {
        try {
            writer.write("#include <bits/stdc++.h>;\nusing namespace std;\n\n");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void exitStart(HaskellParser.StartContext ctx) {
        try {
            writer.write("//EXIT");
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void exitFunction(HaskellParser.FunctionContext ctx) {
        try {
            writer.write("\n}\n\n");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        functionName = "";
    }

    @Override public void enterDeclaration(HaskellParser.DeclarationContext ctx) {
        try {
            switch (ctx.getChild(3).getText()) {
                case "Int" -> writer.write("int");
                case "Integer" -> writer.write("long long");
                case "Double" -> writer.write("double");
                case "String" -> writer.write("string");
                case "Bool" -> writer.write("bool");
                default -> writer.write(ctx.getChild(3).getText());
            }
            functionName = ctx.getChild(0).getText();
            writer.write(" " + functionName + "(");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void exitDeclaration(HaskellParser.DeclarationContext ctx) {
        try {
            writer.write(") {\n");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void enterTypes(HaskellParser.TypesContext ctx) {
        try {
            int i = 0;
            if (ctx.children != null) {
                for (ParseTree x : ctx.children) {
                    if (i % 2 == 0) {
                        if (i != 0)
                            writer.write(", ");
                        switch (x.getText()) {
                            case "Int" -> writer.write("int arg" + (i / 2 + 1));
                            case "Integer" -> writer.write("long long arg" + (i / 2 + 1));
                            case "Double" -> writer.write("double arg" + (i / 2 + 1));
                            case "String" -> writer.write("string arg" + (i / 2 + 1));
                            case "Bool" -> writer.write("bool arg" + (i / 2 + 1));
                            default -> writer.write(x.getText() + " arg" + (i / 2 + 1));
                        }
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void enterMyCase(HaskellParser.MyCaseContext ctx) {
        if (!functionName.equals(ctx.getChild(0).getText())) {
            throw new RuntimeException("Incorrect function name, expected " + functionName);
        }
    }

    @Override public void exitMyCase(HaskellParser.MyCaseContext ctx) {
        argsNames.clear();
    }

    @Override public void enterCaseStructure(HaskellParser.CaseStructureContext ctx) {
        try {
            if (ctx.getChild(0).getText().equals("|")) {
                writer.write("if ");
            } else {
                if (ctx.children.size() == 2) {
                    writer.write("return ");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void exitCaseStructure(HaskellParser.CaseStructureContext ctx) {
        try {
            if (!ctx.getChild(0).getText().equals("|")) {
                if (ctx.children.size() == 2) {
                    writer.write(";");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void enterResult(HaskellParser.ResultContext ctx) {
        try {
            writer.write(" {\nreturn ");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void exitResult(HaskellParser.ResultContext ctx) {
        try {
            writer.write(";\n}\n");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void enterArgs(HaskellParser.ArgsContext ctx) {
        int i = 1;
        if (ctx.children != null) {
            for (ParseTree x : ctx.children) {
                if (argsNames.containsKey(x.getText())) {
                    throw new RuntimeException("we have already got this argument: " + x.getText());
                }
                String name = "arg" + i;
                argsNames.put(x.getText(), name);
                i++;
            }
        }
    }

    @Override public void enterCondition(HaskellParser.ConditionContext ctx) {
        try {
            if (ctx.LOGIC_OP() != null || conditionDepth == 0)
                writer.write("(");
            if (ctx.LOGIC_OP() != null)
                curOp.push(ctx.LOGIC_OP().getText());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        conditionDepth++;
    }

    @Override public void exitCondition(HaskellParser.ConditionContext ctx) {
        try {
            if (ctx.LOGIC_OP() != null || conditionDepth == 1) {
                writer.write(")");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        conditionDepth--;
    }

    @Override public void enterRestCondition(HaskellParser.RestConditionContext ctx) {
        try {
            if (!curOp.empty()) {
                writer.write(" " + curOp.peek() + " ");
                curOp.pop();
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void enterLogicExpression(HaskellParser.LogicExpressionContext ctx) {
        try {
            if (ctx.COMPARE_OP() != null) {
                writer.write("(");
                curOp.push(ctx.COMPARE_OP().getText());
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void exitLogicExpression(HaskellParser.LogicExpressionContext ctx) {
        try {
            if (ctx.COMPARE_OP() != null) {
                writer.write(")");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void enterExpression(HaskellParser.ExpressionContext ctx) {
        try {
            if (ctx.OP() != null)
                writer.write("(");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        if (ctx.OP() != null) {
            if (ctx.OP().getText().equals("`mod`"))
                curOp.push("%");
            else curOp.push(ctx.OP().getText());
        }
    }

    @Override public void exitExpression(HaskellParser.ExpressionContext ctx) {
        try {
            if (ctx.OP() != null)
                writer.write(")");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void enterRestExpression(HaskellParser.RestExpressionContext ctx) {
        try {
            if (!curOp.empty()) {
                writer.write(" " + curOp.peek() + " ");
                curOp.pop();
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void enterCallFunction(HaskellParser.CallFunctionContext ctx) {
        try {
            writer.write(ctx.getChild(1).getText() + "(");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        argsCounts.push(0);
    }

    @Override public void exitCallFunction(HaskellParser.CallFunctionContext ctx) {
        try {
            writer.write(")");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        if (!argsCounts.empty()) argsCounts.pop();
    }

    @Override public void enterArgsExpression(HaskellParser.ArgsExpressionContext ctx) {
        try {
            if (!argsCounts.empty()) {
                if (argsCounts.peek() != 0)
                    writer.write(", ");
                else {
                    int newCnt = argsCounts.peek() + 1;
                    argsCounts.pop();
                    argsCounts.push(newCnt);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void enterData(HaskellParser.DataContext ctx) {
        try {
            if (argsNames.containsKey(ctx.getText()))
                writer.write(argsNames.get(ctx.getText()));
            else if (ctx.NUMBER() != null)
                writer.write(ctx.getText());
            else if (ctx.getText().equals("true") || ctx.getText().equals("false"))
                writer.write(ctx.getText());
            else
                throw new RuntimeException("Incorrect argument " + ctx.getText() + ", expected name from arguments");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void enterMyIf(HaskellParser.MyIfContext ctx) {
        try {
            writer.write("if ");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void enterMyThen(HaskellParser.MyThenContext ctx) {
        try {
            writer.write(" {\nreturn ");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void exitMyThen(HaskellParser.MyThenContext ctx) {
        try {
            writer.write(";\n}");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void enterMyElse(HaskellParser.MyElseContext ctx) {
        try {
            writer.write("\nelse {\nreturn ");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override public void exitMyElse(HaskellParser.MyElseContext ctx) {
        try {
            writer.write(";\n}");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
