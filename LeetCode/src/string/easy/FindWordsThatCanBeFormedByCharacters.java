package string.easy;

public class FindWordsThatCanBeFormedByCharacters {

    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"cat","bt","hat","tree"}, "atach"));
        System.out.println(countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));
    }

    public static int countCharacters(String[] words, String chars) {
        int count = 0;
        int[] charsFreq = new int[26];
        for(char ch : chars.toCharArray()) {
            charsFreq[ch-'a']++;
        }
        for(String word : words) {
            int[] tempFreq = new int[26];
            boolean isPossible = true;
            char[] chArr = word.toCharArray();
            innerCheck:
            for(int i=0; i<chArr.length; i++) {
                int index = chArr[i] - 'a';
                tempFreq[index]++;
                if(tempFreq[index]>charsFreq[index]){
                    isPossible = false;
                    break innerCheck;
                }
            }
            if(isPossible)
                count += chArr.length;
        }
        return count;
    }

}
