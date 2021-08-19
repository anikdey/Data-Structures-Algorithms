package string.easy;

import java.util.HashMap;
import java.util.Map;

public class PathCrossing_1496 {

    public static void main(String[] args) {
        //System.out.println(isPathCrossing("NNSWWEWSSESSWENNW"));
        //System.out.println(isPathCrossing("NNS"));
        System.out.println(isPathCrossing("NESSWWNNWSE"));
        //System.out.println(isPathCrossing("NESSWN"));
    }

    public static boolean isPathCrossing(String path) {
        int horizontalMove = 0;
        int verticalMove = 0;
        Map<String, Boolean> visitedPointsMap = new HashMap<>();
        for(char ch : path.toCharArray()) {
            if(ch == 'N') {
                verticalMove++;
            } else if (ch == 'S') {
                verticalMove--;
            } else if(ch == 'E') {
                horizontalMove++;
            } else {
                horizontalMove--;
            }
            String visitedPoint = verticalMove+","+horizontalMove;
            if(visitedPointsMap.containsKey(visitedPoint)){
                return true;
            } else{
                visitedPointsMap.put(visitedPoint, true);
            }
        }
        return false;
    }

}
