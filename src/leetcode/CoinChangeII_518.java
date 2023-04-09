package leetcode;

import java.util.Arrays;

public class CoinChangeII_518 {
    public static void main(String[] args) {
        int amount = 5;
        int []coins = {1,2,5};
        System.out.println(change(amount,coins));
    }
    public static int change(int amount, int[] coins) {
        int [][] dp = new int[coins.length][amount+1];
        for (int []i :dp){
            Arrays.fill(i,-1);
        }
        return change(coins,amount,0,dp);
    }
    private static int change(int[] coins,int amount,int i,int [][]dp) {
        if (amount==0){
            return 1;
        }
        if (i==coins.length){
            return 0;
        }
        if (dp[i][amount]!=-1){
            return dp[i][amount];
        }
        int include = 0;
        int exclude =0;
        if (amount>= coins[i]){
            include = change(coins,amount-coins[i],i,dp);
        }
        exclude = change(coins,amount,i+1,dp);
        return dp[i][amount]=include+exclude;
    }
}
