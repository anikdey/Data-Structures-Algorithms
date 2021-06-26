package string.medium;

public class MinimumNumberStepsToMakeTwoStringsAnagram {

    public static void main(String[] args) {
        System.out.println(minSteps("bab", "aba" ));
        System.out.println(minSteps("leetcode", "practice" ));
        System.out.println(minSteps("anagram", "mangaar" ));
        System.out.println(minSteps("xxyyzz", "xxyyzz" ));
        System.out.println(minSteps("friend", "family" ));
    }


    public static int minSteps(String s, String t) {
        int count = 0;

        int[] sFreq = new int[26];
        int[] tFreq = new int[26];

        int length = s.length();
        for(int i=0; i<length; i++) {
            sFreq[s.charAt(i) - 'a']++;
            tFreq[t.charAt(i) - 'a']++;
        }

        for(int i=0; i<sFreq.length; i++) {
            if(tFreq[i] > sFreq[i] ) {
                count += tFreq[i] - sFreq[i];
            }
        }
        return count;
    }

}
