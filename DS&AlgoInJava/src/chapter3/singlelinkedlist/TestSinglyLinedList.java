package chapter3.singlelinkedlist;

public class TestSinglyLinedList {

    public static void main(String[] args) {


        basicOperations();

        //disconnectMiddleNode();

    }

    private static void basicOperations() {
        ISinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addFirst("Anik");
        list.addLast("Dey");
        list.addLast("Pappu");
        list.insertAt(0, "test");
        list.insertAt(2, "Should insert after Anik");
        list.printList();

        System.out.println("First element "+ list.first());
        System.out.println("Last element "+ list.last());
        System.out.println("Item at index "+ list.getItemAt(2));

        //list.reverse();
        //list.printList();
        System.out.println(list.getFromTail(2));
        System.out.println("Item exists or not "+list.searchItem("Anik"));

    }

    private static void disconnectMiddleNode() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addFirst("First String");
        list.addLast("Second String");
        list.addLast("Shoul be replaced");
        list.addLast("Third String");
        System.out.println("========= Before Replacing =========");
        list.printList();
        list.disconnectNode(list.getNodeAt(2));
        System.out.println("========= After Replacing =========");
        list.printList();
    }

}
