package sort;

public class QuickSort {


    public static void main(String[] args) {
        //int[] array = {7, 6, 10, 5, 9, 2, 1, 15, 7};
        //int[] array = {5,2,3,1};
        int[] array = {5,1,1,2,0,0};
        quickSort(array);
        printArray(array);
    }

    public static void quickSort(int[] array) {
        partition(array, 0, array.length-1);
    }

    private static void partition(int[] array, int start, int end) {
        if(start<=end) {
            int pivot = array[start];
            int left = start+1;
            int right = end;
            while (left<=right) {
                if(array[left]>pivot && array[right]<pivot) {
                    swap(left, right, array);
                }
                if(array[left]<=pivot)
                    left++;
                if (array[right]>=pivot)
                    right--;
            }
            swap(start, right, array);
            partition(array, start, right-1);
            partition(array, right+1, end);
        }

    }


    private static void swap(int leftIndex, int rightIndex, int[] array) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }


    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
