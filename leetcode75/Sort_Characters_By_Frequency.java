import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Sort_Characters_By_Frequency {
    public static String frequencySort(String s) {
        char[] array = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                int val = map.get(array[i]);
                val++;
                map.put(array[i], val);
            }
        }
        Stream<Map.Entry<Character,Integer>> sorted = map.entrySet()
        .stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
        StringBuilder res = new StringBuilder();

        sorted.forEach(entry -> {
            for (int j = 0; j < entry.getValue(); j++) {
                res.append(entry.getKey());
            }
        });


        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Aabb";
        System.out.println(frequencySort(s));
    }
}
