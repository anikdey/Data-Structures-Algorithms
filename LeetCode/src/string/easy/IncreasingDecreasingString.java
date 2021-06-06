package string.easy;

public class IncreasingDecreasingString {

    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));
        System.out.println(sortString("rat"));
        System.out.println(sortString("leetcode"));
        System.out.println(sortString("ggggggg"));
        System.out.println(sortString("spo"));
    }

    public static String sortString(String s) {

        int[] freq = new int[26];
        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder stringBuilder = new StringBuilder();

        boolean isForwardDirection = true;


        int x = 0;
        while(x<s.length()) {
            if(isForwardDirection) {
                for(int i=0; i<freq.length; i++) {
                    if(freq[i]>0) {
                        stringBuilder.append((char) (i + 'a'));
                        freq[i]--;
                       x++;
                    }
                }
            } else {
                for(int i=freq.length-1; i>=0; i--) {
                    if(freq[i]>0) {
                        stringBuilder.append((char) (i + 'a'));
                        freq[i]--;
                        x++;
                    }
                }
            }
            isForwardDirection = !isForwardDirection;
        }

        return stringBuilder.toString();
    }



    private static boolean isEnded(int[] freq) {
        for(int num : freq) {
            if(num > 0)
                return false;
        }
        return true;
    }

}
