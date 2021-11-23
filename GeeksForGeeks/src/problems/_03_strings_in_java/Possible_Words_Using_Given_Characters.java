package problems._03_strings_in_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Possible_Words_Using_Given_Characters {


    public static void main(String[] args) {
        String[] words = {"go","bat","me","eat","goal","boy", "run"};
        char[] chars = {'e','o','b', 'a','m','g', 'l'};
        System.out.println(possibleWords(words, chars));
    }

    public static List<String> possibleWords(String[] words, char[] chars) {
        List<String> list = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        for(char ch : chars) {
            set.add(ch);
        }
        outer:
        for(String str : words) {
            char[] chArray = str.toCharArray();
            for(int i=0; i<chArray.length; i++) {
                if(!set.contains(chArray[i])) {
                    continue outer;
                }
            }
            list.add(str);
        }
        return list;
    }

}
