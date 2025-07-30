import java.util.Comparator;
import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        int res = 0;

        for (Integer i : nums) {
            priorityQueue.offer(i);
        }
        
        for(int i = 1; i <= nums.length; i++) {
            if(i == k) {
                res = priorityQueue.peek();
            } else {
                priorityQueue.poll();
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        
    }
}
