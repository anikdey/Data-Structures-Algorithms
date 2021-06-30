package numbertheory;

public class GCD {

    public static void main(String[] args) {
        System.out.println("Least Common Multiple: "+getLCM(16, 24));
        System.out.println("Greatest Common Divisor: " +gcdEuclidAlgorithm(24, 16));

        //System.out.println("Greatest Common Divisor: " +gcdEuclidAlgorithm(30, gcdEuclidAlgorithm(24, 16)));
        System.out.println("Least Common Multiple: "+getLCM(4, getLCM(6, 8)));
    }

    public static int gcdEuclidAlgorithm(int firstNumber, int secondNumber) {
        int dividend = firstNumber;
        int divisor = secondNumber;
        if(firstNumber<secondNumber) {
            dividend = secondNumber;
            divisor = firstNumber;
        }
        while (divisor != 0) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return dividend;
    }


//    public static int gcdEuclidAlgorithm(int firstNumber, int secondNumber) {
//        int remainder = secondNumber % firstNumber;
//        while (remainder != 0) {
//            remainder = secondNumber % firstNumber;
//            secondNumber = firstNumber;
//            if(remainder == 0)
//                return firstNumber;
//            firstNumber = remainder;
//        }
//        System.out.println(firstNumber);
//        return firstNumber;
//    }

    public static int getLCM(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber) / gcdEuclidAlgorithm(firstNumber, secondNumber);
    }

}
