
public class Count_Hills_and_Valleys_in_an_Array {
  public static int countHillValley(int[] nums) {
    int res = 0;
    int prev = nums[0];

    for (int i = 1; i < nums.length - 1; i++) {
      int j = i + 1;
      while (j < nums.length && nums[j] == nums[i]) {
        j++;
      }
      if (j == nums.length) break;

      if ((nums[i] > prev && nums[i] > nums[j]) || (nums[i] < prev && nums[i] < nums[j])) {
        res++;
      }
      prev = nums[i];
    }
    return res;
  }

  public static void main(String[] args) {

    int[] nums = {2, 4, 1, 1, 6, 5};
    countHillValley(nums);
  }
}
