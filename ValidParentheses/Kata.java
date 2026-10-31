package ValidParentheses;

import java.util.Stack;

public class Kata {

    public static boolean validParentheses(String parenStr) {
        Stack<Character> stack = new Stack<>();

        int count = 0;

        for (int i = 0; i < parenStr.length(); i++) {
            char ch = parenStr.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty())
                    return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
