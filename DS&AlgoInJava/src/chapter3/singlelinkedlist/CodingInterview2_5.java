package chapter3.singlelinkedlist;

public class CodingInterview2_5 {

    public static void main(String[] args) {
        addNumbersFromLinkedList();
    }

    public static void addNumbersFromLinkedList() {
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

/*    public static void sumUsingRecursion() {
        SinglyLinkedList<Integer> firstNumberList = new SinglyLinkedList<>();
        firstNumberList.add(6);
        firstNumberList.add(6);
        firstNumberList.add(1);
        firstNumberList.add(7);

        firstNumberList.printList();

        SinglyLinkedList<Integer> secondNumberList = new SinglyLinkedList<>();
        secondNumberList.add(2);
        secondNumberList.add(9);
        secondNumberList.add(5);
        secondNumberList.printList();

        getSumExtended(firstNumberList.getHead(), secondNumberList.getHead());
        list.printList();
    }


    static SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
    static int carry = 0;

    public static void getSumExtended(SinglyLinkedList.Node<Integer> firstHead, SinglyLinkedList.Node<Integer> secondHead) {

        if( firstHead == null && secondHead == null ) {
            return;
        }

        if(firstHead != null) {
            firstHead =  firstHead.getNext();
        }

        if(secondHead != null) {
            secondHead =  secondHead.getNext();
        }

        getSumExtended(firstHead, secondHead);

        int sum = carry;
        if(firstHead != null) {
            sum += firstHead.getData();
        }
        if(secondHead != null) {
            sum += secondHead.getData();
        }

        if(sum>9) {
            carry = 1;
            sum = sum % 10;
        } else {
            carry = 0;
        }
        list.addFirst(sum);
    }*/

}
