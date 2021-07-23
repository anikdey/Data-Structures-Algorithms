package array.easy;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestPrice = prices[0];
        for(int i=1; i<prices.length; i++) {

            if(prices[i]<lowestPrice){
                lowestPrice = prices[i];
            } else {
                int profit = prices[i] - lowestPrice;
                if(profit>maxProfit)
                    maxProfit = profit;
            }


        }
        return maxProfit;
    }

}
