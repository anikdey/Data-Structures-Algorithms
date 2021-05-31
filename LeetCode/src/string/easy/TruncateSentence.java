package string.easy;

public class TruncateSentence {

    public static void main(String[] args) {

    }

    public static String truncateSentence(String s, int k) {
        String[] splitArray = s.split(" ");
        if(splitArray.length == k)
            return s;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<k; i++) {
            stringBuilder.append(splitArray[i]);
            if(i != k-1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

}
