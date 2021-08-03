package string.easy;

public class SumOfDigitsOfStringAfterConvert {

    public static void main(String[] args) {
        System.out.println(getLucky("iiii", 1));
        System.out.println(getLucky("leetcode", 2));
        System.out.println(getLucky("zbax", 2));
        System.out.println(getLucky("a", 2));
    }

    public static int getLucky(String s, int k) {
        int sum = 0;
        for(char ch : s.toCharArray()) {
            int currentNumber = ch - 'a' + 1;
            while (currentNumber != 0) {
                sum += currentNumber % 10;
                currentNumber /= 10;
            }
        }

        for(int i=2; i<=k; i++) {
            int newSUm = 0;
            while (sum != 0) {
                newSUm += sum % 10;
                sum /= 10;
            }
            sum = newSUm;
        }
        return sum;
    }

}
