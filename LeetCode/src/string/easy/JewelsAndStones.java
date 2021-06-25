package string.easy;

public class JewelsAndStones {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int[] lowerCaseFreq = new int[26];
        int[] upperCaseFreq = new int[26];

        int length = stones.length();
        for(int i=0; i<length; i++) {
            char currentChar = stones.charAt(i);
            if(currentChar>='a' && currentChar <= 'z') {
                lowerCaseFreq[currentChar - 'a']++;
            } else {
                upperCaseFreq[currentChar - 'A']++;
            }
        }

        length = jewels.length();

        for(int i=0; i<length; i++) {
            char currentChar = jewels.charAt(i);
            if(currentChar>='a' && currentChar <= 'z') {
                count += lowerCaseFreq[currentChar - 'a'];
            } else {
                count += upperCaseFreq[currentChar - 'A'];
            }
        }

        return count;
    }

}
