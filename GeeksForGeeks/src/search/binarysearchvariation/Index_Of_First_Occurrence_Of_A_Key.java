package search.binarysearchvariation;

public class Index_Of_First_Occurrence_Of_A_Key {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 1, 5, 6, 7, 8};
        System.out.println(firstOccurrence(arr, 8));
    }

    public static int firstOccurrence(int[] arr, int target) {
        int index = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target) {
                index = mid;
                end = mid-1;
            } else if(arr[mid]>target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return index;
    }

}
