package array.easy;

import java.util.Arrays;

public class SortArrayByParityII {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4,2,5,7})));
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{2,3})));
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{3,2})));
    }


    public static int[] sortArrayByParityII(int[] nums) {
        int[] newArr = new int[nums.length];
        int evenCounter = 0;
        int oddCounter = 1;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] % 2 == 1) {
                newArr[oddCounter] = nums[i];
                oddCounter += 2;
            } else {
                newArr[evenCounter] = nums[i];
                evenCounter += 2;
            }
        }
        return newArr;
    }

}
