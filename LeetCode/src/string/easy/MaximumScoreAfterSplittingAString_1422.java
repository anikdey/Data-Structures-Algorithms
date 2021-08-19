package string.easy;

public class MaximumScoreAfterSplittingAString_1422 {

    public static void main(String[] args) {
        System.out.println(maxScore("01110100000011111010101"));
    }

    public static int maxScore(String s) {
        int leftCount = 0;
        int rightCount = 0;

        if(s.charAt(0)=='0') {
            leftCount++;
        }
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == '1')
                rightCount++;
        }
        int max = leftCount + rightCount;

        for(int i=1; i<s.length(); i++) {

            char currentChar = s.charAt(i);
            if(currentChar=='1') {
                rightCount--;
            } else {
                leftCount++;
                int currentMax = rightCount + leftCount;
                if(max<currentMax) {
                    max = currentMax;
                }
            }
        }

        return max;
    }

}
