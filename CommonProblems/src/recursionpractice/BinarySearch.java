package recursionpractice;

public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int expectedNumber = binarySearch(numbers, 13, 0, numbers.length-1);
        System.out.println(expectedNumber);

    }


    public static int binarySearch(int[] sortedArray, int target, int low, int high) {
        if(low>high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if(sortedArray[mid] == target) {
            return sortedArray[mid];
        } else if(sortedArray[mid]<target) {
            return binarySearch(sortedArray, target,mid+1, high);
        } else if(sortedArray[mid]>target) {
            return binarySearch(sortedArray, target,low, mid-1);
        }
        return -1;
    }

}


