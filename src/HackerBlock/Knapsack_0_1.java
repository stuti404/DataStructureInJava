package HackerBlock;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Knapsack_0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int [] weight =new int[s];
        for (int i = 0; i < weight.length; i++) {
            weight[i]= sc.nextInt();
        }
        int []cost =new int[s];
        for (int i = 0; i < cost.length; i++) {
            cost[i]=sc.nextInt();
        }
        int [][]dp = new int[s+1][weight.length];
        for (int[]i:dp){
            Arrays.fill(i,-1);
        }
        System.out.println(knapsack(weight,cost,n,0,dp));
    }
    public static int knapsack(int[]weight,int[] cost,int capacity,int i,int [][]dp){
        if (capacity==0||i==weight.length){
            return 0;
        }
        if (dp[capacity][i]!=-1){
            return dp[capacity][i];
        }
        int include = 0;
        int exclude =0;
        if (capacity>=weight[i]){
            include =knapsack(weight,cost,capacity-weight[i],i+1,dp)+cost[i];
        }

        exclude = knapsack(weight, cost, capacity, i+1,dp);
        return dp[capacity][i]= Math.max(include,exclude);
    }
}
