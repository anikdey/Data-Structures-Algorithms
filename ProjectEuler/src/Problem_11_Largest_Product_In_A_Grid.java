public class Problem_10_SummationOfPrimes {

    public static void main(String[] args) {
        System.out.println(summationOfPrimes(2000000));
    }

    public static long summationOfPrimes(int limit) {
        long sum = 0;
        for(int i=2; i<=limit; i++) {
            if(isPrime(i))
                sum += i;
        }
        return sum;
    }


    private static boolean isPrime(int number) {
        double root = Math.sqrt(number);
        for(int i=2; i<=root; i++) {
            if(number%i == 0)
                return false;
        }
        return true;
    }

}
