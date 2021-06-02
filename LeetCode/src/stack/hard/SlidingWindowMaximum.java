package stack.hard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        if(k==1)
            return nums;

        List<Integer> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for(int i=0; i<k; i++) {
            if(nums[i]>=max) {
                max = nums[i];
            }
        }

        list.add(max);

        for(int i=k; i<nums.length; i++) {
            if(nums[i]>=max) {
                max = nums[i];
            }
            list.add(max);
        }


        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
