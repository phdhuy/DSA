import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apply_Operations_to_Make_String_Empty {

    public static String lastNonEmptyString(String s) {
        char[] arr = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();

        int maxFrequency = 1;

        for (Character c : arr) {
            if (map.containsKey(c)) {
                int val = map.get(c);
                val++;
                if (val > maxFrequency) {
                    maxFrequency = val;
                }
                map.put(c, val);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!list.contains(arr[i]) && map.get(arr[i]) == maxFrequency) {
                list.add(arr[i]);
                sb.append(arr[i]);
            }
        }


        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(lastNonEmptyString(s));
    }
}
