package string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OccurrencesAfterBigram {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOcurrences("alice is a good girl she is a good student", "a", "good")));
        System.out.println(Arrays.toString(findOcurrences("we will we will rock you", "we", "will")));
        System.out.println(Arrays.toString(findOcurrences("we we we we will rock you", "we", "we")));
    }




    public static String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();

        String[] splitArray = text.split(" ");
        for(int i=0; i<splitArray.length-2; i++) {
            if(splitArray[i].equals(first) && splitArray[i+1].equals(second)) {
                list.add(splitArray[i+2]);
            }
        }

        String[] arr = new String[list.size()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
