package problems;

import java.util.HashMap;
import java.util.Map;

public class Remove_Duplicates_From_An_Unsorted_Linked_List {

    public GFGSingleLinkedList.Node removeDuplicates(GFGSingleLinkedList.Node head) {

        Map<Integer, Integer> map = new HashMap<>();


        GFGSingleLinkedList.Node temp = head;
        GFGSingleLinkedList.Node prev = null;
        while(temp != null) {

            if(map.containsKey(temp.data)) {
                prev.next = temp.next;
            } else {
                map.put(temp.data, 1);
                prev = temp;

            }
            temp = temp.next;

        }

        return head;


    }


}
