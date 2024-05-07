import java.util.HashMap;
import java.util.Map;

public class Task_Scheduler {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> task = new HashMap<>();
        int res = 0;

        for (int i = 0; i < tasks.length; i++) {
            if (!task.containsKey(tasks[i])) {
                task.put(tasks[i], 1);
            } else {
                int val = task.get(tasks[i]);
                val++;
                task.put(tasks[i], val);
            }
        }

        

        return res;
    }

    public static void main(String[] args) {
        System.out.println("null");
    }
}
