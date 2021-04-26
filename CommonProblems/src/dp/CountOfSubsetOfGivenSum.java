package dp;

import java.util.Arrays;

public class CountOfSubsetOfGivenSum {


    public static void main(String[] args) {
//        int[] array = {2, 3, 4, 5, 6, 8, 10};
//        int targetSum = 10;
        int[] array = {1,2,3,4,5,6};
        int targetSum = 5;
        System.out.println(countOfSubSets(array, targetSum));
    }

    public static int countOfSubSets(int[] array, int targetSum) {
        int count = 0;
        int length = array.length;
        int[][] matrix = new int[length+1][targetSum+1];

        for(int i=0; i <= length; i++) {

            for(int j=0; j<=targetSum; j++) {

                if(i==0 || j==0) {
                    matrix[i][j] = 0;
                } else if( array[i-1] <= j ) {
                    int max = max( matrix[i-1][j], array[i-1] + matrix[i-1][j-array[i-1]] );
                    System.out.println("Max is "+ max);
                    matrix[i][j] = max;
                    if(max == targetSum) {
                        count++;
                    }
                } else {
                    matrix[i][j] = matrix[i-1][j];
                }
            }

        }

        for(int[] numbers: matrix) {
            System.out.println(Arrays.toString(numbers));
        }


        return count;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

}
