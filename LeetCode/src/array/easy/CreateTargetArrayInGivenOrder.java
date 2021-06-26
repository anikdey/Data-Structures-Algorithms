package array.easy;

import java.util.Arrays;

public class CreateTargetArrayInGivenOrder {

    public static void main(String[] args) {
        //int[] nums = {0,1,2,3,4};
        //int[] index = {0,1,2,2,1};

        int[] nums = {0,1,2,3,4};
        int[] index = {0,2,2,1,1};


        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] targetArray = new int[nums.length];
        for(int i=0; i<index.length; i++) {

            int num = nums[i];
            int ind = index[i];

            if(ind<i) {
                for(int x=i-1; x>=ind; x--) {
                    targetArray[x+1] = targetArray[x];
                }
            }
            targetArray[ind] = num;
        }
        return targetArray;
    }

}
