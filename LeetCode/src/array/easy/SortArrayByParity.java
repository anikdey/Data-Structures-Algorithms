package array.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3,1,2,4})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{4,2,1,3})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{4,2,3, 0})));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int leftPointer = 0;
        for(int i=0; i<nums.length; i++) {
            int currentNumber = nums[i];
            if(currentNumber%2==0){
                int temp = nums[leftPointer];
                nums[leftPointer] = currentNumber;
                nums[i] = temp;
                leftPointer++;
            }
        }
        return nums;
    }

}
