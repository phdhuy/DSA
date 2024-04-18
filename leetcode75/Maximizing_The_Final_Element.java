import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maximizing_The_Final_Element {
    public static int getMaxValue(List<Integer> arr) {
        // Write your code here
            Collections.sort(arr);
            for(int i = 0; i < arr.size(); i++) {
                if(i == 0){
                    if(arr.get(i) != 1) {
                        arr.set(0, 1);
                    }
                } else {
                    if(arr.get(i) - arr.get(i-1) > 1) {
                        arr.set(i, arr.get(i-1)+1);
                    }
                } 
            }
            return arr.get(arr.size()-1);
        }
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(3);
            list.add(2);
            list.add(3);
            list.add(5);
            System.out.println(getMaxValue(list));
        }
}
