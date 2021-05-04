package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedUniformString {

    static int[] weightArray = {1,2,3,4,5,6,7,8,9,10, 11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};

    public static void main(String[] args) {

        List<Integer> queries = new ArrayList<>();
        queries.add(1);
        queries.add(7);
        queries.add(5);
        queries.add(4);
        queries.add(15);

        System.out.println(weightedUniformStrings("abbcccdddd", queries));
        System.out.println(weightedUniformStrings("", queries));
    }


    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        List<String> list = new ArrayList<>();

        Map<Integer, Character> map = new HashMap<>();

        char[] chars = s.toCharArray();

        int prevCount = 0;
        char prevChar = 0;

        for(int i=0; i<chars.length; i++) {
            int index = chars[i] % 97;
            if(i==0) {
                prevCount = weightArray[index];
            }else {
                if(chars[i] == prevChar) {
                    prevCount += weightArray[index];
                } else {
                    prevCount = weightArray[index];
                }
            }
            prevChar = chars[i];
            map.put(prevCount, prevChar);
        }

        for(int query : queries) {
            if(map.containsKey(query)) {
                list.add("Yes");
            } else {
                list.add("No");
            }
        }

        return list;
    }

}
