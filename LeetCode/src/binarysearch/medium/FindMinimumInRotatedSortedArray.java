package binarysearch.medium;

public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{5}));
        System.out.println(findMin(new int[]{5,1,2,3,4}));
    }

    public static int findMin(int[] nums) {

        if(nums.length==1)
            return nums[0];
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            int currentNumber = nums[mid];
            int prevNumber = nums[(mid+nums.length-1)%nums.length];
            int nextNumber = nums[(mid+1)%nums.length];
            if(currentNumber<prevNumber && currentNumber<nextNumber) {
                return nums[mid];
            } else if(nums[mid]>nums[nums.length-1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
