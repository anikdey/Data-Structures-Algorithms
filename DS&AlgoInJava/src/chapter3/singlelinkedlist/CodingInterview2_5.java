package chapter3.singlelinkedlist;

public class CodingInterview2_5 {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> firstNumberList = new SinglyLinkedList<>();
        firstNumberList.add(7);
        firstNumberList.add(1);
        firstNumberList.add(6);
        firstNumberList.add(6);
        firstNumberList.printList();

        SinglyLinkedList<Integer> secondNumberList = new SinglyLinkedList<>();
        secondNumberList.add(5);
        secondNumberList.add(9);
        secondNumberList.add(2);
        secondNumberList.printList();

        getSum(firstNumberList, secondNumberList).printList();
    }


    public static SinglyLinkedList<Integer> getSum(SinglyLinkedList<Integer> firstNumberList, SinglyLinkedList<Integer> secondNumberList) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        int carry = 0;

        SinglyLinkedList.Node<Integer> firstHead = firstNumberList.getHead();
        SinglyLinkedList.Node<Integer> secondHead = secondNumberList.getHead();

        while (firstHead != null || secondHead != null) {

            int sum = carry;
            if(firstHead != null) {
                sum += firstHead.getData();
                firstHead = firstHead.getNext();
            }

            if(secondHead != null) {
                sum += secondHead.getData();
                secondHead = secondHead.getNext();
            }

            if(sum>9) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            list.add(sum);
        }

        if(carry>0) {
            list.add(carry);
        }
        return list;
    }

}
