package array.easy;

public class MoveZeroes {

    public static void main(String[] args) {
        //int[] nums = {1,1,0,3,12};
        int[] nums = {0};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(count<i && nums[i] != 0) {
                nums[count] = nums[i];
                nums[i] = 0;
                count++;
            }
            if (nums[i]!=0)
                count++;
        }

        for(int num : nums) {
            System.out.print(num+", ");
        }

    }

}
