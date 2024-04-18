
import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    public int findMaxNum(int[] candies) {
        int max = 0;
        for(int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = findMaxNum(candies);
        List<Boolean> res = new ArrayList<>();
        for(int i = 0; i < candies.length; i++) {
            int tmp = candies[i] + extraCandies;
            if(tmp >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
