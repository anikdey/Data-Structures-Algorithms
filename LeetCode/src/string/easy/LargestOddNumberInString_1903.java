package string.easy;

public class LargestOddNumberInString_1903 {

    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
    }

    public static String largestOddNumber(String num) {
        for(int i=num.length()-1; i>=0; i--) {
            int lastDigit = num.charAt(i) - '0';
            if(lastDigit % 2 == 1) {
                return num.substring(0, i+1);
            }
        }
        return "";
    }

}
