package leetcode;

public class MinimumSizeSubarraySum_209 {
    public static void main(String[] args) {
        int target = 4;
        int []nums = {1,4,4};
        System.out.println(minSubArrayLen(target,nums));
    }
    public static int minSubArrayLen(int target, int[] nums){
       int i =0;
       int j =0;
       int sum =0;
       int ans = Integer.MAX_VALUE;
       while(j<nums.length ){
           //grow
           sum = sum+nums[j];
           //shrink
           while (sum >=target) {
               ans =Math.min(ans,j-i+1);
               sum = sum - nums[i];
               i++;
           }
           j++;
       }
       return (ans != Integer.MAX_VALUE)?ans:0;
    }
}
