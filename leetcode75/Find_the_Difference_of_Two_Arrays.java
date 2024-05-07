import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_the_Difference_of_Two_Arrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < Math.max(nums1.length, nums2.length); i++) {
            if (i < nums1.length) {
                set1.add(nums1[i]);
            }

            if (i < nums2.length) {
                set2.add(nums2[i]);
            }
        }

        for (int i = 0; i < Math.max(nums1.length, nums2.length); i++) {
            if (i < nums1.length) {
                if (!set2.contains(nums1[i]) && !list1.contains(nums1[i])) {
                    list1.add(nums1[i]);
                }
            }

            if (i < nums2.length) {
                if (!set1.contains(nums2[i]) && !list2.contains(nums2[i])) {
                    list2.add(nums2[i]);
                }
            }
        }
        res.add(list1);
        res.add(list2);
        return res;
    }

    public static void main(String[] args) {
        int nums1[] = { -68, -80, -19, -94, 82, 21, -43 };
        int nums2[] = { -63 };
        System.out.println(findDifference(nums1, nums2));
    }
}
