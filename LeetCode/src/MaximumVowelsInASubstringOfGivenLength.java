import java.util.HashSet;
import java.util.Set;

public class MaximumVowelsInASubstringOfGivenLength {

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
        System.out.println(maxVowels("aeiou", 2));
        System.out.println(maxVowels("leetcode", 3));
        System.out.println(maxVowels("eeetcooeade", 5));
        System.out.println(maxVowels("rhythms", 4));
        System.out.println(maxVowels("tryhard", 1));
    }

    public static int maxVowels(String s, int k) {
        int maxCount = 0;
        int length = s.length();
        Set<Character> set = new HashSet<>();
        set.add('a');set.add('e'); set.add('i');set.add('o'); set.add('u');
        char[] chars = s.toCharArray();
        int i=0;
        for(i=0; i<k; i++) {
            if(set.contains(chars[i])){
                maxCount++;
            }
        }
        int lastVowelCount = maxCount;
        for(int x=i; x<length; x++) {
            int lastIndex = x-i;
            if(set.contains(chars[lastIndex])) {
                if(lastVowelCount>=0)
                    lastVowelCount--;
            }

            if(set.contains(chars[x])) {
                lastVowelCount++;
                if(lastVowelCount>maxCount) {
                    maxCount = lastVowelCount;
                }
            }
        }
        return maxCount;
    }

}
