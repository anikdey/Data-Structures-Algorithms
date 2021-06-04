package chapter6.queue;

public class TestQueue {

    public static void main(String[] args) {
        testLinkedQueue();
    }

    private static void testLinkedQueue() {

        Queue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.printQueue();

        System.out.println("Size : "+queue.size());

        System.out.println("First item is "+queue.first());

        System.out.println("Dequeue "+ queue.dequeue());

        System.out.println("Size : "+queue.size());

        System.out.println("First item is "+queue.first());

        queue.printQueue();

    }

}
