package string.easy;

public class DetermineColorOfChessboardSquare {

    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
        System.out.println(squareIsWhite("e5"));
        System.out.println(squareIsWhite("h8"));
    }

    public static boolean squareIsWhite(String coordinates) {

        int firstCoordinate = coordinates.charAt(0);
        int secondCoordinate = coordinates.charAt(1);
//        boolean isWhite = true;
//        if(firstCoordinate % 2 == 1 && secondCoordinate % 2 == 1) {
//            isWhite = false;
//        } else if(firstCoordinate % 2 == 1 && secondCoordinate % 2 == 0) {
//            isWhite = true;
//        } else if(firstCoordinate % 2 == 0 && secondCoordinate % 2 == 1) {
//            isWhite = true;
//        } else {
//            isWhite = false;
//        }
        boolean isWhite = false;
       if(firstCoordinate % 2 == 1 && secondCoordinate % 2 == 0) {
            isWhite = true;
        } else if(firstCoordinate % 2 == 0 && secondCoordinate % 2 == 1) {
            isWhite = true;
        }
        return isWhite;
    }

}
