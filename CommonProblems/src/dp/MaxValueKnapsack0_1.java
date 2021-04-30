package dp;

// https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/

import java.util.Arrays;

public class MaxValueKnapsack0_1 {


    static int[][] matrix;

    public static void main(String[] args) {

        int values[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int capacity = 50;

//        int values[] = new int[] { 10, 15, 40 };
//        int weight[] = new int[] { 1, 2, 3 };
//        int capacity = 6;

        matrix = new int[weight.length+1][capacity+1];

        for (int[] row: matrix)
            Arrays.fill(row, -1);


        //System.out.println(getKnapsack(weight, values, capacity));
        System.out.println(getKnapsackAgain( values, weight, capacity));
        //System.out.println(knapSack(6, weight, values, values.length));

        System.out.println("Knapsack Recursive : " + knapsackRecursive(weight, values, capacity, weight.length));

    }


    static int knapsackRecursive(int[] weight, int[] values, int w, int n) {
        if(w==0 || n==0){
            return 0;
        }

        if(matrix[n][w] != -1)
            return matrix[n][w];

        if(weight[n-1]<=w){
            return matrix[n][w] = max(values[n-1] + knapsackRecursive(weight, values, w - weight[n-1], n-1), knapsackRecursive(weight, values, w, n-1));
        } else {
            return matrix[n][w] = knapsackRecursive(weight, values, w, n-1);
        }

    }



    static int knapSack(int W, int wt[], int val[], int n) {
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (w = 0; w <= W; w++)
            {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        return K[n][W];
    }

    public static int getKnapsack( int[] weight, int[] values, int capacity) {

        int n = weight.length;
        int m = capacity;

        int knapsack[][] = new int[n+1][m+1];

        for(int i=0; i<=n; i++) {
            for(int j=0; j<=capacity; j++) {
                if(i==0 || j==0) {
                    knapsack[i][j] = 0;
                } else if(weight[i-1] <= j) {
                    knapsack[i][j] = max(values[i - 1] + knapsack[i - 1][j - weight[i - 1]], knapsack[i - 1][j]);
                } else {
                    knapsack[i][j] = knapsack[i-1][j];
                }
            }
        }

        for(int[] innerArray: knapsack) {
            System.out.println(Arrays.toString(innerArray));
        }

        return knapsack[n][m];
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int getKnapsackAgain(int[] values, int[] weight, int capacity) {
        int row = weight.length;
        int column = capacity+1;
        int[][] matrix = new int[row+1][column];

        for(int i=0; i<=row; i++) {
            for(int currentWeight = 0; currentWeight<=capacity; currentWeight++) {

                if(i==0 || currentWeight == 0) {
                    matrix[i][currentWeight] = 0;
                } else if( currentWeight >= weight[i-1] ) {
                    matrix[i][currentWeight] = max( matrix[i-1][currentWeight], matrix[i-1][currentWeight - weight[i-1]] + values[i-1] );
                } else {
                    matrix[i][currentWeight] = matrix[i-1][currentWeight];
                }
            }
        }
        return matrix[row][capacity];
    }

}
