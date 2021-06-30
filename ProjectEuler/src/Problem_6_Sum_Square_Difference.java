public class Problem_6_Sum_Square_Difference {

    public static void main(String[] args) {
        System.out.println(sumSquareDifference(100));
    }

    public static long sumSquareDifference(int number) {
        long result = number * (number + 1);
        long sumSquare = (result * (2*number + 1)) / 6;
        long sumOfNaturalNumbers = result/2;
        return (sumOfNaturalNumbers * sumOfNaturalNumbers) - sumSquare;
    }

}
