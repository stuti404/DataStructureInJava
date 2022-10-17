package HackerBlock;

import java.util.Scanner;

public class GDC {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
        int ans =0;
        int max = Math.max(a, b);
        for (int i = 1; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
                ans = Math.max(ans,i);
            }
        }
        System.out.println(ans);
    }
}
