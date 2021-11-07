package array.medium;

public class Sort_An_Array_912 {

    public static void main(String[] args) {

    }

    public int[] sortArray(int[] nums) {
        return quickSort(nums);
    }

    public static int[] quickSort(int[] array) {
        partition(array, 0, array.length-1);
        return array;
    }

    private static void partition(int[] array, int start, int end) {
        if(start<=end) {
            int pivot = array[start];
            int left = start+1;
            int right = end;
            while (left<=right) {
                if(array[left]>pivot && array[right]<pivot) {
                    swap(left, right, array);
                }
                if(array[left]<=pivot)
                    left++;
                if (array[right]>=pivot)
                    right--;
            }
            swap(start, right, array);
            partition(array, start, right-1);
            partition(array, right+1, end);
        }

    }


    private static void swap(int leftIndex, int rightIndex, int[] array) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }


}
