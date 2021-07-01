public class Problem_7_10001st_Prime {

    public static void main(String[] args) {
        System.out.println(findNthPrime(10001));
    }

    public static long findNthPrime(int n) {
        long lastPrime = 1;
        long number = 2;
        while (n != 0) {
            if (isPrime(number)) {
                lastPrime = number;
                n--;
            }
            number++;
        }
        return lastPrime;
    }

    public static boolean isPrime(long number) {
        double sqrt = Math.sqrt(number);
        for(int i=2; i<=sqrt; i++) {
            if(number%i == 0)
                return false;
        }
        return true;
    }

}
