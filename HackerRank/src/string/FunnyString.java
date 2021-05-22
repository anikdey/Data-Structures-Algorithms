package string;

public class FunnyString {

    public static void main(String[] args) {
        System.out.println(funnyString("bcxz"));
    }


    public static String funnyString(String s) {
        int lastPosition = s.length()-1;
        for(int i=0; i<s.length()-1;i++) {
            long forwardValue = Math.abs(s.charAt(i) - s.charAt(i+1));
            long backwardValue = Math.abs(s.charAt(lastPosition) - s.charAt(lastPosition-1));
            lastPosition--;
            if(forwardValue != backwardValue)
                return "Not Funny";
        }
        return "Funny";
    }

}
