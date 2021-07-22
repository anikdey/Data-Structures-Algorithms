package array.optimizationrequired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{1,2}));
        System.out.println(majorityElement(new int[]{1}));
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        int majority = nums.length / 3;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > majority) {
                list.add(entry.getKey());
            }
        }
        return list;
    }

}
