package HackerBlock;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.print(lastIndex(arr,m, arr.length-1)+" ");
    }
    public static int lastIndex(int[]arr,int m,int i){
//        int ans =0;
        if (i<0){
            return -1;
        }
        if (arr[i]==m){
            return i;
        }
        return lastIndex(arr,m,i-1);
    }
}
