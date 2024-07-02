import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Intersection_of_Two_Arrays_II {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();

        for (Integer i : nums1) {
            if (map.containsKey(i)) {
                int val = map.get(i);
                val++;
                map.put(i, val);
            } else {
                map.put(i, 1);
            }
        }

        for (Integer i : nums2) {
            if (map.containsKey(i) && map.get(i) != 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = { 4,9,5 };
        int[] arr2 = { 9,4,9,8,4};
        int[] res = intersect(arr1, arr2);

        for (Integer i : res) {
            System.out.println(i);
        }
    }
}
