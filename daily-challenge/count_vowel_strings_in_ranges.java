import java.util.Set;

public class count_vowel_strings_in_ranges {
    public static boolean isVowel(Character c) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        return vowels.contains(c);
    }

    public static int[] vowelStrings(String[] words, int[][] queries) {
        int[] res = new int[queries.length];
        int[] prefixSum = new int[words.length + 1];
        prefixSum[0] = 0;

        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                prefixSum[i + 1] = prefixSum[i] + 1;
            } else {
                prefixSum[i + 1] = prefixSum[i];
            }
        }

        for (int i = 0; i < queries.length; i++) {
            res[i] = prefixSum[queries[i][1] + 1] - prefixSum[queries[i][0]];
        }

        return res;
    }

    public static void main(String[] args) {
        String[] words = { "aba", "bcb", "ece", "aa", "e" };
        int[][] queries = { { 0, 2 }, { 1, 4 }, { 1, 1 } };
        int[] res = vowelStrings(words, queries);

        for (Integer i : res) {
            System.out.println(i);
        }
    }
}