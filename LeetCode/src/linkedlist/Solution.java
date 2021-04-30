package linkedlist;



    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Solution {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        makeNewList(temp);

        while (head.next != null && newHead.next != null) {

            if(head.val != newHead.val) {
                return false;
            }

            head = head.next;
            newHead = newHead.next;
        }


        return true;
    }

    public void makeNewList(ListNode temp) {
        if(temp.next == null) {
            addLast(temp.val);
        }
        makeNewList(temp.next);
        addLast(temp.val);
    }


    private ListNode newHead = null;
    private ListNode tail = null;

    public void addLast(int data) {
        ListNode newestNode = new ListNode(data, null);
        if(newHead == null) {
            newHead = newestNode;
        } else {
            tail.next = newestNode;
        }
        tail = newestNode;
    }



}