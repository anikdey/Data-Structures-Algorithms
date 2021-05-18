package codility;

import java.util.Arrays;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(gapCount(9));
        System.out.println(gapCount(10));
        System.out.println(gapCount(15));
        System.out.println(gapCount(20));
        System.out.println(gapCount(32));
        System.out.println(gapCount(529));
        System.out.println(gapCount(1041));


        int[] array = {1,1,2,2,3,4,5,5};
        long count = Arrays.stream(array).distinct().count();
        System.out.println(count);

    }

    public static int gapCount(int N) {
        String binaryString = Integer.toBinaryString(N);


        boolean isFoundOne = false;
        boolean isCurrentGap = false;
        int countOfGap = 0;
        int maxLength = 0;
        int currentLengthOfGap = 0;

        for(int i=0; i<binaryString.length(); i++) {
            char currentChar = binaryString.charAt(i);

            if(currentChar == '1'){
                isFoundOne = true;
            }

            if(isFoundOne) {
                if(currentChar == '0') {
                    isCurrentGap = true;
                    currentLengthOfGap++;
                } else {
                    if(isCurrentGap) {
                        countOfGap++;
                        if(currentLengthOfGap > maxLength) {
                            maxLength = currentLengthOfGap;
                        }
                        currentLengthOfGap = 0;
                        isCurrentGap = false;
                    }
                }
            }
        }

        System.out.println("Binary String is " + binaryString + ", gap is "+maxLength);

        return maxLength;
    }

}
