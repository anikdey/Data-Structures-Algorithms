package array.easy;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNAndItsDoubleExist {

    public static void main(String[] args) {
        //int[] numbers = {3,1,7,11};
        //int[] numbers = {7,1,14,11};
        int[] numbers = {3,1,7,11};
        System.out.println(checkIfExist(numbers));
    }

    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int multiple = arr[i] * 2;
            if(map.containsKey(multiple) || ( (arr[i] % 2 == 0) && map.containsKey(arr[i] / 2)) ) {
                return true;
            } else {
                map.put(arr[i], i);
            }
        }
        return false;
    }




}
