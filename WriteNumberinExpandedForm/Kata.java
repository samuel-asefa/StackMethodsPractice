package WriteNumberinExpandedForm;

import java.util.Stack;

public class Kata {
    public static String expandedForm(int num) {
        Stack<Integer> stack = new Stack<>();
        int multiplier = 1;

        while (num > 0) {
            int digit = num % 10;
            if (digit != 0) {
                stack.push(digit * multiplier);
            }
            multiplier *= 10;
            num /= 10;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(" + ");
            }
        }

        return result.toString();
    }
}