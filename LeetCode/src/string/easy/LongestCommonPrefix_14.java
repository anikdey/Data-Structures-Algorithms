package string.easy;

public class LongestCommonPrefix_14 {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }


    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 1) {
            return strs[0];
        }

        char[] chars = strs[0].toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<chars.length; i++) {

            char ch = chars[i];

            for(int x=1; x<strs.length; x++) {
                if(!(strs[x].length()>i && ch == strs[x].charAt(i))){
                    return sb.toString();
                }
            }

            sb.append(ch);

        }

        return sb.toString();


    }

}
