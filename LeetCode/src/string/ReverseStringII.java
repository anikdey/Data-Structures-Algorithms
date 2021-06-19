package string;

public class ReverseStringII {

    public static void main(String[] args) {
        //System.out.println(reverseStr("abcd", 5));
        System.out.println(reverseStr("abcdefg", 2));
    }

    public static String reverseStr(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();

        int length = s.length();
        int doubleLength = 2*k;
        if(length<k || length == doubleLength)
            return getReversedString(s, length, k);

        while(!s.isEmpty()) {
            String subString = "";
            if(length>doubleLength) {
                subString = s.substring(0, doubleLength);
                length = length - doubleLength;
                s = s.substring(doubleLength);
                stringBuilder.append(getReversedString(subString, subString.length(), k));
            } else {
                stringBuilder.append(getReversedString(s, s.length(), k));
                s = "";
            }
        }
        return stringBuilder.toString();
    }

    public static String getReversedString(String string, int length, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        if(length<k) {
            for(int i=length-1; i>=0; i--) {
                stringBuilder.append(string.charAt(i));
            }
        }
        else {
            for(int i=k-1; i>=0; i--) {
                stringBuilder.append(string.charAt(i));
            }
            for(int i=k; i<length; i++) {
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }


}
