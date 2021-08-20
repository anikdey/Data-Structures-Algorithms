package string.easy;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumUnitsOnATruck_1710 {

    public static void main(String[] args) {
        System.out.println(maximumUnits(new int[][]{ {1,3}, {2,2}, {3,1}}, 4));
        System.out.println(maximumUnits(new int[][]{ {5,10}, {2,5}, {4,7}, {3,9} }, 10));
    }


    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int totalUnit  = 0;
        Arrays.sort(boxTypes, Comparator.comparingDouble(a -> a[1]));
        for(int i=boxTypes.length-1; i>=0; i--) {
            if(truckSize>0) {
                int boxes = boxTypes[i][0];
                int unitPerBox = boxTypes[i][1];
                if(boxes<=truckSize) {
                    totalUnit += (boxes * unitPerBox);
                    truckSize = truckSize - boxes;
                } else {
                    totalUnit += (truckSize * unitPerBox);
                    return totalUnit;
                }
            }
        }
        return totalUnit;
    }

}
