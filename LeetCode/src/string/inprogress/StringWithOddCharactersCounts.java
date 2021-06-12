package string.inprogress;

public class StringWithOddCharactersCounts {

    public static void main(String[] args) {
        System.out.println(generateTheString(4));
        System.out.println(generateTheString(15));
        System.out.println(generateTheString(26));
        System.out.println(generateTheString(28));
    }


    public static String generateTheString(int n) {

        StringBuilder stringBuilder = new StringBuilder();

        if(n%2==0) {
            for(int i=1; i<n; i++) {
                stringBuilder.append('a');
            }
            stringBuilder.append('b');
        } else {
            for(int i=1; i<=n; i++) {
                stringBuilder.append('a');
            }
        }

        return stringBuilder.toString();
//        int remainder = n % 26;
//        if(remainder % 2 == 0) {
//            int count = 0;
//            while (count<n) {
//                if(count<=25) {
//                    stringBuilder.append((char) ('a'+count));
//                    count++;
//                } else {
//                    char ch = (char) ('a'+(count%26));
//                    stringBuilder.append(ch);
//                    stringBuilder.append(ch);
//                    count +=2;
//                }
//            }
//        } else {
//            int count = 0;
//            while (count<n) {
//                if(count<=25) {
//                    stringBuilder.append((char) ('a'+count));
//                    count++;
//                } else {
////                    char ch = (char) ('a'+(count%26));
////                    stringBuilder.append(ch);
////                    stringBuilder.append(ch);
////                    count +=2;
//                }
//            }
//        }
//        return stringBuilder.toString();
    }


}
