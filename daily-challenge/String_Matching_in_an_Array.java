import java.util.ArrayList;
import java.util.List;

public class String_Matching_in_an_Array {
     public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[i].contains(words[j])) {
                    if (!res.contains(words[j])) {
                        res.add(words[j]);
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        
    }
}
