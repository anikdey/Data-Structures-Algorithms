package string;

import java.util.HashMap;
import java.util.Map;

public class UniqueMorseCodeWords {

    static String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
            "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for(String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0; i<word.length(); i++) {
                int test = word.charAt(i);
                int index =  word.charAt(i) - 97;
                stringBuilder.append(morseCodes[index]);
            }
            map.put(stringBuilder.toString(), 1);
        }
        return map.size();
    }

}
