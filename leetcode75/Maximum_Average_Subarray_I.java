public class Maximum_Average_Subarray_I {
    
    public static double findMaxAverage(int[] nums, int k) {
        int current = 0;

        for(int i = 0; i < k; i++) {
            current += nums[i];
        }
        double res = current;

        for(int i = 1; i <= nums.length - k; i++) {
            current -= nums[i-1];
            current += nums[i+k-1];
            if(current > res) {
                res = current;
            }
        }
        return res / k;    
    }

    public static void main(String[] args) {
        int nums[] = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }
}
