package binarysearch;

import java.util.Arrays;

public class FindFirstAndLastPosition {

    public static void main(String[] args) {
        //int[] nums = {3, 3, 5, 5,7,7,8,8,10};
        int[] nums = {1};
        int target = 0;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        if(nums.length == 0)
            return new int[]{-1, -1};
        int firstIndex = findFirstIndex(nums, target);
        int lastIndex = findLastIndex(nums, target);
        return new int[]{firstIndex, lastIndex};
    }

    public static int findFirstIndex(int[] nums, int target) {
        int startingIndex = 0;
        int endingIndex = nums.length - 1;
        while (startingIndex<=endingIndex) {
            int mid = startingIndex + (endingIndex-startingIndex)/2;
            if(mid > 0 && nums[mid] == target && nums[mid-1]<target) {
                return mid;
            } else if( nums[mid] < target ) {
                startingIndex = mid + 1;
            }else if( nums[mid]>=target ) {
                endingIndex = mid - 1;
            }
        }
        if (startingIndex == 0 && nums[startingIndex]==target)
            return 0;
        return -1;
    }

    public static int findLastIndex(int[] nums, int target) {
        int startingIndex = 0;
        int endingIndex = nums.length-1;

        while (startingIndex<=endingIndex) {
            int mid = startingIndex + (endingIndex-startingIndex)/2;

            if(mid <nums.length-1 && nums[mid] == target && nums[mid+1]>target) {
                return mid;
            } else if(nums[mid]<=target) {
                startingIndex = mid + 1;
            } else if(nums[mid]>target) {
                endingIndex = mid - 1;
            }
        }

        if(endingIndex==nums.length-1 && nums[startingIndex]==target)
            return endingIndex;
        return -1;
    }

}
