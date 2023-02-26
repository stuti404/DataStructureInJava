package HackerBlock;

import java.util.Scanner;

public class Mazepath_D_Count_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int count =0;
        System.out.println("\n"+mazePath(0,n-1,0,m-1,"",count));
    }
    public static int mazePath(int sr, int er,int sc,int ec, String ans,int count){
        if (sr>er || sc>ec){
            return 0;
        }
        if (sr==er && sc ==ec){
            System.out.print(ans+" ");
            return 1;
        }
        int a = mazePath(sr+1,er,sc,ec,ans+"H",count+1);
        int b = mazePath(sr,er,sc+1,ec,ans+"V",count+1);
//        int c = mazePath(sr+1,er,sc+1,ec,ans+"D",count+1);
        return a+b;
    }

}
