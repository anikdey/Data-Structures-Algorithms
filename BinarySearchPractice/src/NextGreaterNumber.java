import java.util.Arrays;

public class NextGreaterNumber {

    public static void main(String[] args) {
        System.out.println(nextGreaterNumber(new int[]{1,3,4,2}, 1));
    }


    public static int nextGreaterNumber(int[] nums, int target) {
        Arrays.sort(nums);
        int expectedNumber = -1;

        int start = 0;
        int end = nums.length-1;

        while (start<=end) {
            int mid = start + (end-start)/2;
            int midNumber = nums[mid];
            if(midNumber>target) {
                expectedNumber = midNumber;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return expectedNumber;
    }

}
