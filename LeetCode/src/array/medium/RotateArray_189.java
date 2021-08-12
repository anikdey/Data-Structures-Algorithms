package array.medium;

import java.util.Arrays;

public class RotateArray_189 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};
        rotate(numbers, 3);
        System.out.println(Arrays.toString(numbers));

    }

    public static void rotate(int[] nums, int k) {
        int[] newArr = new int[nums.length];

        k = k % nums.length;

        for(int i=k; i<nums.length; i++) {
            int num = nums[i-k];
            newArr[i] = nums[i-k];
        }

        for(int i=0; i<k; i++) {
            int numb = nums[nums.length-k+i];
            newArr[i] = numb;
        }

        for(int i=0; i<newArr.length; i++) {
            nums[i] = newArr[i];
        }
        System.out.println(Arrays.toString(nums));
    }

}
