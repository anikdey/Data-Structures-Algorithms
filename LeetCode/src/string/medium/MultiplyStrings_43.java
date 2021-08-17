package string.medium;

public class MultiplyStrings_43 {

    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
        System.out.println(multiply("56", "10"));
    }

    public static String multiply(String num1, String num2) {


        char[] firstChars = num1.toCharArray();
        char[] secondChars = num2.toCharArray();

        StringBuilder prevCalculatedValue = null;
        int offset = -1;

        outerLoop:
        for(int i=secondChars.length-1; i>=0; i--) {

            int currentDigit = secondChars[i] - '0';
            offset++;
            StringBuilder currentMultiplication = new StringBuilder();
            int carry = 0;
            for(int x=firstChars.length-1; x>=0; x--) {
                int num = firstChars[x]- '0';
                int sum = num * currentDigit + carry;
                currentMultiplication.append(sum%10);
                carry = sum/10;
            }
            if(carry>0) {
                currentMultiplication.append(carry);
            }
            currentMultiplication.reverse();
            if(prevCalculatedValue == null) {
                prevCalculatedValue = currentMultiplication;
            } else {
                StringBuilder newSum = new StringBuilder();
                int rightOffset = offset;
                int count = 0;
                int length = prevCalculatedValue.length()-1;
                while (rightOffset>0) {
                    newSum.append(prevCalculatedValue.charAt(length-count));
                    count++;
                    rightOffset--;
                }
                length = length - count;
                int newSumLength = currentMultiplication.length()-1;
                carry = 0;
                while (length>= 0 || newSumLength>=0) {
                    int sum = carry;
                    if(length>-1) {
                        sum += prevCalculatedValue.charAt(length) - '0';
                    }
                    if(newSumLength>-1) {
                        sum += currentMultiplication.charAt(newSumLength) - '0';
                    }
                    newSum.append(sum%10);
                    carry = sum/10;
                    length--;
                    newSumLength--;
                }
                if(carry>0) {
                    newSum.append(carry);
                }
                prevCalculatedValue = newSum.reverse();
            }
        }
        return prevCalculatedValue.toString();
    }

}
