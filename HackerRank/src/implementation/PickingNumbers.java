package implementation;

import java.util.List;

public class PickingNumbers {

    public static void main(String[] args) {

    }


    public static int pickingNumbers(List<Integer> a) {
        int maxCount = 0;
        int[] freq = new int[101];

        for(int num : a) {
            freq[num]++;
        }

        for(int i=0; i<freq.length-1; i++) {
            int currentMax = freq[i] + freq[i+1];
            if(maxCount<currentMax)
                maxCount = currentMax;
        }
        return maxCount;
    }

}
