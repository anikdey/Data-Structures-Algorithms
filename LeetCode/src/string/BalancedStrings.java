package string;

public class BalancedStrings {

    public static void main(String[] args) {

    }

    public int balancedStringSplit(String s) {

        int count = 0;
        char prevChar = s.charAt(0);

        int countOfR = 0;
        int countOfL = 0;

        if(prevChar == 'R')
            countOfR++;
        else
            countOfL++;

        for(int i=1; i<s.length(); i++) {
            char currentChar = s.charAt(i);

            if(currentChar=='R')
                countOfR++;
            else
                countOfL++;



            if(prevChar != currentChar) {
                prevChar = currentChar;
            }



        }
        return count;
    }

}
