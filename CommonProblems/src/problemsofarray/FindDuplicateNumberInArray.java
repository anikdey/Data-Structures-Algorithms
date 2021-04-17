package problemsofarray;

//How do you find the duplicate number on a given integer array?

//        Output :
//        Array with Duplicates       : [1, 1, 2, 2, 3, 4, 5]
//        After removing duplicates   : [1, 0, 2, 0, 3, 4, 5]
//        Array with Duplicates       : [1, 1, 1, 1, 1, 1, 1]
//        After removing duplicates   : [1, 0, 0, 0, 0, 0, 0]
//        Array with Duplicates       : [1, 2, 3, 4, 5, 6, 7]
//        After removing duplicates   : [1, 2, 3, 4, 5, 6, 7]
//        Array with Duplicates       : [1, 2, 1, 1, 1, 1, 1]
//        After removing duplicates   : [1, 0, 0, 0, 0, 0, 2]

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumberInArray {

    public static void main(String[] args) {
        int[] originalArray = {1, 1, 2, 2, 3, 4, 5, 1};


        //System.out.println(Arrays.toString(removeDuplicateUsingMap(originalArray)));
        System.out.println("Before : "+ Arrays.toString(originalArray));
        //System.out.println("Remove After Sorting" + Arrays.toString(removeAfterSorting(originalArray)));
        System.out.println("Remove & return new array " + Arrays.toString(removeAndReturnNewArray(originalArray)));
    }

    public static int[] removeDuplicateUsingMap(int[] originalArray) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<originalArray.length; i++) {
            if(map.containsKey(originalArray[i])) {
                originalArray[i] = 0;
            }else {
                map.put(originalArray[i], i);
            }
        }

        return originalArray;
    }

    public static int[] removeAfterSorting(int[] originalArray) {
        Arrays.sort(originalArray);
        int prev = originalArray[0];
        for(int i=1; i<originalArray.length; i++) {
            int current = originalArray[i];
            if(current == prev) {
                originalArray[i] = 0;
            } else {
                prev = current;
            }
        }
        return originalArray;
    }

    public static int[] removeAndReturnNewArray(int[] originalArray) {
        Arrays.sort(originalArray);
        int j=0;
        int[] tempArray = new int[originalArray.length];
        int prev = originalArray[0];
        tempArray[0] = prev;
        j++;
        for(int i=1; i<originalArray.length; i++) {
            int current = originalArray[i];
            if(current != prev) {
                tempArray[j] = current;
                j++;
            }
            prev = current;
        }
        int[] newArray = new int[j];
        for(int i=0; i<j; i++) {
            newArray[i] = tempArray[i];
        }
        return newArray;
    }

}
