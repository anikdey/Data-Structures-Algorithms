package string.requiressubscription;

public class CountSubstringWithOnlyOneDistinctLetter {

    public static void main(String[] args) {
        System.out.println(count("aaaaaaaaaa"));
    }

    public static int count(String s) {
        int count = 0;

        int currentCount = 1;
        int prevChar = s.charAt(0);
        int length = s.length();
        for(int i=1; i<length; i++) {
            if(prevChar != s.charAt(i)) {
                count += currentCount * (currentCount + 1 ) / 2;
                prevChar = s.charAt(i);
                currentCount = 1;
            } else {
                currentCount++;
            }
        }
        count += currentCount * (currentCount + 1 ) / 2;
        return count;
    }



}
