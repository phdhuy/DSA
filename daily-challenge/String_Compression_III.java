import java.util.HashMap;
import java.util.Map;

public class String_Compression_III {

    public static String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        char[] wordCharacters = word.toCharArray();

        for (int i = 0; i < wordCharacters.length; i++) {
            if (!map.containsKey(wordCharacters[i])) {
                map.put(wordCharacters[i], 1);
            } else {
                int temp = map.get(wordCharacters[i]);
                temp++;
                map.put(wordCharacters[i], temp);
            }

            if (i == wordCharacters.length - 1 || wordCharacters[i] != wordCharacters[i + 1]
                    || map.get(wordCharacters[i]) == 9) {
                sb.append(map.get(wordCharacters[i]));
                sb.append(wordCharacters[i]);
                map.put(wordCharacters[i], 0);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabba";
        System.out.println(compressedString(word));
    }
}
