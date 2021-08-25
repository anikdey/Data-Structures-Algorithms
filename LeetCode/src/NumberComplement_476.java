import java.util.Locale;

public class NumberComplement_476 {

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
        char[] arr = Integer.toBinaryString(num).toCharArray();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == '1') {
                arr[i] = '0';
            } else {
                arr[i] = '1';
            }
        }
        return Integer.parseInt(new String(arr), 2);

    }


}
