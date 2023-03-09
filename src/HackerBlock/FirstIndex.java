package HackerBlock;

import java.util.*;

public class FirstIndex {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.print(rex(arr,target,0));
    }
    public static int rex(int []arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return rex(arr,target,i+1);

    }
}
