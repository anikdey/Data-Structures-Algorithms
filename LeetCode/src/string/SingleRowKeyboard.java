package string;

public class SingleRowKeyboard {

    public static void main(String[] args) {
        System.out.println(calculateTime("abcdefgh", "cba"));
        System.out.println(calculateTime("abcdefgh", "abc"));
        System.out.println(calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"));
    }

    public static int calculateTime(String keyboard, String word) {
        int time = 0;
        int currentIndex = 0;
        for(char c : word.toCharArray()) {
            int indexOfChar = keyboard.indexOf(c);
            time += Math.abs(indexOfChar - currentIndex);
            currentIndex = indexOfChar;
        }
        return time;
    }

}
