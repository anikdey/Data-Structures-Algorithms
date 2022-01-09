package chapter3.circularlinkedlist;

public class CircularlyLinkedList<T> implements ICircularlyLinkedList<T> {

    private Node<T> tail = null;
    private int size = 0;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T first() {
        if(isEmpty())
            return null;
        return tail.nextNode.data;
    }

    @Override
    public T last() {
        if(isEmpty())
            return null;
        return tail.data;
    }

    @Override
    public void rotate() {
        if(!isEmpty())
            tail = tail.nextNode;
    }

    @Override
    public void addFirst(T element) {
        if(isEmpty()) {
            tail = new Node<>(element, null);
            tail.nextNode = tail;
        } else {
            tail.nextNode = new Node<>(element, tail.nextNode);
        }
        size++;
    }

    @Override
    public void addLast(T element) {
//        if(isEmpty()) {
//            addFirst(element);
//        } else {
//            Node<T> node = new Node<>(element, tail.nextNode);
//            tail = node;
//            size++;
//        }
        addFirst(element);
        tail = tail.nextNode;
    }

    @Override
    public T removeFirst() {
        if(isEmpty())
            return null;
        Node<T> head = tail.nextNode;
        if(head == tail)
            tail = null;
        else
            tail.nextNode = head.nextNode;
        size--;
        return head.data;
    }

    @Override
    public void printList() {
        if(isEmpty()){
            System.out.println("List is empty");
        } else {

            Node<T> head = tail.nextNode;
            Node<T> temp = head;

            boolean isSameNode = false;
            while (!isSameNode) {
                System.out.print(temp.data+", ");
                temp = temp.nextNode;
                isSameNode = head == temp;
            }
            System.out.println();
        }
    }

    private class Node<T> {
        T data;
        Node<T> nextNode;

        public Node(T data, Node<T> nextNode) {
            this.data = data;
            this.nextNode = nextNode;
        }

        public T getData() {
            return data;
        }
    }

}
