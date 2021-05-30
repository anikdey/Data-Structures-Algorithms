package string;

public class ReverseOnlyLetters {

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
        System.out.println(reverseOnlyLetters(";1yDV"));
    }

    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length-1;

        while (start<end) {
            int startChar = chars[start];
            int endingChar = chars[end];
            if( (startChar >= 'a' && startChar <= 'z' ||  startChar >= 'A' && startChar <= 'Z') &&
                    (endingChar >= 'a' && endingChar <= 'z' ||  endingChar >= 'A' && endingChar <= 'Z')) {
                char endChar = chars[end];
                chars[end] = chars[start];
                chars[start] = endChar;
                start++;
                end--;
            }

            startChar = chars[start];
            endingChar = chars[end];

            if(!(startChar >= 'a' && startChar <= 'z') &&  !(startChar >= 'A' && startChar <= 'Z') ) {
                start++;
            }

            if(!(endingChar >= 'a' && endingChar <= 'z') &&  !(endingChar >= 'A' && endingChar <= 'Z') ) {
                end--;
            }
        }

        return new String(chars);
    }

}
