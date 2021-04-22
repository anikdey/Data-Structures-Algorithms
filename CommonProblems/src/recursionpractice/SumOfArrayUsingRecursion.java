package recursionpractice;

public class SumOfArrayUsingRecursion {

    public static void main(String[] args) {
        //int[] originalArray = {1, 1, 2, 2, 3, 4, 5, 1};
        int[] originalArray = {2, 55, 1, 7};

        System.out.println(sumArrayTailRecursion(originalArray, 0, 0));
        System.out.println(sumArray(originalArray, 0));
        System.out.println(multiplicationOfArray(originalArray, 0));
    }

    //A recursive function is tail recursive when recursive call is the last thing executed by the function.
    public static int sumArrayTailRecursion(int[] numbers, int position, int sum) {
        if(position == numbers.length) {
            return sum;
        }
        sum += numbers[position];
        return sumArrayTailRecursion(numbers, position+1, sum);
    }

    public static int sumArray(int[] numbers, int position) {
//        if(position == numbers.length) {
//            return 0;
//        } else {
//            return  numbers[position] + sumArray(numbers, position+1);
//        }
        if(position == numbers.length-1) {
            return numbers[position];
        } else {
            return  numbers[position] + sumArray(numbers, position+1);
        }
    }

    public static int multiplicationOfArray(int[] array, int position) {
        if(position == array.length-1) {
            return array[position];
        }
        return array[position] * multiplicationOfArray(array, position+1);
    }

}
