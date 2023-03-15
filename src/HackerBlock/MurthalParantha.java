package HackerBlock;

import java.util.Arrays;
import java.util.Scanner;

public class MurthalParantha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int cook = sc.nextInt();
        int [] rank = new int[cook];
        for (int i = 0; i < rank.length; i++) {
            rank[i] = sc.nextInt();
        }
        Arrays.sort(rank);
        System.out.println(BST(rank,p));
    }
    public static int BST(int[]rank,int p){
        int lo =0;
        int hi = (rank[rank.length-1]*(p*(p+1)))/2;
        int ans =0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if (isPossible(rank,p,mid)){
                ans =mid;
                hi = mid-1;
            }
            else {
                lo = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int []rank,int p,int mid){
        int cook =0;
        int paratha =1;
        int totalPratha =0;
        int sum =0;
        while (cook<rank.length){
            sum = sum+rank[cook]*paratha;
            if(sum<=mid){
                paratha++;
                totalPratha++;
            }
            else {
                paratha=1;
                sum =0;
                cook++;
            }
            if (totalPratha>=p){
                return true;
            }
        }
        return false;
    }

}
