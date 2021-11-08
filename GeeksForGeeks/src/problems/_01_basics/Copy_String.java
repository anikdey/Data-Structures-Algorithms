package problems._01_basics;

public class Copy_String {

    public static void main(String[] args) {
        System.out.println(copyString("hello", "geeksforgeeks"));
    }

    public static String copyString(String str1, String str2) {
        char[] chars = str1.toCharArray();
        char[] newStr = new char[chars.length];
        for(int i=0; i<chars.length; i++) {
            newStr[i] = chars[i];
        }
        //return new String(newStr);
        return copyStringRecursive(chars, newStr, 0);
    }

    private static String copyStringRecursive(char[] originalString, char[] newString, int currentIndex) {
        if(currentIndex<originalString.length) {
            newString[currentIndex] = originalString[currentIndex];
            copyStringRecursive(originalString, newString, currentIndex+1);
        }
        return new String(newString);
    }


}
