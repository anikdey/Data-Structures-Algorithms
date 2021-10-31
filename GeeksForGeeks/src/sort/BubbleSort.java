package sort;

public class BubbleSort {

    public static void main(String[] args) {
        printArray(incrementalForLoop());
        printArray(decrementalForLoop());
    }

    public static int[] incrementalForLoop() {
        int[] arr = {8, 5, 2, 9, 5, 6, 3};
        for(int i=0; i<arr.length; i++) {
            for(int x=0; x<arr.length-1-i; x++) {
                if(arr[x] > arr[x+1]) {
                    int temp = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] decrementalForLoop() {
        int[] arr = {8, 5, 2, 9, 5, 6, 3};
        for(int i=0; i<arr.length; i++ ){
            for(int x=arr.length-1; x>i; x--) {
                if(arr[x] < arr[x-1]) {
                    int temp = arr[x];
                    arr[x] = arr[x-1];
                    arr[x-1] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }


}
