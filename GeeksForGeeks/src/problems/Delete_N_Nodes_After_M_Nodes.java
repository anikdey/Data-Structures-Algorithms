package problems;

import static problems.GFGSingleLinkedList.linkdelete;
import static problems.GFGSingleLinkedList.printList;

public class Delete_N_Nodes_After_M_Nodes {

    public static void main(String[] args) {

        int d = "ababa".compareTo("abaa");

        GFGSingleLinkedList list = new GFGSingleLinkedList();
        list.add(9);list.add(1);list.add(3);list.add(5);list.add(9);list.add(4);list.add(10);list.add(1);
        printList(list.head);
        linkdelete(list.head, 2, 1);
        //list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);
        printList(list.head);
    }


}
