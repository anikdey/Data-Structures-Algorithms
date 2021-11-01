package search;

public class JumpSearch {

    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 36, 40, 55, 60, 67, 70};
        int[] arr = {1, 2, 3};
        System.out.println(jumpSearch(arr, 5, 2));
    }

    public static int jumpSearch(int[] arr, int jumpWindow, int target) {

        int length = arr.length-1;
        int prevPosition = 0;
        int nextPosition = Math.min(prevPosition+jumpWindow, length);

        while (arr[nextPosition]<target) {
            prevPosition = nextPosition;
            if(prevPosition == length)
                return -1;
            nextPosition = Math.min(nextPosition+jumpWindow, length);
        }

        for(int i=prevPosition; i<=nextPosition; i++) {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }

}
