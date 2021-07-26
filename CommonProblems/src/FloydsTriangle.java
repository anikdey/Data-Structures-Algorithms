public class FloydsTriangle {

    public static void main(String[] args) {
        int count = 0;
        int rows = 7;

//        for(int i=1; i<=rows; i++) {
//            for(int x=1; x<=i; x++) {
//                System.out.print(++count+" ");
//            }
//            System.out.println();
//        }

        System.out.println(calPoints(new String[]{"5", "2", "C", "D", "+"}));
        System.out.println(calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
        System.out.println(calPoints(new String[]{"1", "2"}));


    }


    public static int calPoints(String[] ops) {
        int result = Integer.MIN_VALUE;

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
