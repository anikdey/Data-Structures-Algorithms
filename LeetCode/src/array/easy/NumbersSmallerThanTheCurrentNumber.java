package array.easy;

import java.util.Arrays;

public class NumbersSmallerThanTheCurrentNumber {

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3,8,8,9};
        //int[] nums = {6,5,4,8};
        //int[] nums = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        //afterSortingNotAccepted(nums);
        return bruteForce(nums);
    }

    public static int[] afterSortingNotAccepted(int[] nums) {
        int[] array = new int[nums.length];
        Arrays.sort(nums);
        array[0] = 0;
        int itemCount = 0;
        for(int i=1; i<nums.length; i++) {
            itemCount++;
            if(nums[i] == nums[i-1]) {
                array[i] = array[i-1];
            } else if(nums[i-1]<nums[i]) {
                array[i] = itemCount;
            }
        }
        return array;
    }

    public static int[] bruteForce(int[] nums) {
        int[] array = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int currentNumber = nums[i];
            int count = 0;
            for(int j=0; j<nums.length; j++) {
                if(i != j && currentNumber>nums[j]) {
                    count++;
                }
            }
            array[i] = count;
        }
        return array;
    }

}
