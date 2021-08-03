package string.easy;

public class LongerContiguousSegmentsOfOnesThanZeros {

    public static void main(String[] args) {
        System.out.println(checkZeroOnes("1101"));
        System.out.println(checkZeroOnes("111000"));
        System.out.println(checkZeroOnes("110100010"));
        System.out.println(checkZeroOnes("11111111"));
        System.out.println(checkZeroOnes("00000000"));
        System.out.println(checkZeroOnes("10001111"));
        System.out.println(checkZeroOnes("1"));
        System.out.println(checkZeroOnes("111110000111000011100000111"));
        System.out.println(checkZeroOnes("10"));
    }

    public static boolean checkZeroOnes(String s) {

        int maxOnes = 0;
        int maxZeros = 0;

        int currentCountOfOnes = 0;
        int currentCountOfZeros = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '1') {
                currentCountOfOnes++;
                if(currentCountOfOnes>maxOnes)
                    maxOnes = currentCountOfOnes;
            } else {
                currentCountOfOnes = 0;
            }

            if(ch == '0') {
                currentCountOfZeros++;
                if(currentCountOfZeros>maxZeros)
                    maxZeros = currentCountOfZeros;
            } else {
                currentCountOfZeros = 0;
            }
        }
        return maxOnes > maxZeros;
    }

}
