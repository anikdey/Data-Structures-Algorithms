public class SlidingWindow {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8};
        int k = 3;
        System.out.println(getMaxSum(nums, k));
    }

    public static int getMaxSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<nums.length; i++) {

            if(i<k) {
                sum += nums[i];
            } else {
              sum = sum + nums[i] - nums[i-k];
            }
            if(max<sum) {
                max = sum;
            }
        }

        return max;

    }

}
