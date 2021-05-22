package codility;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] a = {3, 8, 9, 7, 6};
        int k = 3;

//        int[] a = {3, 8, 9, 7, 6};
//        int k = 0;
//        int[] a = {};
//        int k = 3;

        System.out.println(Arrays.toString(solution(a,k)));
    }

    public static int[] solution(int[] A, int K) {

        if(A.length == 0)
            return A;
        K = K % A.length;
        if(K == 0) {
            return A;
        }
        int[] newArray = new int[A.length];

        int j=0;
        int startingIndex = A.length - K;
        for(int i=startingIndex; i<A.length; i++) {
            newArray[j] = A[i];
            j++;
        }
        for(int i=0; i<startingIndex; i++) {
            newArray[j] = A[i];
            j++;
        }
        return newArray;
    }
}
