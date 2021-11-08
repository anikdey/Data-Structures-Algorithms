package problems._01_basics;

public class Count_Vowels_In_String {

    public static void main(String[] args) {
        System.out.println(countVowelsIterative("abc"));
        String str = "abc";
        System.out.println(countVowelsRecursive(str,str.length()-1));
    }

    public static int countVowelsIterative(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++)
            count += isVowel(str.charAt(i));
        return count;
    }

    public static int countVowelsRecursive(String str, int length) {
        if(length == 0)
            return isVowel(str.charAt(length));
        return isVowel(str.charAt(length)) + countVowelsRecursive(str, length-1);
    }

    private static int isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return 1;
        else
            return 0;
    }
}
