package array.requiresubscription;

public class SumOfDigitsTnTheMinimumNumber {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(new int[]{34,23,10,24,75,33,54,8}));
    }

    public static int sumOfDigits(int[] A) {
        int min = A[0];
        for(int i=1; i<A.length; i++) {
            if(A[i] == 1) {
                return 0;
            } else if(A[i]<min) {
                min = A[i];
            }
        }

        int sum = 0;
        while (min != 0) {
            sum += min % 10;
            min /= 10;
        }
        return sum % 2 == 0 ? 1 : 0;
    }


}
