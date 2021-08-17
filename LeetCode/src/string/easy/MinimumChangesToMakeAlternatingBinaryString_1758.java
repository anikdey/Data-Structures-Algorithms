package string.easy;

import java.util.Stack;

public class MinimumChangesToMakeAlternatingBinaryString_1758 {

    public static void main(String[] args) {
        //System.out.println(minOperations("0101111000011110000010101011110100000111"));
        System.out.println(minOperations("10010100"));
        //System.out.println(minOperations("0"));
    }



    public static int minOperations(String s) {
        return solutionOne(s);

       //return solutionOptimized(s);


    }

    public static int solutionOptimized(String s) {
        int zeroCount = 0;
        // Todo.....

        return zeroCount;
    }


    // 14 ms....
    public static int solutionOne(String s) {
        int zeroCount = 0;
        int oneCount = 0;
        Stack<Character> stackStartWithZero = new Stack<>();

        Stack<Character> stackStartWithOne = new Stack<>();

        stackStartWithZero.push('0');
        stackStartWithOne.push('1');

        if(s.startsWith("0")) {
            oneCount++;
        } else {
            zeroCount++;
        }

        for (int i=1; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(stackStartWithZero.peek() == ch) {
                zeroCount++;
                if(stackStartWithZero.peek() == '0') {
                    stackStartWithZero.push('1');
                } else {
                    stackStartWithZero.push('0');
                }
            } else {
                stackStartWithZero.push(ch);
            }

            if(stackStartWithOne.peek() == ch) {
                oneCount++;
                if(stackStartWithOne.peek() == '0') {
                    stackStartWithOne.push('1');
                } else {
                    stackStartWithOne.push('0');
                }
            } else {
                stackStartWithOne.push(ch);
            }
        }

        if(zeroCount>oneCount)
            return oneCount;
        else
            return zeroCount;
    }

}
