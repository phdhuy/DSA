public class Ant_on_the_Boundary {
    public static int returnToBoundaryCount(int[] nums) {
        int res = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            count += nums[i];
            if(count == 0) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
