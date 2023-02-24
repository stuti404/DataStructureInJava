package HackerBlock;

import java.util.Scanner;

public class Replaceall0swith5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(replace(n));
    }
    public static int replace(int num) {
        int temp = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0)
                digit = 5;

            temp = temp * 10 + digit;
            num = num / 10;
        }
        int ans = 0;
        while (temp > 0) {
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp = temp / 10;
        }
        return ans;
    }
}
