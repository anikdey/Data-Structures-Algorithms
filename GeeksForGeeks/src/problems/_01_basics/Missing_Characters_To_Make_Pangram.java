package problems._01_basics;

public class Missing_Characters_To_Make_Pangram {

    public static void main(String[] args) {

        System.out.println(getMissingCharacters("welcome to geeksforgeeks"));
        System.out.println(getMissingCharacters("The quick brown fox jumps"));
    }

    public static String getMissingCharacters(String str) {
        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch != ' ') {
                freq[ch - 'a']++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<freq.length; i++) {
            if(freq[i] == 0) {
                char ch = (char)('a'+i);
                sb.append(ch);
            }
        }

        return sb.toString();
    }

}
