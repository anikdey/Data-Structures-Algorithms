package string.medium;

import java.util.HashMap;
import java.util.Map;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique_1647 {

    public static void main(String[] args) {
        System.out.println(minDeletions("aab"));
        System.out.println(minDeletions("aaabbbcc"));
        System.out.println(minDeletions("ceabaacb"));
    }


    public static int minDeletions(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()) {
            freq[ch-'a']++;
        }
        Map<Integer, Boolean> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<freq.length; i++) {
            int currentCount = freq[i];
            if(map.containsKey(currentCount)) {
                decrementLoop:
                while (currentCount>0) {
                    count++;
                    currentCount--;
                    if(!map.containsKey(currentCount)) {
                        map.put(currentCount, true);
                        break decrementLoop;
                    }
                }
            } else {
                map.put(freq[i], true);
            }
        }
        return count;
    }

}
