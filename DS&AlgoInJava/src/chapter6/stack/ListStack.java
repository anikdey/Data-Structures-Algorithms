package chapter6.stack;

public class ListStack<T> implements Stack<T> {


    private Node<T> head;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(T element) {
        Node<T> newestNode = new Node(element, head);
        head = newestNode;
        size++;
    }

    @Override
    public T top() {
        if(isEmpty())
            return null;
        return head.data;
    }

    @Override
    public T pop() {
        if(isEmpty())
            return null;
        T data = head.data;
        size--;
        head = head.next;
        return data;
    }

    @Override
    public void printStack() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println();
    }

    private class Node<T> {
        T data;
        Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

    }


}
