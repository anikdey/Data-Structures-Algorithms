package string;

public class CheckIfOneStringSwapCanMakeStringsEqual {

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanb"));
        System.out.println(areAlmostEqual("attack", "defend"));
        System.out.println(areAlmostEqual("kelb", "kelb"));
        System.out.println(areAlmostEqual("abcd", "dcba"));
    }

    public static boolean areAlmostEqual(String s1, String s2) {

        char[] fString = s1.toCharArray();
        char[] sString = s2.toCharArray();
        int count = 0;
        for(int i=0; i<fString.length; i++) {
            if(fString[i] != sString[i]){
                count++;
            }
            if(count>2) {
                return false;
            }
        }
        return true;
    }

}
