package slidingwindow;

// Out of leetcode....
public class MaximumWindowForGivenSum {

    public static void main(String[] args) {
//        int[] nums = {50,2,3,4,5,1,1,1,1,-1,1,1,9};
//        int sum = 5;

        int[] nums = {-5, 8, -14, 2, 4, 12 };
        int sum = -5;


        System.out.println(maxWindow(nums, sum));
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
                while (calculatedSum>sum && trailing<=i) {
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


}
