import java.util.Arrays;
import java.util.Comparator;

public class WeakestRowInMatrix {

    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1}};
        int k=3;
        int[][] counts = new int[mat.length][2];
        for(int i=0; i<mat.length; i++) {
            int countOfSoldiers = countOnes(mat[i]);
            counts[i][0] = i;
            counts[i][1] = countOfSoldiers;
        }
        Arrays.sort(counts, Comparator.comparingDouble(o -> o[1]));
        int[] weakestRows = new int[k];

        for(int i=0; i<k; i++) {
            weakestRows[i] = counts[i][0];
        }
        System.out.println(Arrays.toString(weakestRows));

//        for(int[] count : counts) {
//            System.out.println(Arrays.toString(count));
//        }
    }


    public static int countOnes(int[] numbers) {
        int lastIndex = -1;
        int start = 0;
        int end = numbers.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(numbers[mid] == 1) {
                lastIndex = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lastIndex + 1;
    }

}
