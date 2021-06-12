package string.easy;

import java.util.HashSet;
import java.util.Set;

public class GoatLatin {

    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
        System.out.println(toGoatLatin("I m bad"));
    }


    public static String toGoatLatin(String sentence) {
        Set<Character> set = new HashSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');

        String[] words = sentence.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        StringBuilder stringOfA = new StringBuilder();

        for(int i=0; i<words.length; i++) {

            stringOfA.append('a');

            String currentWord = words[i];

            if(set.contains(currentWord.charAt(0))) {
                stringBuilder.append(currentWord);
                stringBuilder.append("ma");
            } else {
                String sub = currentWord.substring(1);
                stringBuilder.append(sub);
                stringBuilder.append(currentWord.charAt(0));
                stringBuilder.append("ma");
            }

            stringBuilder.append(stringOfA);
            if(i != words.length-1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }



}
