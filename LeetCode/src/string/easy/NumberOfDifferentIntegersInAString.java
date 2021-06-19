package string.easy;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegersInAString {

    public static void main(String[] args) {
        System.out.println(numDifferentIntegers("a123bc34d8ef34a44sss"));
        System.out.println(numDifferentIntegers("leet1234code234"));
        System.out.println(numDifferentIntegers("a1b01c001"));
        System.out.println(numDifferentIntegers("4"));
        System.out.println(numDifferentIntegers("0a0"));
    }

    public static int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder(word);
        int length = word.length();
        for(int i=0; i<length; i++) {
            if(!Character.isDigit(word.charAt(i))) {
                stringBuilder.setCharAt(i, ' ');
            }
        }

        String[] words = stringBuilder.toString().trim().split(" ");

        for(String sWord : words) {

            if(!sWord.isEmpty() && sWord.charAt(0) == '0') {
                sWord = sWord.replaceFirst("^0+(?!$)", "");
                set.add(sWord);
            } else if(!sWord.isEmpty()) {
                set.add(sWord);
            }
        }
        return set.size();
    }

    private static int usingDouble(String word) {
        Set<Double> set = new HashSet<>();
        int length = word.length();
        int start = 0;

        while(start<length) {
            char currentChar = word.charAt(start);
//            if(currentChar == '0') {
//                start++;
//            } else

            if( currentChar>= 'a' && currentChar<='z' ) {
                start++;
            } else {
                StringBuilder stringBuilder = new StringBuilder(currentChar);
                while((currentChar>='0' && currentChar<='9')) {
                    stringBuilder.append(currentChar);
                    start++;
                    if(start<length) {
                        currentChar = word.charAt(start);
                    } else {
                        currentChar = 'a';
                    }
                }
                String dfs = stringBuilder.toString();
                set.add(Double.parseDouble(stringBuilder.toString()));
            }
        }
        return set.size();
    }

}
