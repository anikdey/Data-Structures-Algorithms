package math.easy;

public class Maximum69Number {

    public static void main(String[] args) {
        System.out.println(maximum69Number(666));
    }

    public static int maximum69Number (int num) {
        char[] chars = new String(""+num).toCharArray();
        for(int i=0; i<chars.length; i++) {
            if(chars[i] != '9') {
                chars[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(chars));
    }

}
