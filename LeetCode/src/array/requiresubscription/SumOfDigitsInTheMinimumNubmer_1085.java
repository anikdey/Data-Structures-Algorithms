package array.requiresubscription;

public class SumOfDigitsInTheMinimumNubmer_1085 {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(new int[]{34, 23, 100, 24, 75, 33, 54, 8}));
        System.out.println(sumOfDigits(new int[]{99, 77, 33, 66, 55}));
    }

    public static int sumOfDigits(int[] A) {

        int minNumber = Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++) {
            if(A[i]==1) {
                return 0;
            }
            if(A[i]<minNumber)
                minNumber = A[i];
        }

        int sum = 0;

        while (minNumber != 0) {
            sum += minNumber%10;
            minNumber /= 10;
        }

        if(sum % 2 == 1)
            return 0;
        return 1;
    }

}
