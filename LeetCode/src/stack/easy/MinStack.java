package stack.easy;

public class MinStack {

    private Node head;
    private Node trackMin;


    public MinStack() {

    }

    public void push(int val) {
        Node newestNode = new Node(val, head);
        head = newestNode;
        addToMinStack(val);
    }

    public void pop() {
        int data = head.data;
        removeFromMinStack(data);
        head = head.next;
    }

    public int top() {
        return head.data;
    }

    public int getMin() {
        return trackMin.data;
    }

    private void addToMinStack(int element) {
        Node newestNode = new Node(element, trackMin);
        if(trackMin == null) {
            trackMin = newestNode;
        } else {
            if((Integer) trackMin.data >= (Integer) newestNode.data) {
                newestNode.next = trackMin;
                trackMin = newestNode;
            }
        }
    }

    private void removeFromMinStack(int data) {
        if(trackMin != null) {
            if(trackMin.data == data) {
                trackMin = trackMin.next;
            }
        }
    }

    private class Node {
        int data;
        Node next;
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


//    public static void main(String[] args) {
//        MinStack minStack = new MinStack();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        System.out.println(minStack.getMin()); // return -3
//
//        minStack.pop();
//        System.out.println(minStack.top()); // return 0
//        System.out.println(minStack.getMin()); // return -2
//    }

}
