package chapter3.singlelinkedlist;

import javax.swing.*;

public class SinglyLinkedList<T> implements ISinglyLinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;
    int size = 0;

    public SinglyLinkedList() {

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
    public void addFirst(T data) {
        Node<T> newestNode = new Node<>(data, head);
        if(head == null) {
            tail = newestNode;
        }
        head = newestNode;
        size++;
    }

    @Override
    public void addLast(T data) {
        Node<T> newestNode = new Node<>(data, null);
        if(head == null) {
            head = newestNode;
        } else {
            tail.next = newestNode;
        }
        tail = newestNode;
        size++;
    }

    @Override
    public void insertAt(int position, T data) {
        if (position>size){
            return;
        }
        if(size==0) {
            addFirst(data);
        } else if(position == size) {
            addLast(data);
        } else {

        }
    }

    @Override
    public T first() {
        if (head != null)
            return head.data;
        return null;
    }

    @Override
    public T last() {
        if(tail != null)
            return tail.data;
        return null;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T getFromTail(int position) {
        return null;
    }

    @Override
    public T getItemAt(int index) {
        if(index>size-1)
            return null;
        else {
            Node<T> temp = head;
            while (index>0) {
                temp = temp.next;
                index--;
            }
            return temp.data;
        }
    }

    @Override
    public void reverse() {
        
    }

    @Override
    public void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node<T> getNodeAt(int index) {
        if(index>size-1)
            return null;
        else {
            Node<T> temp = head;
            while (index>0) {
                temp = temp.next;
                index--;
            }
            return temp;
        }
    }

    public void disconnectNode(Node<T> node) {
        Node<T> nextNode = node.next;
        node.data = nextNode.data;
        node.next = nextNode.next;
        if(nextNode == tail) {
            tail = node;
        }
    }

    private static class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

    }

}