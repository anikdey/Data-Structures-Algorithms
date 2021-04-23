package recursionpractice.resources;

import java.util.Arrays;

public class RecursionBasicProblemsCollected {

    public static void main(String[] args) {
//        firstNNaturalNumber(50);
//        System.out.println("Sum of numbers from 1 to n: "+ sumOfNumbers(10));
//        fibonacciSeries(12);
//        System.out.println("Number of digits .... "+ numberOfDigits(1234, 0));
//        System.out.println("Sum of digits .... "+ sumOfDigits(1234, 0));
//        int[] numbers = {1,2,3,4,5,6,7,8,6,445,75,4,3};
//        System.out.println("Largest element in array "+ Arrays.toString(numbers) +" is :" + largestElementOfArray(numbers, 0, Integer.MIN_VALUE));
//        evenOrOddInRange(1, 50);
//        System.out.println(powerOfNumber(2,6));

//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        int expectedNumber = binarySearch(numbers, 3, 0, numbers.length-1);
//        System.out.println(expectedNumber);

//        String test = "test String";
//        System.out.println(copyString(test, 0, new StringBuilder()));
//        System.out.println(copyStringUsingCharArray(test.toCharArray(), new char[test.length()], 0));

    }

    //1. Write a program in Java to print first 50 natural numbers using recursion.
    public static void firstNNaturalNumber(int n) {
        if(n == 1) {
            System.out.print(n+", ");
            return;
        }
        firstNNaturalNumber(n-1);
        System.out.print(n+", ");
    }

    //2. Write a program in Java to calculate the sum of numbers from 1 to n using recursion.
    public static int sumOfNumbers(int number) {
        if(number == 1) {
            return 1;
        }
        return number + sumOfNumbers(number-1);
    }

    //3. Write a program in Java to Print Fibonacci Series using recursion.
    public static int fibonacciSeries(int number) {
        if (number == 0){
            //System.out.print(0+", ");
            return 0;
        }
        if(number == 1) {
            //System.out.print(0+", ");
            return 1;
        }
        int num = fibonacciSeries(number -1 ) + fibonacciSeries(number - 2);
        System.out.print(num+", ");
        return num;
    }

    //5. Write a program in Java to count the digits of a given number using recursion.
    public static int numberOfDigits(int number, int count) {
        if(number == 0) {
            return count;
        }
        return numberOfDigits(number/10, count+1);
    }

    //6. Write a program in Java to find the sum of digits of a number using recursion.
    public static int sumOfDigits(int number, int sum) {
        if(number == 0) {
            return sum;
        }
        sum += number%10;
        return sumOfDigits(number/10, sum);
    }

    //8. Write a program in Java to get the largest element of an array using recursion.
    public static int largestElementOfArray(int[] array, int position, int largestSoFar) {
        if(position == array.length-1) {
            return largestSoFar;
        }
        if(largestSoFar<array[position]) {
            largestSoFar = array[position];
        }
        return largestElementOfArray(array, position+1, largestSoFar);
    }

    //14. Write a program in Java to print even or odd numbers in given range using recursion.
    public static void evenOrOddInRange(int start, int number) {
        if(start > number) {
            return;
        }
        if(start%2==0) {
            System.out.println("Even number " + start);
        }
        evenOrOddInRange(start+1, number);
    }

    //17. Write a program in Java to calculate the power of any number using recursion. (2^6 = 64)
    static int powerRaised = 1;
    public static int powerOfNumber(int number, int power) {
//        if(power == 0) {
//            return powerRaised;
//        }
//        powerRaised *= number;
//        return powerOfNumber(number, power-1);
        if(power == 0) {
            return 1;
        }
        return number * powerOfNumber(number, power-1);
    }

    //19. Write a program in Java to copy One string to another using recursion.
    public static String copyString(String str, int position, StringBuilder stringBuilder) {
        if(position > str.length()-1){
            //stringBuilder.append(str.charAt(position));
            return stringBuilder.toString();
        }
        stringBuilder.append(str.charAt(position));
        return copyString(str, position+1, stringBuilder);
    }

    public static String copyStringUsingCharArray(char[] originArray, char[] copyArray, int position) {
        if(position == originArray.length-1){
            copyArray[position] = originArray[position];
            return new String(copyArray);
        }
        copyArray[position] = originArray[position];
        return copyStringUsingCharArray(originArray, copyArray, position+1);
    }

    // 21. Write a program in Java for binary search using recursion.
    public static int binarySearch(int[] sortedArray, int target, int low, int high) {
        if(low>high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if(sortedArray[mid] == target) {
            return sortedArray[mid];
        } else if(sortedArray[mid]<target) {
            return binarySearch(sortedArray, target,mid+1, high);
        } else if(sortedArray[mid]>target) {
            return binarySearch(sortedArray, target,low, mid-1);
        }
        return -1;
    }

}
