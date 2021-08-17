package internalcontest.week1;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(anagramSubString("aaabbb"));
        System.out.println(anagram("ab"));
        System.out.println(anagram("abc"));
        System.out.println(anagram("mnop"));
        System.out.println(anagram("xyyx"));
        System.out.println(anagram("xaxbbbxx"));
    }

    public static int anagramSubString(String s) {
        int length = s.length();
        if(length % 2 == 1)
            return -1;
        int half = length/2;
        int[] fistHalf = new int[26];
        int[] secondHalf = new int[26];
        for(int i=0, j=half; i<half; i++, j++) {
            int firstChar = s.charAt(i) - 'a';
            int secondChar = s.charAt(j) - 'a';
            fistHalf[firstChar]++;
            secondHalf[secondChar]++;
        }

        int sum = 0;
        for(int i=0; i<fistHalf.length; i++) {
            sum += Math.abs(fistHalf[i]-secondHalf[i]);
        }

        if(sum % 2 == 0) {
            return sum/2;
        }
        return -1;
    }


    public static int anagram(String s) {
        int changes = -1;
        int[] freq = new int[26];
        for(char ch : s.toCharArray()) {
            freq[ch-'a']++;
        }
        int sum = 0;
        for (int num : freq) {
            if(num % 2==1) {
                sum += num;
            }
        }
        if(sum % 2 == 0) {
            changes = sum / 2;
        }
        return changes;
    }

}
