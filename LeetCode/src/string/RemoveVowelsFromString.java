package string;

public class RemoveVowelsFromString {

    public static void main(String[] args) {

        System.out.println(removeVowels("leetcodeisacommunityforcoders"));
        System.out.println(removeVowels("aeiou"));

        System.out.println(removeVowel("welcome to geeksforgeeks"));
        System.out.println(removeVowel("what is your name ?"));
        System.out.println(removeVowel("GeeeksforGeeks - A Computer Science Portal for Geeks"));
    }

    public static String removeVowels(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char currentChar = s.charAt(i);
            if( currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o' && currentChar != 'u') {
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }

    // this is from gfg for string containing a-z & A-Z
    public static String removeVowel(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char currentChar = s.charAt(i);
            if( currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o' && currentChar != 'u' && currentChar != 'A' &&
                    currentChar != 'E' && currentChar != 'I' && currentChar != 'O' && currentChar != 'U') {
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }
}
