package slidingwindow.easy;

public class MaximumAverageSubarrayI {

    public static void main(String[] args) {
        //int[] nums = {1,12,-5,-6,50,3};
        //System.out.println(findMaxAverage(nums, 4));
        //int[] nums = {5};
        int[] nums = {-1};
        System.out.println(findMaxAverage(nums, 1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double avgSum = Integer.MIN_VALUE;
        double sum = 0;

        for(int i=0; i<nums.length; i++) {

            if(i<k) {
                sum += nums[i];
            } else {
                sum += nums[i] - nums[i-k];
            }

            if(i>=k-1) {
                double newAgv = sum/k;
                if(avgSum<newAgv)
                    avgSum = newAgv;
            }

        }
        return avgSum;
    }

}
