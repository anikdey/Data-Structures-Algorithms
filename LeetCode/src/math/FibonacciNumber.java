package math;

public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fibIterative(30));
        System.out.println(fib(30));
    }

    public static int fibIterative(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int sum = 0;
        int firstNum = 0;
        int secondNum = 1;
        for(int i=2; i<=n; i++) {
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
        return sum;
    }


    public static int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fib(n-1) + fib(n-2);
    }

}
