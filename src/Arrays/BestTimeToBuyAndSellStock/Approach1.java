package Arrays.BestTimeToBuyAndSellStock;

// Approach:
// Time Complexity:
// Space Complexity:

import java.util.*;

public class Approach1 {
    public static int buyAndSellStock(int[] prices){
        int buy = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] < buy)
                buy = prices[i];

            profit = Math.max(profit, Math.abs(buy - prices[i]));
        }

        return profit;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] prices = new int[n];
        for(int i=0; i<n; i++)
            prices[i] = in.nextInt();

        int profit = buyAndSellStock(prices);
        System.out.println(profit);
    }
}
