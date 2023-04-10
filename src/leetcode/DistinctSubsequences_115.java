package leetcode;

import java.util.Arrays;

public class DistinctSubsequences_115 {
    public static void main(String[] args) {
        String s = "rabbbit", t = "rabbit";
        int [][]dp = new int[s.length()][t.length()];
        for (int[]i:dp){
            Arrays.fill(i,0);
        }
        System.out.println(numDistinct(s,t,0,0,dp));

    }
    private static int numDistinct(String s, String t,int i,int j,int[][]dp) {
        if (j==t.length()){
            return 1;
        }
        if (i==s.length()){
            return 0;
        }
        if (dp[i][j]!=0){
            return dp[i][j];
        }
        int include = 0;
        int exclude =0;
        if (s.charAt(i)==t.charAt(j)){
            include = numDistinct(s,t,i+1,j+1,dp);
        }
        exclude = numDistinct(s,t,i+1,j,dp);
        return dp[i][j]=include+exclude;
    }
}
