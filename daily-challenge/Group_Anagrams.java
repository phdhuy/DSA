import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] sToArray = s.toCharArray();
            Arrays.sort(sToArray);
            String key = new String(sToArray);
            List<String> listValue = map.getOrDefault(key, new ArrayList<>());

            listValue.add(s);
            map.put(key, listValue);
        }
        
        return new ArrayList<>(map.values());
    }
    
    public static void main(String[] args) {
        
    }
}
