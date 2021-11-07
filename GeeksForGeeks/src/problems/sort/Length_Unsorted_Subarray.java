package problems.sort;

import java.util.Arrays;

public class Length_Unsorted_Subarray {

    public static void main(String[] args) {
        printArray(printUnsorted(new int[]{10,12,20,30,25,40,32,31,35,50,60}, 10));
    }

    static int[] printUnsorted(int[] arr, int n) {


        int[] clonedArray = new int[arr.length];

        for(int i=0; i<arr.length; i++)
            clonedArray[i] = arr[i];
        Arrays.sort(clonedArray);

        int leftIndex = 0;
        int rightIndex = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != clonedArray[i]) {
                leftIndex = i;
                break;
            }
        }

        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] != clonedArray[i]) {
                rightIndex = i;
                break;
            }
        }
        return new int[]{leftIndex, rightIndex};
    }

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
