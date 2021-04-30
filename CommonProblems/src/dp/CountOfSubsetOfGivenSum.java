package dp;

import java.util.Arrays;

//https://www.geeksforgeeks.org/count-of-subsets-with-sum-equal-to-x/

public class CountOfSubsetOfGivenSum {


    public static void main(String[] args) {
//        int[] array = {2, 3, 4, 5, 6, 8, 10};
//        int targetSum = 10;
        int[] array = {1,2,3,4,5,6};
        int targetSum = 5;
        System.out.println(countOfSubSets(array, targetSum));
        //System.out.println(subsetSum(array, array.length, targetSum));
    }

    public static int countOfSubSets(int[] array, int targetSum) {
        int count = 0;
        int length = array.length;
        int[][] matrix = new int[length+1][targetSum+1];


        matrix[0][0] = 1;
        for (int i = 1; i <= targetSum; i++)
            matrix[0][i] = 0;
        for (int i = 1; i <= length; i++)
            matrix[i][0] = 1;



        for(int i=0; i <= length; i++) {

            for(int j=0; j<=targetSum; j++) {

                if(i==0 || j==0) {
                    
                    matrix[i][j] = 0;
                } else if( array[i-1] <= j ) {

                    int max = max( matrix[i-1][j], array[i-1] + matrix[i-1][j-array[i-1]] );

                    //int max = matrix[i-1][j] +  matrix[i-1][j-array[i-1]];
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
        //return matrix[length][targetSum];
    }


    //gfg
    static int subsetSum(int a[], int n, int sum) {
        int[][] tab = new int[n + 1][sum + 1];
        tab[0][0] = 1;
        for (int i = 1; i <= sum; i++)
            tab[0][i] = 0;
        for (int i = 1; i <= n; i++)
            tab[i][0] = 1;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= sum; j++)
            {
                // if the value is greater than the sum
                if (a[i - 1] > j)
                    tab[i][j] = tab[i - 1][j];
                else
                {
                    tab[i][j] = tab[i - 1][j] + tab[i - 1][j - a[i - 1]];
                }
            }
        }

        for(int[] numbers: tab) {
            System.out.println(Arrays.toString(numbers));
        }

        return tab[n][sum];
    }


    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

}
