public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] numbersDesc = {10,9,8,7,6,5,4,3,2,1};

        System.out.println(binarySearch(numbers, 10));
        System.out.println(binarySearchDesc(numbersDesc, 10));
        System.out.println();
        System.out.println("Order agnostic search in asc "+ orderAgnosticBinarySearch(numbers, 4));
        System.out.println("Order agnostic search in desc "+ orderAgnosticBinarySearch(numbersDesc, 4));

    }

    public static int binarySearch(int[] numbers, int number) {
        int start = 0;
        int end = numbers.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(numbers[mid] == number){
                return mid;
            } else if(numbers[mid]>number) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearchDesc(int[] numbers, int number) {
        int start = 0;
        int end = numbers.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(numbers[mid] == number) {
                return mid;
            } else if(numbers[mid]>number) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int orderAgnosticBinarySearch(int[] numbers, int number) {
        if(numbers.length == 1) {
            if(numbers[0] == number)
                return 0;
            else
                return -1;
        }

        int start = 0;
        int end = numbers.length-1;
        boolean isAsc = numbers[start] < numbers[end];
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(numbers[mid] == number)
                return mid;
            if(isAsc) {
                if(numbers[mid]>number) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(numbers[mid]>number) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
