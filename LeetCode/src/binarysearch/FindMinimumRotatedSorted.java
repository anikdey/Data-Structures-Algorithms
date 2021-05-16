package binarysearch;

public class FindMinimumRotatedSorted {


    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }


    public static int findMin(int[] nums) {
        int startingIndex = 0;
        int endingIndex = nums.length-1;

        while (startingIndex<endingIndex) {
            int mid = endingIndex + (startingIndex-endingIndex)/2;
            int currentNumber = nums[mid];
            if(mid > 0 && mid<nums.length-1 &&  currentNumber<nums[mid+1] && currentNumber<nums[mid-1] ) {
                return currentNumber;
            }else if(currentNumber>=nums[mid-1]) {
                startingIndex = mid;
            } else if(currentNumber<nums[mid+1]) {
                endingIndex = mid-1;
            }
        }
        return -1;
    }


}
