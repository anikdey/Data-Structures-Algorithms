package internalcontest.week2;

import java.util.*;

public class Pangrams {

    public static void main(String[] args) {

        List<Integer> h = new ArrayList<>();
        h.add(1);h.add(2);h.add(3);h.add(4);h.add(5);

        System.out.println(largestRectangle(h));

    }


    public static long largestRectangle(List<Integer> h) {
        long maxArea = -1;

        Collections.sort(h);
        for(int i=0; i<h.size(); i++) {

            int currentNumber = h.get(i);
            int count = 1;

            innerLoop:
            for(int x=i+1; x<h.size(); x++) {

                if(h.get(x)>=currentNumber) {
                    count++;
                    int newArea = currentNumber * count;
                    if(maxArea<newArea)
                        maxArea = newArea;
                } else {

                    break innerLoop;
                }
            }

        }


        return maxArea;

    }


    public static String funnyString(String s) {
        StringBuilder strB = new StringBuilder(s).reverse();


        for(int i=1; i<s.length()-1; i++) {
            int diffFirstString = Math.abs(s.charAt(i)-s.charAt(i+1));
            int secondStringDiff = Math.abs(strB.charAt(i)-s.charAt(i+1));

            if(diffFirstString != secondStringDiff)
                return  "Not Funny";
        }

        return "Funny";

    }


    public static String pangrams(String s) {

        int[] freq = new int[26];

        s = s.toLowerCase();
        for(char ch : s.toCharArray()) {

            if(ch != ' ') {
                freq[ch-'a']++;
            }
        }

        for(int i=0; i<freq.length; i++) {
            if(freq[i]==0)
                return "not panagram";
        }

        return "panagram";
    }


    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

        List<Integer> list = new ArrayList();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.size(); i++) {

            int result = m - arr.get(i);

            if(map.containsKey(result)) {
                int prevIndex = map.get(result);

                if(prevIndex<i+1) {
                    list.add(prevIndex);
                    list.add(i+1);
                } {
                    list.add(i+1);
                    list.add(prevIndex);
                }


            } else {
                map.put(arr.get(i), i+1);
            }


        }

        return list;


    }

}
