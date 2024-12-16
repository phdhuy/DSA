import java.util.PriorityQueue;
import java.util.Queue;

public class Final_Array_State_After_K_Multiplication_Operations_I {

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<Integer> minHeap = new PriorityQueue<>();

        for (Integer i : nums) {
            minHeap.offer(i);
        }

        while (k > 0) {
            int minElement = minHeap.poll();

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == minElement) {
                    nums[i] *= multiplier;
                    minHeap.offer(nums[i]);
                    break;
                }
            }

            k--;
        }

        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 1, 3, 5, 6 };
        int k = 5, multiplier = 2;
        System.out.println(getFinalState(nums, k, multiplier));
    }
}
