package leetcode;

public class JumpGameII_45 {
    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        int curreach =0;
        int maxreach =0;
        int jumps =0;
        for (int i = 0; i < nums.length-1; i++) {
            if (i+nums[i]>maxreach){
                maxreach = i+ nums[i];
            }
            if (i == curreach){
                jumps++;
                curreach =maxreach;
            }
        }
        return jumps;
    }
}
