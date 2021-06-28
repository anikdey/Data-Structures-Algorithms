package primenumber;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        double number  = 600851475143.0;
        //double number  = 13195;
        System.out.println(largestPrimeFactor(number));
    }

    public static double largestPrimeFactor(double number) {
        double maxPrimeFactor = Double.MIN_VALUE;
        for(double i=2; i<=number; i++) {
            while (number % i == 0) {
                number /= i;
                if(i>maxPrimeFactor) {
                    maxPrimeFactor = i;
                }
            }
        }
        return maxPrimeFactor;
    }

}
