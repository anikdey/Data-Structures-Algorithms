package string;


import java.util.regex.Pattern;

public class StrongPassword {

    public static void main(String[] args) {
        System.out.println(minimumNumber(1, "aaaBcd0!"));
        System.out.println(minimumNumber(1, "#HackerRank"));
    }

    public static int minimumNumber(int n, String password) {

        Pattern patternDigit = Pattern.compile("(\\d)");
        Pattern patternUpper = Pattern.compile("([A-Z])");
        Pattern patternLower = Pattern.compile("([a-z])");
        Pattern patternSpecial = Pattern.compile("(\\W)");

        int count = 0;

        if(!patternDigit.matcher(password).find()) {
            count++;
        }

        if(!patternUpper.matcher(password).find()) {
            count++;
        }

        if(!patternLower.matcher(password).find()) {
            count++;
        }

        if(!patternSpecial.matcher(password).find()) {
            count++;
        }

        if(count + password.length() < 6) {
            count += 6 - (count+password.length());
        }

        return count;
    }


}
