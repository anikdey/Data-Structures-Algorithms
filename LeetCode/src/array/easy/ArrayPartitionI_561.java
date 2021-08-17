package array.easy;

import java.util.Arrays;

public class ArrayPartitionI_561 {

    public static void main(String[] args) {

    }

    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i += 2) {
            //sum += Math.min(nums[i], nums[i+1]);
            sum += nums[i];
        }

        return sum;
    }
}
