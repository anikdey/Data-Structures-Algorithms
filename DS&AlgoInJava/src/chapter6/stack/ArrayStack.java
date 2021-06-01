package chapter6.stack;

public class ArrayStack<T> implements Stack<T> {

    int size = 0;
    private int top = -1;

    private T[] data;

    public ArrayStack(int capacity) {
        data = (T[]) new Object[capacity];
    }

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void push(T element) {
       if(top == data.length-1) {
           return;
       }
       data[++top] = element;
    }

    @Override
    public T top() {
        if(isEmpty())
            return null;
        return data[top];
    }

    @Override
    public T pop() {
        if(isEmpty())
            return null;
        T element = data[top];
        data[top] = null;
        top--;
        return element;
    }

    @Override
    public void printStack() {
        for(int i=0; i<=top; i++) {
            System.out.print(data[i]+", ");
        }
        System.out.println();
    }
}
