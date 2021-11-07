package linkedlist;

public class Swap_Nodes_In_Pairs_24 {


    public ListNode swapPairs(ListNode head) {

        ListNode temp = head;

        while(temp != null && temp.next != null) {
            int tempVal = temp.val;
            temp.val = temp.next.val;
            temp.next.val = tempVal;
            temp = temp.next.next;
        }


        return head;

    }

}
