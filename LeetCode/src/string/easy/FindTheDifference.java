package string.easy;

public class FindTheDifference {

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }

    public static char findTheDifference(String s, String t) {
        int sLength = s.length()-1;
        int tLength = t.length()-1;
        int[] freq = new int[26];
        while (sLength>=0 || tLength>=0) {
            if(sLength>=0) {
                freq[s.charAt(sLength)-'a']++;
            }
            if(tLength>=0) {
                freq[t.charAt(tLength)-'a']--;
            }
            sLength--;
            tLength--;
        }
        for(int i=0; i<freq.length; i++) {
            if(freq[i]==-1)
                return (char)(97 + i);
        }
        return 'a';
    }

}
