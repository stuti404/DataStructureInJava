package HackerBlock;

import java.util.*;

public class AggressiveCows {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int c = sc.nextInt();
            int []arr = new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(BST(c,arr));
    }
    public static int BST(int c,int[]arr){
        int ans =0;
        int lo =0;
        int hi = arr[arr.length-1]-arr[0];
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(isPossible(arr, c, mid)){
                ans = mid;
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[]arr,int c,int mid){
        int cow = 1;
        int pos = arr[0];
        int i =1;
        while(i<arr.length){
            if(arr[i]-pos>=mid){
                cow++;
                pos = arr[i];
            }
            if(cow == c){
                return true;
            }
            i++;
        }
        return false;
    }
}
