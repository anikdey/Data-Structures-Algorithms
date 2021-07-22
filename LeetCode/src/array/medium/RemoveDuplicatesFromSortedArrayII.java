package array.medium;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {
        //System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }


    public static int removeDuplicates(int[] nums) {
        int prevNumber = nums[0];
        int count = 1;
        int runningCount = 1;
        int index = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]==prevNumber) {
                if(runningCount<2) {
                    nums[index] = nums[i];
                    count++;
                    index++;
                }
                runningCount++;
            } else {
                prevNumber = nums[i];
                nums[index] = nums[i];
                runningCount = 1;
                index++;
                count++;
            }
        }

        System.out.println(Arrays.toString(nums));

        return count;
    }

}
