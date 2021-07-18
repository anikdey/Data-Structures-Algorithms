package array.easy;

import java.util.Arrays;

public class FinalPricesWithSpecialDiscountInAShop {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(new int[]{8,4,6,2,3})));
        System.out.println(Arrays.toString(finalPrices(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(finalPrices(new int[]{10,1,1,6})));
    }

    public static int[] finalPrices(int[] prices) {

        for(int i=0; i<prices.length-1; i++) {
            int currentPrice = prices[i];
            if(currentPrice>=prices[i+1]) {
                prices[i] = currentPrice - prices[i+1];
            } else {
                int count = i+2;
                innerLoop:
                while (count<prices.length) {
                    if(currentPrice>=prices[count]) {
                        prices[i] = currentPrice - prices[count];
                        break innerLoop;
                    }
                    count++;
                }
            }
        }
        return prices;
    }

}
