package array.easy;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,5,4,6,1})));
    }

    public static int[] replaceElements(int[] arr) {
        int max = 0;
        for(int i=0; i<arr.length-1; i++) {

            if(i==0) {
                for(int x=i+1; x<arr.length; x++){
                    if(arr[x]>max)
                        max = arr[x];
                }
                arr[i] = max;
            } else {
                if(arr[i]<max) {
                    arr[i] = max;
                } else {
                    max = 0;
                    for(int x=i+1; x<arr.length; x++){
                        if(arr[x]>max)
                            max = arr[x];
                    }
                    arr[i] = max;
                }
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }

}
