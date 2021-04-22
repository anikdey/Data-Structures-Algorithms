package recursionpractice;

public class SumOfDigitUsingRecursion {


    public static void main(String[] args) {

        System.out.println(sumOfDigit(121, 0));

        System.out.println(test(1234));

    }

    private static int sumOfDigit(int number, int sum) {
        if(number == 0) {
            return sum;
        }
        sum += number%10;
        return sumOfDigit(number/10, sum);
    }

    public static int test(int no) {
        //return no == 0 ? 0 : no % 10 + test(no / 10);
        if(no == 0) {
            return  0;
        } else {
            return no % 10 + test(no / 10);
        }
    }

}
