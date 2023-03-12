package HackerBlock;

import java.util.Scanner;

public class GenerateBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t -->0) {
            String str = sc.next();
            Generate(str, 0, "");
            System.out.println();
        }
    }
    public static void Generate(String s,int i,String ans){
        if (i == s.length()){
            System.out.print(ans+"\t");
            return;
        }
        if (s.charAt(i)=='?'){
            Generate(s, i + 1, ans + 0);
            Generate(s, i + 1, ans + 1);
        }
        else
            Generate(s,i+1,ans+s.charAt(i));

    }
}


