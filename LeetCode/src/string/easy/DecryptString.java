package string.easy;

public class DecryptString {

    static char[] chars = {'a','b','c','d','e',
            'f','g','h','i','j','k',
            'l','m','n','o','p','q','r','s','t','u','v','w','x','y', 'z'};

    public static void main(String[] args) {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        System.out.println(freqAlphabets(s));
        System.out.println(freqAlphabets("25#"));
        System.out.println(freqAlphabets("1326#"));
        System.out.println(freqAlphabets("10#11#12"));
    }

    public static String freqAlphabets(String s) {
        String decryptedString = "";

        int count = s.length()-1;
        while (count>=0) {
            char currentChar = s.charAt(count);
            if(currentChar == '#') {
                int index = (s.charAt(count-2) - 48) * 10  + (s.charAt(count-1) - 48) - 1;
                decryptedString = chars[index]+decryptedString;
                count = count - 3;
            } else {
                int index = s.charAt(count) - 49;
                decryptedString = chars[index]+decryptedString;
                count--;
            }

        }
        return decryptedString;
    }

}
