package leetcode;

import java.util.Arrays;

public class EditDistance_72 {
    public static void main(String[] args) {

        String word1 = "horse", word2 = "ros";
//        System.out.println(minDistance(word1,word2,0,0));
        System.out.println(minDistance(word1,word2));
    }
    public static int minDistance(String word1, String word2) {
        int [][] dp = new int[word1.length()][word2.length()];
        for (int []i:dp){
            Arrays.fill(i,-1);
        }
        return minDistance(word1,word2,0,0,dp);
    }
//    public static int minDistance(String word1, String word2) {
//        int memo [][]= new int[word1.length()+1][word2.length()+1];
//        int ans = min(word1,word2,memo);
//        return ans;
//    }
//        Approach 1
//    public static int min(String word1, String word2,int [][]arr) {
//        if (word1.length()==0){
//            return word2.length();
//        }
//        if (word2.length()==0){
//            return word1.length();
//        }
//        if (arr[word1.length()][word2.length()]>0){
//            return arr[word1.length()][word2.length()];
//        }
//        if (word1.charAt(0)==word2.charAt(0)){
//            arr[word1.length()][word2.length()]= min(word1.substring(1),word2.substring(1),arr);
//            return min(word1.substring(1),word2.substring(1),arr);
//        }
//        else {
//            int op1 = min(word1.substring(1),word2.substring(1),arr);
//            int op2 = min(word1,word2.substring(1),arr);
//            int op3 = min(word1.substring(1),word2,arr);
//            arr[word1.length()][word2.length()]=1+Math.min(op1,Math.min(op2,op3));
//            return 1+Math.min(op1,Math.min(op2,op3));
//        }
//    }
    private static int minDistance(String word1, String word2,int i ,int j,int [][]dp) {
        if (i==word1.length() ){
                return word2.length()-j;
        }
        if (j==word2.length()){
            return word1.length()-i;
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans =0;
        if (word1.charAt(i)==word2.charAt(j)){
            ans = minDistance(word1,word2,i+1,j+1,dp);
        }
        else {
            int Delete = minDistance(word1,word2,i+1,j,dp);
            int Insert = minDistance(word1,word2,i,j+1,dp);
            int Replace = minDistance(word1,word2,i+1,j+1,dp);
            ans = Math.min(Delete,Math.min(Insert,Replace))+1;
        }
        return dp[i][j]=ans;
    }
}
