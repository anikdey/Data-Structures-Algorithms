package array.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        //int[] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }

//    public static int numIdenticalPairs(int[] nums) {
//        int count = 0;
//        for(int i=0; i<nums.length; i++) {
//            int currentNumber = nums[i];
//            for(int x=i+1; x<nums.length; x++) {
//                if(currentNumber == nums[x]) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
            for(int i=0; i<nums.length; i++) {
                int currentNumber = nums[i];
               if(map.containsKey(currentNumber)) {
                   int prevCount = map.get(currentNumber);
                   count += prevCount;
                   map.put(currentNumber, prevCount+1);
               } else {
                   map.put(currentNumber, 1);
               }
            }
            return count;
        }

}
