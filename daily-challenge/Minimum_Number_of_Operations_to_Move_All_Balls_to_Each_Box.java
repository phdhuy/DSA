public class Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box {
    public static int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        char[] arr = boxes.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == '1') {
                    res[i] += Math.abs(i - j);
                }
            }
        }
        
        return res;
    }
    public static void main(String[] args) {
        String boxes = "110";
        System.out.println(minOperations(boxes));
    }
}
