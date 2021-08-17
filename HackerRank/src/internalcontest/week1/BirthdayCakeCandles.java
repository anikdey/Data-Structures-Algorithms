package internalcontest.week1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {

    public static void main(String[] args) {

    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Integer.MIN_VALUE;

        Map<Integer, Integer> map = new HashMap<>();

        for(int age : candles) {

            if(map.containsKey(age)) {
                int count = map.get(age) + 1;
                if(count>max)
                    max = count;
                map.put(age, count);
            } else {
                map.put(age, 1);
                if(max<1) {
                    max = 1;
                }
            }
        }
        return max;

    }

}
