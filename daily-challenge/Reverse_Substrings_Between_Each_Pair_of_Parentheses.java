import java.util.Stack;

public class Reverse_Substrings_Between_Each_Pair_of_Parentheses {
    public static String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder currentString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(currentString);
                currentString = new StringBuilder();
            } else if (c == ')') {
                currentString.reverse();
                currentString = stack.pop().append(currentString);
            } else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        String s = "(ed(et(oc))el)";
        System.out.println(reverseParentheses(s));
    }
}
