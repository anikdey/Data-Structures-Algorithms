package string.easy;

public class EqualSummationOfTwoWords {

    public static void main(String[] args) {
        System.out.println(isSumEqual("acb", "cba", "cdb"));
        System.out.println(isSumEqual("aaa", "a", "aaaa"));
        System.out.println(isSumEqual("aaa", "a", "aab"));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        return getValue(firstWord) + getValue(secondWord) == getValue(targetWord);

//        int twoStringSum = 0;
//        int sum = 0;
//
//        for(int i=0; i<firstWord.length(); i++) {
//            sum = (sum * 10) + firstWord.charAt(i) - 97;
//        }
//        twoStringSum = sum;
//        sum = 0;
//
//
//        for(int i=0; i<secondWord.length(); i++) {
//            sum = (sum * 10) + secondWord.charAt(i) - 97;
//        }
//        twoStringSum += sum;
//        sum = 0;
//        for(int i=0; i<targetWord.length(); i++) {
//            sum = (sum * 10) + targetWord.charAt(i) - 97;
//        }
//
//
//        return twoStringSum == sum;
    }

    private static int getValue(String str) {
        int sum = 0;
        for(int i=0; i<str.length(); i++) {
            sum = (sum * 10) + str.charAt(i) - 97;
        }
        return sum;
    }

}
