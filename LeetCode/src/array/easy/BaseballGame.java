package array.easy;

public class BaseballGame {

    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5", "2", "C", "D", "+"}));
        System.out.println(calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
        System.out.println(calPoints(new String[]{"1", "2"}));
    }


    public static int calPoints(String[] ops) {

        int[] scores = new int[ops.length];
        int index = 0;

        for(int i=0; i<ops.length; i++) {

            if(ops[i].equals("C")) {
                index--;
            } else if(ops[i].equals("D")) {
                scores[index] = scores[index-1] * 2;
                index++;
            } else if(ops[i].equals("+")) {
                scores[index] = scores[index-1] + scores[index-2];
                index++;
            } else {
                scores[index] = Integer.parseInt(ops[i]);
                index++;
            }
        }

        int sum = 0;
        for(int i=0; i<index; i++) {
            sum += scores[i];
        }

        return sum;
    }

}
