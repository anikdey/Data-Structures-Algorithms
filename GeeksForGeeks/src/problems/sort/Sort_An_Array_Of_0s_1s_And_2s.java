package problems.sort;

import java.util.Arrays;

public class Sort_An_Array_Of_0s_1s_And_2s {

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        //sortArray(arr);
        int[] newArra = arr.clone();

        printArray(usingCountingSort(arr));
    }

    public static int[] usingCountingSort(int[] arr) {
        int[] count = new int[3];

        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        for(int i=1; i<count.length; i++) {
            count[i] = count[i] + count[i-1];
        }

        int[] outputArray = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--) {
            int num = arr[i];
            int position = count[num]-1;
            outputArray[position] = num;
            count[num] = position;
        }
        return outputArray;
    }

    public static void sortArray(int[] arr) {
        int countZeros = 0;
        int countOnes = 0;
        int countTwos = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                countZeros++;
            } else if(arr[i] == 1) {
                countOnes++;
            } else {
                countTwos++;
            }
        }
        int currentIndex = 0;
        while (countZeros>0) {
            arr[currentIndex] = 0;
            currentIndex++;
            countZeros--;
        }
        while (countOnes>0) {
            arr[currentIndex] = 1;
            currentIndex++;
            countOnes--;
        }
        while (countTwos>0) {
            arr[currentIndex] = 2;
            currentIndex++;
            countTwos--;
        }
    }

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
