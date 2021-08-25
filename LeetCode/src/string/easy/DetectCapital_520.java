package string.easy;

public class DetectCapital_520 {

    public static void main(String[] args) {



        //Aaabdfsdff
    }

    public static boolean detectCapitalUse(String word) {

        if(word.length() == 1) {
            return true;
        }

        char ch = word.charAt(0);
        char secondChar = word.charAt(1);

        if(ch >= 'a' && ch <= 'z') {
            for(int i=1; i<word.length(); i++) {
                if(!(ch >= 'a' && ch <= 'z')) {
                    return false;
                }
            }
        } else {
            if( secondChar >= 'A' && secondChar <= 'Z' ){
                for(int i=2; i<word.length(); i++) {
                    if(!(ch >= 'A' && ch <= 'Z')) {
                        return false;
                    }
                }
            } else {
                for(int i=1; i<word.length(); i++) {
                    if(!(ch >= 'a' && ch <= 'z')) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

}
