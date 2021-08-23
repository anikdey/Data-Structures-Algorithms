package array.inprogress;

public class MaximumProductSubarray_152 {

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2,3,-2,4}));
        System.out.println(maxProduct(new int[]{-2,-3,-1}));
        System.out.println(maxProduct(new int[]{-1,-2,-3,-4,-5,-6,-7,-8,-9}));
    }

    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currentProduct = nums[0];

        for(int i=1; i<nums.length; i++) {
            currentProduct *= nums[i];
            if(currentProduct>maxProduct)
                maxProduct = currentProduct;
        }
        return maxProduct;
    }

}
