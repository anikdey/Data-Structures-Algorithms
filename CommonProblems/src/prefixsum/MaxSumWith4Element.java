package prefixsum;

public class MaxSumWith4Element {

    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,100,112,6,7,84,5,9,10};
        System.out.println(prefixSum(number));
    }

    public static int prefixSum(int[] numbers) {
        int maxOffset = 4;
        int max = numbers[0];
        int sum = max;
        for(int i=1; i<numbers.length; i++) {
            if(i<maxOffset) {
                sum = sum + numbers[i];
                numbers[i] = sum;
                max = sum;
            } else {
                int lastNumber = numbers[i-4];
                sum = sum + numbers[i] - lastNumber;
                numbers[i] = sum;
                if(sum>max)
                    max = sum;
            }
        }
        return max;
    }




}
