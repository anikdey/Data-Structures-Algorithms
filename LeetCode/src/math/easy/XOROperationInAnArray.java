package math.easy;

public class XOROperationInAnArray {

    public static void main(String[] args) {

        System.out.println(xorOperation(5, 0));
        System.out.println(xorOperation(4, 3));
        System.out.println(xorOperation(1, 7));
        System.out.println(xorOperation(10, 5));

    }

    public static int xorOperation(int n, int start) {
        int sum = 0;
        for(int i=0; i<n; i++) {
            int num = start + 2*i;
            sum = sum ^ num;
        }
        return sum;
    }

}
