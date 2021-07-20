package string.easy;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"bella","label","roller"}));
        System.out.println(commonChars(new String[]{"cool","lock","cook"}));
    }

    public static List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        String str = words[0];
        outerLoop:
        for(char ch : str.toCharArray()) {
             for(int i=1; i<words.length; i++) {
                 StringBuilder stringBuilder = new StringBuilder(words[i]);
                 int index = stringBuilder.indexOf(ch+"");
                 if(index>-1) {
                    stringBuilder.setCharAt(index, '#');
                    words[i] = stringBuilder.toString();
                 } else {
                     continue outerLoop;
                 }
             }
             list.add(ch+"");
        }
        return list;
    }

}
