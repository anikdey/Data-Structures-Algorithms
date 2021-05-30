package string;

public class ReverseWordsInStringIII {

    public static void main(String[] args) {

        System.out.println(reverseWords("Let's take LeetCode contest"));

    }

    public static String reverseWords(String s) {
        String[] splitArray = s.split(" ");
        for(int i=0; i< splitArray.length; i++) {
            char[] chars = splitArray[i].toCharArray();
            int start = 0;
            int end = chars.length - 1;
            while (start<end) {
                char lastChar = chars[end];
                chars[end] = chars[start];
                chars[start] = lastChar;
                start++;
                end--;
            }
            splitArray[i] = new String(chars);
        }
        return String.join(" ", splitArray);
    }

}
