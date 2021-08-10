public class FindFirstAndLastIndexOfElement {


    public static void main(String[] args) {
        int[] numbers = {1,2,2,2,2,2,3,3,3,3,3,3,4,5,6,7};
        //int[] numbers = {3,3,3,3,3,3};
        System.out.println(firstIndex(numbers, 2));
        System.out.println(lastIndex(numbers, 3));

        System.out.println(lastIndex(numbers, 2) - firstIndex(numbers, 2)  + 1);
    }


    public static int firstIndex(int[] numbers, int number) {
        int firstPosition = -1;
        int start = 0;
        int end = numbers.length - 1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(numbers[mid]==number) {
                firstPosition = mid;
                end = mid-1;
            } else if(numbers[mid]>number) {
                end = mid-1;
            }
            else {
                start = mid + 1;
            }
        }
        return firstPosition;
    }

    public static int lastIndex(int[] numbers, int number) {
        int lastIndex = -1;
        int start = 0;
        int end = numbers.length - 1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(numbers[mid] == number){
                lastIndex = mid;
                start = mid+1;
            } else if(numbers[mid]>number) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return lastIndex;
    }

}
