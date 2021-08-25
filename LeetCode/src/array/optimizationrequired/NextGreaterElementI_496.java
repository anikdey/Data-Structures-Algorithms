package array.optimizationrequired;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementI_496 {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2})));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums2.length; i++) {
            innerLoop:
            for(int x=i+1; x<nums2.length; x++) {
                if(nums2[i]<nums2[x]) {
                    map.put(nums2[i], nums2[x]);
                    break innerLoop;
                }
            }
        }




//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(int i=0; i<nums2.length-1; i++) {
//            int currentNumber = nums2[i];
//            if(currentNumber>nums2[i+1]) {
//                map.put(currentNumber, nums2[i+1]);
//            }
//        }
//
        for(int i=0; i<nums1.length; i++) {
            if(map.containsKey(nums1[i])) {
                arr[i] = map.get(nums1[i]);
            } else {
                arr[i] = -1;
            }
        }
        return arr;
    }

}


//[1,3,5,2,4]
//[6,5,4,3,2,1,7]

//[7,-1,-1,-1,-1]
//[7,7,7,7,7]
