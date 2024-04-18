import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maximum_Product_of_Two_Elements_in_an_Array {
    public static int maxProduct(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }

        Collections.sort(arr);
        Collections.reverse(arr);
        return (arr.get(0)-1)*(arr.get(1)-1);
    }

    public static void main(String[] args) {
        int[] nums = {1,5,4,5};
        maxProduct(nums);
    }
}
