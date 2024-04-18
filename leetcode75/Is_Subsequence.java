public class Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int i = 0, j = 0;
        int check = 0;
        while(i < s.length() && j < t.length()) {
            if(s1[i] == t1[j]) {
                i++;
                j++;
                check++;
            } else {
                j++;
            }
        }
        
        return check == s.length();
    }

    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
