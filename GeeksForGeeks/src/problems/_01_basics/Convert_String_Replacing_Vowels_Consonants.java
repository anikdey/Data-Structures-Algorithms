package problems._01_basics;

/*
Given two strings S1 and S2, you are allowed only to change a character at any position to any vowel if it is a vowel or to a consonant,
if it is a consonant. The task is to check if a string S1 can be changed to S2 or S2 can be changed to S1.
*/


public class Convert_String_Replacing_Vowels_Consonants {

    public static void main(String[] args) {
        System.out.println(checkIsConvertibleOrNot("abcgle", "ezggli"));
        System.out.println(checkIsConvertibleOrNot("abcglez", "ezgglied"));
    }

    public static String checkIsConvertibleOrNot(String str1, String str2) {
        if(str1.length() != str2.length())
            return "No";
        for(int i=0; i<str1.length(); i++) {
            if(isVowel(str1.charAt(i))) {
                if(!isVowel(str2.charAt(i))) {
                    return "No";
                }
            } else {
                if(!isConsonant(str2.charAt(i))) {
                    return "No";
                }
            }
        }
        return "Yes";
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ')
            return true;
        else
            return false;
    }

    private static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ')
            return false;
        else
            return true;
    }

}
