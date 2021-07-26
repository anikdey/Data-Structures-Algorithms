package array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3,3,3,3}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        int prevNumber = arr[0];
        int count = 1;
        for(int i=1; i<arr.length; i++) {
            if(prevNumber == arr[i]){
                count++;
            } else {
                if(map.containsKey(count))
                    return false;
                prevNumber = arr[i];
                map.put(count, 1);
                count = 1;
            }
        }
        if(map.containsKey(count))
            return false;
        return true;
    }

}
