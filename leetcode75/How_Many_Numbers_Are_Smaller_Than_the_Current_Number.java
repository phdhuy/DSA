
public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        
        for(int i = 0; i < nums.length; ) {
            int count = 0;
            int index = 0;
            while(index < nums.length) {
                if(nums[i] > nums[index]) {
                    count++;
                }
                index++;
            }
            res[i] = count;
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        System.out.println(smallerNumbersThanCurrent(nums));
    }
}
