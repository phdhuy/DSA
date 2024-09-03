public class Sum_of_Digits_of_String_After_Convert {
    
    public static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (Character c : s.toCharArray()) {
            int charToDigit = (int) c - 96;
            sb.append(charToDigit);
        }
        String digit = sb.toString();
        int res = 0;

        for (int i = 0; i < k; i++) {
            for (Character c : digit.toCharArray()) {
                res += Integer.parseInt(c.toString());
            }
            digit = Integer.toString(res);
            if (k - i != 1) {
                res = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getLucky("leetcode", 2));
    }
}
