package implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(sockMerchant(list.size(), list));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(Integer num : ar) {
            if(map.containsKey(num)) {
                count++;
                map.remove(num);
            } else {
                map.put(num, 1);
            }
        }
        return count;
    }


}
