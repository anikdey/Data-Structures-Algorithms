package primenumber;

public class PrimeFactorizationOfNumber {

    public static void main(String[] args) {
        findPrimeFactorsOfNumber(2520);
    }


    public static void findPrimeFactorsOfNumber(int number) {
        for(int i=2; i<=number; i++) {
            int count = 0;
            while (number%i == 0) {
                count++;
                number /= i;
            }
            if(count>0) {
                System.out.println(i+"^"+count);
            }
        }
    }

    //https://www.youtube.com/watch?v=NCrcMxpyE4E
    public static int totalNumberOfFactors(int number) {
        int totalFactors = 1;
        for(int i=2; i<=number; i++) {
            int count = 0;
            while (number%i == 0) {
                count++;
                number /= i;
            }
            if(count>0) {
                System.out.println(i+"^"+count);
                totalFactors *= (count+1);
            }
        }
        return totalFactors;
    }

}
