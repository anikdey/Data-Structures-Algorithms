package string.easy;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {

    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero", "ass"};
        System.out.println(stringMatching(words));
    }


    public static List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();

        for(int i=0; i<words.length; i++) {
            String str = words[i];
            for(int x=0; x<words.length; x++) {
                if(x!=i) {
                    if(words[x].contains(str)) {
                        if(!list.contains(str))
                            list.add(str);
                    }
                }
            }
        }

        return list;
    }

}
