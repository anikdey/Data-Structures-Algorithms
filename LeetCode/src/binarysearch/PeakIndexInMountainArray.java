package binarysearch;

public class PeakIndexInMountainArray {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0};
        //int[] arr = {0, 3, 10,5,2};
        //int[] arr = {3,4,5,1};
        //int[] arr = {1,2,2,2,3,4,6,7,9,10,9,7,6,4,3,2,2,2,1};
        //int[] arr = {24,69,100,99,79,78,67,36,26,19};
        //int[] arr = {3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(arr));

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int expectedIndex = -1;
        int startingPoint = 0;
        int endingPoint = arr.length - 1;
        while (startingPoint<=endingPoint) {
            int mid = (startingPoint + endingPoint) / 2;
            if(arr[mid-1]<arr[mid] && arr[mid]> arr[mid+1]) {
                return mid;
            } else if( arr[mid-1] <= arr[mid] && arr[mid] <= arr[mid+1] ) {
                startingPoint = mid +1;
            } else if( arr[mid-1] >= arr[mid] && arr[mid] >= arr[mid+1] ) {
                endingPoint = mid;
            }
        }
        return expectedIndex;
    }

    public static String defangIPaddr(String address) {
        return address.replaceAll("[*.]", "[.]");
    }

}
