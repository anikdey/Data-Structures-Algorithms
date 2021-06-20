package array;

public class ValidMountainArray {

    public static void main(String[] args) {
        int[] arr = {3};
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {

        if(arr.length < 3)
            return false;

        int peak = Integer.MIN_VALUE;
        int i=0;
        for(i=0; i<arr.length-1; i++) {
            if(arr[i]<arr[i+1])
                peak = arr[i+1];
        }
        if(i == arr.length-1 && arr[i]>=arr[i-1])
            return false;

        for(int x=i; x<arr.length; x++) {
            if(peak<arr[x])
                return false;
            peak = arr[x];
        }
        return true;
    }

}
