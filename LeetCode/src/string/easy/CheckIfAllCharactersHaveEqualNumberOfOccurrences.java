package string.easy;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {

    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("fuckyou"));
        System.out.println(areOccurrencesEqual("abacbc"));
        System.out.println(areOccurrencesEqual("a"));
    }

    public static boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];

        for(char ch : s.toCharArray()) {
            freq[ch-'a']++;
        }
        int count = 0;
        boolean isFoundCount = false;
        for(int i=0; i<freq.length; i++) {
            if(freq[i]>0 && !isFoundCount) {
                isFoundCount = true;
                count = freq[i];
            } else {
                if(freq[i]>0 && count != freq[i])
                    return false;
            }
        }
        return true;
    }

}
