package string.easy;

import java.util.Stack;

public class MakeTheStringGreat {

    public static void main(String[] args) {

        System.out.println(makeGood("leEeetcode"));
        System.out.println(makeGood("ssS"));
        System.out.println(makeGood("abBAcC"));
    }

    public static String makeGood(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(stack.isEmpty()) {
                stack.push(ch);
            } else {
                char top = stack.peek();
                if(ch<=90) {
                    if(top-'a' == ch-'A') {
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                } else {
                    if(top-'A' == ch-'a') {
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }


}
