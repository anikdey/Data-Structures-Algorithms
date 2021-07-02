import javax.swing.*;
import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        input.nextLine();
        BigInteger bigInteger = BigInteger.ZERO;
        for(int i=1; i<= testCase; i++) {
            bigInteger = bigInteger.add(new BigInteger(input.nextLine()));
        }
        input.close();
        System.out.println(bigInteger.toString().substring(0,10));
    }

}
