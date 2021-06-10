package string.easy;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        int word1Length = word1.length();
        int word2Length = word2.length();
        int count1 = 0;
        int count2 = 0;
        while (count1<word1Length || count2<word2Length) {

            if(count1<word1Length) {
                stringBuilder.append(word1.charAt(count1));
                count1++;
            }

            if(count2<word2Length) {
                stringBuilder.append(word2.charAt(count2));
                count2++;
            }
        }

        return stringBuilder.toString();
    }

}
