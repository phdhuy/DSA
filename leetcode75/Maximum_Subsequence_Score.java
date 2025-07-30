import java.util.PriorityQueue;

public class Maximum_Subsequence_Score {
    
    public static long totalCost(int[] costs, int k, int candidates) {
        long res = 0;
        int n = costs.length;

        PriorityQueue<Integer> frontHeap = new PriorityQueue<>();
        PriorityQueue<Integer> backHeap = new PriorityQueue<>();

        int left = 0;
        int right = n - 1;

        for (int i = 0; i < candidates; i++) {
            if (left <= right) {
                frontHeap.offer(costs[left]);
                left++;
            }
            if (left <= right) {
                backHeap.offer(costs[right]);
                right--;
            }
        }

        for (int i = 0; i < k; i++) {
            if (!frontHeap.isEmpty() && (backHeap.isEmpty() || frontHeap.peek() <= backHeap.peek())) {
                res += frontHeap.poll();
                if (left <= right) {
                    frontHeap.offer(costs[left]);
                    left++;
                }
            } else if (!backHeap.isEmpty()) {
                res += backHeap.poll();
                if (left <= right) {
                    backHeap.offer(costs[right]);
                    right--;
                }
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        
    }
}
