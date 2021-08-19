package string.easy;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord_748 {


    public static void main(String[] args) {

    }


    public static String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> licenseMap = new HashMap<>();
        for(char ch : licensePlate.toLowerCase().toCharArray()) {
            if(ch>='a' && ch<='z') {
                if(licenseMap.containsKey(ch)) {
                    licenseMap.put(ch, licenseMap.get(ch)+1);
                } else {
                    licenseMap.put(ch, 1);
                }
            }
        }

        int closerMatch = Integer.MIN_VALUE;
        String expectedString = "";
        for(String word : words) {
            Map<Character, Integer> currentMap = new HashMap<>();
            int currentDifference = 0;
            for(char ch : word.toCharArray()) {
                if(licenseMap.containsKey(ch)) {
                    int totalCountOfChar = licenseMap.get(ch);
                    if(currentMap.containsKey(ch)) {
                        currentMap.put(ch, currentMap.get(ch)+1);
                        if(totalCountOfChar == currentMap.get(ch)) {
                            currentDifference++;
                        }
                    } else {
                        currentMap.put(ch, 1);
                        if(totalCountOfChar == 1) {
                            currentDifference++;
                        }
                    }
                }
            }

            if(closerMatch<currentDifference) {
                expectedString = word;
                closerMatch = currentDifference;
            } else if(closerMatch == currentDifference) {
                if(expectedString.length()>word.length()) {
                    expectedString = word;
                }
            }
        }
        return expectedString;
    }


}
