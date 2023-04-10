package leetcode;

import java.util.Arrays;

public class MinimumFallingPathSumII_1289 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(minFallingPathSum(arr));
    }
    public static int minFallingPathSum(int[][] grid) {
        int [][] dp= new int[grid.length][grid[0].length];
        for (int[]i:dp){
            Arrays.fill(i,-1);
        }
        int ans =Integer.MAX_VALUE;
        for (int i = 0; i < grid[0].length; i++) {
            ans = Math.min(ans,FallingPathSum(grid,0,i,dp));
        }
        return ans;
    }
    public static int FallingPathSum(int[][] grid,int row,int col,int [][]dp) {
        if (col<0||col>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if (row==grid.length-1){
            return grid[row][col];
        }
        if (dp[row][col]!=-1){
            return dp[row][col];
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < grid[0].length; i++) {
            if (i!=col) {
                ans = Math.min(ans, FallingPathSum(grid,row+1,i,dp));
            }
        }
        return dp[row][col]=ans+grid[row][col];
    }
}
