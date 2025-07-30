public class Counting_Words_With_a_Given_Prefix {
    public static int prefixCount(String[] words, String pref) {
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= pref.length()) {
                String temp = words[i].substring(0, pref.length());

                if (temp.equals(pref)) {
                    res++;
                }
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"}; 
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }
}
