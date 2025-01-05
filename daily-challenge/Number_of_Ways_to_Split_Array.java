public class Number_of_Ways_to_Split_Array {
    public static int waysToSplitArray(int[] nums) {
        int res = 0;
        long[] prefixSum = new long[nums.length + 1];
        prefixSum[0] = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (int i = 1; i < prefixSum.length - 1; i++) {
            if (prefixSum[i] >= prefixSum[prefixSum.length - 1] - prefixSum[i]) {
                res++;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, -5};
        System.out.println(waysToSplitArray(nums));
    }
}