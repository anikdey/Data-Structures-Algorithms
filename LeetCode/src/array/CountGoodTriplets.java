package array;

public class CountGoodTriplets {

    public static void main(String[] args) {
        int[] numbers = {3,0,1,1,9,7};
        System.out.println(countGoodTriplets(numbers, 7, 2, 3));
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for(int i=0; i<arr.length-2; i++) {
            for(int j=i+1; j<arr.length-1; j++) {
                int diffForA = Math.abs(arr[i] - arr[j]);
                if(diffForA<=a) {
                    for(int k=j+1; k<arr.length; k++) {
                        int diffForB = Math.abs(arr[j] - arr[k]);
                        int diffForC = Math.abs(arr[i] - arr[k]);
                        if(diffForB<=b && diffForC<=c) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

}
