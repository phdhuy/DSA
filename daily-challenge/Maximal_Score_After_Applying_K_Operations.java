import java.util.Collections;
import java.util.PriorityQueue;

public class Maximal_Score_After_Applying_K_Operations {
    public static long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long res = 0;
        for (Integer i : nums) {
            maxHeap.add(i);
        }
        
        for (int i = 0; i < k; i++) {
            long maxElement = maxHeap.poll();
            int ceil = (int) Math.ceil( (double) maxElement / 3);
            maxHeap.add((int) ceil);
            res += maxElement;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 10, 3, 3, 3 };
        int k = 3;
        System.out.println(maxKelements(nums, k));
    }
}
