package problemsofarray;

import java.util.Arrays;

public class ReverseArrayInPlace {


    public static void main(String[] args) {
        int[] numbers = {-20, 34, 21, -87, 92, 100, -110};

        System.out.println("Before Reversing: "+ Arrays.toString(numbers));
        reverseArrayInPlace(numbers, numbers.length-1);
        System.out.println("After Reversing: "+ Arrays.toString(numbers));

    }


    private static void reverseArrayInPlace(int[] numbers, int length) {
        int counter = 0;
        while (counter<length) {
            int temp = numbers[counter];
            numbers[counter] = numbers[length];
            numbers[length] = temp;
            counter++;
            length--;
        }
    }

}
