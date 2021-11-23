package sort;

public class MergeSort {


    public static void main(String[] args) {
        printArray(testMerge());
        int[] array = {3,4,56,6,4,3,4,5,6,3,56,6,77};
        //int[] array = {9,8,7,6,5,4,3,2,1};
        mergeSort(array, 0 , array.length-1);
        printArray(array);
    }

    public static void mergeSort(int[] array, int start, int end) {
        if(start<end) {
            int mid = (start+end)/2;
            mergeSort(array, start, mid);
            mergeSort(array, mid+1, end);
            merge2(array, start, mid, end);
        }
    }

    public static void merge2(int[] array, int lowerBound, int mid, int upperBound) {
        int leftArraySize = mid - lowerBound + 1;
        int rightArraySize = upperBound - mid;

        int[] left = new int[leftArraySize];
        int[] right = new int[rightArraySize];

        for(int i=0; i<left.length; i++) {
            left[i] = array[lowerBound+i];
        }
        for(int j=0; j<right.length; j++) {
            right[j] = array[mid+j+1];
        }
        int k = lowerBound;
        int l = 0;
        int r = 0;
        while (l<left.length && r<right.length) {
            if(left[l]<=right[r]) {
                array[k] = left[l];
                l++;
            } else {
                array[k] = right[r];
                r++;
            }
            k++;
        }
        while (l<left.length) {
            array[k] = left[l];
            l++;
            k++;
        }
        while (r<right.length) {
            array[k] = right[r];
            r++;
            k++;
        }
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
