package implementation;

public class StrangeCounter {

    public static void main(String[] args) {
        System.out.println(strangeCounter(7));
        //System.out.println(strangeCounter(21));
    }

    public static long strangeCounter(long t) {
        long prevNumber = 3;
        long currentCount = prevNumber;
        for(long i=1; i<t; i++) {
            if(currentCount == 1) {
                prevNumber *= 2;
                currentCount = prevNumber;
            } else {
                currentCount--;
            }
        }
        return currentCount;
    }

}
