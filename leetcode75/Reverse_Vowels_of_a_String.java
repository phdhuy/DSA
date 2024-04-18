
public class Reverse_Vowels_of_a_String {

  public static String reverseVowels(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append(s.charAt(i));
    }
    String vowels = "aeiouAEIOU";
    int start = 0;
    int end = s.length() - 1;

    while (start < end) {
      while (start < end && vowels.indexOf(sb.charAt(start)) == -1) {
        start++;
      }

      while (start < end && vowels.indexOf(sb.charAt(end)) == -1) {
        end--;
      }

      char startChar = sb.charAt(start);
      char endChar = sb.charAt(end);
      sb.setCharAt(end, startChar);
      sb.setCharAt(start, endChar);
      start++;
      end--;
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    String str = "leetcode";
    System.out.println(reverseVowels(str));
  }
}
