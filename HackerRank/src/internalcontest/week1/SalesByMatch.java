package internalcontest.week1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    public static void main(String[] args) {

    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : ar) {
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
