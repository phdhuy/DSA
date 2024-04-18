import java.util.HashMap;
import java.util.Map;

public class Count_Elements_With_Maximum_Frequency {
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int val = map.get(nums[i]);
                val++;
                map.put(nums[i], val);
            }
        }

        int max = 0;
        int count = 0;

        for (var entry : map.entrySet()) {
            if(entry.getValue() >= max) {
                max = entry.getValue();
            }
        }

        for(var entry : map.entrySet()) {
            if(max == entry.getValue()) {
                count++;
            }
        }

        return count*max;
    }

    public static void main(String[] args) {
        int nums[] = {10,12,11,9,6,19,11};
        System.out.println(maxFrequencyElements(nums));
    }
}
