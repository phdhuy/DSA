public class Find_First_Palindromic_String_in_the_Array {
    public static  String firstPalindrome(String[] words) {
        String res = "";

        for(int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            int l = 0; 
            int r = word.length - 1;
            boolean check = true;

            while(l < r && check) {
                if(word[l] == word[r]) {
                    l++;
                    r--;
                } else {
                    check = false;
                }
            }

            if(check) {
                res = words[i];
                break;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = {"def","ghi"};
        System.out.println(firstPalindrome(words));
    }
}
