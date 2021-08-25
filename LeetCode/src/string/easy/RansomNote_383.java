package string.easy;

public class RansomNote_383 {

    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freqR = new int[26];
        int[] freqM = new int[26];

        int lengthR = ransomNote.length();
        int lengthM = magazine.length();

        for(int i=0; i<lengthR; i++) {
            freqR[ransomNote.charAt(i) - 'a']++;
        }

        for(int i=0; i<lengthM; i++) {
            freqM[magazine.charAt(i)-'a']++;
        }

//        int countR = 0;
//        int countM = 0;

        /*while(countR<lengthR || countM < lengthM) {

            if(countR<lengthR) {
                freqR[ransomNote.charAt(countR) - 'a']++;
                countR++;
            }

            if(countM<lengthM) {
                freqM[magazine.charAt(countM)-'a']++;
                countM++;
            }

        }*/

        for(int i=0; i<freqR.length; i++) {
            if(freqR[i] != 0 && freqR[i]>freqM[i])
                return false;
        }
        return true;
    }

}
