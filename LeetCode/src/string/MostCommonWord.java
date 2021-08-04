package string;

import java.util.*;

public class MostCommonWord {

    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
        System.out.println(mostCommonWord("a", new String[]{}));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedSet = new HashSet<>();
        for(String str : banned)
            bannedSet.add(str);

        paragraph = paragraph.replaceAll("[!?',;.]", "");

        String expectedWord = "";
        int maxCount = 0;

        String[] splitArray = paragraph.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(String str : splitArray) {
            str = str.toLowerCase();
            if(!bannedSet.contains(str)) {
                if(map.containsKey(str)) {
                    int freq = map.get(str) + 1;
                    if(freq>maxCount){
                        maxCount = freq;
                        expectedWord = str;
                    }
                    map.put(str, freq);
                } else {
                    map.put(str, 1);
                    if(1>maxCount) {
                        maxCount = 1;
                        expectedWord = str;
                    }
                }
            }
        }
        return expectedWord;
    }

}
