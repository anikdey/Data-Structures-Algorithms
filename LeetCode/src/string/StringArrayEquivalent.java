package string;

public class StringArrayEquivalent {

    public static void main(String[] args) {

    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();

        for(String word : word1) {
            stringBuilder.append(word);
        }

        for(String word : word2) {
            stringBuilder1.append(word);
        }
        return stringBuilder.toString().equals(stringBuilder1.toString());
    }

}
