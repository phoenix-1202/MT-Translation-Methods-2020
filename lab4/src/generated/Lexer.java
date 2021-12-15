package generated;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Pattern;

public class Lexer {
    public final InputStream is;
    public int curChar;
    public int curPos;
    public String curToken;
    public String curStr;
    public final Map<String, String> tokens = new LinkedHashMap<>();

    public Lexer(InputStream is) throws ParseException {
        this.is = is;
        curPos = 0;
        nextChar();
        tokens.put("NUMBER", "[0-9]+");
tokens.put("FACTORIZE", "[!]+");
tokens.put("PLUS", "\\+");
tokens.put("MUL", "\\*");
tokens.put("SUB", "-");
tokens.put("DIV", "/");
tokens.put("OB", "\\(");
tokens.put("CB", "\\)");

    }

    private boolean isBlank(int c) {
        return Character.isWhitespace(c);
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = is.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }

    public void nextToken() throws ParseException {
        while (isBlank(curChar))
            nextChar();
        if (curChar == -1) {
            curToken = "EOF";
            curStr = "";
            return;
        }
        StringBuilder sb = new StringBuilder();
        String resTokenName = "";
        boolean flag;
        while (true) {
            sb.append((char) curChar);
            flag = false;
            for (var s : tokens.entrySet()) {
                Pattern p = Pattern.compile(s.getValue());
                if (p.matcher(sb.toString()).matches()) {
                    resTokenName = s.getKey();
                    flag = true;
                    break;
                }
            }
            nextChar();
            if (flag) break;
            if (curChar == -1)
                throw new ParseException("Unknown token " + sb.toString(), curPos);
        }

        while (true) {
			sb.append((char) curChar);
			flag = false;
			for (var s : tokens.entrySet()) {
				Pattern p = Pattern.compile(s.getValue());
				if (p.matcher(sb.toString()).matches()) {
					resTokenName = s.getKey();
					flag = true;
					break;
				}
			}
			if (!flag) {
				sb.deleteCharAt(sb.length() - 1);
				break;
			}
			nextChar();
		}

        curToken = resTokenName;
        curStr = sb.toString();
    }
}