import java.math.BigInteger;

public class Problem_20_Factorial_Digit_Sum {

    public static void main(String[] args) {
        System.out.println(findFactSum(100));
    }

    public static long findFactSum(int number) {
        BigInteger bigInteger = BigInteger.ONE;
        for(int i=1; i<=number; i++) {
            bigInteger = bigInteger.multiply(new BigInteger(i+""));
        }
        return findSum(bigInteger.toString());
    }

    public static long findSum(String fact) {
        System.out.println(fact);
        long sum = 0;
        char[] chars = fact.toCharArray();
        for(int i=0; i<chars.length; i++) {
            sum += Character.getNumericValue(chars[i]);
        }
        return sum;
    }

}
