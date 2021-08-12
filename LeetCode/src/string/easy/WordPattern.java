package string.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] sArray = s.split(" ");
        if(pattern.length() != sArray.length)
            return false;
        Map<Character, String> map = new HashMap<>();
        for(int i=0; i<pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(ch).equals(sArray[i])) {
                    return false;
                }
            } else {
                if(map.containsValue(sArray[i]))
                    return false;
                map.put(ch, sArray[i]);
            }
        }
        return true;
    }

}
