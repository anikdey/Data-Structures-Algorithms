package internalcontest.week3;

import com.sun.tools.javac.Main;

import java.util.*;

public class BeautifulTriplets {

    public static void main(String[] args) {

    }


    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<p.size(); i++) {
            map.put(i+1, p.get(i));
        }

        for(int i=1; i<=p.size(); i++) {
            list.add(map.get(map.get(i+1)));
        }
        return list;
    }


    public static int beautifulTriplets(int d, List<Integer> arr) {

        int size = arr.size();
        int count = 0;

        //Collections.sort(arr);

        for(int i=0; i<size-2; i++) {
            int j = i+1;
            int k = j + 1;
            if(arr.get(j)-arr.get(i) == d && arr.get(k)-arr.get(j) == d){
                count++;
            }
        }



       /* for(int i=0; i<size; i++) {
            for(int j=i+1; j<size; j++) {
                for(int k=j+1; k<size; k++) {
                    if(arr.get(j)-arr.get(i) == d && arr.get(k)-arr.get(j) == d){
                        count++;
                    }
                }
            }



        }*/

        return count;

    }


}
