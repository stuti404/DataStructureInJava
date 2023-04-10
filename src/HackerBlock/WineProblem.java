package HackerBlock;

import java.util.Arrays;

public class WineProblem {
    public static void main(String[] args) {
        int []arr ={2,3,5,1,4};
        int[][]dp = new int[arr.length][arr.length];
        System.out.println(wine(arr,0,arr.length-1,1,dp));
    }
    public static int wine(int []arr,int i,int j,int year,int[][]dp){
        if (i>j){
            return 0;
        }
        if (dp[i][j]!=0){
            return dp[i][j];
        }
        int fs = arr[i]*year+wine(arr,i+1,j,year+1,dp);
        int ss =arr[j]*year+wine(arr,i,j-1,year+1,dp);
        return dp[i][j]=Math.max(fs,ss);
    }
}
