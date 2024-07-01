import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {
    
    public static boolean isAnagram(String s, String t) { 
        if (s.length() != t.length()) {
            return false;
        }
    
        Map<Character, Integer> map = new HashMap<>();
    
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
    
        for (Character c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
    
        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
    
        return true;
    }
    
    public static void main(String[] args) {
        String s = "ab..";
        String t = "ab..";
        System.out.println(isAnagram(s, t));
    }
}
