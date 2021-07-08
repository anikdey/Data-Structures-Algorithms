package array;

public class ContinuousSubarraySum {

    public static void main(String[] args) {
        //int[] numbers = {23,2,4,6,7};
        //int[] numbers = {23,2,6,4,7};
        //int k = 5;

//        int[] numbers = {23,2,6,4,7};
//        int k = 13;

        //int[] numbers = {23,1,1,4,1,1,5};
        int[] numbers = {23,2,4,6,6};
        int k = 7;


        System.out.println(checkSubarraySum(numbers, k));
        //System.out.println(bruteForce(numbers, k));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {

        int sum = nums[0];
        int globalSum = sum;
        int leftPosition = 0;
        for(int i=1; i<nums.length; i++) {
            globalSum += nums[i];
            if(globalSum % k == 0)
                return true;


            sum += nums[i];
            if(sum%k==0) {
                if(i-leftPosition+1 == 2)
                    return true;
            } else if(sum<k) {
                if(sum >= k && sum % k == 0) {
                    if(i-leftPosition+1 == 2)
                        return true;
                }
            } else {
                while (sum>=k) {
                    sum -= nums[leftPosition];
                    leftPosition++;
                    if(sum >= k && sum % k == 0) {
                        if(i-leftPosition+1 >= 2)
                            return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean bruteForce(int[] nums, int k) {
        for(int i=0; i<nums.length-1; i++) {
            int sum = nums[i];
            for(int x=i+1; x<nums.length; x++) {
                sum += nums[x];
                if(sum % k == 0)
                    return true;
            }
        }
        return false;
    }

}
