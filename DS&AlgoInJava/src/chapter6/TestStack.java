package chapter6;

import chapter6.stack.ArrayStack;
import chapter6.stack.ListStack;
import chapter6.stack.MinStack;
import chapter6.stack.Stack;

public class TestStack {

    public static void main(String[] args) {
        //testArrayStack();
        //testListStack();
        testMinStack();
    }

    public static void testMinStack() {

        MinStack<Integer> minStack = new MinStack<>();
        minStack.push(10);
        minStack.push(20);
        minStack.push(5);
        minStack.push(10);
        minStack.push(50);
        minStack.push(3);
        minStack.push(5);
        minStack.push(3);

        minStack.printStack();

        System.out.println(minStack.getMinElement());

        System.out.println("Here goes the min stack");
        minStack.printMinStack();
        System.out.println("After popping....");
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.push(5);
        minStack.push(10);
        minStack.pop();
        minStack.pop();
        minStack.printStack();
        System.out.println(minStack.getMinElement());

    }

    public static void testListStack() {

        Stack<String> stack = new ListStack<>();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println("============");

        stack.push("Anik");
        stack.push("Dey");
        stack.push("Hello");
        stack.push("World");
        stack.push("Goes again");
        stack.push("Won't get inserted...");
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println("============");
        stack.printStack();
        System.out.println("============");
        System.out.println(stack.top());
        System.out.println(stack.pop());
        stack.printStack();
        System.out.println(stack.size());
    }


    public static void testArrayStack() {

        Stack<String> stack = new ArrayStack<>(5);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println("============");

        stack.push("Anik");
        stack.push("Dey");
        stack.push("Hello");
        stack.push("World");
        stack.push("Goes again");
        stack.push("Won't get inserted...");
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println("============");
        stack.printStack();

    }

}
