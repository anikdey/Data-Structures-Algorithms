package string.easy;

import java.util.Arrays;

public class NumberOfLinesToWriteString {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz")));
    }

    public static int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];
        int sum = 0;
        int rows = 1;
        for(char ch : s.toCharArray()) {
            int index = ch - 'a';
            sum += widths[index];
            if(sum>100) {
                sum = widths[index];
                rows++;
            }
        }
        result[0] = rows;
        result[1] = sum;
        return result;
    }

}
