package string;

public class HackerRankInAString {

    public static void main(String[] args) {
        System.out.println(hackerrankInString("abc"));
        System.out.println(hackerrankInString("hereiamstackerrank"));
        System.out.println(hackerrankInString("hackerworld"));
        System.out.println(hackerrankInString("haacckkerannk"));
        System.out.println(hackerrankInString("hccaakkerrannkk"));


        System.out.println("#######################");

        System.out.println(hackerrankInStringRegex("abc"));
        System.out.println(hackerrankInStringRegex("hereiamstackerrank"));
        System.out.println(hackerrankInStringRegex("hackerworld"));
        System.out.println(hackerrankInStringRegex("haacckkerannk"));
        System.out.println(hackerrankInStringRegex("hccaakkerrannkk"));
    }

    // This one got tle
    public static String hackerrankInString(String s) {
        char[] chars = {'h','a','c','k','e','r','r','a','n','k'};
        int counter = 0;
        char[] inputArray = s.toCharArray();
        for(int i=0; i< inputArray.length; i++) {
            if(inputArray[i] == chars[counter]) {
                counter++;
            }
        }
        if(counter == chars.length) {
            return "YES";
        } else {
            return "NO";
        }
    }
    public static String hackerrankInStringRegex(String s) {

        if(s.matches(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*")) {
            return "YES";
        } else {
            return "NO";
        }
    }




}
