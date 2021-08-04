package string.easy;

public class ThousandSeparator {

    public static void main(String[] args) {

        System.out.println(thousandSeparator(987));
        System.out.println(thousandSeparator(1234));
        System.out.println(thousandSeparator(1234567890));
    }

    public static String thousandSeparator(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if(n == 0)
            stringBuilder.append(n);
        int count = 0;

        while (n != 0) {
            count++;
            int lastDigit = n % 10;
            stringBuilder.append(lastDigit);
            n /= 10;
            if(count == 3 && n != 0){
                stringBuilder.append(".");
                count = 0;
            }

        }
        return stringBuilder.reverse().toString();
    }


}
