package leetcode;

public class SubarrayProductLessThanK_713 {
    public static void main(String[] args) {
        int []nums = {10,5,2,6};
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(nums,k));
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        // grow
        int si =0;
        int ei =0;
        int p =1;
        int ans = 0;
        while (ei<nums.length && si<=ei){
            p = p*nums[ei];
            //shrink
            while (p>=k){
                p = p/nums[si];
                si++;
            }
            //calculate
            ans = ans+ei-si+1;
            ei++;
        }
        return ans;
    }

}
