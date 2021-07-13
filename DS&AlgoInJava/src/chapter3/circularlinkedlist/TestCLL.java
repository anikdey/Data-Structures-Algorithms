package chapter3.circularlinkedlist;

public class TestCLL {

    public static void main(String[] args) {
        CircularlyLinkedList<String> cll = new CircularlyLinkedList<>();
        cll.addFirst("Anik");
        cll.addFirst("Dey");
        cll.addFirst("Pappu");

        cll.printList();
        cll.rotate();
        cll.printList();

    }

}
