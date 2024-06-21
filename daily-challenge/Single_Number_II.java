import java.util.HashMap;

public class Single_Number_II {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int val = map.get(nums[i]);
                val++;
                map.put(nums[i], val);
            } else {
                map.put(nums[i], 1);
            }
        }
        int res = 0;
        for (var mapVal : map.entrySet()) {
            if (mapVal.getValue() == 1) {
                res = mapVal.getKey();
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
