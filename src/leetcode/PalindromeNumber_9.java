package leetcode;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
        int target = -121;
        System.out.println(Solution(target));
//        Solution(target);
    }
    public static boolean Solution(int n){
        int temp =n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = (sum*10)+rem;
            n =n/10;
        }
        if (temp == sum ){
//            System.out.println(true);
            return true;
        }
        else {
//            System.out.println(false);
            return false;
        }
    }
}
