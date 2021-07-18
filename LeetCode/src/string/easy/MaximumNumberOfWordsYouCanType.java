package string.easy;

public class MaximumNumberOfWordsYouCanType {

    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello world", "ad"));
        System.out.println(canBeTypedWords("leet code", "lt"));
        System.out.println(canBeTypedWords("leet code", "e"));
    }


    public static int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        int[] brokenFreq = new int[26];
        for(char ch: brokenLetters.toCharArray())
            brokenFreq[ch-'a']++;
        String[] splitArray = text.split(" ");

        outerCheck:
        for(String s : splitArray) {
            for (char ch : s.toCharArray()) {
                if(brokenFreq[ch-'a'] == 1) {
                    continue outerCheck;
                }
            }
            count++;
        }
        return count;
    }


}
