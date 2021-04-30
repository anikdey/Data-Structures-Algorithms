package linkedlist;

public class MyLinkedList {


    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
//        myLinkedList.addAtTail(5);
//        myLinkedList.addAtTail(6);
//        myLinkedList.addAtTail(7);

        myLinkedList.printList();

        System.out.println(myLinkedList.middleNode(myLinkedList.head).val);

//        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
//
//        myLinkedList.printList();
//
//        System.out.println("Get At 1 : "+ myLinkedList.get(1));              // return 2
//        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
//        myLinkedList.printList();
//        myLinkedList.get(1);              // return 3
    }


    public Node middleNode(Node head) {
        Node slowNode = head;
        Node fasterNode = head;
        while (fasterNode != null && fasterNode.next != null) {
            slowNode = slowNode.next;
            fasterNode = fasterNode.next.next;
        }
        return slowNode;
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+", ");
            temp= temp.next;
        }
        System.out.println();
    }


    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void addAtHead(int val) {
        Node newestNode = new Node(val, head);
        if(head == null) {
            tail = newestNode;
        }
        head = newestNode;
        size++;
    }

    public void addAtTail(int val) {
        Node newestNode = new Node(val, null);
        if(head == null) {
            head = newestNode;
        } else {
            tail.next = newestNode;
        }
        tail = newestNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index == size) {
            addAtTail(val);
        } else if(index == 0) {
            addAtHead(val);
        } else if(index<size) {
            int counter = 0;
            Node temp = head;
            while (temp.next != null) {
                if(counter == index-1) {
                    break;
                }
                temp = temp.next;
                counter++;
            }
            Node newNode = new Node(val, temp.next);
            temp.next = newNode;
            size++;
        }
    }

    public void removeHead() {
        head = head.next;
        size--;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index>size-1) {
            return;
        }
        if(index == 0) {
            removeHead();
        } else {
            int counter = 0;
            Node temp = head;
            while (counter<index-1) {
                temp = temp.next;
                counter++;
            }
            if(temp.next == tail) {
                tail = temp;
                temp.next = null;
            } else {
                temp.next = temp.next.next;
            }
            size--;
        }
    }

    public int get(int index) {
        if(index<0 || index>size-1) {
            return -1;
        }
        int counter = 0;
        Node temp = head;
        while (counter<index) {
            temp = temp.next;
            counter++;
        }
        return temp.val;
    }


    class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }
    }

}
