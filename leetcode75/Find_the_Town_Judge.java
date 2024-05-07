import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Find_the_Town_Judge {
    public static int findJudge(int n, int[][] trust) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Integer> check =  new LinkedList<>();

        for(int i = 0; i < trust.length; i++) {
            for(int j = 0; j < 2; j++) {
                if(j != 0) {
                    if(!map.containsKey(trust[i][j])) {
                        map.put(trust[i][j], 1);
                    } else {
                        int val = map.get(trust[i][j]);
                        val++;
                        map.put(trust[i][j], val);
                    }
                } else {
                    if(!check.contains(trust[i][j])) {
                        check.add(trust[i][j]);
                    }
                }
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(!check.contains(entry.getKey()) && entry.getValue() == n-1) {
                return entry.getKey();
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] arr = {{1,3},{2,3},{3,1}};
        System.out.println(findJudge(n, arr));
    }
}
