package slidingwindow;

import java.util.HashMap;
import java.util.Map;

// Out of leetcode....
public class MaximumWindowForGivenSum {

    public static void main(String[] args) {
//        int[] nums = {50,2,3,4,5,1,1,1,1,-1,1,1,9};
//        int sum = 5;

        int[] nums = {-5, 8, -14, 2, 4, 3, 3, 3, -9, 12 };
        int sum = 9;


        System.out.println(maxWindowWithNegativeNumber(nums, sum));
    }

    public static int maxWindow(int[] nums, int sum) {
        int maxWindow = 0;
        int trailing = 0;
        int calculatedSum = 0;
        for(int i=0; i<nums.length; i++) {
            calculatedSum += nums[i];
            if(calculatedSum == sum) {
                int windowLength = i - trailing + 1;
                if(windowLength>maxWindow)
                    maxWindow = windowLength;
            } else if(calculatedSum>sum) {
                while (calculatedSum>sum) {
                    calculatedSum -= nums[trailing];
                    trailing++;
                    if(calculatedSum == sum) {
                        int windowLength = i - trailing + 1;
                        if(windowLength>maxWindow)
                            maxWindow = windowLength;
                    }
                }
            }
        }
        return maxWindow;
    }


    public static int maxWindowWithNegativeNumber(int[] nums, int sum) {
        Map<Integer, Integer> map = new HashMap<>();

        int calcSum = 0;
        for(int i=0; i<nums.length; i++) {
            calcSum += nums[i];
            if(calcSum == sum){
                map.put(sum, i);
            }
        }

        if(map.size() == 0){
            return 0;
        } else {
            return map.get(sum)+1;
        }
    }

}
