package leetcode;

public class SingleNumber_136 {
    public static void main(String[] args) {
        int [] num = {1,0,1};
        System.out.println(singleNumber(num));
    }
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for (int num:nums){
            xor = xor^num;
        }
        return xor;
    }
}
