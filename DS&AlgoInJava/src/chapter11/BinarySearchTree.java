package chapter11;

import chapter6.queue.LinkedQueue;
import chapter6.queue.Queue;

public class BinarySearchTree {

    private Node root;
    private int size = 0;

    public void insert(int data) {
        Node newestNode = new Node(data, null, null);
        if(root == null) {
            root = newestNode;
        } else {
            Node temp = root;
            Node prev = null;
            while (temp != null) {
                prev = temp;
                if(temp.data>=data) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }
            if (prev.data>data)
                prev.left = newestNode;
            else
                prev.right = newestNode;
        }
        size++;
    }

    public void insertRecursive(Node root, int data) {
        if(root == null) {
            root = new Node(data, null, null);
        } else if(root.data>data) {
            insertRecursive(root.left, data);
        } else {
            insertRecursive(root.right, data);
        }
    }


    public int getMin() {
        if (root == null)
            return -1;
        Node temp = root;
        while (temp.left != null)
            temp = temp.left;
        return temp.data;
    }

    public int getMax() {
        if (root == null)
            return -1;
        Node temp = root;
        while (temp.right != null)
            temp = temp.right;
        return temp.data;
    }

    public boolean search(int data) {
        //return searchIterative(data);
        return searchRecursive(root, data);
    }

    private boolean searchIterative(int data) {
        Node temp = root;
        while (temp != null ) {
            Node df = temp;
            if(temp.data == data){
                return true;
            } else if(temp.data>data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return false;
    }

    private boolean searchRecursive(Node root, int data) {
        if(root == null) {
            return false;
        } else if(root.data == data) {
            return true;
        } else if (root.data>data) {
            return searchRecursive(root.left, data);
        } else {
            return searchRecursive(root.right, data);
        }
    }

    public int height(Node root) {
        if(root == null)
            return -1;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public Node getRoot() {
        return root;
    }

    public int getSize() {
        return size;
    }

    public void printBST(Node root) {

        if(root.left != null)
            printBST(root.left);

        if(root.right != null)
            printBST(root.right);

        System.out.println(" Node "+ root.data);
        //System.out.println("Right Node "+ root.data);
    }

    public int getSum(Node root, int low, int high) {
        if(root == null)
            return 0;

        if(root.data>=low && root.data<=high)
            return root.data + (getSum(root.left, low, high)) + getSum(root.right, low, high);
        else
            return (getSum(root.left, low, high)) + getSum(root.right, low, high);
    }

    public void printLevelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedQueue<>();
        queue.enqueue(root);
        while (!queue.isEmpty()) {

            Node temp = queue.dequeue();
            System.out.println(temp.data);

            if(temp.left != null)
                queue.enqueue(temp.left);
            if (temp.right != null)
                queue.enqueue(temp.right);

        }
    }

    public void printPreOrder(Node root) {
        if(root == null)
            return;
        System.out.println(root.data);
        printLevelOrder(root.left);
        printLevelOrder(root.right);
    }

    public void printInorder(Node root) {
        if(root == null)
            return;
        printLevelOrder(root.left);
        System.out.println(root.data);
        printLevelOrder(root.right);
    }

    public void printPostOrder(Node root) {
        if(root == null)
            return;
        printLevelOrder(root.left);
        printLevelOrder(root.right);
        System.out.println(root.data);
    }


    private class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public int getData() {
            return data;
        }
    }


}
