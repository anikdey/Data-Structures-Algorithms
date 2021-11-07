package linkedlist;

import com.sun.source.tree.Tree;

import java.util.*;

public class Remove_Duplicates_From_Sorted_List_II_82 {

    ListNode head = null;
    ListNode tail = null;


    public static void main(String[] args) {
        Remove_Duplicates_From_Sorted_List_II_82 obj = new Remove_Duplicates_From_Sorted_List_II_82();

//        obj.addNode(1);obj.addNode(2);
//        obj.addNode(3);obj.addNode(3);
//        obj.addNode(4);obj.addNode(4);
//        obj.addNode(5);obj.addNode(6);

        obj.addNode(1);obj.addNode(1);obj.addNode(2);
        obj.addNode(3);

        obj.printList();

        System.out.println();

        obj.deleteDuplicates(obj.head);


    }

    public ListNode deleteDuplicates(ListNode head) {

        Map<Integer, Boolean> map = new TreeMap<>();

        while (head != null) {
            if(map.containsKey(head.val)) {
                map.put(head.val, true);
            } else {
                map.put(head.val, false);
            }
            head = head.next;
        }

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if(!entry.getValue()) {
                list.add(entry.getKey());
            }
        }
        ListNode newHead = null;
        ListNode tail = null;
        int size = list.size();
        for(int i=0; i<size; i++) {
            ListNode newestNode = new ListNode(list.get(i), null);
            if(newHead == null) {
                newHead = newestNode;
            } else {
                tail.next = newestNode;
            }
            tail = newestNode;
        }
        return newHead;
    }

    private void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    private void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    private void addNode(int data) {
        ListNode newestNode = new ListNode(data, null);
        if(this.head == null) {
            head = newestNode;
        } else {
            tail.next = newestNode;
        }
        tail = newestNode;
    }

}
