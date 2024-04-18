public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode temp = res;

        while(list1.next != null && list2.next != null) {
            if(list1.val < list2.val) {
                temp.val = list1.val;
            } else {
                temp.val = list2.val;
            }
            temp = temp.next;
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
