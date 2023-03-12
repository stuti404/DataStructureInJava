package HackerBlock;

import java.util.Scanner;

public class Painters_PartitionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(partition(arr,k));
    }
    public static int partition(int[]arr, int painter){
        int lo =0;
        int hi = 0;
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            hi = hi+arr[i];
        }
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(isPossible(arr,mid,painter)){
                ans = mid;
                hi = mid-1;
            }
            else {
                lo =  mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int []arr,int mid,int painters){
        int painter =1;
        int board =0;
        int i =0;
        while (i<arr.length){
            if (board+arr[i]<=mid){
                board = board+arr[i];
                i++;
            }
            else {
                painter++;
                board =0;
            }
            if (painter>painters){
                return false;
            }
        }
        return true;
    }
}
