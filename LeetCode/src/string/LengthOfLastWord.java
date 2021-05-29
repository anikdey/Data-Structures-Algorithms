package string;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("Anik"));
        System.out.println(lengthOfLastWord("a "));
        System.out.println(lengthOfLastWord("    "));
    }

    public static int lengthOfLastWord(String s) {
        if(s.trim().length() == 0)
            return 0;
        s = s.trim();
        int index = s.lastIndexOf(" ");
        return s.substring(index+1, s.length()).length();

//        String[] words = s.split(" ");
//        return words[words.length-1].length();
    }

}
