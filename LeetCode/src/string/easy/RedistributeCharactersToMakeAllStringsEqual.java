package string.easy;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharactersToMakeAllStringsEqual {

    public static void main(String[] args) {
        System.out.println(makeEqual(new String[]{"abc","aabc","bc"}));
        System.out.println(makeEqual(new String[]{"a","b"}));
    }

    public static boolean makeEqual(String[] words) {
        int arrayLength = words.length;
        Map<Character, Integer> map = new HashMap<>();
        for(String str : words) {
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() % arrayLength != 0)
                return false;
        }

        return true;
    }

}
