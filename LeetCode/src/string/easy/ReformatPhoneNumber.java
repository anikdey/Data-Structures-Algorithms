package string.easy;

public class ReformatPhoneNumber {

    public static void main(String[] args) {
        //System.out.println(reformatNumber("1-23-45 66656"));
        System.out.println(reformatNumber("1-23-45 6"));
        System.out.println(reformatNumber("123 4-567"));
        System.out.println(reformatNumber("123 4-5678"));
        System.out.println(reformatNumber("12"));
        System.out.println(reformatNumber("--17-5 229 35-39475 "));
        System.out.println(reformatNumber("3854- 075270354-74 840-506 326- 726-41 20618920053  9876 9-   "));
    }

    public static String reformatNumber(String number) {

        StringBuilder stringBuilder = new StringBuilder();

        int length = number.length();
        int start = 0;
        int groupCount = 0;
        while (start<length) {
            char currentChar = number.charAt(start);
            if(currentChar != '-' && currentChar != ' ') {
                stringBuilder.append(currentChar);
                groupCount++;
                if(groupCount==3) {
                    stringBuilder.append("-");
                    groupCount = 0;
                }
            }
            start++;
        }

        if(groupCount==1) {
            int index = stringBuilder.length() - 3;
            char ch = stringBuilder.charAt(index);
            stringBuilder.setCharAt(index, '-');
            stringBuilder.setCharAt(index+1, ch);
        } else if(groupCount == 0) {
            return stringBuilder.substring(0, stringBuilder.length()-1);
        }
        return stringBuilder.toString();
    }

}
