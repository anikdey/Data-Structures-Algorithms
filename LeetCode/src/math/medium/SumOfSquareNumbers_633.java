package math.medium;

public class SumOfSquareNumbers_633 {

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(49));
    }


    public static boolean judgeSquareSum(int c) {
//        if(c==1)
//            return true;
        int upperBound = (int) Math.sqrt(c);
        int lowerBound = 0;
        while (lowerBound<=upperBound) {
            int sum = lowerBound * lowerBound + upperBound * upperBound;
            if(sum==c)
                return true;
            if(sum>c) {
                upperBound--;
            } else {
                lowerBound++;
            }
        }

        return false;
    }

}
