package chapter6.stack;

public class MinStack<T> implements Stack<T> {

    private Node<T> trackMin;
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
        addToMinStack(element);
        size++;
    }

    private void addToMinStack(T element) {
        Node<T> newestNode = new Node(element, trackMin);
        if(isEmpty()) {
            trackMin = newestNode;
        } else {
            if((Integer) trackMin.data >= (Integer) newestNode.data) {
                newestNode.next = trackMin;
                trackMin = newestNode;
            }
        }
    }

    public T getMinElement() {
        if(isEmpty())
            return null;
        return trackMin.data;
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
        removeFromMinStack(data);
        size--;
        head = head.next;
        return data;
    }

    private void removeFromMinStack(T data) {
        if(trackMin != null) {
            if(trackMin.data == data) {
                trackMin = trackMin.next;
            }
        }
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

    public void printMinStack() {
        Node<T> temp = trackMin;
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
