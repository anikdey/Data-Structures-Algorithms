package string;

public class SortingTheSentence {

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        String[] splitArray = s.split(" ");
        String[] sortedArray = new String[splitArray.length];
        for(String word : splitArray) {
            int index = word.charAt(word.length()-1) - 49;
            sortedArray[index] = word.substring(0, word.length()-1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<sortedArray.length; i++) {
            stringBuilder.append(sortedArray[i]);
            if(i != sortedArray.length-1){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }


}
