public class Minimum_Length_of_String_After_Deleting_Similar_Ends {
    public static int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right && s.charAt(left) == s.charAt(right)) {
            while(s.charAt(left) == s.charAt(left+1) && right - left > 1) {
                left++;
            }

            while(s.charAt(right) == s.charAt(right-1) && right - left > 1) {
                right--;
            }
            
            left++;
            right--;
        }

        return right-left+1;
    }

    public static void main(String[] args) {
        String s = "ca";
        System.out.println(minimumLength(s));
    }
}
