package HackerBlock;

import java.util.Scanner;

public class Recursion_Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("\n"+Subsequence(str,"",0));
    }
    public  static int Subsequence(String str,String ans,int count){
        if (str.length()==0){
            System.out.print(ans+" ");
            return 1;
        }
        int c1 =Subsequence(str.substring(1),ans,count+1);
        int c2 =Subsequence(str.substring(1),ans+str.charAt(0),count+1);
        return c1+c2;
    }
}
