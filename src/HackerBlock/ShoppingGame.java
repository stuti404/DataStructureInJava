package HackerBlock;

import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t =sc.nextInt();
        while (t-->0) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int A = 0;
        int H =0;
        int count =1;
//            System.out.println();
            while (true) {
                A= A+count;
                if (A > m) {
                    System.out.println("Harshit");
                    break;
                }
                count++;
                H= H+count;
                if (H > n) {
                    System.out.println("Ayush");
                    break;
                }
                count++;
            }
        }
    }
}
