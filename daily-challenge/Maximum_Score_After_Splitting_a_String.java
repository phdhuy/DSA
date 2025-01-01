public class Maximum_Score_After_Splitting_a_String {
    public static int maxScore(String s) {
        int frequenceRight = 0;
        int frequenceLeft = 0;
        char[] arr = s.toCharArray();
        int res = -1;

        for (Character c : s.toCharArray()) {
            if (c.equals('1')) {
                frequenceRight++;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '0') {
                frequenceLeft++;
            } else {
                frequenceRight--;
            }

            if (frequenceLeft + frequenceRight > res) {
                res = frequenceLeft + frequenceRight;
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        String s = "00";
        System.out.println(maxScore(s));
    }
}
