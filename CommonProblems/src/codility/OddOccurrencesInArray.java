package codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] a = {9,3,9,3,9,7,9};
        System.out.println(solution(a));
    }

    public static int solution(int[] A) {
        Map<Integer, Boolean> map = new HashMap<>();
        for(int i=0; i<A.length; i++) {
            if(map.containsKey(A[i])) {
                map.remove(A[i]);
            } else {
                map.put(A[i], true) ;
            }
        }
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            return entry.getKey();
        }
        return 0;
    }

}
