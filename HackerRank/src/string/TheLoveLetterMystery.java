package string;

public class TheLoveLetterMystery {

    public static void main(String[] args) {
        //System.out.println(theLoveLetterMystery("ac"));
        System.out.println(theLoveLetterMystery("abc"));
        System.out.println(theLoveLetterMystery("abcba"));
        System.out.println(theLoveLetterMystery("abcd"));
        System.out.println(theLoveLetterMystery("cba"));
        System.out.println(theLoveLetterMystery(""));
        System.out.println(theLoveLetterMystery("a"));
    }


    public static int theLoveLetterMystery(String s) {
        int count = 0;
        int length = s.length();
        if(length == 0 || length == 1)
            return 0;
        int starting = 0;
        while (starting<length-1) {
            if(s.charAt(starting) != s.charAt(length-1)) {
                count += Math.abs(s.charAt(starting) - s.charAt(length-1));
            }
            starting++;
            length--;
        }
        return count;
    }

}
