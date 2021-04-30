package chapter3.singlelinkedlist;

public class SinglyLinkedList<T> implements ISinglyLinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;
    int size = 0;

    public SinglyLinkedList() {

    }

    public Node<T> getHead() {
        return head;
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
    public void add(T data) {
        addLast(data);
    }

    @Override
    public void addFirst(T data) {
        Node<T> newestNode = new Node<>(data, head);
        if(head == null) {
            tail = newestNode;
        }
        head = newestNode;
        size++;
    }

    @Override
    public void addLast(T data) {
        Node<T> newestNode = new Node<>(data, null);
        if(head == null) {
            head = newestNode;
        } else {
            tail.next = newestNode;
        }
        tail = newestNode;
        size++;
    }

    @Override
    public void insertAt(int position, T data) {
        if (position>size){
            return;
        }
        if(size==0) {
            addFirst(data);
        } else if(position == size) {
            addLast(data);
        } else {

        }
    }

    @Override
    public T first() {
        if (head != null)
            return head.data;
        return null;
    }

    @Override
    public T last() {
        if(tail != null)
            return tail.data;
        return null;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T getFromTail(int position) {
        if(position>size-1)
            return null;
        else{
            //return getFromTailIterative(position);
            Node<T> temp = head;
            getFromTailRecursively(position, temp);
            return expectedData;
        }
    }

    private T getFromTailIterative(int position) {
        int counter = 0;
        Node<T> temp = head;
        Node<T> expectedNode = null;
        while (temp!=null) {
            if(counter>position-1) {
                expectedNode = temp;
            }
            counter++;
            temp = temp.next;
        }
        return expectedNode.data;
    }

    private int count = 0;
    private T expectedData;

    private void getFromTailRecursively(int position, Node<T> currentNode) {
        if(currentNode.next == null) {
            return;
        }
        getFromTailRecursively(position, currentNode.getNext());
        count = count + 1;
        if(count == position) {
            expectedData = currentNode.data;
            count = 0;
            return;
        }
    }

    @Override
    public T getItemAt(int index) {
        if(index>size-1)
            return null;
        else {
            Node<T> temp = head;
            while (index>0) {
                temp = temp.next;
                index--;
            }
            return temp.data;
        }
    }

    @Override
    public void reverse() {
        iterative();
        //reverseRecursively(head);
    }

    private void iterative() {
        Node<T> prevNode = null;
        Node<T> tempNode = head;
        while (tempNode != null) {
            Node<T> nextNode = tempNode.next;
            tempNode.next = prevNode;
            prevNode = tempNode;
            tempNode = nextNode;
        }
        head = prevNode;
    }

    private void reverseRecursively(Node<T> currentNode) {
        if (currentNode == null) {
            return;
        }

        if(currentNode.getNext() == null) {
            this.head = currentNode;
            return;
        }
        reverseRecursively(currentNode.getNext());
        currentNode.getNext().setNext(currentNode);
        currentNode.setNext(null);
    }

    @Override
    public boolean searchItem(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if(temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    private void searchRecursively() {
        //Todo implement search recursively...
    }

    @Override
    public void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node<T> getNodeAt(int index) {
        if(index>size-1)
            return null;
        else {
            Node<T> temp = head;
            while (index>0) {
                temp = temp.next;
                index--;
            }
            return temp;
        }
    }

    public void disconnectNode(Node<T> node) {
        Node<T> nextNode = node.next;
        node.data = nextNode.data;
        node.next = nextNode.next;
        if(nextNode == tail) {
            tail = node;
        }
    }

    static class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

    }

}
