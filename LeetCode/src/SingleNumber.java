
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        //System.out.println(singleNumberUsingSort(nums));
        System.out.println(singleNumber(nums));

    }


    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
           if(map.containsKey(nums[i])) {
               map.remove(nums[i]);
           } else {
               map.put(nums[i], 1);
           }
        }
        Map.Entry<Integer,Integer> entry = map.entrySet().iterator().next();
        return entry.getKey();
    }

    public static int singleNumberUsingSort(int[] nums) {
        //Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(nums);
        int expectedNumber = 0;
        for(int i=0; i<nums.length; i += 2) {
            expectedNumber = nums[i];
            int nextIndex = i+1;
            if(nextIndex<nums.length){
                if(expectedNumber != nums[i+1]) {
                    return expectedNumber;
                }
            } else {
                expectedNumber = nums[nums.length-1];
            }
        }
        return expectedNumber;
    }



}
