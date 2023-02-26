package leetcode;

public class ReverseInteger_7 {
    public static void main(String[] args) {
        int x =-1534236469;
        int y =-120;
        System.out.println(reverse(x));
        System.out.println(reverse(y));
    }
    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
            long y =0;
            while(x!=0) {
                int rem = x%10;
                y = y*10+rem;
                x = x/10;
            }
        if (y > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -y : y);

    }
}
