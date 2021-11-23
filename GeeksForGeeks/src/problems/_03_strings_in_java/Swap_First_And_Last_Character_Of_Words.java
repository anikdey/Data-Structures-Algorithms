package problems._03_strings_in_java;

public class Swap_First_And_Last_Character_Of_Words {

    public static void main(String[] args) {
        System.out.println(swap("ad geeks for geeks"));
    }

    public static String swap(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length-1;
        int start = 0;

        for (int i=0; i<=length; i++) {

            if(chars[i] == ' ') {
                if(start<i) {
                    char temp = chars[i-1];
                    chars[i-1] = chars[start];
                    chars[start] = temp;
                }
                start = i+1;
            }

            if (i == length) {
                if(start<i) {
                    char temp = chars[i];
                    chars[i] = chars[start];
                    chars[start] = temp;
                }
            }

        }
        return new String(chars);
    }

}
