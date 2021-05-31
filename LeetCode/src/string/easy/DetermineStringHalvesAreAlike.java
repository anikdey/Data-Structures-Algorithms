package string.easy;

public class DetermineStringHalvesAreAlike {

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
        System.out.println(halvesAreAlike("aeioua"));
        System.out.println(halvesAreAlike("Anik"));
        System.out.println(halvesAreAlike("AnikDeys"));
    }

    public static boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        int leftCount = 0;
        int rightCount = 0;

//        for(int i=0; i<mid; i++) {
//            if(isVowel(s.charAt(i)))
//                leftCount++;
//        }
//
//        for(int i=mid; i<s.length(); i++) {
//            if(isVowel(s.charAt(i)))
//                rightCount++;
//        }
        int left = 0;
        int right = s.length()-1;
        while (left<=right) {
            if(isVowel(s.charAt(left)))
                leftCount++;
            if(isVowel(s.charAt(right)))
                rightCount++;
            left++;
            right--;
        }
        if(leftCount != rightCount)
            return false;
        return true;
    }



    private static boolean isVowel(char currentChar) {
        return currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o' && currentChar != 'u' && currentChar != 'A' &&
                currentChar != 'E' && currentChar != 'I' && currentChar != 'O' && currentChar != 'U';
    }

}
