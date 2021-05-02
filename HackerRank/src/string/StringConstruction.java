package string;

import java.util.Scanner;

public class StringConstruction {

    public static void main(String[] args) {
        System.out.println(stringConstruction("a"));
        System.out.println(stringConstruction("abcabcd"));
        System.out.println(stringConstruction("bccb"));
    }


    public static int stringConstruction(String s) {
        // As per my thinking....
        int counter = 0;
        String p = "";
        int length = s.length();
        for(int i=0; i<length; i++) {
            if(!p.isEmpty()) {
                String subString = s.substring(i, length);
                if(subString.startsWith(p)) {
                    i += p.length()-1;
                    p += p;
                } else if(p.contains(""+s.charAt(i)))  {
                    p += ""+s.charAt(i);
                } else {
                    p += ""+s.charAt(i);
                    counter++;
                }
            } else {
                p = ""+s.charAt(i);
                counter++;
            }
        }
        return counter;
        // Using the built in method support...
        //return counter = (int)s.chars().distinct().count();
    }

}
