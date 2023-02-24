package leetcode;

import java.util.HashMap;

public class BestTimetoBuyandSellStockIII_123 {
    public static void main(String[] args) {
        int [] prices = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(prices));
    }
    private static int maxProfit(int i, int buysell, int[] prices, int k, HashMap<String,Integer>hm) {
        if (i>=prices.length ||k ==0){
            return 0;
        }
        String key =i+"buy"+buysell+"s"+k;
        if (hm.containsKey(key)) return hm.get(key);
        int x =0;
        if (buysell==0){
            int buy = maxProfit(i+1,1,prices,k,hm)-prices[i];
            int noBuy = maxProfit(i+1,0,prices,k,hm);
            x = Math.max(buy,noBuy);
        }else {
            int sell = maxProfit(i+1,0,prices,k-1,hm)+prices[i];
            int noSell = maxProfit(i+1,1,prices,k,hm);
            x =  Math.max(sell,noSell);
        }
        hm.put(key,x);
        return x;
    }
    public static int maxProfit(int[] prices) {
        HashMap<String,Integer>hm = new HashMap<>();
        return maxProfit(0,0,prices,2,hm);
    }
}
