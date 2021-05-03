package string;

public class MarsExploration {

    public static void main(String[] args) {

        System.out.println(marsExploration("SOSSPSSQSSOR"));
        System.out.println(marsExploration("SOSSPSSQSSOR"));
        System.out.println(marsExploration("SR"));

    }

    public static int marsExploration(String s) {
        int numberOfAlteration = 0;
        char[] array = s.toCharArray();
        int currentCount = 0;
        for(int i=0; i<array.length; i++) {

            char currentChar = array[i];

            if( (currentCount == 0 || currentCount == 2) && currentChar != 'S') {
                numberOfAlteration++;
            } else if(currentCount == 1 && currentChar != 'O') {
                numberOfAlteration++;
            }

            currentCount++;
            if(currentCount > 2) {
                currentCount = 0;
            }
        }
        return numberOfAlteration;
    }



}
