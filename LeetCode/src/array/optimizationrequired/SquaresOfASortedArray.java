package array.optimizationrequired;

import java.util.Arrays;

public class SquaresOfASortedArray {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4,-1,0,3,10})));
    }

    public static int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
