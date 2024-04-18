import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Unique_Number_of_Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int val = map.get(arr[i]);
                val++;
                map.put(arr[i], val);
            }
        }
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(set.contains(entry.getValue())) {
                return false;
            } else {
                set.add(entry.getValue());
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(5/2);
    }
}
