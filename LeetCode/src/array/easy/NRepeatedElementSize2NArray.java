package array.easy;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementSize2NArray {

    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{1,2,3,3}));
    }


    public static int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i]))
                return nums[i];
            map.put(nums[i], i);
        }
        return -1;
    }


}
