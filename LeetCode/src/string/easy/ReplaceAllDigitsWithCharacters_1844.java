package string.easy;

public class ReplaceAllDigitsWithCharacters_1844 {

    public static void main(String[] args) {


    }

    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        char lastChar = ' ';
        for(int i=0; i<s.length(); i++) {
            if(i % 2 == 0) {
                lastChar = s.charAt(i);
                sb.append(lastChar);
            } else {
                char ch = (char) (lastChar + Character.getNumericValue(s.charAt(i)));
                sb.append(ch);

            }
        }
        return sb.toString();
    }

}
