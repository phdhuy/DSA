import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Determine_if_Two_Strings_Are_Close {
    
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        List<Integer> occurent = new ArrayList<>();

        for (Character c1 : word1.toCharArray()) {
            if (!map1.containsKey(c1)) {
                map1.put(c1, 1);
            } else {
                int temp = map1.get(c1);
                temp++;
                map1.put(c1, temp);
            }
        }

        for (Character c2 : word2.toCharArray()) {
            if (!map2.containsKey(c2)) {
                map2.put(c2, 1);
            } else {
                int temp = map2.get(c2);
                temp++;
                map2.put(c2, temp);
            }
        }

        for (var entry : map2.entrySet()) {
            occurent.add(entry.getValue());
        }

        for (var entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey()) && occurent.contains(entry.getValue())) {
                occurent.remove(entry.getValue());
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
    }
}
