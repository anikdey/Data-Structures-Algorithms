package string;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("1010010"));
    }


    public static int beautifulBinaryString(String b) {
        int count = 0;
        int starting = 0;
        int end = b.length()-3;
        while (starting<=end) {
            if(b.charAt(starting) == '0' && b.charAt(starting+1) == '1' && b.charAt(starting+2) == '0') {
                count++;
                starting += 3;
            } else {
                starting++;
            }
        }
        return count;
    }

}
