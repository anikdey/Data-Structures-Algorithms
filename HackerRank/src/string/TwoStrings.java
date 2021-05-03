package string;

public class TwoStrings {

    public static void main(String[] args) {
        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "world"));
    }

    public static String twoStrings(String s1, String s2) {
        char[] chars = s1.toCharArray();

        //s2 = s2.chars().distinct().toArray();
        System.out.println(s2);

        for(int i=0; i<chars.length; i++) {
            if(s2.indexOf(chars[i] ) > -1) {
                return "YES";
            }
        }
        return "NO";
    }

}
