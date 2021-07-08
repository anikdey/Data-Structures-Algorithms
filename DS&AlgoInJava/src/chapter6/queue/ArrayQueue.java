package chapter6.queue;

public class ArrayQueue<T> implements Queue<T>{

    private T data[];
    int size = 0;
    int front = 0;

    public ArrayQueue(int size) {
        data = (T[]) new Object[size];
    }

    @Override
    public void enqueue(T element) {
        if(size < data.length) {
            int index = (front+size) % data.length;
            data[index] = element;
            size++;
        }
    }

    @Override
    public T dequeue() {
        if(isEmpty())
            return null;
        T element = data[front];
        data[front] = null;
        front = (front+1) % data.length;
        size--;
        return element;
    }

    @Override
    public T first() {
        return null;
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

    }
}
