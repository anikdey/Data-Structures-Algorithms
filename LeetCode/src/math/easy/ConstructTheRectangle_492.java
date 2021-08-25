package math.easy;

import java.util.Arrays;

public class ConstructTheRectangle_492 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(122122)));
    }

    public static int[] constructRectangle(int area) {
        int[] result = {area, 1};

        int width = (int) Math.sqrt(area);
        int length = width;
        int minDifference = area - 1;

        while (width>0) {

            if(area%width == 0) {
                result[0] = area/width;
                result[1] = width;
                return result;
            }
            width--;

           /* int calculatedArea = length * width;
            if(calculatedArea == area) {
                int diff = length - width;
                if(diff<minDifference) {
                    minDifference = diff;
                    result[0] = length;
                    result[1] = width;
                    if(diff == 0)
                        return result;
                }
                length--;
            } else if(calculatedArea>area) {
                width--;
            } else {
                length--;
            }*/
        }
        return result;
    }

}
