package string.easy;

public class RemovePalindromicSubsequences {

    public static void main(String[] args) {
        System.out.println(removePalindromeSub("aba"));
        System.out.println(removePalindromeSub("abb"));
    }

    public static int removePalindromeSub(String s) {
        if(s.length() == 0)
            return 0;
        if(isPalindrome(s))
            return 1;
        return 2;
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while (start<end) {
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

}
