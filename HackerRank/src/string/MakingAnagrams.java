package string;

public class MakingAnagrams {

    public static void main(String[] args) {

        System.out.println(makingAnagrams("abc", "amnop"));
        System.out.println(makingAnagrams("cde", "abc"));
        System.out.println(makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj", "djfladfhiawasdkjvalskufhafablsdkashlahdfa"));

    }

    public static int makingAnagrams(String s1, String s2) {
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        int lengthOfFirstString = s1.length()-1;
        int lengthOfSecondString = s2.length()-1;
        while (lengthOfFirstString>=0 || lengthOfSecondString>=0) {

            if(lengthOfFirstString>=0) {
                int index = s1.charAt(lengthOfFirstString) - 'a';
                s1Freq[index]++;
            }
            if(lengthOfSecondString>=0) {
                int index = s2.charAt(lengthOfSecondString) - 'a';
                s2Freq[index]++;
            }
            lengthOfFirstString--;
            lengthOfSecondString--;
        }
        int count = 0;
        for(int i=0; i<s1Freq.length; i++) {
            count += Math.abs(s1Freq[i] - s2Freq[i]);
        }
        return count;
    }

}
