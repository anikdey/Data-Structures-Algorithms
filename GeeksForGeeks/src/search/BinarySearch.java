package search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 10, 20, 22, 25, 65, 100};
        System.out.println(binarySearch(arr, 0, arr.length-1, 11));
        System.out.println(binarySearchRecursive(arr, 0, arr.length-1, 10));
    }

    public static int binarySearch(int[] arr, int start, int end, int target) {
        while (start<=end) {
            int mid = start + (end-start) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid]>target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int start, int end, int target) {
        if (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid]<target) {
                return binarySearchRecursive(arr, mid+1, end, target);
            } else {
                return binarySearchRecursive(arr, start, mid-1, target);
            }
        }


        return -1;
    }

}
