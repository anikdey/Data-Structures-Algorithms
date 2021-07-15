package string;

public class DeleteColumnsToMakeSorted {

    public static void main(String[] args) {
        System.out.println(minDeletionSize(new String[]{"cba","daf","ghi"}));
        System.out.println(minDeletionSize(new String[]{"a","b"}));
        System.out.println(minDeletionSize(new String[]{"zyx","wvu","tsr"}));
    }

    public static int minDeletionSize(String[] strs) {
        int count = 0;

        int rowSize = strs[0].length();

        for(int i=0; i<rowSize; i++) {
            char lastChar = strs[0].charAt(i);
            innerLoop:
            for(int x = 1; x<strs.length; x++) {
                char nextChar = strs[x].charAt(i);
                if(lastChar<=nextChar) {
                    lastChar = nextChar;
                } else {
                    count++;
                    break innerLoop;
                }
            }
        }

        return count;
    }

}
