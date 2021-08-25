package string.easy;

public class DeleteCharactersToMakeFancyString_1957 {

    public static void main(String[] args) {
        System.out.println(makeFancyString("aaabaaa"));
    }

    public static String makeFancyString(String s) {

        char prevChar = s.charAt(0);
        int count = 1;

        StringBuilder sb = new StringBuilder();
        sb.append(prevChar);
        for(int i=1; i<s.length(); i++) {
            char currentChar = s.charAt(i);
            if(currentChar == prevChar) {
                count++;
                if(count<=2) {
                    sb.append(currentChar);
                }
            } else {
                count = 1;
                prevChar = currentChar;
                sb.append(currentChar);
            }
        }


        return sb.toString();

    }

}
