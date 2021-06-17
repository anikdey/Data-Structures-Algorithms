package chapter1;

public class StringCompression1_6 {

    public static void main(String[] args) {
        System.out.println(stringCompression("aabcccccaaa"));
        System.out.println(stringCompression("aaab"));
        System.out.println(stringCompression("aa"));
        System.out.println(stringCompression("aaasbbbb"));
    }

    public static String stringCompression(String str) {

        if(str.length() == 1)
            return str;

        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        int count = 0;
        for(int i=0; i<chars.length-1; i++) {
            count++;
            char currentChar = chars[i];
            char nextChar = chars[i+1];
            if(currentChar == nextChar && i==chars.length-2) {
                stringBuilder.append(currentChar);
                stringBuilder.append(count+1);
                count = 0;
            } else if(currentChar != nextChar && i==chars.length-2) {
                stringBuilder.append(currentChar);
                stringBuilder.append(count);
                stringBuilder.append(nextChar);
                stringBuilder.append(1);
            } else if(currentChar != nextChar && i<chars.length-1) {
                stringBuilder.append(currentChar);
                stringBuilder.append(count);
                count = 0;
            }
        }
        if(stringBuilder.length() >= str.length()) {
            return str;
        }
        return stringBuilder.toString();
    }

}