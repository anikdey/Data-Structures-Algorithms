package stack.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BuildAnArrayWithStackOperations {

    public static void main(String[] args) {
        int[] target = {};
        int n = 3;
        System.out.println(buildArray(target, n));
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=target.length-1; i>=0; i--) {
            stack.push(target[i]);
        }
        for(int i=1; i<=n; i++) {
            if(stack.isEmpty())
                break;
            operations.add("Push");
            if(i == stack.peek()) {
                stack.pop();
            } else  {
                operations.add("Pop");
            }
        }
        return operations;
    }

}
