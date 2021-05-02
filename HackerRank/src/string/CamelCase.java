package string;

public class CamelCase {


    public static void main(String[] args) {
        System.out.println(camelcase("one"));
        System.out.println(camelcase("saveChangesInTheEditor"));
    }


    public static int camelcase(String s) {
        int count = 1;
        int length = s.length();
        for(int i=0; i<length; i++) {
            char currentChar = s.charAt(i);
            if(currentChar >= 'A' && currentChar<= 'Z') {
                count++;
            }
        }
        return count;
    }


}
