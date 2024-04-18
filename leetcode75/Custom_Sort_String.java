import java.util.HashMap;
import java.util.Map;

public class Custom_Sort_String {
    public static String customSortString(String order, String s) {
        StringBuilder res = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        char[] sArr = s.toCharArray();
        char[] orderArr = order.toCharArray();

        for(int i = 0; i < sArr.length; i++) {
            if(map.containsKey(sArr[i])) {
                int val = map.get(sArr[i]);
                val++;
                map.put(sArr[i], val);
            } else {
                map.put(sArr[i], 1);
            }
        }

        for(Character c : orderArr) {
            if(map.containsKey(c)) {
                int count = map.get(c);
                while(count != 0) {
                    res.append(c);
                    count--;
                }
                map.remove(c);
            }
        }

        for(var entry : map.entrySet()) {
            int count = entry.getValue();
            while(count != 0) {
                res.append(entry.getKey());
                count--;
            }
        }

        return res.toString();
    }
    public static void main(String[] args) {
        String s = "pekeq";
        String order = "kqep";
        System.out.println(customSortString(order, s));
    }                                     
}
                                                                                      