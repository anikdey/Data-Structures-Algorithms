public class FloorAndCeilOfANumber {

    public static void main(String[] args) {

        //System.out.println(findFloor(new int[]{1,2,3,4,5,6,7,8,9,10,10,11,11,11}, 5));
        System.out.println(findFloor(new int[]{1, 2, 8, 10, 10, 12, 19}, 2));
        System.out.println(findFloor(new int[]{1, 2, 8, 10, 10, 12, 19}, 20));
        System.out.println(findFloor(new int[]{1, 2, 8, 10, 10, 12, 19}, 0));

        System.out.println("=====================");

        System.out.println(findCeil(new int[]{1, 2, 8, 10, 10, 12, 19}, 2));
        System.out.println(findCeil(new int[]{1, 2, 8, 10, 10, 12, 19}, 20));
        System.out.println(findCeil(new int[]{1, 2, 8, 10, 10, 12, 19}, 0));
    }


    public static int findFloor(int[] numbers, int number) {
        int start = 0;
        int end = numbers.length - 1;
        int expectedFloor = -1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(numbers[mid] == number) {
                return number;
            } else if(numbers[mid]>number) {
                end = mid-1;
            } else {
                expectedFloor = numbers[mid];
                start = mid + 1;
            }
        }
        return expectedFloor;
    }

    public static int findCeil(int[] numbers, int number) {
        int start = 0;
        int end = numbers.length - 1;
        int expectedCeil = -1;

        while (start<=end) {
            int mid = start + (end-start)/2;
            if(numbers[mid] == number) {
                return number;
            } else if(numbers[mid]<number) {
                start = mid + 1;
            } else {
                expectedCeil = numbers[mid];
                end = mid-1;
            }
        }
        return expectedCeil;
    }

}
