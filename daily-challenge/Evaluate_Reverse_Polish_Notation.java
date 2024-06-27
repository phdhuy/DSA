import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].matches("-?\\d+")) {
                stack.add(Integer.parseInt(tokens[i]));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                if (tokens[i].equals("+")) {
                    stack.add(b + a);
                } else if (tokens[i].equals("-")) {
                    stack.add(b - a);
                } else if (tokens[i].equals("*")) {
                    stack.add(b * a);
                } else {
                    stack.add(b / a);
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = { "3", "11", "+", "5", "-" };
        System.out.println(evalRPN(tokens));
    }
}
