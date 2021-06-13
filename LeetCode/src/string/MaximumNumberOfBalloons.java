package string;

public class MaximumNumberOfBalloons {

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(maxNumberOfBalloons("leetcode"));
    }


    public static int maxNumberOfBalloons(String text) {
        int counter = 0;

        int countOfB = 0; int countOfA = 0; int countOfL = 0; int countOfO = 0; int countOfN = 0;

        for(char ch : text.toCharArray()) {
            if(ch == 'b') {
                countOfB++;
            } else if( ch == 'a' ) {
                countOfA++;
            }else if( ch == 'l' ) {
                countOfL++;
            }else if( ch == 'o' ) {
                countOfO++;
            }else if( ch == 'n' ) {
                countOfN++;
            }
        }

        boolean isValid = ( countOfB>0 && countOfA>0 && countOfL>1 && countOfO>1 && countOfN>0 );

        while (isValid) {
            counter++;

            countOfB--;
            countOfA--;
            countOfL -= 2;
            countOfO -=2;
            countOfN--;
            isValid = ( countOfB>0 && countOfA>0 && countOfL>1 && countOfO>1 && countOfN>0 );
        }

        return counter;
    }

}
