package chapter6.queue;

public interface Queue<T> {

    void enqueue(T element);

    T dequeue();

    T first();

    int size();

    boolean isEmpty();

    void printQueue();

}
