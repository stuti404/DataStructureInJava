package HackerBlock;

import java.util.Arrays;
import java.util.Scanner;

public class ValentineMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boy =sc.nextInt();
        int girl =sc.nextInt();
        int []boyChocolate = new int[boy];
        for (int i = 0; i < boyChocolate.length; i++) {
            boyChocolate[i]=sc.nextInt();
        }
        int []girlCandy = new int[girl];
        for (int i = 0; i < girlCandy.length; i++) {
            girlCandy[i]=sc.nextInt();
        }
        int [][]dp = new int[boyChocolate.length][girlCandy.length];
        for (int []i:dp) {
            Arrays.fill(i,-1);
        }
        Arrays.sort(boyChocolate);
        Arrays.sort(girlCandy);
        System.out.println(valentine(boyChocolate,girlCandy,0,0,dp));
    }
    public static  int valentine(int[]boy, int[]girl,int i,int j,int [][]dp){
        if (i==boy.length){
            return 0;
        }
        if (j ==girl.length){
            return 1000000;
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int pair = valentine(boy,girl,i+1,j+1,dp)+Math.abs(boy[i]-girl[j]);
        int unpair = valentine(boy,girl,i,j+1,dp);
        return dp[i][j]= Math.min(pair,unpair);
    }
}
