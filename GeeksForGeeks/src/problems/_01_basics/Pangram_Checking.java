package problems._01_basics;

public class Pangram_Checking {

    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println(isPangram("The quick brown fox jumps over the dog"));
    }

    public static boolean isPangram(String str) {
        int[] freq = new int[26];

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                ch = Character.toLowerCase(ch);
                freq[ch-'a']++;
            }
        }

        for(int i=0; i<freq.length; i++) {
            if(freq[i] == 0)
                return false;
        }
        return true;
    }


}
