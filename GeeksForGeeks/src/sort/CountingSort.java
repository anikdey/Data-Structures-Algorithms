package sort;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9};
        countingSort(arr, 9);
    }

    public static void countingSort(int[] arr, int maxElement) {

        int[] count = new int[maxElement+1];

        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }
        printArray(count);

        for(int i=1; i<count.length; i++) {
            count[i] = count[i] + count[i-1];
        }
        printArray(count);


//        int start = 0;
//        for(int i=0; i<count.length; i++) {
//            for(int x=start; x<count[i]; x++) {
//                arr[x] = i;
//            }
//            start = count[i];
//        }

        int[] output = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--) {
//            output[count[arr[i]] - 1] = arr[i];
//            --count[arr[i]];
            int num = arr[i];
            int position = count[num] - 1;
            count[num] = position;
            output[position] = num;
        }
        printArray(output);
    }


    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }




}
