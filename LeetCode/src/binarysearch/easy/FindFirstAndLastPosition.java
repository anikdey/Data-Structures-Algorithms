package binarysearch.easy;

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

    public static int findFirstIndex(int[] numbers, int target) {
        int firstPosition = -1;
        int start = 0;
        int end = numbers.length - 1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(numbers[mid]==target) {
                firstPosition = mid;
                end = mid-1;
            } else if(numbers[mid]>target) {
                end = mid-1;
            }
            else {
                start = mid + 1;
            }
        }
        return firstPosition;
    }

    public static int findLastIndex(int[] numbers, int target) {
        int lastIndex = -1;
        int start = 0;
        int end = numbers.length - 1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(numbers[mid] == target){
                lastIndex = mid;
                start = mid+1;
            } else if(numbers[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return lastIndex;
    }

}
