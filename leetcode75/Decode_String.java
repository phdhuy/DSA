import java.util.Stack;

public class Decode_String {
    public static String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> st1 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = Integer.parseInt(c.toString());
            } else if (c == '[') {
                st.push(n);
                n = 0;
                st1.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int k = st.pop();
                StringBuilder temp = sb;
                sb = st1.pop();
                while (k-- > 0) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }                                                   

    public static void main(String[] args) {
        String a = "2[abc]3[cd]ef";
        System.out.println(decodeString(a));
    }
}
