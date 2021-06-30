
// Link to iterative solution
// https://www.geeksforgeeks.org/lcm-of-given-array-elements/

public class Problem_5_Smallest_Multiple {

    public static void main(String[] args) {
        //int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //int[] numbers = {1,2,3};
        //int[] numbers = {1,2, 8, 3};
        //int[] numbers = {2, 7, 3, 9, 4};
        System.out.println(leastCommonMultiple(numbers, 0, numbers.length));
    }

    public static long leastCommonMultiple(int[] numbers, int startIndex, int length) {
        if(startIndex == length-2) {
            return getLCM(numbers[startIndex], numbers[startIndex+1]);
        }
        return getLCM(numbers[startIndex], leastCommonMultiple(numbers, startIndex+1, length));
    }

    public static long getLCM(long firstNumber, long secondNumber) {
        return (firstNumber * secondNumber) / gcdEuclidAlgorithm(firstNumber, secondNumber);
    }

    public static long gcdEuclidAlgorithm(long firstNumber, long secondNumber) {
        long dividend = firstNumber;
        long divisor = secondNumber;
        if(firstNumber<secondNumber) {
            dividend = secondNumber;
            divisor = firstNumber;
        }
        while (divisor != 0) {
            long remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return dividend;
    }
}
