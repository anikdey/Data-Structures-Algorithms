package problemsofarray;

// 1. How do you find the missing number in a given integer array of 1 to 100?

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(getMissingNumber(numbers));
    }

    public static int getMissingNumber(int[] numbers) {
        int sum = 0;
        for(int number: numbers) {
            sum += number;
        }
        int length = numbers.length + 1;
        return ( length * ( length +1 ) ) / 2 - sum;
    }

}
