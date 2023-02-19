package leetcode;

public class BestTimetoBuyandSellStock_121 {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        int []prices1 = {1,2};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int min =prices[0];
        int profit =0;
        int current = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min>prices[i]){
                min = prices[i];
                current = prices[i];
            }
            else {
                current = prices[i];
                profit= Math.max(current-min,profit);

            }
        }
        return profit;
    }
}
