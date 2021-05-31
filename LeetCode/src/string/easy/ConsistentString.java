package string.easy;

public class ConsistentString {

    public static void main(String[] args) {
        //String allowed = "ab";
        //String[] words = {"ad","bd","aaab","baa","badab"};

        //String allowed = "abc";
        //String[] words = {"a","b","c","ab","ac","bc","abc"};

        String allowed = "cad";
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};


        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for(String word : words) {
            boolean isConsistent = true;
            innerLoop:
            for(int i=0; i<word.length(); i++) {
                if(!allowed.contains(word.charAt(i)+"")) {
                    isConsistent = false;
                    break innerLoop;
                }
            }
            if(isConsistent)
                count++;

        }

        return count;
    }

}
