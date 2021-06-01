package warmup;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        List<Integer> cl = new ArrayList<>();
//        cl.add(0);
//        cl.add(1);
//        cl.add(0);
//        cl.add(0);
//        cl.add(0);
//        cl.add(1);
//        cl.add(0);

//        cl.add(0);
//        cl.add(0);
//        cl.add(1);
//        cl.add(0);
//        cl.add(0);
//        cl.add(1);
//        cl.add(0);

        cl.add(0);
        cl.add(0);
        cl.add(0);
        cl.add(0);
        cl.add(1);
        cl.add(0);

        System.out.println(jumpingOnClouds(cl));
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int numberOfJumps = 0;
        int currentPosition = 0;
        int length = c.size();
        while (currentPosition<length-1) {
            if(currentPosition+2 < length && c.get(currentPosition+2)==0) {
                currentPosition+=2;
            } else {
                currentPosition++;
            }
            numberOfJumps++;
        }
        return numberOfJumps;
    }

}
