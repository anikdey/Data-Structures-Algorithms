package string;

import java.util.HashSet;
import java.util.Set;

public class SherlockAndTheValidString {

    public static void main(String[] args) {
        System.out.println(isValid("abccc"));
        System.out.println(isValid("aabbcd"));
        System.out.println(isValid("aabbccddeefghi"));
        System.out.println(isValid("aabbcd"));
        System.out.println(isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadh" +
                "dhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehii" +
                "dfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"));
    }

    public static String isValid(String s) {
       int[] freq = new int[26];

       for(char ch : s.toCharArray()) {
           freq[ch-'a']++;
       }
       Set<Integer> freqType = new HashSet<>();
       for(int number : freq) {
           if(number != 0) {
               freqType.add(number);
           }
       }
       if(freqType.size() == 1) {
           return "YES";
       } else if(freqType.size()==2) {
           int minValue = Integer.MAX_VALUE;
           for(int num : freqType) {
               if(num<minValue)
                   minValue = num;
           }
           if(minValue == 1) {
               return "YES";
           } else {
               return "NO";
           }
       } else {
            return "NO";
       }
    }

}
