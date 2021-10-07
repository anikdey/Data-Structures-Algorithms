package string;

public class Reverse_Prefix_Of_Word_2000 {

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }


    public static String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        int index = word.indexOf(ch);
        int i=0;

        while (i<index) {
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
            i++;
            index--;
        }
        return new String(chars);
    }

}
