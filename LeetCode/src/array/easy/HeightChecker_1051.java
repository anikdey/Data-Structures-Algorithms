package array.easy;

import java.util.Arrays;

public class HeightChecker_1051 {

    public static void main(String[] args) {

    }

    public int heightChecker(int[] heights) {
        int[] newArray = Arrays.copyOf(heights, heights.length);
        Arrays.sort(newArray);

        int count = 0;

        for(int i=0; i<heights.length; i++) {
            if(heights[i] != newArray[i])
                count++;
        }
        return count;
    }

}
