package binarysearch;

public class ValidPerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {
        int sum = 0;
        while(num != 0) {
            sum += num % 10;
            num /= 10;

            if(num == 0 && sum>9) {
                num = sum;
            }
        }

        if(sum == 1 || sum == 4 || sum == 7 || sum == 9) {
            return true;
        } else {
            return false;
        }

    }

}
