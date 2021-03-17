#include <iostream>
#include <string>
#include <utility>
#include <vector>
#include <fstream>
#include "Colors.h"

using namespace std;

/// Sorry, I'm a crazy fat kitty
/// So I'll write all code at this one file

/// My exception

struct ParseException : public exception {
    string message;
    explicit ParseException(string s) : message(std::move(s)) {}

    const char* what () const noexcept override {
        return message.c_str();
    }
};

/// Enum Token; EPS and $ (END) also here

enum Token {
    EPS, FUN, NAME, TYPE, OB, CB, COMMA, COLON, END
};

/// Lexical Analyzer - in the best traditions

struct LexicalAnalyzer {
    string str;
    int curPos;
    int curChar{};
    Token curToken;
    int strSize;

    explicit LexicalAnalyzer(string& s) : str(s) {
        curPos = 0;
        curToken = EPS;
        strSize = str.size();
        nextChar();
    }

    void nextChar() {
        if (curPos > strSize)
            throw ParseException("String index out of range");
        if (curPos == strSize)
            curChar = -1;
        else
            curChar = (int)(unsigned char)(str[curPos++]);
    }

    static bool isBlank (int c) {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    void nextToken() {
        while (isBlank(curChar))
            nextChar();
        if (curChar == -1) {
            curToken = END;
            str = "";
            return;
        }
        if (curChar == '(') {
            curToken = OB;
            str = "(";
            nextChar();
            return;
        }
        if (curChar == ')') {
            curToken = CB;
            str = ")";
            nextChar();
            return;
        }
        if (curChar == ':') {
            curToken = COLON;
            str = ":";
            nextChar();
            return;
        }
        if (curChar == ',') {
            curToken = COMMA;
            str = ",";
            nextChar();
            return;
        }
        if (isdigit(curChar)) {
            string message = "No one token can start from digit. Illegal character ";
            message += (char) curChar;
            message += " at pos " + to_string(curPos);
            throw ParseException(message);
        }
        if (!isalpha(curChar) && curChar != '_') {
            string message = "Illegal character ";
            message += (char) curChar;
            message += " at pos " + to_string(curPos);
            throw ParseException(message);
        }
        string word;
        int pos = curPos;
        while (isalnum(curChar) || curChar == '_') {
            word += (char)curChar;
            nextChar();
        }
        if (word == "fun") {
            curToken = FUN;
            str = "fun";
            return;
        }
        if (curToken == COLON) {
            if (islower(word[0]) || word[0] == '_') {
                string message = "Type cannot start from lowercase or _. Illegal character ";
                message += word[0];
                message += " at pos " + to_string(pos);
                throw ParseException(message);
            }
            curToken = TYPE;
            str = word;
            return;
        }
        curToken = NAME;
        str = word;
    }
};


/// Struct Node - parse Tree

string STRING_RESULT;

struct Node {
    string name;
    vector<Node*> children;

    explicit Node(string n) : name(std::move(n)) {}
    Node(string n, vector<Node*>& v) : name(std::move(n)), children(v) {}

    void print(int counter) {
        if (counter == 1)
            STRING_RESULT = "";
        STRING_RESULT += "a" + to_string(counter) + " [label=\"" + name + "\"];\n";
        for (int i = 0; i < children.size(); i++) {
            children[i]->print(counter * 3 + i);
            STRING_RESULT += "a" + to_string(counter) + " -- a" + to_string(counter * 3 + i) + ";\n";
        }
    }

    string toString() {
        if (name == "fun")
            return "fun " + children[0]->toString() + "(" + children[1]->toString() + "): " + children[2]->toString();
        else if (name == "eps")
            return "";
        else if (name == "args")
            return children[0]->toString();
        else if (name == "vars")
            return children[0]->toString() + children[1]->toString();
        else if (name == "rest_vars")
            return ", " + children[0]->toString() + children[1]->toString();
        else
            return name;
    }
};

/// Struct Parser - the main part of the task

struct Parser {
    LexicalAnalyzer* lex;

    Node* FunName() const {
        int pos = lex->curPos;
        if (lex->curToken != NAME) {
            string message = "Assertion error: expected function name, found ";
            message += lex->str[0];
            message += " at pos ";
            message += to_string(pos);
            throw ParseException(message);
        }
        return new Node(lex->str);
    }

    Node* Var() const {
        int pos = lex->curPos;
        if (lex->curToken != NAME) {
            string message = "Assertion error: expected argument's name, found ";
            message += lex->str[0];
            message += " at pos ";
            message += to_string(pos);
            throw ParseException(message);
        }
        string res = lex->str;
        pos = lex->curPos;
        lex->nextToken();
        if (lex->curToken != COLON) {
            string message = "Assertion error: expected colon before argument's type, found ";
            message += lex->str[0];
            message += " at pos ";
            message += to_string(pos);
            throw ParseException(message);
        }
        pos = lex->curPos;
        lex->nextToken();
        if (lex->curToken != TYPE) {
            string message = "Assertion error: expected argument's type, found ";
            message += lex->str[0];
            message += " at pos ";
            message += to_string(pos);
            throw ParseException(message);
        }
        res += ": " + lex->str;
        return new Node(res);
    }

