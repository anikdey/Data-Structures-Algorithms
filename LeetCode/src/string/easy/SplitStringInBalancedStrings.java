package string.easy;

public class SplitStringInBalancedStrings {

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }

    public static int balancedStringSplit(String s) {
        int count = 0;

        int countOfLorR = 0;
        int length = s.length();
        for(int i=0; i<length; i++) {
            if(s.charAt(i) == 'L') {
                countOfLorR++;
            } else {
                countOfLorR--;
            }
            if(countOfLorR == 0) {
                count++;
            }
        }
        return count;

    }

}
