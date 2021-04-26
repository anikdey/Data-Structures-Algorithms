package recursion;

public class RecursiveDigitSum {

    public static void main(String[] args) {
        System.out.println(superDigit("98963", 100));
    }

    public static int superDigit(String n, int k) {
        long sum = 0;
        n = n.trim();
        int length = n.length();
        for(int i=0; i<length; i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        return getSuperDigit(sum*k);
    }

    private static int getSuperDigit(long digit) {
        if(digit<10) {
            return (int)digit;
        }
        return getSuperDigit(getDigitSum(digit));
    }

    private static long getDigitSum(long digit) {
        if(digit == 0) {
            return 0;
        }
        return digit%10 + getDigitSum(digit/10);
    }

}
