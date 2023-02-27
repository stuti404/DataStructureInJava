package HackerBlock;

import java.util.Scanner;

public class RecursionKeypadCodes {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        System.out.println("\n"+keyPadMOb(str,"",0));
    }
    public static int keyPadMOb(String num,String ans,int count){
        if (num.length()==0){
            System.out.print(ans+" ");
            return 1;
        }
        char ch = num.charAt(0);
        String press = key[ch-'0'];
        int b =0;
        for (int i =0;i<press.length();i++) {
            b = b+keyPadMOb(num.substring(1), ans+press.charAt(i),count+1);
        }
        return b;
    }

}
