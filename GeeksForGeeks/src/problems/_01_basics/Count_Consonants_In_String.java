package problems._01_basics;

public class Count_Consonants_In_String {

    public static void main(String[] args) {
        System.out.println(countConsonantsIterative("abc"));
        String str = "geeksforgeeks portal";
        System.out.println(countConsonantsRecursive(str,str.length()-1));
    }

    public static int countConsonantsIterative(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++)
            count += isVowel(str.charAt(i));
        return count;
    }

    public static int countConsonantsRecursive(String str, int length) {
        if(length == 0)
            return isVowel(str.charAt(length));
        return isVowel(str.charAt(length)) + countConsonantsRecursive(str, length-1);
    }

    private static int isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ')
            return 0;
        else
            return 1;
    }
}
