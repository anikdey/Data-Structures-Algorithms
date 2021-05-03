package string;

import java.util.Locale;

public class Pangram {

    public static void main(String[] args) {

        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
        System.out.println(pangrams("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }

    public static String pangrams(String s) {
        int count = (int)s.toLowerCase().chars().distinct().count();
        if(s.contains(" ") && count == 27) {
            return "pangram";
        } else if(!s.contains(" ") && count == 26) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }

}
