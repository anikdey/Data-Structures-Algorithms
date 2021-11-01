package sort;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};
        insertionSort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }

    public static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int currentNumber = arr[i];
            int j = i;
            while (j>0 && arr[j-1]>currentNumber){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = currentNumber;
        }
    }

}
