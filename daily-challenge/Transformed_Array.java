public class Transformed_Array {
    
    public static int[] constructTransformedArray(int[] nums) {
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = nums[i];
            } else if (nums[i] > 0) {
                int index = (i + nums[i]) % nums.length; 
                res[i] = nums[index];
            } else {
                int index = (i + nums[i]) % nums.length;
                if (index < 0) {
                    index += nums.length;
                }
                res[i] = nums[index];
            }
        }

        return res;
    }
    

    public static void main(String[] args) {
        int arr[] = { -1,4,-1 };
        int res[] = constructTransformedArray(arr);

        for (Integer i : res) {
            System.out.println(i);
        }
        
    }
}
