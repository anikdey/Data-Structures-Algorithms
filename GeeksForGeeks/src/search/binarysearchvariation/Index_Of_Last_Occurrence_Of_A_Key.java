package search.binarysearchvariation;

public class Index_Of_Last_Occurrence_Of_A_Key {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 1, 5, 6, 7, 8};
        System.out.println(lastOccurrence(arr, 1));
    }

    public static int lastOccurrence(int[] arr, int target) {
        int index = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if(arr[mid]<target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }





}
