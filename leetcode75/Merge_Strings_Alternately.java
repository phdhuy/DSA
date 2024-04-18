
import java.util.LinkedList;
import java.util.Queue;

public class Merge_Strings_Alternately {
  public static String mergeAlternately(String word1, String word2) {
    int length = Math.max(word1.length(), word2.length());
    Queue<Character> queue = new LinkedList<>();

    for (int i = 0; i < length; i++) {
      if (i < word1.length()) {
        queue.add(word1.charAt(i));
      }
      if (i < word2.length()) {
        queue.add(word2.charAt(i));
      }
    }

    StringBuilder sb = new StringBuilder();
    while (!queue.isEmpty()) {
      sb.append(queue.poll());
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    String a = "ab";
    String b = "pqrs";

    System.out.println(mergeAlternately(a, b));
  }
}
