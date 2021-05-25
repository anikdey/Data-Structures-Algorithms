package implementation;

public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
        System.out.println(repeatedString("abcac", 10));
        System.out.println(repeatedString("asdbaa", 30));
        System.out.println(repeatedString("", 10));
    }

    public static long repeatedString(String s, long n) {
        long count = 0;
        long stringLength = s.length();
        if(s.isEmpty())
            return count;
        if(stringLength < n) {
            for (int i=0; i<stringLength; i++) {
                if(s.charAt(i) == 'a') {
                    count++;
                }
            }

            long numberOfRepetition = n / stringLength;
            if(numberOfRepetition>0) {
                count = numberOfRepetition * count;
            }

            long remainder = n % stringLength;
            for (int i=0; i<remainder; i++) {
                if(s.charAt(i) == 'a') {
                    count++;
                }
            }
        } else {
            for (int i=0; i<=n-1; i++) {
                if(s.charAt(i) == 'a') {
                    count++;
                }
            }
        }
        return count;
    }

}
