package string;

import java.util.ArrayList;
import java.util.List;

public class Gemstones {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aabcdde");
        list.add("aabcdde");
        list.add("aabcdde");

        System.out.println(gemstones(list));

    }


    public static int gemstones(List<String> arr) {
        int count = 0;
        int[] freq = new int[26];
        for(String str : arr) {
            int[] checkDuplicate = new int[26];
            for(int i=0; i<str.length(); i++) {
                int index = str.charAt(i) - 'a';
                if(checkDuplicate[index] == 0) {
                    freq[index]++;
                    checkDuplicate[index]++;
                }
            }
        }

        for(int number : freq) {
            if(number == arr.size())
                count++;
        }
        return count;
    }

}
