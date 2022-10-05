package HackerBlock;
//https://hack.codingblocks.com/app/contests/3405/571/problem
import java.util.Scanner;

public class PatternMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int row =1;
        int space =n*2-3;
        int star =1;
        while(row<=n){
            int i = 1;
            while(i<=star){
                System.out.print(i+" ");
                i++;
            }
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k =1;
            int count =row;
            if(row==n){
                k=2;
                count-=1;
            }
            while (k<=star){
                System.out.print(count+" ");
                count--;
                k++;
            }

            row++;
            System.out.println();
            star++;
            space-=2;
        }
    }
}
