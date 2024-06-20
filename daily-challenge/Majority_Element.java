import java.util.HashMap;

public class Majority_Element {
    public static int majorityElement(int[] nums) {
        float times = nums.length / 2;
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer i : nums) {
            if (map.containsKey(i)) {
                int val = map.get(i);
                val++;
                map.put(i, val);
            } else {
                map.put(i, 1);
            }
        }

        for (var val : map.entrySet()) {
            if (val.getValue() > times) {
                res = val.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
