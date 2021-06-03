package string;

public class GameOfThrones1 {

    public static void main(String[] args) {
        System.out.println(gameOfThrones("aaabbbb"));
        System.out.println(gameOfThrones("cdefghmnopqrstuvw"));
        System.out.println(gameOfThrones("cdcdcdcdeeeef"));
        System.out.println(gameOfThrones("aaabbb"));
    }

    public static String gameOfThrones(String s) {
        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++) {
            int index = s.charAt(i) - 'a';
            freq[index]++;
        }

        int oddCount = 0;

        for(int i=0; i<freq.length; i++) {
            if(freq[i] % 2 == 1) {
                oddCount++;
                if(oddCount == 2) {
                    return "NO";
                }
            }
        }
        return "YES";
    }

}
