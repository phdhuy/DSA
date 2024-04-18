import java.util.Stack;

public class Reverse_Words_in_a_String {
    public static String reverseWords(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        char[] arr = s.toCharArray();

        for (Character c : arr) {
            if (Character.isWhitespace(c)) {
                if (!stack.isEmpty() && !stack.peek().equals(' ')) {
                    stack.add(' ');
                }
            } else {
                stack.add(c);
            }
        }

        StringBuilder temp = new StringBuilder();
        boolean leadingSpace = true;

        while (!stack.empty()) {
            if (!Character.isWhitespace(stack.peek())) {
                temp.append(stack.pop());
                leadingSpace = false;
            } else {
                if (!leadingSpace) {
                    temp.reverse();
                    sb.append(temp);
                    sb.append(stack.pop());
                    temp = new StringBuilder();
                } else {
                    stack.pop();
                }
            }
        }

        temp.reverse();
        sb.append(temp);

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.print(reverseWords(s));
    }
}
