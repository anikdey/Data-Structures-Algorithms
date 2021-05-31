package string.easy;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfString {

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("aeiou"));
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int leftPointer = 0;
        int rightPointer = chars.length-1;

        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        while (leftPointer<rightPointer) {
            if(set.contains(chars[leftPointer]) && set.contains(chars[rightPointer])) {
                char leftChar = chars[leftPointer];
                chars[leftPointer] = chars[rightPointer];
                chars[rightPointer] = leftChar;
                leftPointer++;
                rightPointer--;
            }

            if(!set.contains(chars[leftPointer])) {
                leftPointer++;
            }
            if(!set.contains(chars[rightPointer])) {
                rightPointer--;
            }
        }
        return new String(chars);
    }

}
