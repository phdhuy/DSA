public class Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        int right = 0, left = 0;

        for(int i : nums) {
            right += i;
        }

        for(int i = 0; i < nums.length; i++) {
            right -= nums[i];
            if(right == left) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(pivotIndex(arr));
    }
}
