package primenumber;

public class AllFactorsOfNumber {

    public static void main(String[] args) {
        //allFactorsNaiveApproach(36);
        allFactorsOptimized(49);
    }

    public static void allFactorsNaiveApproach(int number) {
        System.out.println(1);
        int half = number/2;
        for(int i=2; i<=half; i++) {
            if(number%i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(number);
//        for(int i=1; i<=number; i++) {
//            if(number%i == 0) {
//                System.out.println(i);
//            }
//        }
    }


    public static void allFactorsOptimized(int number) {
        int sqrt = (int) Math.sqrt(number);
        for(int i=1; i<=sqrt; i++) {
            if(number % i == 0) {
                System.out.println(i);
                if(i != sqrt) {
                    System.out.println(number/i);
                }
            }

        }
    }

}
