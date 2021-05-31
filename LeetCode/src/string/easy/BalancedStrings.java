package string.easy;

public class BalancedStrings {

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("LLLRRLRLRR"));
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        int countOfLR = 0;

        for(int i=0; i<s.length(); i++) {

            if(s.charAt(i) == 'L') {
                countOfLR++;
            } else {
                countOfLR--;
            }
            if(countOfLR == 0) {
                count++;
            }
        }


        return count;
    }

}
