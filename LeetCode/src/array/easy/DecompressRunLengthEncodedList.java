package array.easy;

import java.util.Arrays;

public class DecompressRunLengthEncodedList {

    public static void main(String[] args) {
        //int[] nums = {1,2,3,4};
        int[] nums = {1,1,2,3};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

    public static int[] decompressRLElist(int[] nums) {
        int lengthCount = 0;

        for(int i=0; i<nums.length; i+=2) {
            lengthCount += nums[i];
        }

        int[] newArray = new int[lengthCount];
        int index = 0;
        for(int i=0; i<nums.length; i+=2) {
            int freq = nums[i];
            for(int x=0; x<freq; x++) {
                newArray[index] = nums[i+1];
                index++;
            }
        }
        return newArray;
    }

}
