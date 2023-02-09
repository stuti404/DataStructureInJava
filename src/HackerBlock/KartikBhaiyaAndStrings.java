package HackerBlock;

import java.util.Scanner;

public class KartikBhaiyaAndStrings {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int k =sc.nextInt();
//        String str = sc.nextLine();
        int k =2;
        String  str = "abba";
        int a = bhaiya(k,str,'a');
        int b = bhaiya(k,str,'b');
        System.out.println(Math.max(a,b));

    }
    public static int bhaiya(int k,String str,char ch){
        int si =0;
        int ei =0;
        int flip =0;
        int ans =0;
        while (ei<str.length() ){
            // grow
            if (ch==str.charAt(ei)){
                flip++;
            }
            //shrink
            while (flip>k&& si<=ei){
                if (str.charAt(si)==ch){
                    flip--;
                }
                si++;
            }
            ans = Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
