package HackerBlock;
//https://hack.codingblocks.com/app/contests/3405/740/problem

import java.util.Scanner;

public class PatternMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int row =1;
        int star =n;
        int space =-1;
        int x =n*2-1;
        while(row<=x){
            //star
            int i=1;
            while(i<=star){
                System.out.print("*");
                i++;
            }
            int j =1;
            while (j<=space){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            if(row==1||row==n*2-1){
                k=2;
            }
            while(k<=star){
                System.out.print("*");
                k++;
            }

            if(row<n) {
                space+=2;
                star--;
            }
            else{
                space-=2;
                star++;
            }
            row++;
            System.out.println();
        }
    }
}
