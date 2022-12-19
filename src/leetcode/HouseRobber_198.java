package leetcode;

import org.jetbrains.annotations.NotNull;

import java.io.FilterOutputStream;

public class HouseRobber_198 {
    private static Integer[] dp;

    public static void main(String[] args) {
        int [] arr = {1,2};
        System.out.println(rob(arr));
    }
    public static int rob(int [] nums) {
        dp = new Integer[nums.length];
       return robfrom(nums,0);
    }
    private static int robfrom(int []arr, int currIndex){
        if (currIndex >= arr.length){
            return 0;
        }
        if (dp[currIndex] != null){
            return dp[currIndex];
        }
        int stealfrom = arr[currIndex]+(robfrom(arr,currIndex+2));
        int skipfrom = robfrom(arr, currIndex+1);
        return dp[currIndex]= Math.max(stealfrom,skipfrom);
    }
}
