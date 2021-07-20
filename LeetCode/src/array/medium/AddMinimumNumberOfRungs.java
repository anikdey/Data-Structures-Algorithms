package array.medium;

public class AddMinimumNumberOfRungs {

    public static void main(String[] args) {
        System.out.println(addRungs(new int[]{1,3,5,10}, 2));
//        System.out.println(addRungs(new int[]{3,6,8,10}, 3));
//        System.out.println(addRungs(new int[]{3,4,6,7}, 2));
//        System.out.println(addRungs(new int[]{4, 11}, 2));
        //System.out.println(addRungs(new int[]{3}, 1));
        System.out.println(addRungs(new int[]{15, 26, 29}, 4));
        //System.out.println(addRungs(new int[]{5}, 10));
    }

    public static int addRungs(int[] rungs, int dist) {
        int count = 0;
        int prevPosition = 0;
        for(int i=0; i<rungs.length; i++) {
            int diff = rungs[i] - prevPosition - dist;
            if(diff>0) {
                count  = count + diff/dist;
                if(diff%dist>0) {
                    count++;
                }
            }
            prevPosition = rungs[i];
        }
        return count;
    }

}
