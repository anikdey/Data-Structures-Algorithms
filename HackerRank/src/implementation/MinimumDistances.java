package implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistances {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(7);
        System.out.println(minimumDistances(list));
    }

    public static int minimumDistances(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(int i=0; i<a.size(); i++) {
            int number = a.get(i);
            if(map.containsKey(number)) {
                int distance = i - map.get(number);
                if(distance<min)
                    min = distance;
            } else {
                map.put(a.get(i), i);
            }
        }

        if(min == Integer.MAX_VALUE)
            return -1;
        return min;
    }

}
