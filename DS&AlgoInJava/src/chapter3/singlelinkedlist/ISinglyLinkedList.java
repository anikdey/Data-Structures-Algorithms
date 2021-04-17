package chapter3.singlelinkedlist;

public interface ISinglyLinkedList<T> {

    int size();

    boolean isEmpty();

    void addFirst(T data);

    void addLast(T data);

    void insertAt(int position, T data);

    T first();

    T last();

    T removeFirst();

    T removeLast();

    T getFromTail(int position);

    T getItemAt(int index);

    void reverse();

    boolean searchItem(T data);

    void printList();

}
