package HackerBlock;

import java.util.Scanner;

public class All_IndicesProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        allindex(arr,target,0);
    }
    public  static void allindex(int[]arr,int target,int i){
        if (i==arr.length){
            return;
        }
        if (arr[i]==target){
            System.out.print(i+" ");
        }
        allindex(arr,target,i+1);
    }
}
