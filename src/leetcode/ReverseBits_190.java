package leetcode;

public class ReverseBits_190 {
    public static void main(String[] args) {

    }
    public int reverseBits(int n) {
        int result =0;
        for (int i = 0; i < 32; i++) {
            int lsb = n&1;
            int reverse = lsb<<(31-i);
            result = result|reverse;
            n=n>>1;
        }
        return result;
    }
}
