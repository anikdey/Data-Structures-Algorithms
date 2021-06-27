public class Problem_2_EvenFibonacciNumbers {

    public static void main(String[] args) {

        System.out.println(getFibSum(10));
        System.out.println(getFibSum(34));
        System.out.println(getFibSum(60));
        System.out.println(getFibSum(1000));
        System.out.println(getFibSum(100000));
        System.out.println(getFibSum(4000000));

    }


    public static int getFibSum(int limit) {
        int firstNumber = 0;
        int secondNumber = 1;
        int sumToShow = 0;
        int sum = 0;
        while (sum<=limit) {
            sum = firstNumber + secondNumber;
            if(sum % 2 == 0) {
                sumToShow += sum;
            }
            firstNumber = secondNumber;
            secondNumber = sum;
        }
        return sumToShow;
    }


}
