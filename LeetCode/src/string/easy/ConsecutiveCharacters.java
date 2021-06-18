package string.easy;

public class ConsecutiveCharacters {

    public static void main(String[] args) {
        System.out.println(maxPower("leetcode"));
        System.out.println(maxPower("abbcccddddeeeeedcba"));
        System.out.println(maxPower("triplepillooooow"));
        System.out.println(maxPower("hooraaaaaaaaaaay"));
        System.out.println(maxPower("tourist"));
        System.out.println(maxPower("a"));
        System.out.println(maxPower("ab"));
        System.out.println(maxPower("aaaab"));
    }


    public static int maxPower(String s) {
        char[] chars = s.toCharArray();
        int power = 1;
        int currentCount = 1;
        char prevChar = s.charAt(0);

        for(int i=1; i<chars.length; i++) {
            char currentChar = chars[i];
            if(currentChar == prevChar) {
                currentCount++;
            } else {
                prevChar = currentChar;
                currentCount = 1;
            }
            if(currentCount>power) {
                power = currentCount;
            }
        }
        return power;
    }

}
