import java.util.Arrays;

public class Max_Number_of_K_Sum_Pairs {
    
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        int operations = 0;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == k) {
                r--;
                l++;
                operations++;
            }
            else if (sum > k) {
                r--;
            } else {
                l++;
            }
        }
        return operations;
    }
    
    public static void main(String[] args) { 
        int[] nums = { 3,1,3,4,3 };
        System.out.println(maxOperations(nums, 6));
    }
}
