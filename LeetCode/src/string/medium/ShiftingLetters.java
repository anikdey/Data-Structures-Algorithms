package string.medium;

public class ShiftingLetters {

    public static void main(String[] args) {
        String s = "abcz";
        int[] shifts = {3,5,9,2};
        System.out.println(shiftingLetters(s, shifts));
    }

    public static String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();

        for(int i=0; i<shifts.length; i++) {
            int k = shifts[i] % 26;
            for(int j=0; j<=i; j++) {
                int newChar = chars[j] + k;

                if(newChar>122) {
                    newChar = newChar % 122 + 96;
                }
                chars[j] = (char) newChar;
            }
        }
        return new String(chars);
    }

}
