package string.easy;

import java.util.*;

public class KeyboardRow {

    static Set<Character> homeRow = new HashSet<>();
    static Set<Character> topRow = new HashSet<>();
    static Set<Character> bottomRow = new HashSet<>();

    static{
        homeRow.add('a'); homeRow.add('s');homeRow.add('d');homeRow.add('f');homeRow.add('g');homeRow.add('h');homeRow.add('j');homeRow.add('k');homeRow.add('l');
        topRow.add('q');topRow.add('w');topRow.add('e');topRow.add('r');topRow.add('t');topRow.add('y');topRow.add('u');topRow.add('i');topRow.add('o');topRow.add('p');
        bottomRow.add('z');bottomRow.add('x');bottomRow.add('c');bottomRow.add('v');bottomRow.add('b');bottomRow.add('n');bottomRow.add('m');
    }

    public static void main(String[] args) {
        //String[] words = {"Hello","Alaska","Dad","Peace"};
        String[] words = {"omk"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();

        for(String str : words) {

            char[] chars = str.toLowerCase().toCharArray();

            if(chars.length == 1) {
                list.add(str);
            } else {
                int currentRow = 1;
                if(topRow.contains(chars[0])) {
                    currentRow = 2;
                } else if(bottomRow.contains(chars[0])) {
                    currentRow = 3;
                }

                boolean shouldAdd = true;
                innerCheck:
                for(int i=1; i<chars.length; i++) {
                    if(currentRow == 1) {
                        if(!homeRow.contains(chars[i])) {
                            shouldAdd = false;
                            break innerCheck;
                        }
                    } else if(currentRow == 2) {
                        if(!topRow.contains(chars[i])) {
                            shouldAdd = false;
                            break innerCheck;
                        }
                    } else {
                        if(!bottomRow.contains(chars[i])) {
                            shouldAdd = false;
                            break innerCheck;
                        }
                    }
                }
                if(shouldAdd)
                    list.add(str);

            }
        }

        String[] newArray = new String[list.size()];
        for(int i=0; i<list.size(); i++) {
            newArray[i] = list.get(i);
        }
        return newArray;
    }

}
