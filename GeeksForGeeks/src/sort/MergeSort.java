package sort;

public class MergeSort {

    public static void main(String[] args) {
        printArray(testMerge());
    }

    public static void mergeSort(int[] array, int start, int end) {
        if(start<end) {
            int mid = (start+end)/2;
            mergeSort(array, start, mid);
            mergeSort(array, mid+1, end);
            merge(array, start, mid, end);
        }
    }

    public static void merge(int[] array, int lowerBound, int mid, int upperBound) {

    }

    public static int[] testMerge() {
        int[] leftArray = {2, 4, 5, 6, 10};
        int[] rightArray = {1, 3, 6, 88, 90, 110};
        int[] mergedArray = new int[leftArray.length+rightArray.length];

        int leftCounter = 0;
        int rightCounter = 0;
        int currentIndex = 0;

        while (leftCounter<leftArray.length && rightCounter<rightArray.length) {
            if(leftArray[leftCounter]<=rightArray[rightCounter]) {
                mergedArray[currentIndex] = leftArray[leftCounter];
                leftCounter++;
            } else {
                mergedArray[currentIndex] = rightArray[rightCounter];
                rightCounter++;
            }
            currentIndex++;
        }

        while (leftCounter<leftArray.length) {
            mergedArray[currentIndex] = leftArray[leftCounter];
            leftCounter++;
            currentIndex++;
        }

        while (rightCounter<rightArray.length) {
            mergedArray[currentIndex] = rightArray[rightCounter];
            rightCounter++;
            currentIndex++;
        }

        return mergedArray;
    }

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
