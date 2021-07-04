package array.easy;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {

    public static void main(String[] args) {
        //int[] numbers = {5,6,2,7,4};
        int[] numbers = {4,2,5,9,7,4,8};
        System.out.println(maxProductDifference(numbers));
    }

    public static long maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1] * nums[nums.length-2] - nums[0] * nums[1];
    }


}
