package binarysearch.easy;

import java.util.Arrays;

public class FindTheDistanceValueBetweenTwoArrays_1385 {

    public static void main(String[] args) {

        System.out.println(findTheDistanceValue(new int[]{4,5,8}, new int[]{10,9,1,8}, 2));
        System.out.println(findTheDistanceValue(new int[]{1,4,2,3}, new int[]{-4,-3,6,10,20,30}, 3));
        System.out.println(findTheDistanceValue(new int[]{2,1,100,3}, new int[]{-5,-2,10,-3,7}, 6));
        System.out.println(findTheDistanceValue(new int[]{-3,10,2,8,0,10}, new int[]{-9,-1,-4,-9,-8}, 9));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        Arrays.sort(arr2);
        for(int num : arr1) {
            if(isValidElement(arr2, num, d)) {
                count++;
            }
        }
        return count;
    }



    public static boolean isValidElement(int[] nums, int element, int d) {

        int start = 0;
        int end = nums.length - 1;

        while(start<=end) {
            int mid = start + (end-start)/2;

            int diff = Math.abs(nums[mid] - element);

            if(diff<=d)
                return false;
            if(nums[mid]<0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return true;
    }


}
