public class Find_the_Highest_Altitude {
    public static int largestAltitude(int[] gain) {
        int max = 0;

        int[] prefixSum = new int[gain.length+1];
        prefixSum[0] = 0;
        prefixSum[1] = gain[0];

        for(int i = 0; i < gain.length-1; i++) {
            prefixSum[i+2] = prefixSum[i+1] + gain[i+1]; 
        }

        for(int i = 0; i < prefixSum.length; i++) {
            max = Math.max(max, prefixSum[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {52,-91,72};
        System.out.println(largestAltitude(arr));
    }
}
