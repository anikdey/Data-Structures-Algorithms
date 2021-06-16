package chapter1;

import java.util.Arrays;

public class UniqueCharacterInString1_1 {

    public static void main(String[] args) {
        System.out.println(isUniqueWithoutExtraMemory("abcd10jk"));
        System.out.println(isUniqueWithoutExtraMemory("hutg9mnd!nk9"));
    }

    public static boolean isUniqueUsingExtraMemory(String str) {
        if(str.length()>256)
            return false;
        int[] freq = new int[256];
        for(char ch : str.toCharArray()) {
            int index = ch;
            if(freq[index]>0) {
                return false;
            }
            freq[index]++;
        }
        return true;
    }

    public static boolean isUniqueWithoutExtraMemory(String str) {
        if(str.length()>256)
            return false;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for(int i=0; i<chars.length-1; i++) {
            if(chars[i]==chars[i+1])
                return false;
        }
        return true;

    }


}
