package array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        //int[] numbers = {3,2,1};
        //int[] numbers = {1,2};
        //int[] numbers = {2,2,3,1};
        //int[] numbers = {1,2,-2147483648};
        int[] numbers = {1,2,0, -2147483648};
        System.out.println(thirdMax(numbers));
    }

    public static int thirdMax(int[] nums) {
        int[] sortedArray = new int[3];
        Arrays.fill(sortedArray, Integer.MIN_VALUE);
        int maxNumber = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int currentNumber = nums[i];
            if(currentNumber>maxNumber)
                maxNumber = currentNumber;
            if(sortedArray[2]<=currentNumber && !map.containsKey(currentNumber)) {
                map.put(currentNumber, i);
                sortedArray[2] = currentNumber;
                for(int j=2; j>=1; j--) {
                    if(sortedArray[j]>sortedArray[j-1]) {
                        int temp = sortedArray[j];
                        sortedArray[j] = sortedArray[j-1];
                        sortedArray[j-1] = temp;
                    }
                }
            }
        }
        if(map.size()<=2) {
            return maxNumber;
        }
        return sortedArray[2];
    }

}
