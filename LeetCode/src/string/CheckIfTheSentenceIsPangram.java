package string;

public class CheckIfTheSentenceIsPangram {

    public static void main(String[] args) {

        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));

    }

    public static boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for (char ch : sentence.toCharArray()) {
            freq[ch - 'a']++;
        }
        for(int num : freq) {
            if(num == 0) {
                return false;
            }
        }

        return true;
    }

}
