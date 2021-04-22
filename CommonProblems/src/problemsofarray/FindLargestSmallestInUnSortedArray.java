package problemsofarray;

// 3. How do you find the largest and smallest number in an unsorted integer array?

public class FindLargestSmallestInUnSortedArray {

    public static void main(String[] args) {

        int[] numbers = {-20, 34, 21, -87, 92, 100, -110};
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            int currentNumber = numbers[i];
            if(currentNumber > maxValue) {
                maxValue = currentNumber;
            }
            if(currentNumber<minValue) {
                minValue = currentNumber;
            }
        }

        System.out.println(maxValue);
        System.out.println(minValue);
    }





}
