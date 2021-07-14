package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {

    public static void main(String[] args) {
        System.out.println(subdomainVisits(new String[]{"9001 discuss.leetcode.com"}));
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String dom : cpdomains) {

            String[] arr = dom.split(" ");
            int visitCount = Integer.parseInt(arr[0]);
            String domain = arr[1];

            while (true) {
                if(map.containsKey(domain)) {
                    map.put(domain, visitCount + map.get(domain));
                } else {
                    map.put(domain, visitCount);
                }

                int index = domain.indexOf(".");
                if(index>0) {
                    domain = domain.substring(index+1);
                } else {
                    break;
                }
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue()+" "+ entry.getKey());
        }
        return list;
    }

}
