package leetcode;

import javax.naming.CannotProceedException;
import java.util.Arrays;
import java.util.HashMap;

public class MinimumFallingPathSum_931 {
    public static void main(String[] args) {
        int[][]arr = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minFallingPathSum(arr));

    }
//    public static int minFallingPathSum(int[][] matrix) {
//        int r = matrix.length;
//        int c = matrix[0].length;
//        int ans = Integer.MAX_VALUE;
//        HashMap<String ,Integer> map = new HashMap<>();
//
//        for (int i = 0; i < c; i++) {
//            ans = Math.min(ans,rec(0,i,matrix,map));
//        }
//        return ans;
//    }
//    private static  int rec(int i, int j,int[][]A,HashMap<String,Integer>hm){
//        int r = A.length;
//        int c = A[0].length;
//        if (i==r){
//            return 0;
//        }
//        if (j<0 || j>=c) return Integer.MAX_VALUE;
//        String key = i+"stuti"+j;
//        if (hm.containsKey(key)){
//            return hm.get(key);
//        }
//        int op1 = rec(i+1,j-1,A,hm);
//        int op2 = rec(i+1,j,A,hm);
//        int op3 = rec(i+1,j+1,A,hm);
//
//        hm.put(key,A[i][j]+Math.min(op1,Math.min(op2,op3)));
//        return  A[i][j] +Math.min(op1,Math.min(op3,op2));
//    }
    public static int minFallingPathSum(int[][] matrix) {
        int [][]dp = new int[matrix.length][matrix[0].length];
        for (int[]i:dp){
            Arrays.fill(i,-1);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(ans,FallingPathSum(matrix,0,i,dp));
        }
        return ans;
    }
    public static int FallingPathSum(int[][] matrix,int row,int col,int[][]dp) {

        if (col<0|| col>=matrix[0].length){
            return Integer.MAX_VALUE;
        }
        if (row==matrix.length-1 ){
            return matrix[row][col];
        }
        if (dp[row][col] !=-1){
            return dp[row][col];
        }
        int left = FallingPathSum(matrix,row+1,col-1,dp);
        int down =  FallingPathSum(matrix,row+1,col,dp);
        int right = FallingPathSum(matrix,row+1,col+1,dp);
        return dp[row][col]= matrix[row][col]+Math.min(left,Math.min(right,down));
    }
}
