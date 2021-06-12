package string.easy;

public class PrefixOfAnyWordInASentence {

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
        System.out.println(isPrefixOfWord("this problem is an easy problem", "pro"));
        System.out.println(isPrefixOfWord("i am tired", "you"));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");

        for(int i=0; i<words.length; i++) {
            if(words[i].startsWith(searchWord))
                return i+1;
        }
        return -1;
    }


}
