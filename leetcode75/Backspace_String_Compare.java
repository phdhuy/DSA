import java.util.Stack;

public class Backspace_String_Compare {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder(); StringBuilder sb2 = new StringBuilder();
        char[] sToArray = s.toCharArray();
        char[] tToArray = t.toCharArray();

        Stack<Character> stackT = new Stack<>();
        Stack<Character> stackS = new Stack<>();

        for(Character c : sToArray) {
            if(c == '#') {
                if(!stackS.empty()) {
                    stackS.pop();
                }
            } else {
                stackS.add(c);
            }                                             
        }

        for(Character c : tToArray) {
            if(c == '#') {
                if(!stackT.empty()) {
                    stackT.pop();   
                }
            } else {
                stackT.add(c);
            }                                             
        }

        while(!stackS.isEmpty()) {
            sb1.append(stackS.pop());
        }

        while(!stackT.isEmpty()) {
            sb2.append(stackT.pop());
        }

        System.out.println(sb1);
        System.out.println(sb2);

        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("ac");
        StringBuilder sb2 = new StringBuilder("ac");

        System.out.println(sb1.equals(sb2));
    }
}
