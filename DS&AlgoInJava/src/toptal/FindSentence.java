package toptal;

public class FindSentence {

    public static void main(String[] args) {
        //System.out.println(solution("We test coders. Give us a try? Pretty much what you need"));
        System.out.println(solution("We test coders. Give  fucking sdf dfd     us a try? Pretty much what you need"));
        System.out.println(solution("We test coders Give  fucking sdf dfd     us a try Pretty much what you need"));
        System.out.println(solution("We test coders Give ! fucking sdf dfd   ?  us a try Pretty much what you need"));
    }


    public static int solution(String s) {
        int count = 0;
        s = s.replaceAll("[.?!]", "#");
        String[] sentenceArray = s.split("#");
        for(String sentence : sentenceArray) {
            String[] wordsArray = sentence.trim().split(" ");
            int wordCount = 0;
            for(String word : wordsArray) {
                if (!word.isEmpty()) {
                    wordCount++;
                }
            }
            if(wordCount>count)
                count = wordCount;

        }
        return count;
    }

}
