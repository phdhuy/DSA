import java.util.TreeMap;

public class Most_Frequent_Even_Element {

    public static int mostFrequentEven(int[] nums) {
        int res = -1;
        int frequent = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (Integer i : nums) {
            if (i % 2 == 0) {
                if (map.containsKey(i)) {
                    int val = map.get(i);
                    val++;
                    map.put(i, val);
                } else {
                    map.put(i, 1);
                }
            }
        }

        for (var mapVal : map.entrySet()) {
            if (mapVal.getValue() > frequent) {
                res = mapVal.getKey();
                frequent = mapVal.getValue();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 8154, 9139, 8194, 3346, 5450, 9190, 133, 8239, 4606, 8671, 8412, 6290 };
        System.out.println(mostFrequentEven(nums));
    }
}
