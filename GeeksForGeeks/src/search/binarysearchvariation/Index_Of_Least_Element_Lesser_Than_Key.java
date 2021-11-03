package search.binarysearchvariation;

public class Index_Of_Least_Element_Lesser_Than_Key {

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 5, 5, 5, 6, 6};
        //int[] arr = {6, 6};
        System.out.println(getIndex(arr, 2));
    }

    // I just wanted to return -1 if the expected lesser element
    // is not in the array....
    public static int getIndex(int[] arr, int target) {
        int index = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target) {
                end = mid - 1;
                index = end;
            } else if(arr[mid]>target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }



}
