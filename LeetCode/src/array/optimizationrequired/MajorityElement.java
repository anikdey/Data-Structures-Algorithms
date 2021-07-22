package array.optimizationrequired;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public static int majorityElement(int[] nums) {
        int element = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        int majority = nums.length / 2;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > majority) {
                return entry.getKey();
            }
        }

        return element;
    }

}
