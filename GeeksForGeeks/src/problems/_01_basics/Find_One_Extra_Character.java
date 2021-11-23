package problems._01_basics;

public class Find_One_Extra_Character {

    public static void main(String[] args) {
        System.out.println(findChar("abcd", "cbdae"));
    }

    public static char findChar(String firstString, String secondString) {
        int[] freq = new int[26];
        int fLength = firstString.length()-1;
        int sLength = secondString.length()-1;

        while (fLength>=0 || sLength>=0) {

            if(fLength>=0) {
                char ch = Character.toLowerCase(firstString.charAt(fLength));
                freq[ch-'a']--;
            }

            if(sLength>=0) {
                char ch = Character.toLowerCase(secondString.charAt(sLength));
                freq[ch-'a']++;
            }
            fLength--;
            sLength--;
        }
        for(int i=0; i < freq.length; i++) {
            if(freq[i] != 0)
                return (char) (i + 'a');
        }

        return ' ';
    }

}
