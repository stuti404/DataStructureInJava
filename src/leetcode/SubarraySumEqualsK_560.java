package leetcode;

public class SubarraySumEqualsK_560 {
    public static void main(String[] args) {
        int []nums = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums,k));
    }
    public static int subarraySum(int[] nums, int k) {
        int res =0;
        for (int i = 0; i < nums.length; i++) {
            int sum =0;
            for (int j = i; j < nums.length; j++) {
                sum = sum+nums[j];
                if (sum==k){
                   res++;
                }
            }
        }
        return res;
    }

}
