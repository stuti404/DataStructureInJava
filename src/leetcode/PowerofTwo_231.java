package leetcode;

public class PowerofTwo_231 {
    public boolean isPowerOfTwo(int n) {
        if (n<1)return false;
        if (n==1)return true;
        if (n%2==1)return false;
        return (isPowerOfTwo(n/2));
    }
}
