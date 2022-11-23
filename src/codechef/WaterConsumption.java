package codechef;

import java.util.Scanner;

public class WaterConsumption {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int x = sc.nextInt();
            if(x<2000){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            T--;
        }
    }
}
