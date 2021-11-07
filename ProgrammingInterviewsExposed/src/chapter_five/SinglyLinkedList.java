package chapter_five;

public class SinglyLinkedList {

    Node head;
    private Node tail;

    private int size = 0;


    public void add(int data) {
        Node newestNode = new Node(data, null);
        if(isEmpty())
            head = newestNode;
        else
            tail.next = newestNode;
        tail = newestNode;
        size++;
    }

    public void insertInFront(int data) {
        head = new Node(data, head);
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void traverseList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // assumed zero based index.....
    public void insertAtIndex(int index, int data) {
        if(index == 0 ) {
            insertInFront(data);
        } else if(index>=size) {
            add(data);
        } else {
            Node temp = head;
            Node prev = null;
            int counter = 0;
            while (temp != null && counter != index) {
                prev = temp;
                temp = temp.next;
                counter++;
            }
            if(prev != null) {
                Node node = new Node(data, prev.next);
                prev.next = node;
            }
        }
    }

    public boolean deleteAtIndex(int index) {
        if(index>size-1) {
            return false;
        }

        if(index == 0) {
            head = head.next;
        } else {
            Node prev = null;
            Node temp = head;
            int counter = 0;
            while (temp != null && counter != index-1) {
                prev = temp;
                temp = temp.next;
                counter++;
            }
            prev.next = temp.next;
            if(temp.next == null)
                tail = prev;
        }
        size--;
        return true;
    }

    private class Node {
        int val;
        Node next;
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.insertInFront(1);
        list.insertAtIndex(4, 55);
        System.out.println("size is "+list.size);
        list.traverseList();
        list.insertAtIndex(5, 65);
        //list.insertAtIndex(4, 100);
        list.traverseList();
        System.out.println("size is "+list.size);
        list.deleteAtIndex(5);
        list.traverseList();
        list.add(33);
        System.out.println("size is "+list.size);
        list.deleteAtIndex(0);
        list.traverseList();
    }



}
