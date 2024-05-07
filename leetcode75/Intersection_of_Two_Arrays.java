import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection_of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int i = 0; 
        int j = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                set.add(nums1[i]);
            }

            if(nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }

        int[] res = set.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }

    public static void main(String[] args) {

    }
}
