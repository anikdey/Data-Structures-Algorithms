package string.easy;

public class CheckIfTheSentenceIsPangram {

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
        System.out.println(checkIfPangram("pqrstuvwxyzabcdefghijklmno"));
    }

//    public static boolean checkIfPangram(String sentence) {
//        boolean[] isPresent = new boolean[26];
//
//        for(int i=0; i<sentence.length(); i++) {
//            int index = sentence.charAt(i) - 'a';
//            isPresent[index] = true;
//        }
//
//        for (boolean value : isPresent) {
//            if(!value) {
//                return false;
//            }
//        }
//        return true;
//    }

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
