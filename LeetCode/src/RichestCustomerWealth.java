public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++) {
            int count = 0;
            for(int j=0; j<accounts[i].length; j++) {
                int item = accounts[i][j];
                count += item;
            }
            if(count>max) {
                max = count;
            }
        }
        return max;
    }

}
