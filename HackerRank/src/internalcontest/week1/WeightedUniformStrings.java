package internalcontest.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedUniformStrings {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //list.add(6);list.add(1);list.add(3);list.add(12);list.add(5);list.add(9);list.add(10);
        list.add(9);list.add(7);list.add(8);list.add(12);list.add(5);
        System.out.println(weightedUniformStrings("aaabbbbcccddd", list));
    }

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        List<String> list = new ArrayList<>();

        Map<Integer, Character> map = new HashMap<>();

        char prevChar = s.charAt(0);
        int weight = prevChar - 'a' + 1;
        map.put(weight, prevChar);
        for(int i=1; i<s.length(); i++) {
            char ch = s.charAt(i);
            int newWeight = ch - 'a' + 1;
            if(prevChar != ch) {
                weight = newWeight;
                prevChar = ch;
            } else {
                weight = weight + newWeight;
            }
            map.put(weight, prevChar);
        }

        for(int num : queries) {
            if(map.containsKey(num)) {
                list.add("Yes");
            } else {
                list.add("No");
            }
        }
        return list;
    }

}
