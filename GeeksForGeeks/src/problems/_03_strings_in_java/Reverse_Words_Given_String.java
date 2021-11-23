package problems._03_strings_in_java;

public class Reverse_Words_Given_String {

    public static void main(String[] args) {
        System.out.println(reverseWords("Welcome to geeksforgeeks"));
    }

    public static String reverseWords(String str) {

        String[] strArray = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=strArray.length-1; i>=0; i--) {
            if(i==0) {
                sb.append(strArray[i]);
            } else {
                sb.append(strArray[i]+" ");
            }

        }
        return sb.toString();
    }

}
