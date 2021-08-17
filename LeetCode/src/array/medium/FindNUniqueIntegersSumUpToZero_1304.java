package array.medium;

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero_1304 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(6)));
    }


    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int half = n /2;
        int right = n-1;
        if(n % 2 == 1) {
            arr[n-1] = 0;
            right = n - 2;
        }
        for(int i=0; i<half; i++) {
            arr[i] = i + 1;
            arr[right] = - i - 1;
            right--;
        }
        return arr;
    }
}