    Node* RestVars() const {
        int pos = lex->curPos;
        if (lex->curToken != COMMA) {
            string message = "Assertion error: expected comma for rest arguments, found ";
            message += lex->str[0];
            message += " at pos ";
            message += to_string(pos);
            throw ParseException(message);
        }
        lex->nextToken();
        Node* var = Var();
        lex->nextToken();
        if (lex->curToken == CB) {
            vector<Node*> v;
            v.emplace_back(var);
            v.emplace_back(new Node("eps"));
            return new Node("rest_vars", v);
        }
        Node* restVars = RestVars();
        vector<Node*> v;
        v.emplace_back(var);
        v.emplace_back(restVars);
        return new Node("rest_vars", v);
    }

    Node* Vars() const {
        Node* var = Var();
        lex->nextToken();
        if (lex->curToken == CB) {
            vector<Node*> v;
            v.emplace_back(var);
            v.emplace_back(new Node("eps"));
            return new Node("vars", v);
        }
        Node* restVars = RestVars();
        vector<Node*> v;
        v.emplace_back(var);
        v.emplace_back(restVars);
        return new Node("vars", v);
    }

    Node* Args() const {
        int pos = lex->curPos;
        if (lex->curToken != OB) {
            string message = "Assertion error: expected (, found ";
            message += lex->str[0];
            message += " at pos ";
            message += to_string(pos);
            throw ParseException(message);
        }
        lex->nextToken();
        if (lex->curToken == CB) {
            Node* eps = new Node("eps");
            vector<Node*> v;
            v.emplace_back(eps);
            return new Node("args", v);
        }
        Node* vars = Vars();
        vector<Node*> v;
        v.emplace_back(vars);
        return new Node("args", v);
    }

    Node* FunType() const {
        int pos = lex->curPos;
        if (lex->curToken != COLON && lex->curToken != END) {
            string message = "Assertion error: expected colon or end of input, found ";
            message += lex->str[0];
            message += " at pos " + to_string(pos);
            throw ParseException(message);
        }
        if (lex->curToken == END)
            return new Node("Unit");
        pos = lex->curPos;
        lex->nextToken();
        if (lex->curToken != TYPE) {
            string message = "Assertion error: expected type, found ";
            message += lex->str[0];
            message += " at pos " + to_string(pos);
            throw ParseException(message);
        }
        return new Node(lex->str);
    }

    Node* Function() const {
        if (lex->curToken != FUN)
            throw ParseException("Assertion error: declaration must start from \"fun\"");
        lex->nextToken();
        Node* funName = FunName();
        lex->nextToken();
        Node* args = Args();
        lex->nextToken();
        Node* type = FunType();
        int pos = lex->curPos;
        lex->nextToken();
        if (lex->curToken != END) {
            string message = "Assertion error: expected end of input, found ";
            message += lex->str[0];
            message += " at pos " + to_string(pos);
            throw ParseException(message);
        }
        vector<Node*> v;
        v.emplace_back(funName);
        v.emplace_back(args);
        v.emplace_back(type);
        return new Node("fun", v);
    }

    Node* parse(string& s) {
        lex = new LexicalAnalyzer(s) ;
        lex->nextToken();
        return Function();
    }
};


/// Test part

const int TEST_COUNT = 15;

void Tests() {
    for (int i = 0; i < TEST_COUNT; i++) {
        string infileName = "/home/phoenix/CLionProjects/MT/lab2/test/" + to_string(i + 1) + ".in";
        string outfileName = "/home/phoenix/CLionProjects/MT/lab2/test/" + to_string(i + 1) + ".out";
        ifstream infile(infileName.c_str());
        string input;
        string s;
        while (getline(infile, s)) {
            if (!input.empty())
                input += "\n";
            input += s;
        }
        infile.close();
        Parser parser{};
        try {
            Node* node = parser.parse(input);
            STRING_RESULT = node->toString();
        } catch (exception& e) {
            STRING_RESULT = e.what();
        }
        ifstream outfile(outfileName.c_str());
        string output;
        while (getline(outfile, s)) {
            if (!output.empty())
                output += "\n";
            output += s;
        }
        outfile.close();
        cout << input << "\n";
        cout << STRING_RESULT << "\n";
        if (output != STRING_RESULT) {
            cerr << "Test #" << i + 1 << " failed";
            exit(1);
        }
        else
            cout << FGRN("Test #" + to_string(i + 1) + " passed\n");
    }
    cout << "\n";
    cout << FCYN("CONGRATS! ALL TEST PASSED\n");
}

int main() {
    Tests();
    return 0;
}
