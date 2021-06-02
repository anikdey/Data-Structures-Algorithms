package stack.medium;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())"));
        System.out.println(minAddToMakeValid("((("));
        System.out.println(minAddToMakeValid("()"));
        System.out.println(minAddToMakeValid("()))(("));
        System.out.println(minAddToMakeValid("((()))((()()())"));
    }

    public static int minAddToMakeValid(String s) {

        int count = 0;
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == ')' && stack.isEmpty()){
                count++;
            } else if(ch == '(') {
                stack.push(ch);
            } else if(ch == ')' && stack.peek() == '('){
                stack.pop();
            }
        }

        return stack.size() + count;
    }


}
