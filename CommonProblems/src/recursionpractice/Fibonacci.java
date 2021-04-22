package recursionpractice;

public class Fibonacci {

    public static void main(String[] args) {
        fib(12);
        System.out.println(nthFib(12));
    }

    public static void fib(int number) {
        int[] numbers = new int[number+1];
        numbers[0] = 0;
        numbers[1] = 1;

        System.out.print(0+", "+ 1+", ");

        for(int i=2; i<numbers.length; i++) {
            int nextFib = numbers[i-2] + numbers[i-1];
            numbers[i] = nextFib;
            System.out.print(nextFib +", ");
        }
        System.out.println();
    }

    public static int nthFib(int number) {
        if(number == 0) {
            return 0;
        }
        if(number == 1) {
            return 1;
        }
//        if( number<= 1) {
//            System.out.println("Returning number "+ number);
//            return number;
//        }
        return nthFib(number -1) + nthFib(number - 2);
    }

    public static void fibWithoutExtraStorage() {
        // Todo implement it....
    }

}
