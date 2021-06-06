package string;

public class TwoStrings {

    public static void main(String[] args) {
       // System.out.println(twoStrings("hello", "world"));
        //System.out.println(twoStrings("hi", "world"));
        System.out.println(twoStrings("aardvark", "apple"));
    }

    public static String twoStrings(String s1, String s2) {

        int[] firstFreq = new int[26];
        int[] secondFreq = new int[26];

        int fLength = s1.length() - 1;
        int sLength = s2.length() - 1;

        while (fLength>0 || sLength>0) {
            if(fLength>=0) {
                firstFreq[s1.charAt(fLength) - 'a']++;
            }

            if (sLength>=0) {
                secondFreq[s2.charAt(sLength) - 'a']++;
            }
            fLength--;
            sLength--;
        }

        for(int i=0; i<firstFreq.length; i++) {
            if(firstFreq[i] > 0 && secondFreq[i] > 0) {
                return "YES";
            }
        }
        return "NO";
    }

}
