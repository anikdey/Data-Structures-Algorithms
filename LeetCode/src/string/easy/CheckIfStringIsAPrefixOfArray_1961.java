package string.easy;

public class CheckIfStringIsAPrefixOfArray_1961 {

    public static void main(String[] args) {

    }

    public boolean isPrefixString(String s, String[] words) {

        int legth = s.length();
        int count = 0;

        for(String str : words) {

            char[] chars = str.toCharArray();

            for(int i=0; i<chars.length; i++) {
                if(chars[i] == s.charAt(count)) {
                    count++;
                    if(count == legth && i==chars.length-1) {
                        return true;
                    } else if(count == legth && i!=chars.length-1) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return false;
    }


}
