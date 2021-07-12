package string.easy;

import java.util.Stack;

public class RemoveOutermostParentheses {

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("()()()"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
    }

    public static String removeOuterParentheses(String s) {
        if(s.isEmpty())
            return "";
        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int stackSize = 0;
        for(int i=0; i<chars.length; i++) {
            char currentChar = chars[i];
            if(stackSize==0) {
                stack.push(currentChar);
                stackSize++;
            } else {
                char top = stack.peek();
                if(top == '(' && currentChar == ')') {
                    stack.pop();
                    stackSize--;
                    if(stackSize>0) {
                        stringBuilder.append(currentChar);
                    }
                } else {
                    stack.push(currentChar);
                    stackSize++;
                    stringBuilder.append(currentChar);
                }
            }
        }
        return stringBuilder.toString();
    }

}
