package array.easy;

public class FindTheHighestAltitude {

    public static void main(String[] args) {
        //int[] numbers = {-5,1,5,0,-7};
        int[] numbers = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(numbers));
    }

    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int prevGain = 0;
        for(int i=0; i<gain.length; i++) {
            prevGain += gain[i];
            if(prevGain>maxAltitude)
                maxAltitude = prevGain;
        }
        return maxAltitude;
    }

}
