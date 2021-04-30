package chapter3.singlelinkedlist;

public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> firstNumberList = new SinglyLinkedList<>();
        firstNumberList.add(1);
        firstNumberList.add(2);
        firstNumberList.add(3);
        //firstNumberList.add(6);
        //firstNumberList.add(6);
        firstNumberList.printList();

        removeNthFromEnd(firstNumberList.getHead(), 2);

        firstNumberList.printList();

    }

    public static SinglyLinkedList.Node<Integer> removeNthFromEnd(SinglyLinkedList.Node head, int n) {

        if(head.getNext() == null) {
            head = null;
            return head;
        }

        if(head.getNext().getNext() == null) {
            head.setNext(null);
            return head;
        }

        SinglyLinkedList.Node<Integer> temp = head;
//        SinglyLinkedList.Node<Integer> prev = null;
//
//        int localCounter = 0;
//        while (temp.getNext() != null) {
//            localCounter++;
//            if(localCounter == n) {
//                prev = temp;
//            }
//            temp = temp.getNext();
//        }
//
//        prev.setData(prev.getNext().getData());
//        prev.setNext(prev.getNext().getNext());


        removeNode(temp, n);
        return head;
    }

    public static int count = 0;

    public static void removeNode(SinglyLinkedList.Node currentNode, int n) {
        if(currentNode.getNext() == null) {
            return;
        }
        removeNode(currentNode.getNext(), n);
        count++;
        if(count == n) {
            currentNode.setData(currentNode.getNext().getData());
            currentNode.setNext(currentNode.getNext().getNext());
            return;
        }
    }


}
