package array.easy;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        //int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat = {{1,2,3,6},{4,5,6,6},{7,8,9,6},{7,8,9,6}};
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        for(int i=0, j=mat.length-1; i<mat.length; i++, j--) {
            int forward = mat[i][i];
            int backward = mat[i][j];
            sum += (forward+backward);
        }

        if(mat.length %2==1) {
            int mid = mat.length/2;
            sum -= mat[mid][mid];
        }

        return sum;
    }

}
