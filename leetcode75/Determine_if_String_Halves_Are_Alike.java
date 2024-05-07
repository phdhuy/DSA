public class Determine_if_String_Halves_Are_Alike {
    
    public static boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int mid = s.length() / 2;
        String a = s.substring(0, mid);
        String b = s.substring(mid, s.length());

        int countA = 0, countB = 0;

        for(int i = 0; i < a.length(); i++) {
            if(vowels.indexOf(a.charAt(i)) != -1) {
                countA++;
            }
        }

        for(int i = 0; i < b.length(); i++) {
            if(vowels.indexOf(b.charAt(i)) != -1) {
                countB++;
            }
        }

        if(countA == countB) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "book";
        System.out.println(halvesAreAlike(str));
    }
}
