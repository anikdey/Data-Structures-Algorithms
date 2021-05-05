package binarysearch;

public class CountNegativeNumbersInSortedMatrix {

    public static void main(String[] args) {
        //int[] numbers = {4,3,2,-1};
        //int[] numbers = {4,3,2,1,0,-1,-1,-2,-3};
        //int[] numbers = {0,1};
        int[] numbers = {};
        System.out.println(getNegativeNumberCount(numbers));

       int[][] grid = {{4,3,2,-1}, {3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
       System.out.println(countNegatives(grid));


    }

    public static int countNegatives(int[][] grid) {
        int totalCount = 0;
        for(int[] numbers: grid) {
            totalCount += getNegativeNumberCount(numbers);
        }

        return totalCount;
    }

    public static int getNegativeNumberCount(int[] numbers) {
        int startingPoint = 0;
        int endingPoint = numbers.length-1;

        while (startingPoint<=endingPoint) {

            int mid = (startingPoint + endingPoint) / 2;

            if(numbers[mid] < 0) {
                endingPoint = mid - 1;
            } else if(numbers[mid] >= 0) {
                startingPoint = mid + 1;
            }

        }
        return numbers.length - endingPoint - 1;
    }

}
