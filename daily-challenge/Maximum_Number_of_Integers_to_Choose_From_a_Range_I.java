import java.util.HashSet;
import java.util.Set;

public class Maximum_Number_of_Integers_to_Choose_From_a_Range_I {
    public static int maxCount(int[] banned, int n, int maxSum) {
        int res = 0;
        int currentSum = 0;

        Set<Integer> set = new HashSet<>();
        for (Integer i : banned) {
            set.add(i);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i) && currentSum + i <= maxSum) {
                res++;
                currentSum += i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
       int[] banned = {1,6,5};
       int n = 5;
       int maxSum = 6;
       System.out.println(maxCount(banned, n, maxSum));
    }
}
