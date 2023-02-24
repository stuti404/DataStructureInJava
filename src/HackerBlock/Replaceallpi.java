package HackerBlock;

import java.util.Scanner;

public class Replaceallpi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            String str =sc.nextLine();
            System.out.println(replace(str));
            t--;
        }
    }
    public static String replace(String str){
        if(str.length()<=1){
            return str;
        }
        if (str.charAt(0)=='p'&& str.length() >= 2 && str.charAt(1)=='i'){
            return "3.14"+replace(str.substring(2,str.length()));
        }
        return str.charAt(0)+replace(str.substring(1,str.length()));
    }
}
