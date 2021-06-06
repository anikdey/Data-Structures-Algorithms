package string;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(anagram("aaaabbba"));
        System.out.println(anagram("xaxbbbxx"));
        System.out.println(anagram("xyyx"));
    }

    public static int anagram(String s) {
        if(s.length() % 2 != 0)
            return -1;
        int count = 0;
        int[] freq = new int[26];
        int start = 0;
        int end = s.length()-1;
        int mid = s.length()/2;
        while (start<mid) {
            int startIndex = s.charAt(start) - 'a';
            freq[startIndex]++;
            start++;
        }

        while (end>=start) {
            int endIndex = s.charAt(end) - 'a';
            if(freq[endIndex]>0) {
                freq[endIndex]--;
            }
            end--;
        }

        for(int num : freq) {
            count += num;
        }
        return count;
    }

}
