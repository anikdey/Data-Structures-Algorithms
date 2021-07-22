package string.easy;

public class CrawlerLogFolder {

    public static void main(String[] args) {
        //System.out.println(minOperations(new String[]{"d1/","d2/","../","d21/","./"}));
        //System.out.println(minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"}));
        //System.out.println(minOperations(new String[]{"d1/","../","../","../"}));
        System.out.println(minOperations(new String[]{"./","../","./"}));
    }

    public static int minOperations(String[] logs) {
        int count = 0;
        for(String dir : logs) {

            System.out.println(dir.length());

            if(dir.equals("../")) {
                if (count>0)
                    count--;
            } else if(dir.equals("./")) {

            } else {
                count++;
            }
        }
        return count;
    }

}
