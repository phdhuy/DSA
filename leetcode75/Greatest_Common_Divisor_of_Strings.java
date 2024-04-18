

import java.util.LinkedList;
import java.util.Queue;

public class Greatest_Common_Divisor_of_Strings {
    public static boolean isValid(String sb, String str) {
        if (str.length() % sb.length() != 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (sb.charAt(i % sb.length()) != str.charAt(i)) {
                return false;
            }
        }

        return true;
    }
    public static String gcdOfStrings(String str1, String str2) {
        Queue<Character> queue =  new LinkedList<>();
        String min = "";
        String max = "";
        if(str1.length() > str2.length()) {
            min = str2;
            max = str1;
        } else {
            min = str1;
            max = str2;
        }
        for(int i = 0; i < min.length(); i++) {
            if(str1.charAt(i) == str2.charAt(i)) {
                queue.add(str1.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()) {
            sb.append(queue.poll());
        }
        System.out.println(sb.toString());

        if(sb.toString().length() > 0) {
            if(isValid(sb.toString(), max)) {
                return sb.toString();
            } else {
                return "";
            }
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        System.out.println(gcdOfStrings(str1, str2));
    }
}
