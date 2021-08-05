package math.easy;

public class ConvertBinaryNumberInALinkedListToInteger {

    public static void main(String[] args) {
        System.out.println(getDecimalValue("10101010101010101010101010"));
    }


    public static int getDecimalValue(String head) {
        return Integer.parseInt(head, 2);
    }

}
