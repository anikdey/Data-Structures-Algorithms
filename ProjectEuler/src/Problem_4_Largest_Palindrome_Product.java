import java.util.Calendar;

public class Problem_4_Largest_Palindrome_Product {

    public static void main(String[] args) {

        double dsaf = Math.pow(10, 3) - 1;
        System.out.println(dsaf);

        System.out.println(getLargestPalindrome());
    }


    public static int getLargestPalindrome() {
        long startTime = Calendar.getInstance().getTimeInMillis();
        int firstNumber = 999;
        int secondNumber = 999;
        int product = firstNumber * secondNumber;
        int maxPalindrome = -1;
        int count = 1;
        while (secondNumber >= 1) {
            if(firstNumber < 1) {
                firstNumber = 999 -count;
                secondNumber--;
                count++;
                System.out.println("table is "+ secondNumber +", "+ firstNumber);
            }
            if(isPalindrome(product) && product>maxPalindrome){
                maxPalindrome = product;
                if(firstNumber < 1) {
                    firstNumber = 999 -count;
                    secondNumber--;
                    count++;
                    continue;
                }
            }
            firstNumber--;
            product = firstNumber * secondNumber;
        }
        long endTime = Calendar.getInstance().getTimeInMillis();
        timeTaken(startTime, endTime);
        return maxPalindrome;
    }

    private static boolean isPalindrome(int number) {
        int copy = number;
        int sum = 0;
        while (copy != 0) {
            int lastDigit = copy % 10;
            sum = sum * 10 + lastDigit;
            copy /= 10;
        }
        return sum == number;
    }

    public static void timeTaken(long startTime, long endTime) {
        System.out.println((endTime-startTime)+" ms");
    }

}
