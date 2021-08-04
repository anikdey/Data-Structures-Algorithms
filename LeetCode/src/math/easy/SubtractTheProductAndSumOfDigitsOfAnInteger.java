package math.easy;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            product *= lastDigit;
            n /= 10;
        }
        return product - sum;
    }

}
