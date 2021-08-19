import java.util.PriorityQueue;
import java.util.Queue;

public class MissingNumber {

    public static void main(String[] args) {

    }

    public static int missingNumber(int[] nums) {
        int expectedSum = ( nums.length * (nums.length)) / 2;

        int totalSum = 0;
        for(int number: nums) {
            totalSum += number;
        }

        Queue<String> queue = new PriorityQueue<>();

        while (!queue.isEmpty())

        queue.add("");
        queue.poll();


        return expectedSum - totalSum;
    }

}
