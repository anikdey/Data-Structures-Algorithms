package binarysearch.easy;

public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'a','b'}, 'z'));
        System.out.println(nextGreatestLetter(new char[]{'c','f', 'j'}, 'a'));
    }


    public static char nextGreatestLetter(char[] letters, char target) {
        char expected = '#';
        int start = 0;
        int end = letters.length - 1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            char currentChar = letters[mid];
            if(currentChar>target) {
                expected = currentChar;
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }

        if(expected == '#') {
            expected = letters[0];
        }
        return expected;
    }

}
