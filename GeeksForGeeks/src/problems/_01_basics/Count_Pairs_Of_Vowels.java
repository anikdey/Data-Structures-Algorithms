package problems._01_basics;

// https://www.geeksforgeeks.org/count-the-pairs-of-vowels-in-the-given-string/?ref=rp

public class Count_Pairs_Of_Vowels {

    public static void main(String[] args) {
        System.out.println(getCount("abaebio"));
        System.out.println(getCount("aeouixyjae"));
    }

    public static int getCount(String str) {
        int count = 0;
        int currentCountOfConsecutiveVowels = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if(isVowel(ch)) {
                currentCountOfConsecutiveVowels++;
            } else {
                if(currentCountOfConsecutiveVowels>1) {
                    count += currentCountOfConsecutiveVowels - 1;
                }
                currentCountOfConsecutiveVowels = 0;
            }
        }
        if(currentCountOfConsecutiveVowels>1) {
            count += currentCountOfConsecutiveVowels-1;
        }
        return count;
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ')
            return true;
        else
            return false;
    }

}
