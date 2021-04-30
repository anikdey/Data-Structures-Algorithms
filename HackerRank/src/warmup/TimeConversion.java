package warmup;

import java.util.Locale;

public class TimeConversion {

    public static void main(String[] args) {

//        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("07:05:45AM"));
//        System.out.println(timeConversion("01:59:45PM"));
        System.out.println(timeConversion("12:40:22AM"));

    }

    public static String timeConversion(String s) {
        s = s.toLowerCase();
        if(s.contains("pm")) {
            s = s.replace("pm", "");
            String[] splitArray = s.split(":");

            int hour = Integer.parseInt(splitArray[0]);
            if(hour != 12) {
                hour += 12;
            }
            return hour+":"+splitArray[1]+":"+splitArray[2];

        } else {
            s = s.replace("am", "");
            String[] splitArray = s.split(":");

            int hour = Integer.parseInt(splitArray[0]);
            String hourString = "";
            if(hour == 12) {
                hour = 00;
            }
            hourString = ""+hour;
            if(hourString.length() == 1) {
                hourString = "0"+hourString;
            }
            return hourString+":"+splitArray[1]+":"+splitArray[2];
        }
    }


}
