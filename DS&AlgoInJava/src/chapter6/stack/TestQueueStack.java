package chapter6.stack;

public class TestQueueStack {

    public static void main(String[] args) {

        QueueUsingStack<Integer> queueUsingStack = new QueueUsingStack<>();
        queueUsingStack.enqueue(1);
        queueUsingStack.enqueue(2);
        queueUsingStack.enqueue(3);
        queueUsingStack.enqueue(4);
        queueUsingStack.enqueue(5);

        queueUsingStack.printStack();

        //queueUsingStack.printRecursive();

        System.out.println(queueUsingStack.top());

        System.out.println("Size: "+queueUsingStack.size());
        System.out.println(queueUsingStack.dequeue());
        System.out.println("Size: "+queueUsingStack.size());
        queueUsingStack.printStack();

        System.out.println(queueUsingStack.dequeue());
        System.out.println("Size: "+queueUsingStack.size());
    }

}
