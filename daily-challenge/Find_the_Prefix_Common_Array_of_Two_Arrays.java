import java.util.HashSet;
import java.util.Set;

public class Find_the_Prefix_Common_Array_of_Two_Arrays {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        int count = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if(set.contains(A[i])) {
                count++;
            } else {
                set.add(A[i]);
            }

            if(set.contains(B[i])) {
                count++;
            } else {
                set.add(B[i]);
            }

            set.

            res[i] = count;
        }

        return res;
    }
    
    public static void main(String[] args) {
        
    }
}
