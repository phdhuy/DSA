import java.util.HashMap;
import java.util.Map;

public class Split_the_Array {
    public boolean isPossibleToSplit(int[] nums) {
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

        for(var entry : map.entrySet()) {
            if(entry.getValue() > 2) {
                return false;
            } 
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
