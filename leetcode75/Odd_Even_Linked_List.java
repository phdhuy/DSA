public class Odd_Even_Linked_List {

    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return null;   
        }

        ListNode odd=head;
        ListNode even = head.next;
        ListNode enHead = even;
        
        while (even != null && even.next != null && odd != null && odd.next!=null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = enHead;
        
        return head;
    }
    
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode res = oddEvenList(n1);
        while(res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
