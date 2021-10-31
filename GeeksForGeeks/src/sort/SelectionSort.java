package sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,20, 22, 10, 25, 65, 100};
        selectionSort(arr);

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+", ");

    }

    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int minIndex = i;
            int currentMin = arr[i];
            for(int x=i+1; x<arr.length; x++) {
                if(currentMin>arr[x]) {
                    minIndex = x;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}
