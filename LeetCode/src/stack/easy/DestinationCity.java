package stack.easy;

import java.lang.reflect.Array;
import java.util.*;

public class DestinationCity {

    public static void main(String[] args) {
        List<List<String>> pairs = new ArrayList<>();

//        List<String> p0 = new ArrayList<>();
//        p0.add("A");
//        p0.add("Z");
//        pairs.add(p0);

//        List<String> p1 = new ArrayList<>();
//        p1.add("B");
//        p1.add("C");
//        pairs.add(p1);
//
//        List<String> p2 = new ArrayList<>();
//        p2.add("D");
//        p2.add("B");
//        pairs.add(p2);
//
//        List<String> p3 = new ArrayList<>();
//        p3.add("C");
//        p3.add("A");
//        pairs.add(p3);

//        List<String> p4 = new ArrayList<>();
//        p4.add("C");
//        p4.add("A");
//        pairs.add(p3);



        List<String> p1 = new ArrayList<>();
        p1.add("London");
        p1.add("New York");
        pairs.add(p1);

        List<String> p3 = new ArrayList<>();
        p3.add("Lima");
        p3.add("Sao Paulo");
        pairs.add(p3);

        List<String> p2 = new ArrayList<>();
        p2.add("New York");
        p2.add("Lima");
        pairs.add(p2);

        System.out.println(destCity(pairs));
    }

    public static String destCity(List<List<String>> paths) {

        Set<String> starCity = new HashSet<>();
        Set<String> destCity = new HashSet<>();

        starCity.add(paths.get(0).get(0));
        destCity.add(paths.get(0).get(1));
        int length = paths.size();
        for(int i=1; i<length; i++) {
            starCity.add(paths.get(i).get(0));
            String destCityStr = paths.get(i).get(1);
            if(!starCity.contains(destCityStr)) {
                if(destCity.contains(destCityStr)) {
                    destCity.remove(destCityStr);
                } else {
                    destCity.add(destCityStr);
                }
            }

            if (destCity.contains(paths.get(i).get(0))) {
                destCity.remove(paths.get(i).get(0));
            }
        }

        return destCity.iterator().next();
    }

}
