package array.inprogress;

import java.util.ArrayList;
import java.util.List;

public class Lucky_Numbers_In_Matrix_1380 {

    public static void main(String[] args) {
        int[][] matrix =  {{3,7,8}, {9,11,13}, {15,16,17}};
        //int[][] matrix =  {{3,6}, {7,1}, {5,2}, {4,8}};
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        outer:
        for(int i=0; i<matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int expectedCol = 0;
            for(int x=0; x<matrix[i].length; x++) {
                if(min>matrix[i][x]) {
                    expectedCol = x;
                    min = matrix[i][x];
                }
            }

            inner:
            for(int col = 0; col<matrix.length; col++) {
                if(min<matrix[col][expectedCol])
                    break inner;
                list.add(min);
            }

        }

        return list;
    }

}
