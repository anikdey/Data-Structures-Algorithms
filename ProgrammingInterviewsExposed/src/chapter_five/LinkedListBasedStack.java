package chapter_five;

import java.util.EmptyStackException;

public class LinkedListBasedStack {

    private int size = 0;
    private Node head;


    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void push(int data) {
        head = new Node(data, head);
        size++;
    }

    public int pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int top() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return head.data;
    }

    public void printStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println();
    }




    private class Node {
        int data;
        Node next;
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkedListBasedStack stack = new LinkedListBasedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Top of the stack is "+ stack.top());
        stack.printStack();
    }



}
