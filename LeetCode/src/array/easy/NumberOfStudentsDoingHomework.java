package array.easy;

import java.util.Arrays;

public class NumberOfStudentsDoingHomework {

    public static void main(String[] args) {

    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for(int i=0; i<startTime.length; i++) {
            if(queryTime>=startTime[i] && queryTime<=endTime[i]) {
                count++;
            }
        }
        return count;
    }

}
