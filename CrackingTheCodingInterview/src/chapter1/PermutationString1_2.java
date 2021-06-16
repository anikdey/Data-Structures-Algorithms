package chapter1;

import java.util.Arrays;

public class PermutationString1_2 {

    public static void main(String[] args) {
        
        System.out.println(isPermutation("abcd", "dabc"));

    }

    public static boolean isPermutation(String firstString, String secondString) {
        if(firstString.length() != secondString.length())
            return false;

        int[] freq = new int[256];

        freq[65] = 0;
        freq[69] = 0;

        int length = firstString.length();

        for(int i=0; i<length; i++) {
            freq[firstString.charAt(i)]++;
            freq[secondString.charAt(i)]--;
        }

        for(int number : freq){
            if(number != 0)
                return false;
        }
        return true;
    }

    public static boolean isPermutationWithoutExtraMemory(String firstString, String secondString) {
        if(firstString.length() != secondString.length())
            return false;
        char[] firstStringToChar = firstString.toCharArray();
        char[] secondStringToChar = secondString.toCharArray();
        Arrays.sort(firstStringToChar);
        Arrays.sort(secondStringToChar);
        for(int i=0; i<firstStringToChar.length; i++) {
            if(firstStringToChar[i] != secondStringToChar[i])
                return false;
        }
        return true;
    }

}
