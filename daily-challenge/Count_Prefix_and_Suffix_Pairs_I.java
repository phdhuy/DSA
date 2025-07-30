public class Count_Prefix_and_Suffix_Pairs_I {
    public static int countPrefixSuffixPairs(String[] words) {
        int res = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    res++;
                }
            }
        }

        return res;
    }

    public static boolean isPrefixAndSuffix(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return false;
        }
        String prefix = str2.substring(0, str1.length());
        String suffix = str2.substring(str2.length() - str1.length(), str2.length());
        return str1.equals(suffix) && str1.equals(prefix);
    }

    public static void main(String[] args) {
        String[] testcase = {"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(testcase));
    }
}
