public class House_Robber {
    public static int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = Math.max(nums[i] + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }

        return rob2;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 1, 2 };
        System.out.println(rob(arr));
    }
}
