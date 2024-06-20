import java.util.HashSet;
import java.util.Set;

public class Set_Mismatch {

    public static int[] findErrorNums(int[] nums) {
        int[] res = new int[2];

        Set<Integer> set = new HashSet<>();

        for (Integer i : nums) {
            if (set.contains(i)) {
                res[0] = i;
            }
            set.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                res[1] = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
