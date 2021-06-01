package chapter6.stack;

public interface Stack<T> {

    int size();

    boolean isEmpty();

    void push(T element);

    T top();

    T pop();

    void printStack();
}
