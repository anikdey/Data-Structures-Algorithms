public class MinimumDifferenceElement {

    public static void main(String[] args) {
        //System.out.println(minDiff(new int[]{1,3,8,10,13,15}, 13));
        System.out.println(minDiff(new int[]{2, 5, 10, 12, 15}, 6));
        System.out.println(minDiff(new int[]{2, 5, 10, 12, 15}, 5));
        System.out.println(minDiff(new int[]{2, 5, 10, 12, 15}, 8));
        System.out.println(minDiff(new int[]{2, 5, 10, 12, 15}, 11));
        System.out.println(minDiff(new int[]{2, 5, 10, 12, 15}, 20));
    }


    public static int minDiff(int[] nums, int k) {
        int minDiff = Integer.MAX_VALUE;
        int targetValue = -1;
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            int midNumber = nums[mid];
            int diff = Math.abs(midNumber-k);
            if(minDiff>diff) {
                minDiff = diff;
                targetValue = midNumber;
            }
            if(k>=midNumber) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        //return minDiff;
        return targetValue;
    }

}
