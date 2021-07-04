package array.easy;

public class SumOfAllOddLengthSubarrays {

    public static void main(String[] args) {
        int[] numbers = {10,11,12};
        //int[] numbers = {2,3};
        System.out.println(sumOddLengthSubarrays(numbers));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        return bruteForce(arr);
    }

    public static int bruteForce(int[] arr) {
        int globalSum = 0;
        for(int i=0; i<arr.length; i++) {
            int subSum = 0;
            int count = 1;
            for(int x=i; x<arr.length; x++) {
                subSum += arr[x];
                if(count%2==1){
                    globalSum += subSum;
                }
                count++;
            }
        }
        return globalSum;
    }

}
