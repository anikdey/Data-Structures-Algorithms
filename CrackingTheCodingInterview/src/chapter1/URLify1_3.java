package chapter1;

public class URLify1_3 {

    public static void main(String[] args) {

    }

    public static String urlify(String str, int length) {

        StringBuilder stringBuilder = new StringBuilder();
        int n = str.trim().length();
        for(int i=0; i<n; i++) {
            char currentChar = str.charAt(i);
            if(currentChar ==' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }


}
