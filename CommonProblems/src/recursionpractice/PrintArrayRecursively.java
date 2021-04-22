package recursionpractice;

public class PrintArrayRecursively {

    public static void main(String[] args) {
        int[] originalArray = {1, 1, 2, 2, 3, 4, 5, 1};
        printRecursively(originalArray, 0);
        printReverseUsingRecursion(originalArray, 0);
    }


    public static void printRecursively(int[] originalArray, int length) {
        if(length == originalArray.length) {
            System.out.println();
            return;
        }
        System.out.print(originalArray[length]+", ");
        printRecursively(originalArray, length+1);
    }

    public static void printReverseUsingRecursion(int[] originalArray, int length) {
        if(length == originalArray.length) {
            return;
        }
        printReverseUsingRecursion(originalArray, length+1);
        System.out.print(originalArray[length]+", ");
        if(length==0) {
            System.out.println();
        }
    }

}
