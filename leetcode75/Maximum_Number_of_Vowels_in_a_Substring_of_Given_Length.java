/**
 * Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length
 */
public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public static int maxVowels(String s, int k) {
        int current = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < k; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                current++;
            }
        }

        int res = current;

        for(int i = 0; i < arr.length - k; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                current--;
            }
            if (arr[i + k] == 'a' || arr[i + k] == 'e' || arr[i + k] == 'i' || arr[i + k] == 'o' || arr[i + k] == 'u') {
                current++;
            }

            res = Math.max(res, current);
        }


        return res;
    }

    public static void main(String[] args) {

    }
}
