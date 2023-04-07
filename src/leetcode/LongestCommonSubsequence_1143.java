package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class
LongestCommonSubsequence_1143 {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        int [][]dp = new int[text1.length()][text2.length()];
        for (int []s:dp){
            Arrays.fill(s,  -1);
        }
//        System.out. println(longestCommonSubsequence(text1,text2));
        System.out.println(lcs(text1,text2,0,0,dp));
    }
//    //Approach1   Bottom Up
//    public static int longestCommonSubsequence(String text1, String text2) {
//        int [][] dp = new int[text1.length()+1][text2.length()+1];
//        for (int i = 1; i < dp.length; i++) {
//            for (int j = 1; j < dp[0].length; j++) {
//                if (text1.charAt(i-1)==text2.charAt(j-1)){
//                    dp[i][j] = dp[i-1][j-1]+1;
//                }
//                else {
//                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
//                }
//            }
//        }
//        return dp[text1.length()][text2.length()];
//    }


    //Approach 2 O(n^2)

    //i =s1,j=s2
    public static int lcs(String s1,String s2,int i,int j,int [][]dp){
        if (i ==s1.length() || j==s2.length()){
            return 0;
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans =0;
        if (s1.charAt(i)==s2.charAt(j)){
            ans = 1+lcs(s1,s2,i+1,j+1,dp);
        }
        else {
            int a = lcs(s1, s2, i+1, j,dp);
            int b = lcs(s1,s2,i,j+1,dp);
            ans = Math.max(a,b);
        }
        return dp[i][j]= ans;
    }
}
