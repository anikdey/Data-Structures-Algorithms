package string.easy;

public class ImplementStrStr {

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty())
            return 0;

        int firstIndex = haystack.indexOf(needle);
        return firstIndex;
    }

}
