package HackerBlock;

import java.util.Scanner;

public class BookAllocationProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [] book = new int[n];
            for (int i = 0; i < book.length; i++) {
                book[i]=sc.nextInt();
            }
            System.out.println(BST(book,m));
            t--;
        }
    }
    public static int BST(int []book,int student){
        int lo =0;
        int hi =0;
        for (int i = 0; i <book.length ; i++) {
            hi = hi+book[i];
        }
        int ans =0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if (isPossible(book,student,mid)){
                ans = mid;
                hi = mid-1;
            }
            else {
                lo = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int []book,int student,int mid){
        int stud=1;
        int read =0;
        int i =0;
        while (i<book.length){
            if (read+book[i]<=mid){
                read = read+book[i];
                i++;
            }
            else {
                stud++;
                read =0;
            }
            if (stud>student){
                return false;
            }
        }
        return true;
    }
}
