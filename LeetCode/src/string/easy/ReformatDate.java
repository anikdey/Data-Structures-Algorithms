package string.easy;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {

    public static void main(String[] args) {
        System.out.println(reformatDate("20th Oct 2052"));
    }

    public static String reformatDate(String date) {
        String formattedDate = "";
        String[] dateArray = date.split(" ");
        formattedDate = dateArray[2]+"-";
        formattedDate += getMonth(dateArray[1])+"-";

        String dayString = dateArray[0];
        int endIndex = 1;
        if(dayString.length() == 4) {
            endIndex = 2;
        }

        int day = Integer.parseInt(dateArray[0].substring(0,endIndex));
        if(day<10) {
            formattedDate += "0"+day;
        } else {
            formattedDate += ""+day;
        }

        return formattedDate;
    }

    private static String getMonth(String month) {
        Map<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
        return map.get(month);
    }

}
