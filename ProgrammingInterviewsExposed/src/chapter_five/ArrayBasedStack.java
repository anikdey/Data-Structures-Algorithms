package chapter_five;

import java.util.EmptyStackException;

public class ArrayBasedStack {

    private int top = -1;
    private int[] stack;

    public ArrayBasedStack(int size) {
        stack = new int[size];
    }

    public void push(int data) {
        if (top == stack.length-1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = data;
    }

    public int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top--];
    }

    public int top() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length-1;
    }

    public void printStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top; i>=0; i--) {
            System.out.print(stack[i]+", ");
        }
    }

    public static void main(String[] args) {
        ArrayBasedStack stack = new ArrayBasedStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Top of the stack is "+ stack.top);
        System.out.println("Is stack full "+ stack.isFull());
        stack.printStack();
    }

}
