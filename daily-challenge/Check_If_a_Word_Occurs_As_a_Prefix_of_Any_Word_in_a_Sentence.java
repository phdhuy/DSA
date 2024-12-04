public class Check_If_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int res = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                res = i + 1;
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String sentence = "hellohello hellohellohello";
        String searchWord = "ell";

        System.out.println(isPrefixOfWord(sentence, searchWord));
    }
}
