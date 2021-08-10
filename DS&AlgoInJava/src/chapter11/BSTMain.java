package chapter11;

public class BSTMain {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.insert(10);
//        binarySearchTree.insert(9);
//        binarySearchTree.insert(5);
//        binarySearchTree.insert(1);
//        binarySearchTree.insert(4);
//        binarySearchTree.insert(3);
//        binarySearchTree.insert(8);
//        binarySearchTree.insert(50);

        binarySearchTree.insert(15);
        binarySearchTree.insert(10);
        binarySearchTree.insert(20);
        binarySearchTree.insert(25);
        binarySearchTree.insert(8);
        binarySearchTree.insert(12);

//        System.out.println(binarySearchTree.getSize());
//        System.out.println(binarySearchTree.getMin());
//        System.out.println(binarySearchTree.getMax());
//        System.out.println(binarySearchTree.search(3));
//
//        System.out.println("Max Height "+ binarySearchTree.height(binarySearchTree.getRoot()));

        //binarySearchTree.printBST(binarySearchTree.getRoot());
        //System.out.println("Sum is "+ binarySearchTree.getSum(binarySearchTree.getRoot(), 26 ,30));

        System.out.println("Level order traversal");
        binarySearchTree.printLevelOrder(binarySearchTree.getRoot());
        System.out.println("Preorder traversal");
        binarySearchTree.printPreOrder(binarySearchTree.getRoot());



    }



}
