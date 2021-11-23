package problems._01_basics;

public class Nearest_Multiple_Of_10 {

    public static void main(String[] args) {
        System.out.println(roundToNearest("989"));
    }

   public static String roundToNearest(String N){

        StringBuilder sb = new StringBuilder(N);
        int length = sb.length() - 1;
        int lastDigit = Character.getNumericValue(sb.charAt(length));

        if(lastDigit<=5) {
            sb.setCharAt(length, '0');
            return sb.toString();
        } else {
            int add = 10 - lastDigit;
            int sum = lastDigit + add;
            int carry = sum / 10;
            sb.setCharAt(length, '0');
            while (length>=0 && carry != 0) {
                sb.setCharAt(length, '0');
                length--;
                if (length<0)
                    break;
                int prevDigit = Character.getNumericValue(sb.charAt(length));
                sum = prevDigit + carry;
                if(sum>9) {
                    carry = 1;
                } else {
                    sb.setCharAt(length, Character.forDigit(sum, 10));
                    carry = 0;
                }
            }
            if(carry>0) {
                sb.insert(0, 1);
            }
            return sb.toString();
        }
    }

}
