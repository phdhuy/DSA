import java.util.ArrayList;
import java.util.List;

public class Maximum_Twin_Sum_of_a_Linked_List {

    public static int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        int res = 0;

        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        for(int i = 0; i < list.size() / 2; i++) {
            int sum = list.get(i) + list.get(list.size() - i - 1);
            res = Math.max(res, sum);
        }
    
        return res;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println(pairSum(n1));
    }
}
