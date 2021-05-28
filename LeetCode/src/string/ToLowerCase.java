package string;

public class ToLowerCase {

    public static void main(String[] args) {

        System.out.println(toLowerCase("LOVELY"));
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("al&phaBET"));
    }

    public static String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++) {
            int currentChar = chars[i];
            if(currentChar>=65 && currentChar <= 'Z') {
                char lowerCase = (char) (currentChar+32);
                chars[i] = lowerCase;
            }
        }
        return new String(chars);
    }

}
