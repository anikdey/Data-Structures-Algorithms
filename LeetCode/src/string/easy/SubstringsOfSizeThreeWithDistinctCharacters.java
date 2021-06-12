package string.easy;

import javax.swing.plaf.metal.MetalBorders;

public class SubstringsOfSizeThreeWithDistinctCharacters {

    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
        System.out.println(countGoodSubstrings("aababcabc"));
    }


    public static int countGoodSubstrings(String s) {
        int count = 0;

        if(s.length() < 3)
            return 0;

        for(int i=0; i<s.length()-2; i++) {
            char firstChar = s.charAt(i);
            char secondChar = s.charAt(i+1);
            char thirdChar = s.charAt(i+2);
            if(firstChar != secondChar && firstChar != thirdChar && secondChar != thirdChar) {
                count++;
            }
        }
        return count;
    }

}
