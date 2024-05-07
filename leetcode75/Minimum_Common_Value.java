import java.util.ArrayList;
import java.util.List;

public class Minimum_Common_Value {
    public int getCommon(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums1.length; i++)  {
            list.add(nums1[i]);
        }

        for(int i = 0; i  < nums2.length; i++) {
            if(list.contains(nums2[i])) {
                return nums2[i];
            }
        }
        return -1;
    }
}
