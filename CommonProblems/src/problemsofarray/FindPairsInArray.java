package problemsofarray;


// 4. How do you find all pairs of an integer array whose sum is equal to a given number?

import java.util.HashMap;
import java.util.Map;

public class FindPairsInArray {

    public static void main(String[] args) {
        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9, 0};
        findPairsGreedy(numbersWithDuplicates, 7);
        System.out.println("Optimized using map ======");
        findPairsOptimized(numbersWithDuplicates, 7);

    }

    public static void findPairsGreedy(int[] numbers, int target) {

        for(int i=0; i<numbers.length; i++) {
            int currentNumber = numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                int sum = currentNumber + numbers[j];
                if(sum == target) {
                    System.out.println("( "+currentNumber+", "+numbers[j]+" )");
                }
            }
        }
    }

    public static void findPairsOptimized(int[] numbers, int target) {
        Map<Integer, Boolean> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++) {
            int currentNumber = numbers[i];
            int requiredSum = target - currentNumber;
            if(map.containsKey(requiredSum)) {
                System.out.println("( "+currentNumber+", "+requiredSum+" )");
            }
            map.put(currentNumber, true);
        }
    }

}
