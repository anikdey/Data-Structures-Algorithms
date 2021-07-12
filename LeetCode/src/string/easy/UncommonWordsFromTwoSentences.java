package string.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UncommonWordsFromTwoSentences {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
        System.out.println(Arrays.toString(uncommonFromSentences("apple apple", "banana")));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String, String> encounteredWords = new HashMap<>();
        Map<String, String> uniqueWords = new HashMap<>();

        String[] words = s1.split(" ");

        for (String word : words) {
            if(encounteredWords.containsKey(word)) {
                uniqueWords.remove(word);
            } else {
                uniqueWords.put(word, word);
            }
            encounteredWords.put(word, word);
        }

        words = s2.split(" ");

        for (String word : words) {
            if(encounteredWords.containsKey(word)) {
                uniqueWords.remove(word);
            } else {
                uniqueWords.put(word, word);
            }
            encounteredWords.put(word, word);
        }

        String[] arr = new String[uniqueWords.size()];
        int count = 0;
        for(Map.Entry<String, String> entry: uniqueWords.entrySet()) {
            arr[count] = entry.getKey();
            count++;
        }
        return arr;
    }

}
