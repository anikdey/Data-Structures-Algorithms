package string.easy;

import java.util.*;

public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap();
        char[] chars = s.toCharArray();
        List<Integer> indices = new ArrayList<>();

        for(int i=0; i<chars.length; i++) {
            if(map.containsKey(chars[i])) {
                indices.remove(map.get(chars[i]));
            } else {
                map.put(chars[i], i);
                indices.add(i);
            }
        }
        if(indices.size()>0)
            return indices.get(0);
        return -1;
    }

}
