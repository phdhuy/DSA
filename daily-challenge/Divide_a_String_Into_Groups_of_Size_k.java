import java.util.ArrayList;
import java.util.List;

public class Divide_a_String_Into_Groups_of_Size_k {
    public static String[] divideString(String s, int k, char fill) {
        List<String> res = new ArrayList<String>();
        int length = k;
        StringBuilder sb = new StringBuilder();

        for (Character c : s.toCharArray()) {
            if (length != 0) {
                sb.append(c);
                length--;
            } else {
                res.add(sb.toString());
                sb = new StringBuilder();
                length = k;
                length--;
                sb.append(c);
            }
        }

        if (length != 0) {
            while (length != 0) {
                sb.append(fill);
                length--;
            }
            res.add(sb.toString());
        } else {
            res.add(sb.toString());
        }
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        String[] res = divideString(s, k, fill);

        for (String s1 : res) {
            System.out.println(s1);
        }
    }
}
