package chapter6.queue;

public class LinkedQueue<T> implements Queue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    @Override
    public void enqueue(T element) {
        Node<T> newestNode = new Node<>(element, null);
        if(head == null) {
            head = newestNode;
        } else {
            tail.next = newestNode;
        }
        tail = newestNode;
        size++;
    }

    @Override
    public T dequeue() {
        if(isEmpty())
            return null;
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    @Override
    public T first() {
        if(isEmpty())
            return null;
        return head.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void printQueue() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

    }

}
