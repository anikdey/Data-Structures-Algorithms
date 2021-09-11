package internalcontest.week3;

public class ModifiedKaprekarNumbers {

    public static void main(String[] args) {
        //kaprekarNumbers(1, 100000);
        kaprekarNumbers(65536, 65536);
    }

    public static void kaprekarNumbers(int p, int q) {

        boolean isFound = false;
        for(int i=p; i<=q; i++) {

            if(isKaprekarNumber(i)) {
                isFound = true;
                System.out.print(i+" ");
            }

        }

        if(!isFound) {
            System.out.println("INVALID RANGE");
        }

    }


    private static boolean isKaprekarNumber(int number) {
        int d = new String(""+number).length();
        //int squaredNumber = number * number;
        System.out.println("Number is " + number);
        long multiplication = (long) number * number;
        String squareStr = ""+(multiplication);

        System.out.println(squareStr+"=========");

        String right = squareStr.substring(squareStr.length() - d);
        String left = squareStr.substring(0, squareStr.length() - d);

        int r = 0;
        int l = 0;

        if(!right.isEmpty()) {
            r=Integer.parseInt(right);
        }


        if(!left.isEmpty()) {
            l=Integer.parseInt(left);
        }


        return r + l == number;
    }


  /*  private static boolean isKaprekarNumber(int number) {
        int d = new String(""+number).length();
        int squaredNumber = number * number;
        String squareStr = ""+(number * number);

        String right = squareStr.substring(squareStr.length() - d);
        String left = squareStr.substring(0, squareStr.length() - d);

        if(squaredNumber<=9) {
            return squaredNumber == number;
        } else {

            if(!right.isEmpty()) {
                Integer.parseInt(right)
            }

            return Integer.parseInt(right) + Integer.parseInt(left) == number;
        }

    }*/

}
