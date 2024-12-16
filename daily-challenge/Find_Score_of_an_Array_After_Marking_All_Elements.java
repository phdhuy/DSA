public class Find_Score_of_an_Array_After_Marking_All_Elements {
    public static long findScore(int[] nums) {
        long score = 0;

        while (true) {
            int minElement = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != -1 && nums[i] < minElement) {
                    minElement = nums[i];
                    minIndex = i;
                }
            }

            if (minIndex == -1) {
                break;
            }

            score += minElement;
            nums[minIndex] = -1;
            if (minIndex - 1 >= 0) {
                nums[minIndex - 1] = -1;
            }
            if (minIndex + 1 < nums.length) {
                nums[minIndex + 1] = -1;
            }
        }

        return score;
    }

    public static void main(String[] args) {

    }
}
