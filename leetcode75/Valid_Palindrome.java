import java.util.LinkedList;
import java.util.Queue;

public class Valid_Palindrome {

    public static boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }
        Queue<Character> queue = new LinkedList<>();
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(Character c : arr) {
            if(Character.isDigit(c) || Character.isAlphabetic(c)) {
                if(Character.isUpperCase(c)) {
                    queue.add(Character.toLowerCase(c));
                } else {
                    queue.add(c);
                }
            }
        }

        for(Character c : queue) {
            sb.append(c);
        }

        char[] characters = sb.toString().toCharArray();
        int l = 0;
        int r = characters.length - 1;
        boolean check = true;

        while(l < r && check) {
            if(characters[l] == characters[r]) {
                l++;
                r--;
            } else {
                check = false;
            }
        }

        return check;
    }
    
    public static void main(String[] args) {
        String s  = "race a car";
        System.out.println(isPalindrome(s));
    }
}
