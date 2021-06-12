package string.easy;

import java.util.Locale;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("!043XjqjX043!"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int start = 0;
        int end = s.length()-1;
        while (start<end) {
            char leftChar = s.charAt(start);
            char rightChar = s.charAt(end);

            boolean isLeftChar = ((leftChar>= 'a' && leftChar <= 'z') || (leftChar>='0' && leftChar<='9'));
            boolean isRightChar = ((rightChar>= 'a' && rightChar <= 'z') || (rightChar>='0' && rightChar<='9'));

            if( isLeftChar && isRightChar) {
                if(leftChar != rightChar)
                    return false;
                start++;
                end--;
            }

            if( !isLeftChar ) {
                start++;
            }

            if(!isRightChar) {
                end--;
            }
        }
        return true;
    }

}
