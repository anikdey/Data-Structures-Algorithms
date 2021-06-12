package string.easy;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] countArray = new int[26];

        for(int i=0; i<s.length(); i++) {
            char firstChar = s.charAt(i);
            char secondChar = t.charAt(i);
            int fIndex = firstChar - 'a';
            countArray[fIndex]++;
            int sIndex = secondChar - 'a';
            countArray[sIndex]--;
        }

        for(int i=0; i<countArray.length; i++) {
            if(countArray[i] != 0) {
                return false;
            }
        }

        return true;
    }

}
