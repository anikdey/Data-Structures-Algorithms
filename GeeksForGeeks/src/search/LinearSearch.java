package search;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 10, 20, 22, 25, 65, 100};
        System.out.println(usingForLoop(arr, 100));
        System.out.println(usingWhileLoop(arr, 22));
    }

    private static int usingForLoop(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    private static int usingWhileLoop(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            if(arr[start] == target) {
                return start;
            }
            if(arr[end] == target){
                return end;
            }
            start++;
            end--;
        }
        return -1;
    }

}
