package leetcode;

import org.jetbrains.annotations.NotNull;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class HouseRobber_198 {
    private static Integer[] dp;

    public static void main(String[] args) {
        int [] arr = {1,2};
        int []dp = new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(rob(arr,0,dp));
    }
//    public static int rob(int [] nums) {
//        dp = new Integer[nums.length];
//       return robfrom(nums,0);
//    }
//    private static int robfrom(int []arr, int currIndex){
//        if (currIndex >= arr.length){
//            return 0;
//        }
//        if (dp[currIndex] != null){
//            return dp[currIndex];
//        }
//        int stealfrom = arr[currIndex]+(robfrom(arr,currIndex+2));
//        int skipfrom = robfrom(arr, currIndex+1);
//        return dp[currIndex]= Math.max(stealfrom,skipfrom);
//    }

    private static int rob(int[] nums,int i,int[]dp) {
        if (i>=nums.length){
            return 0;
        }
        if (dp[i]!=-1){
            return dp[i];
        }
        int a =rob(nums,i+2,dp)+nums[i];
        int b = rob(nums,i+1,dp);
        return dp[i]=Math.max(a,b);
    }
}
