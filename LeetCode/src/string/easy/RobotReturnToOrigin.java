package string.easy;

public class RobotReturnToOrigin {

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
        System.out.println(judgeCircle("RRDD"));
        System.out.println(judgeCircle("LDRRLRUULR"));
    }


    public static boolean judgeCircle(String moves) {
        int horizontalMove = 0;
        int verticalMove = 0;
        char[] charArray = moves.toCharArray();
        for(int i=0; i<charArray.length; i++) {
            char currentChar = charArray[i];
            if(currentChar == 'U') {
                verticalMove++;
            } else if(currentChar == 'D'){
                verticalMove--;
            } else if (currentChar == 'L') {
                horizontalMove--;
            } else if(currentChar == 'R') {
                horizontalMove++;
            }
        }

        return verticalMove == 0 && horizontalMove == 0;
    }

}
