package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinCostClimbingStairs_746 {
    public static void main(String[] args) {
        int []cost = {10,15,20};
        int[]dp =new int[cost.length];
        Arrays.fill(dp,-1);
        int a =minCostClimbingStairs(cost,0,dp);
        int b =minCostClimbingStairs(cost,1,dp);
        System.out.println(Math.min(a,b));
    }
//    public static int minCostClimbingStairs(int[] cost) {
//        if (cost.length==2){
//            return Math.min(cost[1],cost[0]);
//        }
//        int [] count = new int[1001];
//        int x = climb(cost,0,count);
//        int y = climb(cost,1,count);
//        return Math.min(x,y);
//    }
//    public  static int climb(int []cost, int jump, int []count){
//        if (jump==cost.length-1 || jump==cost.length-2){
//            return cost[jump];
//        }
//        if (count[jump]!=0){
//            return count[jump];
//        }
//        int a = climb(cost,jump+1,count);
//        int b = climb(cost,jump+2,count);
//        count[jump] = Math.min(a,b)+cost[jump];
//        return count[jump];
//    }
    public static int minCostClimbingStairs(int[] cost,int i,int []dp ) {
        if (i>=cost.length){
            return 0;
        }
        if (dp[i]!=-1){
            return dp[i];
        }
        int a = minCostClimbingStairs(cost,i+1,dp);
        int b =minCostClimbingStairs(cost,i+2,dp);
        return dp[i]=cost[i]+Math.min(a,b);
    }
}
