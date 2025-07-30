import java.util.HashMap;
import java.util.Map;

public class Minimum_Length_of_String_After_Operations {
    public static int minimumLength(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();


        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
                res++;
            } else {
                if (map.get(c) == 2) {
                    res -= 1;
                    map.put(c, 1);
                } else if(map.get(c) == 1) {
                    map.put(c, 2);
                    res++;
                }
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        String s = "abaacbcbb";
        System.out.println(minimumLength(s));
    }
}
