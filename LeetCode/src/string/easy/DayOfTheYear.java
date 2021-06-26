package string.easy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DayOfTheYear {

    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-02-10"));
        //System.out.println(dayOfYear("2021-06-26"));
    }

    public static int dayOfYear(String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = null;
        try {
            dt = simpleDateFormat.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dt);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        return dayOfYear;
    }

}
