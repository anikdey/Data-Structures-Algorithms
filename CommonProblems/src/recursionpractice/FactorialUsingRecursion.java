package recursionpractice;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println("Using tail recursion: " +factorialUsingTailRecursion(5, 1));

        System.out.println(fun1(4));

        System.out.println("func2");

        fun2(4);

    }

    public static  int factorialUsingTailRecursion(int number, int factor) {
        if(number == 0) {
            return factor;
        }

        return factorialUsingTailRecursion(number-1, number * factor);
    }

    public static int factorial(int number) {
        if(number == 0) {
            return 1;
        } else {
            return number * factorial(number-1);
        }
    }

    static int fun1(int n) {
        if(n == 1)
            return 0;
        else
            return 1 + fun1(n/2);
    }

    static void fun2(int n) {
        if(n == 0)
            return;
        fun2(n/2);
        System.out.println(n%2);
    }

}
