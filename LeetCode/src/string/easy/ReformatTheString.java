package string.easy;

import java.util.Stack;

public class ReformatTheString {

    public static void main(String[] args) {
        System.out.println(reformat("covid2019"));
    }

    public static String reformat(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        Stack<Character> digitStack = new Stack<>();
        Stack<Character> letterStack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                digitStack.push(ch);
            } else {
                letterStack.push(ch);
            }
        }

        if(digitStack.isEmpty() && letterStack.isEmpty())
            return "";

        int digitStackSize = digitStack.size();
        int letterStackSize = letterStack.size();

        if(Math.abs(digitStackSize - letterStackSize) > 1 )
            return "";

        while (!digitStack.isEmpty() || !letterStack.isEmpty()) {

            if(letterStackSize>digitStackSize) {
                if(!letterStack.isEmpty()) {
                    stringBuilder.append(letterStack.pop());
                }
                if(!digitStack.isEmpty()) {
                    stringBuilder.append(digitStack.pop());
                }
            } else {
                if(!digitStack.isEmpty()) {
                    stringBuilder.append(digitStack.pop());
                }
                if(!letterStack.isEmpty()) {
                    stringBuilder.append(letterStack.pop());
                }
            }
        }

        return stringBuilder.toString();
    }

}
