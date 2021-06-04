package chapter6.stack;

public class QueueUsingStack<T> {

    Stack<T> listStack;

    public QueueUsingStack() {
        listStack = new ListStack<>();
    }

    public int size() {
        return listStack.size();
    }


    public boolean isEmpty() {
        return listStack.isEmpty();
    }


    public void enqueue(T element) {
        listStack.push(element);
    }


    public T top() {
        if(isEmpty())
            return null;
        Stack<T> tempStack = new ListStack<>();
        while (!listStack.isEmpty()) {
            tempStack.push(listStack.pop());
        }
        T data = tempStack.top();
        while (!tempStack.isEmpty()) {
            listStack.push(tempStack.pop());
        }
        return data;
    }


    public T dequeue() {
        if(isEmpty())
            return null;
        Stack<T> tempStack = new ListStack<>();
        while (!listStack.isEmpty()) {
            tempStack.push(listStack.pop());
        }
        T data = tempStack.pop();
        while (!tempStack.isEmpty()) {
            listStack.push(tempStack.pop());
        }
        return data;
    }


    public void printStack() {
        listStack.printStack();
    }

    public void printRecursive() {
        printRecursively(listStack, listStack.pop());
    }

    private void printRecursively(Stack<T> stack, T data) {
        if(!stack.isEmpty()) {
            printRecursively(stack, stack.pop());
        }
        System.out.print(data+", ");
    }

}
