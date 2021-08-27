package implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeTheArray {

    public static void main(String[] args) {

    }

    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }

        int maxCount = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet() ) {
            if(entry.getValue()>maxCount)
                maxCount = entry.getValue();
        }
        return arr.size() - maxCount;
    }

}
