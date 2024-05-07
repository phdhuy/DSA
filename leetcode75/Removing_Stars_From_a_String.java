import java.util.Stack;

public class Removing_Stars_From_a_String {
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for(char c : arr) {
            if(c == '*') {
                stack.pop();
            } else {
                stack.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();

        while(!stack.empty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String str = "leet**cod*e";
        System.out.println(removeStars(str));
    }

}
