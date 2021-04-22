package recursionpractice;

import java.util.Arrays;

public class StringPrintReverse {

    public static void main(String[] args) {
        String str = "Helo world!";
        printReverse(str, str.length(), 0);

        String newStr = "121";

        System.out.println("Using recursion "+isPalindromeOptimized(newStr, 0,newStr.length()-1));

        System.out.println(reversedString(newStr, newStr.length()-1));

        System.out.println(isPalindrome(newStr, newStr.length()-1, new StringBuilder()));

        String[] words = {"foo", "bar", "world", "hello"};
        capitalizeWord(words, 0);
        System.out.println(Arrays.toString(words));

    }

    private static void printReverse(String str, int length, int currentPosition) {
        if(currentPosition == length){
            return;
        }
        printReverse(str, length, currentPosition+1);
        System.out.print(str.charAt(currentPosition));
        if(currentPosition == 0) {
            System.out.println();
        }
    }

    private static String reversedString(String str, int length) {
        if(length == 0){
            return ""+str.charAt(0);
        } else {
            String newString = str.charAt(length) + reversedString(str, length-1);
            return newString;
        }
    }

    private static boolean isPalindrome(String str, int length, StringBuilder stringBuilder) {
        if(length == 0){
            stringBuilder.append(str.charAt(length));
        } else {
            stringBuilder.append(str.charAt(length));
            isPalindrome(str, length-1, stringBuilder);
        }
        return stringBuilder.toString().equals(str);
    }

    public static boolean isPalindromeOptimized(String str, int start, int end) {
        if(start == end) {
            return true;
        }
        if(start<end) {
            if(str.charAt(start) == str.charAt(end)){
                return isPalindromeOptimized(str, start+1, end-1);
            }else {
                return false;
            }
        }
        return  true;
    }

    public static void capitalizeWord(String[] words, int position) {
        if(position == words.length-1) {
            words[position] = words[position].toUpperCase();
        } else {
            words[position] = words[position].toUpperCase();
            capitalizeWord(words, position+1);
        }
    }

}
