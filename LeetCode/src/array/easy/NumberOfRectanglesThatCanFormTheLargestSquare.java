package array.easy;

public class NumberOfRectanglesThatCanFormTheLargestSquare {

    public static void main(String[] args) {
        System.out.println(countGoodRectangles(new int[][]{ {5,8}, {3,9}, {5,12}, {16,5}}));
        System.out.println(countGoodRectangles(new int[][]{ {2,3}, {3,7}, {4,3}, {3,7}}));
    }

    public static int countGoodRectangles(int[][] rectangles) {
        int count = 1;
        int maxLength = Math.min(rectangles[0][0], rectangles[0][1]);
        for(int i=1; i<rectangles.length; i++) {
            int length = Math.min(rectangles[i][0], rectangles[i][1]);
            if(length == maxLength)
                count++;
            if(length>maxLength) {
                maxLength = length;
                count = 1;
            }
        }
        return count;
    }

}
