public class LongestConsecutive1s {

    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes(927));
    }

    public static int maxConsecutiveOnes(int N) {
        int maxCount = 0;
        int count = 0;
        String s = Integer.toBinaryString(N);
        int length = s.length();
        for(int i=0; i<length; i++) {
            if(s.charAt(i)=='1') {
                count++;
            } else {
                if(count>maxCount)
                    maxCount = count;
                count = 0;
            }
        }
        return maxCount;
    }

}
