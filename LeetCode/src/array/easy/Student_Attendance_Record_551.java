package array.easy;

public class Student_Attendance_Record_551 {

    public static void main(String[] args) {

        System.out.println(checkRecord("LALL"));

    }

    public static boolean checkRecord(String s) {

        char[] chars = s.toCharArray();

        int absentCount = 0;
        int lateCount = 0;


        for(char ch : chars) {
            if(ch == 'A') {
                absentCount++;
                if(absentCount>1)
                    return false;
            } else if(ch == 'L') {
                lateCount++;
                if(lateCount>2)
                    return false;
            } else {
                lateCount = 0;
            }
        }



        return true;
    }

}
