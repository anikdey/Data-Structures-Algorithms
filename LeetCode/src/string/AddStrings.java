package string;

public class AddStrings {

    public static void main(String[] args) {
        System.out.println(addStrings("11", "21"));
        System.out.println(addStrings("456", "77"));
        System.out.println(addStrings("956", "77"));
        System.out.println(addStrings("0", "0"));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();

        int num1Count = num1.length() - 1;
        int num2Count = num2.length() - 1;

        int carry = 0;

        while (num1Count>=0 || num2Count>=0) {
            int sum = carry;
            if(num1Count>=0) {
                sum += num1.charAt(num1Count) - 48;
                num1Count--;
            }
            if(num2Count>=0) {
                sum += num2.charAt(num2Count) - 48;
                num2Count--;
            }
            stringBuilder.append(sum%10);
            carry = sum/10;
        }
        if(carry>0) {
            stringBuilder.append(carry);
        }
        return stringBuilder.reverse().toString();
    }

//    public static String addStrings(String num1, String num2) {
//        StringBuilder stringBuilder = new StringBuilder();
//
//        int num1Count = num1.length() - 1;
//        int num2Count = num2.length() - 1;
//
//        int carry = 0;
//
//        while (num1Count>=0 && num2Count>=0) {
//            int firstNumber = num1.charAt(num1Count) - 48;
//            int secondNumber = num2.charAt(num2Count) - 48;
//            int sum = firstNumber + secondNumber + carry;
//            if(sum>9) {
//                carry = 1;
//                stringBuilder.append(sum-10);
//            } else {
//                carry = 0;
//                stringBuilder.append(sum);
//            }
//            num1Count--;
//            num2Count--;
//        }
//
//        while (num1Count>=0) {
//            int firstNumber = num1.charAt(num1Count) - 48;
//            int sum = firstNumber + carry;
//            if(sum>9) {
//                carry = 1;
//                stringBuilder.append(sum-10);
//            } else {
//                carry = 0;
//                stringBuilder.append(sum);
//            }
//            num1Count--;
//        }
//
//        while (num2Count>=0) {
//            int secondNumber = num2.charAt(num2Count) - 48;
//            int sum = secondNumber + carry;
//            if(sum>9) {
//                carry = 1;
//                stringBuilder.append(sum-10);
//            } else {
//                carry = 0;
//                stringBuilder.append(sum);
//            }
//            num2Count--;
//        }
//        if(carry>0) {
//            stringBuilder.append(carry);
//        }
//        return stringBuilder.reverse().toString();
//    }

}
