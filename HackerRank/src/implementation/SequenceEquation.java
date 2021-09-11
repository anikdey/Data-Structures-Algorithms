package implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SequenceEquation {

    public static void main(String[] args) {

    }


    public static List<Integer> permutationEquation(List<Integer> p) {

        List<Integer> list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<p.size(); i++) {
            map.put(i+1, p.get(i));
        }

        for(int i=1; i<=p.size(); i++) {
            list.add(map.get(map.get(i)));
        }

        return list;
    }


}
