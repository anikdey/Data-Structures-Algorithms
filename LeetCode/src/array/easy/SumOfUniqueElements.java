package array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {

    public static void main(String[] args) {
        //System.out.println(sumOfUnique(new int[]{1,2,3,2}));
        //System.out.println(sumOfUniqueWithoutHashmap(new int[]{1,1,1,1,1,5,7}));
        System.out.println(sumOfUniqueWithoutHashmap(new int[]{5}));
    }

    public static int sumOfUnique(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int sum = 0;
        Map<Integer, Boolean> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {

            if(map.containsKey(nums[i])) {
                if(!map.get(nums[i])) {
                    sum -= nums[i];
                    map.put(nums[i], true);
                }
            } else {
                sum += nums[i];
                map.put(nums[i], false);
            }
        }

        return sum;
    }

    public static int sumOfUniqueWithoutHashmap(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int count = 0;
        while (count<nums.length-1) {
            if(nums[count] == nums[count+1]) {
                while (count<nums.length-1 && nums[count] == nums[count+1]) {
                    count++;
                }
                count++;
            } else {
                sum += nums[count];
                count++;
            }
        }

        if(count==nums.length) {
            if(nums[count-1] != nums[count-2])
                sum += nums[count-1];
        } else if(nums[count] != nums[count-1])
            sum += nums[count];
        return sum;
    }

}
