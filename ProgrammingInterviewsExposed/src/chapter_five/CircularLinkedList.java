package chapter_five;

public class CircularLinkedList {

    private Node tail;

    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void add(int data) {
        Node newestNode = new Node(data, null);
        if(isEmpty()) {
            tail = newestNode;
            tail.next = tail;
        } else {
            newestNode.next = tail.next;
            tail.next = newestNode;
            tail = newestNode;
        }
        size++;
    }

    public void rotate() {
        if(isEmpty())
            return;
        tail = tail.next;
    }

    public void insertAtTheBeginning(int data) {
        if(isEmpty()) {
            add(data);
        } else {
            Node newestNode = new Node(data, tail.next);
            tail.next = newestNode;
            size++;
        }
    }


    public void insertAt(int index, int data) {
        if(size ==0 ) {
            add(data);
        } else if(size == index) {
            add(data);
        } else {
            Node temp = tail.next;
            int i=1;
            while (i<index) {
                temp = temp.next;
                i++;
            }
            Node newest = new Node(data, temp.next);
            temp.next = newest;
            size++;
        }
    }


    public int removeFirst() {
        if(isEmpty())
            return -1;
        int data = tail.next.val;
        if(getSize()==1) {
            tail = null;
        }else {
            tail.next = tail.next.next;
        }
        size--;
        return data;
    }

    private int deleteFromBeginning() {
        if(size==0)
            return -1;
        int data = tail.next.val;
        if(size==1) {
            tail = null;
        } else {
            tail.next = tail.next.next;
        }
        size--;
        return data;
    }

    public void deleteFromEnd() {
        if(isEmpty())
            return;
        if(size==1) {
            tail = null;
        }
        Node prev = null;
        Node temp = tail.next;
        while (temp.next != tail.next) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        tail = prev;
        size--;
    }

    public void deleteAt(int position) {
        if(position>size) {
            return;
        }
        if(position==1) {
            deleteFromBeginning();
        } else if(position == size) {
            deleteFromEnd();
        } else {
            int i=1;
            Node temp = tail.next;
            Node prev = null;
            while (i<position) {
                prev = temp;
                temp = temp.next;
                i++;
            }
            prev.next = temp.next;
            size--;
        }
    }

    public void printList() {
        if(isEmpty())
            return;
        Node temp = tail.next;
        while (temp.next != tail.next) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.print(temp.val);
        System.out.println();
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
        CircularLinkedList list = new CircularLinkedList();
        list.add(10);
        list.add(15);
        list.add(20);
        list.printList();
        System.out.println("====== called rotate ========");
        //list.rotate();
        list.rotate();
        list.printList();
        //System.out.println("Remove first "+ list.removeFirst());
        list.insertAtTheBeginning(122);

        list.insertAt(3, 500);
        list.printList();
        System.out.println("Delete first element "+ list.deleteFromBeginning());
        list.printList();
        list.deleteFromEnd();
        System.out.println("AFter deleting last element");
        list.add(56622);
        list.printList();
        System.out.println("AFter deleting 3rd element");
        list.deleteAt(3);
        list.printList();


    }

}
