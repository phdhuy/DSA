import java.util.PriorityQueue;

public class Smallest_Number_in_Infinite_Set {

    private Integer minNum;
    private PriorityQueue<Integer> minHeap;
    
    public Smallest_Number_in_Infinite_Set() {
        minHeap = new PriorityQueue<>();
        minNum = 1;
    }
    
    public int popSmallest() {
        if (!minHeap.isEmpty()) {
            return minHeap.poll();
        }
        minNum++;
        return minNum - 1;
    }
    
    public void addBack(int num) {
        if (minNum > num && !minHeap.contains(num)) {
            minHeap.offer(num);
        }
    }
}
